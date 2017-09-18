import java.beans.PropertyDescriptor;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import KYLAND_pmMgr.*;
import com.sun.tracing.dtrace.NameAttributes;
import common.Common_I;
import common.Common_IHolder;
import emsMgr.EMSMgr_I;
import emsMgr.EMSMgr_IHelper;
import emsMgr.EMS_T;
import emsMgr.EMS_THolder;
import emsSession.EmsSession_I;
import emsSession.EmsSession_IHolder;
import emsSessionFactory.EmsSessionFactory_I;
import emsSessionFactory.EmsSessionFactory_IHelper;
import globaldefs.NameAndStringValue_T;
import globaldefs.NamingAttributes_THelper;
import globaldefs.ProcessingFailureException;
import nmsSession.NmsSession_I;
import nmsSession.NmsSession_IPOATie;
import notifications.EventIterator_IHolder;
import notifications.EventList_THolder;
import notifications.PerceivedSeverity_T;
import org.omg.CORBA.*;
import org.omg.CORBA.Object;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNotification.StructuredEvent;
import org.omg.CosNotifyChannelAdmin.ClientType;
import org.omg.CosNotifyComm.StructuredPushConsumer;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import performance.PMTPSelect_T;
/**
 东土科技EMS北向接口调用指南
 @author achen
 @version V1.0
 */
public class DongtuClient {
    String m_ip;
    String m_userName;
    String m_passWord;

    public DongtuClient(String p_EMSID) {
        //m_ip = "172.18.1.8";
        m_ip = "192.168.0.99";
        m_userName = "admin";
        m_passWord = "admin";
        int m_ConnectCount = 0;
        while (true) {
            m_ConnectCount++;
            try {
                Thread.currentThread();
                Thread.sleep(3000);
                System.out.println("Conn " + m_ConnectCount + " Start ");
                getConnect(m_ip, m_userName, m_passWord);
                break;
            } catch (Exception e) {
                System.out.println(e);
                continue;
            }
        }
    }

    // emsSession object
    public EmsSession_I m_emsSession_I = null;

    /**
     * 获得EMS连接
     * @param p_EMSID
     * @param p_username
     * @param p_password
     * @throws Exception
     */
    public void getConnect(String p_EMSID, String p_username, String p_password) throws Exception {
        String[] strs = new String[2];
        strs[0] = "-ORBInitRef";
        strs[1] = ("NameService=corbaloc::" + m_ip + ":9900/NameService");
        ORB global_orb = ORB.init(strs, null);

        Object root_poa = global_orb.resolve_initial_references("RootPOA");
        POA rpoa = POAHelper.narrow(root_poa);
        POA poa = rpoa.create_POA("myPolicy", null, new Policy[0]);
        poa.the_POAManager().activate();
        String objRef = "corbaloc::" + m_ip + ":9900/NameService";
        Object obj = global_orb.string_to_object(objRef);
        NamingContextExt root_context = NamingContextExtHelper.narrow(obj);

        NameComponent[] path = new NameComponent[2];
        path[0] = new NameComponent("ky", "class");
        path[1] = new NameComponent("instance", "EmsSessionFactory");
        Object emsSessionI = root_context.resolve(path);
        SessionImpl mySessionImpl = new SessionImpl();
        EmsSessionFactory_I ems_ref = EmsSessionFactory_IHelper.narrow(emsSessionI);
        EmsSession_IHolder emsSessionHldr = new EmsSession_IHolder();
        NmsSession_IPOATie tieobj = new NmsSession_IPOATie(mySessionImpl, poa);
        poa.activate_object(tieobj);
        NmsSession_I nmsSession_ref = tieobj._this();
        if (ems_ref != null) {
            ems_ref.getEmsSession(m_userName, m_passWord, nmsSession_ref, emsSessionHldr);
            m_emsSession_I = emsSessionHldr.value;
        }
        //获取所有活动告警  OK
        getAllEMSAndMEActiveAlarms(m_emsSession_I);

        //获取所有故障监视器信息 OK
        Resourcemonitor_T[] resourcemonitor_Ts = getAllResourceMonitor(m_emsSession_I);

        //设置故障阈值  //设置故障阈值 需要先获取故障阈值模型
        //获取第一个阈值模型 OK
        Resourcemonitor_T resourcemonitor_T = resourcemonitor_Ts[3];
        //设置这个阈值模型主要阈值
        resourcemonitor_T.majorLimit = "50";
        resourcemonitor_T.minorLimit = "40";
        updateResourceMonitor(m_emsSession_I, resourcemonitor_T);

        //获取所有资源类型 OK
        String deviceid = "1";
        //String resourceTypes = getAllResourceType(m_emsSession_I, deviceid);

        //获取所有资源名称 OK
        //String resourceNames = getAllResourceName(m_emsSession_I, deviceid);

        //获取所有性能监视器名称 OK
        String resourceType = "CPU"+encoding("使用率");
        //String resourceMonitorName = getAllResourceMonitorName(m_emsSession_I, deviceid,resourceType);

        //获取历史性能数据 OK
        String deviceidString = "1";
        String resourceName = encoding("内存");
        String monitorItem = encoding("内存利用率性能监视");
        int how_many = 100;
        String startTime = "2016-01-01 00:00:00";
        String endTime = "2019-01-01 00:00:00";
        PMResourceIterator_IHolder pmIt = new PMResourceIterator_IHolder();
        //getAllHisCurrentPMData(m_emsSession_I, deviceidString, resourceName, monitorItem, how_many, startTime, endTime, pmIt);

        //获取所有进程 OK
         //Process_T[] process_ts = FindAllProcess(m_emsSession_I, deviceid);

        //新增进程 OK
        Process_T process = new Process_T();
        //addProcess(m_emsSession_I, process,deviceid);

        //删除进程 OK
       // deleteProcess(m_emsSession_I, process_ts[1],deviceid);
    }

    /**
     * 获取所有活动告警
     * @param emsSession_I
     */
    public void getAllEMSAndMEActiveAlarms(EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {

                emsSession_I.getManager("EMS", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return;
            }
            EMSMgr_I emsMgr = EMSMgr_IHelper.narrow(mgrIntf);
            int how_many = 100;
            String[] excludeProbCauseList = new String[0];
            PerceivedSeverity_T[] excludeSeverityList = new PerceivedSeverity_T[0];
            EventList_THolder listHolder = new EventList_THolder();
            EventIterator_IHolder itHolder = new EventIterator_IHolder();

            if (emsMgr != null) {
                emsMgr.getAllEMSAndMEActiveAlarms(excludeProbCauseList, excludeSeverityList, how_many, listHolder, itHolder);

            }
            StructuredEvent mgdElmT = new StructuredEvent();


            if (listHolder.value != null) {
                StructuredEvent[] t_array;
                int j = (t_array = listHolder.value).length;
                for (int i = 0; i < j; i++) {
                    if ((mgdElmT = t_array[i]) != null) {
                        java.lang.Object obj = mgdElmT;
                        for (int ii = 0; ii < mgdElmT.filterable_data.length; ii++) {
                            System.out.println(mgdElmT.filterable_data[ii].name);
                            if(ii==1)
                            {
                             NameAndStringValue_T[] nameAndStringValue_ts = NamingAttributes_THelper.extract(mgdElmT.filterable_data[ii].value);
                                for (NameAndStringValue_T n:nameAndStringValue_ts)
                                {
                                    System.out.println(n.name+":   "+n.value);
                                }
                            }else
                            {
                                System.out.println(mgdElmT.filterable_data[ii].value);
                            }

                        }

                    }
                }
                if (itHolder.value != null) {
                    boolean bool = true;
                    while (bool) {
                        bool = itHolder.value.next_n(how_many, listHolder);
                        if (listHolder.value != null) {
                            int k = (t_array = listHolder.value).length;
                            for (j = 0; j < k; j++) {
                                if ((mgdElmT = t_array[j]) != null) {
                                    java.lang.Object obj = mgdElmT;
                                    //generateMsg(obj,"NT_ALARM");
                                }
                            }
                        }
                    }
                }
            }
        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取指定EMS的所有故障监视器
     * @param emsSession_I
     * @return
     */
    public static Resourcemonitor_T[] getAllResourceMonitor(EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //通过Session获取对应的管理模块的引用
                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return null;
            }
            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
            ResourcemonitorList_THolder resourcemonitorList_T = new ResourcemonitorList_THolder();
            if (kYLAND_pmMgr_I != null) {

                kYLAND_pmMgr_I.getResourceMonitor(getSelectPara(), resourcemonitorList_T);
            }
            for (int i = 0; i < resourcemonitorList_T.value.length; i++) {
                ToGBKEncode(resourcemonitorList_T.value[i].toString());
            }
            return resourcemonitorList_T.value;

        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 设置故障阈值
     * @param emsSession_I
     * @param resourcemonitor_T
     */
    public static void updateResourceMonitor(EmsSession_I emsSession_I, Resourcemonitor_T resourcemonitor_T) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //通过Session获取对应的管理模块的引用
                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return;
            }
            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
            //ResourcemonitorList_THolder resourcemonitorList_T = new ResourcemonitorList_THolder();
            if (kYLAND_pmMgr_I != null) {

                kYLAND_pmMgr_I.updateResourceMonitor(getSelectPara(), resourcemonitor_T);
            }


        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }

    //获取实时性能数据  deviceid

    /**
     *
     * @param emsSession_I
     * @param deviceid 设备id
     * @return
     */
    public static PMResource_T[] getAllCurrentPMDataNew(EmsSession_I emsSession_I, String deviceid) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //通过Session获取对应的管理模块的引用
                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return null;
            }
            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
            PMResourceList_THolder pmResourceList = new PMResourceList_THolder();
            if (kYLAND_pmMgr_I != null) {
                PMTPSelect_T[] pmtpSelect_Ts = getSelectPara();
                pmtpSelect_Ts[0].name[1].value = deviceid;
                kYLAND_pmMgr_I.getAllCurrentPMDataNew(pmtpSelect_Ts, pmResourceList);
            }
            for (int i = 0; i < pmResourceList.value.length; i++) {
                System.out.println(pmResourceList.value[i].toString());
            }
            return pmResourceList.value;
        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
        return null;

    }

    /**
     * 获取历史性能数据
     * @param emsSession_I
     * @param deviceid 设备id
     * @param resourceName 资源名称
     * @param monitorItem 性能指标
     * @param how_many 数量
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @param pmIt 剩余数据迭代器
     * @return
     */
    public static PMResource_T[] getAllHisCurrentPMData(EmsSession_I emsSession_I, String deviceid, String resourceName, String monitorItem, int how_many, String startTime, String endTime, PMResourceIterator_IHolder pmIt) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //通过Session获取对应的管理模块的引用
                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return null;
            }
            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
            PMResourceList_THolder pmResourceList = new PMResourceList_THolder();

            if (kYLAND_pmMgr_I != null) {
                PMTPSelect_T[] select_ts = getSelectPara();
                select_ts[0].name[1].value = deviceid;
                select_ts[0].name[2].value = resourceName;
                select_ts[0].name[3].value = monitorItem;
                kYLAND_pmMgr_I.getAllHisCurrentPMData(select_ts, how_many, startTime, endTime, pmResourceList, pmIt);
            }
            for (int i = 0; i < pmResourceList.value.length; i++) {
                PMResource_T pmResource_t = pmResourceList.value[i];
                ToGBKEncode(pmResource_t.toString());
            }

            return pmResourceList.value;
        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取所有资源类型
     * @param emsSession_I
     * @param deviceid 设备id
     * @return
     */
    public static String getAllResourceType(EmsSession_I emsSession_I, String deviceid) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //通过Session获取对应的管理模块的引用
                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return null;
            }
            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
            StringHolder resourceTypes = new StringHolder();
            if (kYLAND_pmMgr_I != null) {
                PMTPSelect_T[] select_ts = getSelectPara();
                select_ts[0].name[1].value = deviceid;
                kYLAND_pmMgr_I.getAllResourceType(select_ts, resourceTypes);
            }
            ToGBKEncode(resourceTypes.value.toString());
            return resourceTypes.value;
        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取所有资源名称
     * @param emsSession_I
     * @param deviceid 设备id
     * @return
     */
    public static String getAllResourceName(EmsSession_I emsSession_I, String deviceid) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //通过Session获取对应的管理模块的引用
                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return null;
            }
            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
            StringHolder resourceNames = new StringHolder();
            if (kYLAND_pmMgr_I != null) {
                PMTPSelect_T[] select_ts = getSelectPara();
                select_ts[0].name[1].value = deviceid;
                kYLAND_pmMgr_I.getAllResourceName(select_ts, resourceNames);
            }
            ToGBKEncode(resourceNames.value.toString());
            return resourceNames.value;
        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取所有性能监视器名称
     * @param emsSession_I
     * @param deviceid 设备id
     * @param resourceType 资源类型
     * @return
     */
    public static String getAllResourceMonitorName(EmsSession_I emsSession_I, String deviceid, String resourceType) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //通过Session获取对应的管理模块的引用
                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return null;
            }
            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
            StringHolder resourceMonitorNames = new StringHolder();
            if (kYLAND_pmMgr_I != null) {
                PMTPSelect_T[] select_ts = getSelectPara();
                select_ts[0].name[1].value = deviceid;
                select_ts[0].name[2].value = resourceType;
                select_ts[0].name[2].name = "resourceType";
                kYLAND_pmMgr_I.getAllResourceMonitorName(select_ts, resourceMonitorNames);
            }
            ToGBKEncode(resourceMonitorNames.value.toString());
            return resourceMonitorNames.value;
        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 新增进程
     * @param emsSession_I
     * @param process 进程
     * @param deviceid 设备id
     */
    public static void addProcess(EmsSession_I emsSession_I, Process_T process, String deviceid) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //通过Session获取对应的管理模块的引用
                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return;
            }
            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);

            if (kYLAND_pmMgr_I != null) {
                PMTPSelect_T[] select_ts = getSelectPara();
                select_ts[0].name[1].value = deviceid;
                kYLAND_pmMgr_I.addProcess(select_ts, process);
            }

        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }

    /**
     删除进程
     @param   emsSession_I
     @param   process 进程
     @param   deviceid 设备id
     @return
     */
    public static void deleteProcess(EmsSession_I emsSession_I, Process_T process, String deviceid) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //通过Session获取对应的管理模块的引用
                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return;
            }
            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
            if (kYLAND_pmMgr_I != null) {
                PMTPSelect_T[] select_ts = getSelectPara();
                select_ts[0].name[1].value = deviceid;
                kYLAND_pmMgr_I.deleteProcess(select_ts, process);
            }
        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }

    /**
     获取所有服务器的进程
     @param   emsSession_I
     @param   deviceid 设备id
     @return
     */
    public static Process_T[] FindAllProcess(EmsSession_I emsSession_I, String deviceid) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //通过Session获取对应的管理模块的引用
                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return null;
            }
            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
            ProcessList_THolder processList_tHolder = new ProcessList_THolder();
            if (kYLAND_pmMgr_I != null) {
                PMTPSelect_T[] select_ts = getSelectPara();
                select_ts[0].name[1].value = deviceid;
                kYLAND_pmMgr_I.FindAllProcess(select_ts, processList_tHolder);
            }
            for (Process_T process_t : processList_tHolder.value) {
               ToGBKEncode(process_t.toString());
            }
            return processList_tHolder.value;
        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 转换为GBK编码
     * @param args
     */
    public static void ToGBKEncode(String args) {
        String str = args;
        try {
            byte[] temp = str.getBytes("iso8859-1");//这里写原编码方式
            String newStr = new String(temp, "gbk");//这里写转换后的编码方式
            System.out.println(newStr);
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Decode failed");
        }
    }

    /**
     * 转换为ISO8859-1编码
     * @param str
     * @return
     */
    public static final String encoding(String str)
    {
        try
        {
            return new String(str.getBytes(),"iso8859-1");
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 构建输入参数网元标识集合
     * @return pMTPSelect_t
     * @link
     */
    public static PMTPSelect_T[] getSelectPara() {
        PMTPSelect_T[] pMTPSelect_T = new PMTPSelect_T[1];
        pMTPSelect_T[0] = new PMTPSelect_T();
        String[] granularityList = new String[1];
        granularityList[0] = "";
        pMTPSelect_T[0].granularityList = granularityList;
        short[] layerRateList = new short[1];
        layerRateList[0] = 1;
        pMTPSelect_T[0].layerRateList = layerRateList;
        NameAndStringValue_T[] name = new NameAndStringValue_T[4];
        name[0] = new NameAndStringValue_T();
        name[0].name = "EMS";
        name[0].value = "kyland/kyvision";
        name[1] = new NameAndStringValue_T();
        name[1].name = "deviceid";
        name[1].value = "";
        name[2] = new NameAndStringValue_T();
        name[2].name = "resourceName";
        name[2].value = "";
        name[3] = new NameAndStringValue_T();
        name[3].name = "monitorItem";
        name[3].value = "";
        pMTPSelect_T[0].name = name;
        String[] pMLocationList = new String[1];
        pMLocationList[0] = "";
        pMTPSelect_T[0].pMLocationList = pMLocationList;
        return pMTPSelect_T;
    }

}