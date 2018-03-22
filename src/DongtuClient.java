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
import org.tmforum.mtnm.KYLAND_alarmMgr.KYLAND_alarmMgr_I;
import org.tmforum.mtnm.KYLAND_alarmMgr.KYLAND_alarmMgr_IHelper;
import org.tmforum.mtnm.common.Common_I;
import org.tmforum.mtnm.common.Common_IHolder;
import org.tmforum.mtnm.emsMgr.EMSMgr_I;
import org.tmforum.mtnm.emsMgr.EMSMgr_IHelper;
import org.tmforum.mtnm.emsSession.EmsSession_I;
import org.tmforum.mtnm.emsSession.EmsSession_IHolder;
import org.tmforum.mtnm.emsSessionFactory.EmsSessionFactory_I;
import org.tmforum.mtnm.emsSessionFactory.EmsSessionFactory_IHelper;
import org.tmforum.mtnm.globaldefs.NameAndStringValue_T;
import org.tmforum.mtnm.globaldefs.NamingAttributes_THelper;
import org.tmforum.mtnm.globaldefs.ProcessingFailureException;
import org.tmforum.mtnm.managedElement.ManagedElement_THolder;
import org.tmforum.mtnm.managedElementManager.ManagedElementMgr_I;
import org.tmforum.mtnm.managedElementManager.ManagedElementMgr_IHelper;
import org.tmforum.mtnm.nmsSession.NmsSession_I;
import org.tmforum.mtnm.nmsSession.NmsSession_IPOATie;
import org.tmforum.mtnm.notifications.EventIterator_IHolder;
import org.tmforum.mtnm.notifications.EventList_THolder;
import org.tmforum.mtnm.notifications.PerceivedSeverity_T;
import org.tmforum.mtnm.notifications.PerceivedSeverity_THelper;
import org.tmforum.mtnm.performance.*;
import org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder;
import org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder;

/**
 ???????EMS????????????
 @author achen
 @version V1.0
 */
public class DongtuClient {
    String m_ip;
    String m_userName;
    String m_passWord;

    public DongtuClient(String p_EMSID) {
        //m_ip = "172.18.1.8";
        m_ip = "192.168.0.199";
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
     * ???EMS????
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
        //??????��??��  OK
        getAllEMSAndMEActiveAlarms(m_emsSession_I);
        String name = "10";//?��id
        String port = "KYLANDCPU";
        getPTPAllCurrentPMData(name,port,m_emsSession_I);
        String startTime = "2016-01-01 00:00:00";
        String endTime = "2019-01-01 00:00:00";
        //getPTPHisCurrentPMData(name,port,startTime,endTime,m_emsSession_I);
        //??????��??????????? OK7
        //Resourcemonitor_T[] resourcemonitor_Ts = getAllResourceMonitor(m_emsSession_I);

        //???��??????  //???��?????? ?????????????????
        //?????????????? OK
        //Resourcemonitor_T resourcemonitor_T = resourcemonitor_Ts[3];
        //???????????????????
        //resourcemonitor_T.majorLimit = "50";
       // resourcemonitor_T.minorLimit = "40";
        //updateResourceMonitor(m_emsSession_I, resourcemonitor_T);

        //?????????????? OK
        //String deviceid = "15";
        //String resourceTypes = getAllResourceType(m_emsSession_I, deviceid);

        //?????????????? OK
       //String resourceNames = getAllResourceName(m_emsSession_I, deviceid);

        //???????????????????? OK
        //String resourceType = "CPU"+encoding("?????");
        //String resourceMonitorName = getAllResourceMonitorName(m_emsSession_I, deviceid,resourceType);

        //?????????????? OK
//        String deviceidString = "1";
//        String resourceName = encoding("???");
//        String monitorItem = encoding("????????????????");
//        int how_many = 100;
//        String startTime = "2016-01-01 00:00:00";
//        String endTime = "2019-01-01 00:00:00";
        //PMResourceIterator_IHolder pmIt = new PMResourceIterator_IHolder();
//        getAllHisCurrentPMData(m_emsSession_I, deviceidString, resourceName, monitorItem, how_many, startTime, endTime, pmIt);

        //???????��??????????
       // String deviceidString = "1";
//        PMResource_T[] pmResource_Ts = getAllCurrentPMDataNew(m_emsSession_I, deviceidString);
        //???????? OK
//        Process_T process = new Process_T();
//        process.name = "dldo.exe";
//        process.state = "1";
//        process.dn = "";
//        process.id = 1;
//        process.type ="1";
//        process.index = "";
        //addProcess(m_emsSession_I, process,deviceid);

        //??????��??? OK
      //Process_T[] process_ts = FindAllProcess(m_emsSession_I, deviceid);

        //??????? OK
       // deleteProcess(m_emsSession_I, process_ts[1],deviceid);
    }

    /***
     * ??????????
     * @param name
     * @param emsSession_I
     */
    private static void getAllPTPs(String name, EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //???Session???????????????????
                emsSession_I.getManager("ManagedElement", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return;
            }
            ManagedElementMgr_I emsMgr = ManagedElementMgr_IHelper.narrow(mgrIntf);
            ManagedElement_THolder meLstTH = new ManagedElement_THolder();
            NameAndStringValue_T[] array = new NameAndStringValue_T[2];
            array[0] = new NameAndStringValue_T("EMS", "KYLAND/kyvision");
            array[1] = new NameAndStringValue_T("ManagedElement", name);
            TerminationPointList_THolder eventList = new TerminationPointList_THolder();
            TerminationPointIterator_IHolder eventIt = new TerminationPointIterator_IHolder();
            short[] lay = new short[1];
            lay[0] = 1;
            short[] con = new short[1];
            con[0] = 1;
            int how_many = 100;
            if (emsMgr != null) {
                emsMgr.getAllPTPs(array,lay,con, how_many, eventList, eventIt);
            }

            System.out.println("eventList.value.length=" + eventList.value.length);

        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }

    /**
     * ??????��??��
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
            System.out.println("alarm length: "+listHolder.value.length);
            if (listHolder.value != null) {
                StructuredEvent[] t_array;
                int j = (t_array = listHolder.value).length;
                for (int i = 0; i < j; i++) {
                    if ((mgdElmT = t_array[i]) != null) {
                        System.out.println("--------------------------------------------------"+i);
                        java.lang.Object obj = mgdElmT;
                        generateMsg(obj,"NT_ALARM");
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
                                    generateMsg(obj,"NT_ALARM");
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

    /***
     * ??????????
     * @param name
     * @param port
     * @param starttime
     * @param endtime
     * @param emsSession_I
     */
    private static void getPTPHisCurrentPMData(String name, String port, String starttime,String endtime, EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //???Session???????????????????
                emsSession_I.getManager("PerformanceManagement", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return;
            }
            PerformanceManagementMgr_I emsMgr = PerformanceManagementMgr_IHelper.narrow(mgrIntf);


            ManagedElement_THolder meLstTH = new ManagedElement_THolder();
            PMTPSelect_T[] selectPorts = new PMTPSelect_T[1];

            NameAndStringValue_T[] array = new NameAndStringValue_T[3];
            array[0] = new NameAndStringValue_T("EMS", "KYLAND/kyvision");
            array[1] = new NameAndStringValue_T("ManagedElement", name);
            array[2] = new NameAndStringValue_T("PTP", port);
            PMTPSelect_T pmtpSelect_t = new PMTPSelect_T();
            pmtpSelect_t.name = array;
            String s = "s";
            String[] strings = new String[1];
            strings[0] = s;
            pmtpSelect_t.granularityList = strings;
            String s1 = "s";
            String[] strings1 = new String[1];
            strings1[0] = s1;
            pmtpSelect_t.pMLocationList = strings1;
            short sh =1;
            short[] shorts = new short[1];
            shorts[0] = sh;
            pmtpSelect_t.layerRateList = shorts;
            selectPorts[0] = pmtpSelect_t;
            PMDataList_THolder pmList = new PMDataList_THolder();
            PMDataIterator_IHolder pmIt = new PMDataIterator_IHolder();
            String[] parameter = new String[]{encoding("CPU?????????????"), "ifDescr", "ifOperstatus", "ifInOctets", "ifInUcastPkts", "ifInNUcastPkts", "ifInDiscards", "ifInErrors",
                    "ifOutOctets", "ifOutUcastPkts", "ifOutNUcastPkts", "ifOutDiscards", "ifOutErrors", "RxPower", "TxPower"};
            int how_many = 100;
            if (emsMgr != null) {
                emsMgr.getTPHistoryPMData(selectPorts, parameter,starttime,endtime, how_many, pmList, pmIt);
            }

            System.out.println("eventList.value.length=" + pmList.value.length);

        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }

    /***
     * ??????????
     * @param name
     * @param port
     * @param emsSession_I
     */
    private static void getPTPAllCurrentPMData(String name, String port, EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //???Session???????????????????
                emsSession_I.getManager("PerformanceManagement", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return;
            }
            PerformanceManagementMgr_I emsMgr = PerformanceManagementMgr_IHelper.narrow(mgrIntf);


            ManagedElement_THolder meLstTH = new ManagedElement_THolder();
            PMTPSelect_T[] selectPorts = new PMTPSelect_T[1];

            NameAndStringValue_T[] array = new NameAndStringValue_T[3];
            array[0] = new NameAndStringValue_T("EMS", "KYLAND/kyvision");
            array[1] = new NameAndStringValue_T("ManagedElement", name);
            array[2] = new NameAndStringValue_T("PTP", port);
            PMTPSelect_T pmtpSelect_t = new PMTPSelect_T();
            pmtpSelect_t.name = array;
            String s = "s";
            String[] strings = new String[1];
            strings[0] = s;
            pmtpSelect_t.granularityList = strings;
            String s1 = "s";
            String[] strings1 = new String[1];
            strings1[0] = s1;
            pmtpSelect_t.pMLocationList = strings1;
            short sh =1;
            short[] shorts = new short[1];
            shorts[0] = sh;
            pmtpSelect_t.layerRateList = shorts;
            selectPorts[0] = pmtpSelect_t;
            PMDataList_THolder pmList = new PMDataList_THolder();
            PMDataIterator_IHolder pmIt = new PMDataIterator_IHolder();
            String[] parameter = new String[]{"ifIndex", "ifDescr", "ifOperstatus", "ifInOctets", "ifInUcastPkts", "ifInNUcastPkts", "ifInDiscards", "ifInErrors",
                    "ifOutOctets", "ifOutUcastPkts", "ifOutNUcastPkts", "ifOutDiscards", "ifOutErrors", "RxPower", "TxPower"};
            int how_many = 100;
            if (emsMgr != null) {
                emsMgr.getAllCurrentPMData(selectPorts, parameter, how_many, pmList, pmIt);
            }

            System.out.println("eventList.value.length=" + pmList.value.length);

        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }

    /***
     * ???????��
     * @param name
     * @param emsSession_I
     */
    private static void getMEHisAlarms(String name, EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //???Session???????????????????
                emsSession_I.getManager("KYLAND_alarmMgr", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return;
            }
            KYLAND_alarmMgr_I emsMgr = KYLAND_alarmMgr_IHelper.narrow(mgrIntf);


            String[] excludeProbCauseList = new String[0];
            PerceivedSeverity_T[] excludeSeverityList = new PerceivedSeverity_T[0];
            int[] alarmtypeList = new int[0];
            EventList_THolder listHolder = new EventList_THolder();
            EventIterator_IHolder itHolder = new EventIterator_IHolder();
            int how_many = 100;
            NameAndStringValue_T[] array = new NameAndStringValue_T[2];
            array[0] = new NameAndStringValue_T("EMS", "KYLAND/kyvision");
            array[1] = new NameAndStringValue_T("ManagedElement", name);

            DateFormat stdFormatterInMillis = new SimpleDateFormat("yyyyMMddHHmmss");
            String endtime = stdFormatterInMillis.format(new Date());
            String starttime = "20170601000000";
            if (emsMgr != null) {
                emsMgr.getMEHisAlarms(excludeProbCauseList, excludeSeverityList, alarmtypeList, array, how_many, starttime, endtime, listHolder, itHolder);
            }
            System.out.println("eventList.value.length=" + listHolder.value.length);
            StructuredEvent mgdElmT = new StructuredEvent();
            System.out.println("alarm length: "+listHolder.value.length);
            if (listHolder.value != null) {
                StructuredEvent[] t_array;
                int j = (t_array = listHolder.value).length;
                for (int i = 0; i < j; i++) {
                    if ((mgdElmT = t_array[i]) != null) {
                        System.out.println("--------------------------------------------------"+i);
                        java.lang.Object obj = mgdElmT;
                        generateMsg(obj,"NT_ALARM");
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
                                    generateMsg(obj,"NT_ALARM");
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


    /***
     * ???????��
     * @param emsSession_I
     */
    private static void getAllHisAlarms(EmsSession_I emsSession_I) {

        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //???Session???????????????????
                emsSession_I.getManager("KYLAND_alarmMgr", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return;
            }
            KYLAND_alarmMgr_I emsMgr = KYLAND_alarmMgr_IHelper.narrow(mgrIntf);
            String[] excludeProbCauseList = new String[0];
            PerceivedSeverity_T[] excludeSeverityList = new PerceivedSeverity_T[0];
            int[] alarmtypeList = new int[0];
            EventList_THolder listHolder = new EventList_THolder();
            EventIterator_IHolder itHolder = new EventIterator_IHolder();
            int how_many = 100;
            DateFormat stdFormatterInMillis = new SimpleDateFormat("yyyyMMddHHmmss");
            String endtime = stdFormatterInMillis.format(new Date());
            String starttime = "20170601000000";
            if (emsMgr != null) {
                emsMgr.getAllHisAlarms(excludeProbCauseList, excludeSeverityList, alarmtypeList, how_many, starttime, endtime, listHolder, itHolder);
            }
            System.out.println("eventList.value.length=" + listHolder.value.length);
            StructuredEvent mgdElmT = new StructuredEvent();
            System.out.println("alarm length: "+listHolder.value.length);
            if (listHolder.value != null) {
                StructuredEvent[] t_array;
                int j = (t_array = listHolder.value).length;
                for (int i = 0; i < j; i++) {
                    if ((mgdElmT = t_array[i]) != null) {
                        System.out.println("--------------------------------------------------"+i);
                        java.lang.Object obj = mgdElmT;
                        generateMsg(obj,"NT_ALARM");
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
                                    generateMsg(obj,"NT_ALARM");
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
     * ??????EMS?????��????????
     * @param emsSession_I
     * @return
     */
//    public static Resourcemonitor_T[] getAllResourceMonitor(EmsSession_I emsSession_I) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //???Session???????????????????
//                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
//                mgrIntf = comHldr.value;
//            }
//            if (mgrIntf == null) {
//                return null;
//            }
//            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
//            ResourcemonitorList_THolder resourcemonitorList_T = new ResourcemonitorList_THolder();
//            if (kYLAND_pmMgr_I != null) {
//
//                kYLAND_pmMgr_I.getResourceMonitor(getSelectPara(), resourcemonitorList_T);
//            }
//            for (int i = 0; i < resourcemonitorList_T.value.length; i++) {
//                ToGBKEncode(resourcemonitorList_T.value[i].toString());
//            }
//            return resourcemonitorList_T.value;
//
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    /**
     * ???��??????
     * @param emsSession_I
     * @param resourcemonitor_T
     */
//    public static void updateResourceMonitor(EmsSession_I emsSession_I, Resourcemonitor_T resourcemonitor_T) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //???Session???????????????????
//                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
//                mgrIntf = comHldr.value;
//            }
//            if (mgrIntf == null) {
//                return;
//            }
//            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
//            //ResourcemonitorList_THolder resourcemonitorList_T = new ResourcemonitorList_THolder();
//            if (kYLAND_pmMgr_I != null)
//            {
//                kYLAND_pmMgr_I.updateResourceMonitor(getSelectPara(), resourcemonitor_T);
//            }
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//    }

    //?????????????  deviceid

    /**
     *
     * @param emsSession_I
     * @param deviceid ?��id
     * @return
     */
//    public static PMResource_T[] getAllCurrentPMDataNew(EmsSession_I emsSession_I, String deviceid) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //???Session???????????????????
//                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
//                mgrIntf = comHldr.value;
//            }
//            if (mgrIntf == null) {
//                return null;
//            }
//            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
//            PMResourceList_THolder pmResourceList = new PMResourceList_THolder();
//            if (kYLAND_pmMgr_I != null) {
//                PMTPSelect_T[] pmtpSelect_Ts = getSelectPara();
//                pmtpSelect_Ts[0].name[1].value = deviceid;
//                kYLAND_pmMgr_I.getAllCurrentPMDataNew(pmtpSelect_Ts, pmResourceList);
//            }
//            for (int i = 0; i < pmResourceList.value.length; i++) {
//                ToGBKEncode(pmResourceList.value[i].toString());
//            }
//            return pmResourceList.value;
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//        return null;
//
//    }

    /**
     * ??????????????
     * @param emsSession_I
     * @param deviceid ?��id
     * @param resourceName ???????
     * @param monitorItem ???????
     * @param how_many ????
     * @param startTime ??????
     * @param endTime ???????
     * @param pmIt ????????????
     * @return
     */
//    public static PMResource_T[] getAllHisCurrentPMData(EmsSession_I emsSession_I, String deviceid, String resourceName, String monitorItem, int how_many, String startTime, String endTime, PMResourceIterator_IHolder pmIt) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //???Session???????????????????
//                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
//                mgrIntf = comHldr.value;
//            }
//            if (mgrIntf == null) {
//                return null;
//            }
//            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
//            PMResourceList_THolder pmResourceList = new PMResourceList_THolder();
//
//            if (kYLAND_pmMgr_I != null) {
//                PMTPSelect_T[] select_ts = getSelectPara();
//                select_ts[0].name[1].value = deviceid;
//                select_ts[0].name[2].value = resourceName;
//                select_ts[0].name[3].value = monitorItem;
//                kYLAND_pmMgr_I.getAllHisCurrentPMData(select_ts, how_many, startTime, endTime, pmResourceList, pmIt);
//            }
//            for (int i = 0; i < pmResourceList.value.length; i++) {
//                PMResource_T pmResource_t = pmResourceList.value[i];
//                ToGBKEncode(pmResource_t.toString());
//            }
//
//            return pmResourceList.value;
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    /**
     * ??????????????
     * @param
     * @param  ?��id
     * @return
     */
//    public static String getAllResourceType(EmsSession_I emsSession_I, String deviceid) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //???Session???????????????????
//                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
//                mgrIntf = comHldr.value;
//            }
//            if (mgrIntf == null) {
//                return null;
//            }
//            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
//            StringHolder resourceTypes = new StringHolder();
//            if (kYLAND_pmMgr_I != null) {
//                PMTPSelect_T[] select_ts = getSelectPara();
//                select_ts[0].name[1].value = deviceid;
//                kYLAND_pmMgr_I.getAllResourceType(select_ts, resourceTypes);
//            }
//            ToGBKEncode(resourceTypes.value.toString());
//            return resourceTypes.value;
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    /**
//     * ??????????????
//     * @param emsSession_I
//     * @param deviceid ?��id
//     * @return
//     */
//    public static String getAllResourceName(EmsSession_I emsSession_I, String deviceid) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //???Session???????????????????
//                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
//                mgrIntf = comHldr.value;
//            }
//            if (mgrIntf == null) {
//                return null;
//            }
//            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
//            StringHolder resourceNames = new StringHolder();
//            if (kYLAND_pmMgr_I != null) {
//                PMTPSelect_T[] select_ts = getSelectPara();
//                select_ts[0].name[1].value = deviceid;
//                kYLAND_pmMgr_I.getAllResourceName(select_ts, resourceNames);
//            }
//            ToGBKEncode(resourceNames.value.toString());
//            return resourceNames.value;
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    /**
//     * ????????????????????
//     * @param emsSession_I
//     * @param deviceid ?��id
//     * @param resourceType ???????
//     * @return
//     */
//    public static String getAllResourceMonitorName(EmsSession_I emsSession_I, String deviceid, String resourceType) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //???Session???????????????????
//                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
//                mgrIntf = comHldr.value;
//            }
//            if (mgrIntf == null) {
//                return null;
//            }
//            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
//            StringHolder resourceMonitorNames = new StringHolder();
//            if (kYLAND_pmMgr_I != null) {
//                PMTPSelect_T[] select_ts = getSelectPara();
//                select_ts[0].name[1].value = deviceid;
//                select_ts[0].name[2].value = resourceType;
//                select_ts[0].name[2].name = "resourceType";
//                kYLAND_pmMgr_I.getAllResourceMonitorName(select_ts, resourceMonitorNames);
//            }
//            ToGBKEncode(resourceMonitorNames.value.toString());
//            return resourceMonitorNames.value;
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    /**
//     * ????????
//     * @param emsSession_I
//     * @param process ????
//     * @param deviceid ?��id
//     */
//    public static void addProcess(EmsSession_I emsSession_I, Process_T process, String deviceid) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //???Session???????????????????
//                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
//                mgrIntf = comHldr.value;
//            }
//            if (mgrIntf == null) {
//                return;
//            }
//            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
//
//            if (kYLAND_pmMgr_I != null) {
//                PMTPSelect_T[] select_ts = getSelectPara();
//                select_ts[0].name[1].value = deviceid;
//                kYLAND_pmMgr_I.addProcess(select_ts, process);
//            }
//
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     ???????
//     @param   emsSession_I
//     @param   process ????
//     @param   deviceid ?��id
//     @return
//     */
//    public static void deleteProcess(EmsSession_I emsSession_I, Process_T process, String deviceid) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //???Session???????????????????
//                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
//                mgrIntf = comHldr.value;
//            }
//            if (mgrIntf == null) {
//                return;
//            }
//            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
//            if (kYLAND_pmMgr_I != null) {
//                PMTPSelect_T[] select_ts = getSelectPara();
//                select_ts[0].name[1].value = deviceid;
//                kYLAND_pmMgr_I.deleteProcess(select_ts, process);
//            }
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     ??????��??????????
//     @param   emsSession_I
//     @param   deviceid ?��id
//     @return
//     */
//    public static Process_T[] FindAllProcess(EmsSession_I emsSession_I, String deviceid) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //???Session???????????????????
//                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
//                mgrIntf = comHldr.value;
//            }
//            if (mgrIntf == null) {
//                return null;
//            }
//            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
//            ProcessList_THolder processList_tHolder = new ProcessList_THolder();
//            if (kYLAND_pmMgr_I != null) {
//                PMTPSelect_T[] select_ts = getSelectPara();
//                select_ts[0].name[1].value = deviceid;
//                kYLAND_pmMgr_I.FindAllProcess(select_ts, processList_tHolder);
//            }
//            for (Process_T process_t : processList_tHolder.value) {
//               ToGBKEncode(process_t.toString());
//            }
//            return processList_tHolder.value;
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    public static void generateMsg(java.lang.Object object,String s)
    {
        StructuredEvent mgdElmT = (StructuredEvent)object;
        for (int ii = 0; ii < mgdElmT.filterable_data.length; ii++) {
            System.out.println(mgdElmT.filterable_data[ii].name);
            if(ii==1)
            {
                NameAndStringValue_T[] nameAndStringValue_ts = NamingAttributes_THelper.extract(mgdElmT.filterable_data[ii].value);
                for (NameAndStringValue_T n:nameAndStringValue_ts)
                {
                    System.out.println(n.name+":   "+n.value);
                }
            }
            else if (ii==2) {
                ToGBKEncode(mgdElmT.filterable_data[ii].value.extract_wstring());
            }
            else if(ii==6){
                System.out.println(mgdElmT.filterable_data[ii].value.extract_boolean());
            }
            else if(ii==8){
                System.out.println(mgdElmT.filterable_data[ii].value.extract_long());
            }
            else if(ii==9){
                PerceivedSeverity_T perceivedSeverity_t = PerceivedSeverity_THelper.extract(mgdElmT.filterable_data[ii].value);
                System.out.println(perceivedSeverity_t.value());
            }else
            {
                ToGBKEncode(mgdElmT.filterable_data[ii].value.extract_string());
            }

        }
    }

    /**
     * ????GBK????
     * @param args
     */
    public static void ToGBKEncode(String args) {
        String str = args;
        try {
            byte[] temp = str.getBytes("iso8859-1");//????��??????
            String newStr = new String(temp, "GBK");//????��??????????
            System.out.println(newStr);
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Decode failed");
        }
    }

    /**
     * ????ISO8859-1????
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
     * ?????????????????????
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