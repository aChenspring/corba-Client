
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.omg.CORBA.*;
import org.omg.CORBA.Object;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNotification.Property;
import org.omg.CosNotification.StructuredEvent;

import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import com.sun.org.apache.regexp.internal.recompile;
import org.tmforum.mtnm.KYLAND_alarmMgr.KYLAND_alarmMgr_I;
import org.tmforum.mtnm.KYLAND_alarmMgr.KYLAND_alarmMgr_IHelper;
import org.tmforum.mtnm.common.Common_I;
import org.tmforum.mtnm.common.Common_IHolder;
import org.tmforum.mtnm.emsMgr.EMSMgr_I;
import org.tmforum.mtnm.emsMgr.EMSMgr_IHelper;
import org.tmforum.mtnm.emsMgr.EMS_T;
import org.tmforum.mtnm.emsMgr.EMS_THolder;
import org.tmforum.mtnm.emsSession.EmsSession_I;
import org.tmforum.mtnm.emsSession.EmsSession_IHolder;
import org.tmforum.mtnm.emsSessionFactory.EmsSessionFactory_I;
import org.tmforum.mtnm.emsSessionFactory.EmsSessionFactory_IHelper;
import org.tmforum.mtnm.equipment.EquipmentInventoryMgr_I;
import org.tmforum.mtnm.equipment.EquipmentInventoryMgr_IHelper;
import org.tmforum.mtnm.globaldefs.NameAndStringValue_T;
import org.tmforum.mtnm.globaldefs.NamingAttributes_THelper;
import org.tmforum.mtnm.globaldefs.ProcessingFailureException;
import org.tmforum.mtnm.managedElement.ManagedElementIterator_IHolder;
import org.tmforum.mtnm.managedElement.ManagedElementList_THolder;
import org.tmforum.mtnm.managedElement.ManagedElement_T;
import org.tmforum.mtnm.managedElement.ManagedElement_THolder;
import org.tmforum.mtnm.managedElementManager.ManagedElementMgr_I;
import org.tmforum.mtnm.managedElementManager.ManagedElementMgr_IHelper;
import org.tmforum.mtnm.multiLayerSubnetwork.*;
import org.tmforum.mtnm.nmsSession.NmsSession_I;
import org.tmforum.mtnm.nmsSession.NmsSession_IPOATie;
import org.tmforum.mtnm.notifications.EventIterator_IHolder;

import org.tmforum.mtnm.notifications.EventList_THolder;
import org.tmforum.mtnm.notifications.PerceivedSeverity_T;
import org.tmforum.mtnm.performance.*;
import org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder;
import org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder;
import org.tmforum.mtnm.topologicalLink.TopologicalLinkIterator_IHolder;
import org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THolder;
import org.tmforum.mtnm.topologicalLink.TopologicalLink_T;

public class Demo {
    public static void main(String[] args) {
        String ip = args[0];
        String user = "admin";
        String pw = "admin";
        int m_ConnectCount = 0;
        while (true) {
            m_ConnectCount++;
            try {
                Thread.currentThread();
                Thread.sleep(3000);
                System.out.println("Conn " + m_ConnectCount + " Start ");
                getConnect(ip, user, pw);
                break;
            } catch (Exception e) {
                System.out.println(e);
                continue;
            }
        }
    }
    public static void getConnect(String ip, String user, String pw) throws Exception {
        try {
            //��ʼ��ORB
            String[] strs = new String[2];
            strs[0] = "-ORBInitRef";
            strs[1] = ("NameService=corbaloc::" + ip + ":9900/NameService");
            ORB global_orb = ORB.init(strs, null);
            //��ȡPOA
            Object root_poa = global_orb.resolve_initial_references("RootPOA");
            POA rpoa = POAHelper.narrow(root_poa);
            POA poa = rpoa.create_POA("myPolicy", null, new Policy[0]);
            poa.the_POAManager().activate();
            String objRef = "corbaloc::" + ip + ":9900/NameService";
            Object obj = global_orb.string_to_object(objRef);
            NamingContextExt root_context = NamingContextExtHelper.narrow(obj);

            //���������ռ�
            NameComponent[] path = new NameComponent[2];
            path[0] = new NameComponent("ky", "class");
            path[1] = new NameComponent("instance", "EmsSessionFactory");
            Object emsSessionI = root_context.resolve(path);

            EmsSession_I emsSession_I = null;
            SessionImpl mySessionImpl = new SessionImpl();
            //���EMS����
            EmsSessionFactory_I ems_ref = EmsSessionFactory_IHelper.narrow(emsSessionI);
            EmsSession_IHolder emsSessionHldr = new EmsSession_IHolder();
            NmsSession_IPOATie tieobj = new NmsSession_IPOATie(mySessionImpl, poa);
            poa.activate_object(tieobj);
            NmsSession_I nmsSession_ref = tieobj._this();
            if (ems_ref != null) {

                //ems_ref.getVersion();
                //��ȡEMS�Ự
                try {
                    ems_ref.getEmsSession(user, pw, nmsSession_ref, emsSessionHldr);
                    emsSession_I = emsSessionHldr.value;
                } catch (Exception e) {
                    e.printStackTrace();
                    ems_ref.getEmsSession(user, pw, nmsSession_ref, emsSessionHldr);
                    emsSession_I = emsSessionHldr.value;
                }
            }

            //��1����ȡEMS��Ϣ
            //getEMS(emsSession_I);
//            //��3����ѯEMS�������ж�������
            //getAllTopoLevelSubnetworks(emsSession_I);
//            //��4����ȡEMS���ܺ�������Ԫ�Ļ�澯
           // getAllEMSAndMEActiveAlarms(emsSession_I);
//            //��5����ȡEMS���ܶ�����������
            getAllTopLevelTopologicLinks(emsSession_I);
            //getAllTopoLevelSubnetworks(emsSession_I);
//            //multiLayerSubnetwork.idl
//            //��6����ȡ������������Ԫ
            String subnetname = "2";
           // getMultiLayerSubnetworkAllManagedElements(subnetname,emsSession_I);
//            //��7����ȡ������������Ԫ����
           //getSubnetAllTopologicalLinks(subnetname,emsSession_I);
//            //��8���������subnetName��������
            //getMultiLayerSubnetwork(subnetname,emsSession_I);
//
//
//            //managedElementManager.idl
//            //��2����ȡ������Ԫ
           // getManagerElepments(emsSession_I);
//            //��9����ȡָ����Ԫ
            String name = "14";//�豸id
            //getManagedElement(name,emsSession_I);
//            //��10����ȡָ����Ԫ�ĸ澯
             //getAllActiveAlarms(name,emsSession_I);
//
//            //equipment.idl
//            //��ȡ�豸�Ķ˿�
            //getAllPTPs(name ,emsSession_I);

            //getAllSupportedPTPs(name ,emsSession_I);
            //performance.idl
            //��ȡָ���豸��ǰ����
            String port = "FX-18";
            //System.out.println("��˹���豸id:16:--ip:192.168.0.8�������ݲɼ�");
            //wagetPTPAllCurrentPMData(name,port,emsSession_I);
//            System.out.println("Kyland�豸id:10--ip:192.168.0.3�������ݲɼ�");
            getPTPAllCurrentPMData("10",port,emsSession_I);
//            System.out.println("MOXA�豸id:19--ip:192.168.0.88�������ݲɼ�");
//            getPTPAllCurrentPMData("19",port,emsSession_I);
//            System.out.println("�������豸id:2---ip:192.168.50.199�������ݲɼ�");
//            getPTPAllCurrentPMData("2",port,emsSession_I);
//            String startTime = "2016-01-01 00:00:00";
//            String endTime = "2019-01-01 00:00:00";
//            getPTPHisCurrentPMData(name,port,startTime,endTime,emsSession_I);
//            //KYLAND_alarmMgr.idl
//            //��ȡEMS��ʷ�澯
          // getAllHisAlarms(emsSession_I);
//
//            //��ȡָ����Ԫ����ʷ�澯
            //getMEHisAlarms(name,emsSession_I);

            //KYLAND_pmMgr.idl,֮ǰ�İ汾�����������ڰ�֮ǰ��ͨ�޸Ľӿ�
            //��ȡ��Ԫ���������ݣ�����CPU��ǰʹ����cpuCurrentUtilRate��CPUƽ��ʹ����cpuLongTimeUtilRate��ȫ���ڴ�devMemoryTotalNum����ʹ���ڴ�devMemoryFreeNum���Ѿ������ڴ�devMemoryAllocNum
            //getManagerElementPMData(name,emsSession_I);

            //��ȡ���й�����Ϣ
            //Resourcemonitor_T[] resourcemonitor_Ts = getAllResourceMonitor(emsSession_I);

            //���ù�����ֵ  //���ù�����ֵ ��Ҫ�Ȼ�ȡ������ֵģ��
            //��ȡ��һ����ֵģ��
//			 Resourcemonitor_T resourcemonitor_T = resourcemonitor_Ts[0];
//			 //���������ֵģ����Ҫ��ֵ
//			 resourcemonitor_T.majorLimit = "50";
//			 resourcemonitor_T.minorLimit = "40";
//			 updateResourceMonitor(emsSession_I, resourcemonitor_T);
//			
//			
//			//��ȡָ���豸ʵʱ��������
            //String deviceidString = "1";
//            PMResource_T[] pmResource_Ts = getAllCurrentPMDataNew(emsSession_I, deviceidString);


            //��ȡ��ʷ��������
           // String deviceidString = "1";
//            String resourceName = "";
//            String monitorItem = "";
//            int how_many = 100;
//            String startTime = "";
//            String endTime = "";
           // PMResourceIterator_IHolder pmIt = new PMResourceIterator_IHolder();
          // getAllHisCurrentPMData(emsSession_I, deviceidString, resourceName, monitorItem, how_many, startTime, endTime, pmIt);

            //��ȡ������Դ����
            //String deviceid = "1";
            //String resourceTypes = getAllResourceType(emsSession_I, deviceid);

            //��ȡ������Դ����
            //String resourceNames = getAllResourceName(emsSession_I, deviceid);

            //��ȡ�������ܼ���������
            //String resourceType = "";
            //String resourceMonitorName = getAllResourceMonitorName(emsSession_I, deviceid, resourceType);

            //��������
            //Process_T process = new Process_T();
            //addProcess(emsSession_I, process, deviceid);

            //ɾ������
            //deleteProcess(emsSession_I, process, deviceid);

            //��ȡ���н���
            //Process_T[] process_ts = FindAllProcess(emsSession_I, deviceid);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void getPTPHisCurrentPMData(String name, String port, String starttime,String endtime, EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
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
            String[] parameter = new String[]{encoding("�������������ܼ���:C"), "ifDescr", "ifOperstatus", "ifInOctets", "ifInUcastPkts", "ifInNUcastPkts", "ifInDiscards", "ifInErrors",
                    "ifOutOctets", "ifOutUcastPkts", "ifOutNUcastPkts", "ifOutDiscards", "ifOutErrors", "RxPower", "TxPower"};
            int how_many = 100;
            if (emsMgr != null) {
                emsMgr.getTPHistoryPMData(selectPorts, parameter,starttime,endtime, how_many, pmList, pmIt);
            }

            System.out.println("eventList.value.length=" + pmList.value[0].pmMeasurementList[0].pmParameterName);



        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }
//    private static void getManagerElementPMData(String name, EmsSession_I emsSession_I) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
//                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
//                mgrIntf = comHldr.value;
//            }
//            if (mgrIntf == null) {
//                return;
//            }
//            KYLAND_pmMgr_I emsMgr = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
//
//            int how_many = 100;
//            PMTPSelect_T[] selectMos = new PMTPSelect_T[1];
//            NameAndStringValue_T[] array = new NameAndStringValue_T[2];
//            array[0] = new NameAndStringValue_T("EMS", "KYLAND/kyvision");
//            array[1] = new NameAndStringValue_T("ManagedElement", name);
//            selectMos[0].name = array;
//            PMDataList_THolder pmList = new PMDataList_THolder();
//            PMDataIterator_IHolder pmIt = new PMDataIterator_IHolder();
//
//
//            if (emsMgr != null) {
//                emsMgr.getAllCurrentPMData(selectMos, how_many, pmList, pmIt);
//            }
//
//            System.out.println("pmList.value.length=" + pmList.value.length);
//
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//    }


    private static void getMEHisAlarms(String name, EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
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
            EventList_THolder eventList = new EventList_THolder();
            EventIterator_IHolder eventIt = new EventIterator_IHolder();
            int how_many = 1000;
            NameAndStringValue_T[] array = new NameAndStringValue_T[2];
            array[0] = new NameAndStringValue_T("EMS", "KYLAND/kyvision");
            array[1] = new NameAndStringValue_T("ManagedElement", name);

            DateFormat stdFormatterInMillis = new SimpleDateFormat("yyyyMMddHHmmss");
            String endtime = stdFormatterInMillis.format(new Date());
            String starttime = "20170601000000";
            if (emsMgr != null) {
                emsMgr.getMEHisAlarms(excludeProbCauseList, excludeSeverityList, alarmtypeList, array, how_many, starttime, endtime, eventList, eventIt);
            }
            System.out.println("eventList.value.length=" + eventList.value.length);
        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }


    private static void getAllHisAlarms(EmsSession_I emsSession_I) {

        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
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
            EventList_THolder eventList = new EventList_THolder();
            EventIterator_IHolder eventIt = new EventIterator_IHolder();
            int how_many = 100;


            DateFormat stdFormatterInMillis = new SimpleDateFormat("yyyyMMddHHmmss");
            String endtime = stdFormatterInMillis.format(new Date());
            String starttime = "20170601000000";
            if (emsMgr != null) {
                emsMgr.getAllHisAlarms(excludeProbCauseList, excludeSeverityList, alarmtypeList, how_many, starttime, endtime, eventList, eventIt);
            }
            System.out.println("eventList.value.length=" + eventList.value.length);
        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }

    }

    private static void getPTPAllCurrentPMData(String name, String port, EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
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

            System.out.println("��Դ��:" + pmList.value.length);
            for(int i=0;i<pmList.value.length;i++)
            {
                DongtuClient.ToGBKEncode(pmList.value[i].tpName[2].value+":");
                for(int j=0;j<pmList.value[i].pmMeasurementList.length;j++)
                {
                    DongtuClient.ToGBKEncode(pmList.value[i].pmMeasurementList[j].pmParameterName+" : "+pmList.value[i].pmMeasurementList[j].value);
                }

            }

        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }

    private static void getAllPTPs(String name, EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
                emsSession_I.getManager("ManagedElement", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return;
            }
            ManagedElementMgr_I emsMgr = ManagedElementMgr_IHelper.narrow(mgrIntf);
            //ManagedElement_THolder meLstTH = new ManagedElement_THolder();
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
            for(int i=0;i<eventList.value.length;i++)
            {
                DongtuClient.ToGBKEncode(eventList.value[i].name[2].value);
            }
            System.out.println("eventList.value.length=" + eventList.value.length);

        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }

    private static void getAllSupportedPTPs(String name, EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
                emsSession_I.getManager("EquipmentInventory", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return;
            }
            EquipmentInventoryMgr_I emsMgr = EquipmentInventoryMgr_IHelper.narrow(mgrIntf);
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
                emsMgr.getAllSupportedPTPs(array, how_many, eventList, eventIt);
            }
            for(int i=0;i<eventList.value.length;i++)
            {
                DongtuClient.ToGBKEncode(eventList.value[i].name[2].value);
            }
            System.out.println("eventList.value.length=" + eventList.value.length);

        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }

    private static void getAllActiveAlarms(String name, EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
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

            String[] excludeProbCauseList = new String[0];
            PerceivedSeverity_T[] excludeSeverityList = new PerceivedSeverity_T[0];
            EventList_THolder eventList = new EventList_THolder();
            EventIterator_IHolder eventIt = new EventIterator_IHolder();
            int how_many = 1000;
            if (emsMgr != null) {
                emsMgr.getAllActiveAlarms(array, excludeProbCauseList, excludeSeverityList, how_many, eventList, eventIt);
            }
            StructuredEvent mgdElmT = new StructuredEvent();
            if (eventList.value != null) {
                StructuredEvent[] t_array;
                int j = (t_array = eventList.value).length;
                for (int i = 0; i < j; i++) {
                    if ((mgdElmT = t_array[i]) != null) {
                        java.lang.Object obj = mgdElmT;
                        DongtuClient.generateMsg(obj,"NT_ALARM");
                    }
                }
                if (eventIt.value != null) {
                    boolean bool = true;
                    while (bool) {
                        bool = eventIt.value.next_n(how_many, eventList);
                        if (eventList.value != null) {
                            int k = (t_array = eventList.value).length;
                            for (j = 0; j < k; j++) {
                                if ((mgdElmT = t_array[j]) != null) {
                                    java.lang.Object obj = mgdElmT;
                                    DongtuClient.generateMsg(obj,"NT_ALARM");
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

    private static void getManagedElement(String name, EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
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

            if (emsMgr != null) {
                emsMgr.getManagedElement(array, meLstTH);
            }

            printManagedElement_T(meLstTH.value);

        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }

    private static void getMultiLayerSubnetwork(String subnetname, EmsSession_I emsSession_I) {

        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
                emsSession_I.getManager("MultiLayerSubnetwork", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return;
            }
            MultiLayerSubnetworkMgr_I emsMgr = MultiLayerSubnetworkMgr_IHelper.narrow(mgrIntf);


            MultiLayerSubnetwork_THolder meLstTH = new MultiLayerSubnetwork_THolder();

            NameAndStringValue_T[] array = new NameAndStringValue_T[2];
            array[0] = new NameAndStringValue_T("EMS", "KYLAND/kyvision");
            array[1] = new NameAndStringValue_T("MultiLayerSubnetwork", subnetname);

            if (emsMgr != null) {
                emsMgr.getMultiLayerSubnetwork(array, meLstTH);
            }

            System.out.println("meLstTH.value.length=" + meLstTH.value.nativeEMSName);


        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }

    private static void getSubnetAllTopologicalLinks(String subnetname, EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
                emsSession_I.getManager("MultiLayerSubnetwork", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return;
            }
            MultiLayerSubnetworkMgr_I emsMgr = MultiLayerSubnetworkMgr_IHelper.narrow(mgrIntf);
            int how_many = 50;
            TopologicalLinkList_THolder meLstTH = new TopologicalLinkList_THolder();
            TopologicalLinkIterator_IHolder meItrIH = new TopologicalLinkIterator_IHolder();
            NameAndStringValue_T[] array = new NameAndStringValue_T[2];
            array[0] = new NameAndStringValue_T("EMS", "KYLAND/kyvision");
            array[1] = new NameAndStringValue_T("MultiLayerSubnetwork", subnetname);
            if (emsMgr != null) {
                emsMgr.getAllTopologicalLinks(array, how_many, meLstTH, meItrIH);
            }
            System.out.println("meLstTH.value.length=" + meLstTH.value.length);
        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }

    private static void getMultiLayerSubnetworkAllManagedElements(String subnetname, EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
                emsSession_I.getManager("MultiLayerSubnetwork", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return;
            }
            MultiLayerSubnetworkMgr_I emsMgr = MultiLayerSubnetworkMgr_IHelper.narrow(mgrIntf);

            int how_many = 50;

            ManagedElement_T mgdElmT = new ManagedElement_T();
            ManagedElementList_THolder meLstTH = new ManagedElementList_THolder();
            ManagedElementIterator_IHolder meItrIH = new ManagedElementIterator_IHolder();
            NameAndStringValue_T[] array = new NameAndStringValue_T[2];
            array[0] = new NameAndStringValue_T("EMS", "KYLAND/kyvision");
            array[1] = new NameAndStringValue_T("MultiLayerSubnetwork", subnetname);

            if (emsMgr != null) {
                emsMgr.getAllManagedElements(array, how_many, meLstTH, meItrIH);
            }
            System.out.println("meLstTH.value.length=" + meLstTH.value.length);


        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }

    private static void getAllTopLevelTopologicLinks(EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
                emsSession_I.getManager("EMS", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return;
            }
            EMSMgr_I emsMgr = EMSMgr_IHelper.narrow(mgrIntf);

            int how_many = 1000;

            TopologicalLinkList_THolder linkList = new TopologicalLinkList_THolder();
            TopologicalLinkIterator_IHolder linkListIt = new TopologicalLinkIterator_IHolder();

            if (emsMgr != null) {
                emsMgr.getAllTopLevelTopologicalLinks(how_many, linkList, linkListIt);
            }
            if (linkList.value != null) {
                TopologicalLink_T[] array = linkList.value;
                for (int i = 0; i < array.length; i++) {
                    //System.out.println("zEndTP=" + array[i].zEndTP);
                    for (NameAndStringValue_T nsv : array[i].zEndTP) {
                        printNameAndStringValue_T(nsv);
                    }

                    for (NameAndStringValue_T nsv : array[i].aEndTP) {
                        printNameAndStringValue_T(nsv);
                    }
                }
            }
        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }

    private static void getAllEMSAndMEActiveAlarms(EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
                emsSession_I.getManager("EMS", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return;
            }
            EMSMgr_I emsMgr = EMSMgr_IHelper.narrow(mgrIntf);

            int how_many = 1000;
            String[] excludeProbCauseList = new String[0];
            PerceivedSeverity_T[] excludeSeverityList = new PerceivedSeverity_T[0];
            EventList_THolder eventList = new EventList_THolder();
            EventIterator_IHolder eventIt = new EventIterator_IHolder();

            if (emsMgr != null) {
                emsMgr.getAllEMSAndMEActiveAlarms(excludeProbCauseList, excludeSeverityList, how_many, eventList, eventIt);
                System.out.println(eventList.value.length);
            }
//            CosNotification.StructuredEvent[] alarmarray = eventList.value;
//
//            for (int i = 0; i < alarmarray.length; i++) {
//                CosNotification.Property[] ptarray = alarmarray[i].filterable_data;
//                for (int j = 0; j < ptarray.length; j++) {
//                    CosNotification.Property pt = ptarray[j];
//                    System.out.println("pt.name" + pt.name + ";pt.value=" + pt.value);
//                }
//            }


        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }

    private static void getAllTopoLevelSubnetworks(EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
                emsSession_I.getManager("EMS", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return;
            }
            EMSMgr_I emsMgr = EMSMgr_IHelper.narrow(mgrIntf);
            EMS_THolder emsTHldr = new EMS_THolder();
            int how_many = 1000;
            SubnetworkList_THolder listHolder = new SubnetworkList_THolder();
            SubnetworkIterator_IHolder itHolder = new SubnetworkIterator_IHolder();
            if (emsMgr != null) {
                emsMgr.getAllTopLevelSubnetworks(how_many, listHolder, itHolder);
            }
            printSubnet_T(listHolder.value);

        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }

    /*
     * ��һ����ȡEMS��Ϣ
     */
    private static void getEMS(EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
                emsSession_I.getManager("EMS", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return;
            }
            EMSMgr_I emsMgr = EMSMgr_IHelper.narrow(mgrIntf);
            EMS_THolder emsTHldr = new EMS_THolder();
            if (emsMgr != null) {
                emsMgr.getEMS(emsTHldr);
            }
            printEMS_T(emsTHldr.value);

        } catch (ProcessingFailureException e) {
            e.printStackTrace();
        }
    }

    /*
     * ��������ȡ������Ԫ
     */
    private static void getManagerElepments(EmsSession_I emsSession_I) {
        try {
            Common_IHolder comHldr = new Common_IHolder();
            Common_I mgrIntf = null;
            if (emsSession_I != null) {
                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
                emsSession_I.getManager("ManagedElement", comHldr);
                mgrIntf = comHldr.value;
            }
            if (mgrIntf == null) {
                return;
            }
            int count = 100;
            ManagedElementMgr_I mgrElmMgrI = ManagedElementMgr_IHelper.narrow(mgrIntf);
            ManagedElement_T mgdElmT = new ManagedElement_T();
            ManagedElementList_THolder meLstTH = new ManagedElementList_THolder();
            ManagedElementIterator_IHolder meItrIH = new ManagedElementIterator_IHolder();
            if (mgrElmMgrI != null) {
                mgrElmMgrI.getAllManagedElements(count, meLstTH, meItrIH);
            }
            if (meLstTH.value != null) {
                ManagedElement_T[] arrayOfManagedElement_T;
                int j = (arrayOfManagedElement_T = meLstTH.value).length;
                for (int i = 0; i < j; i++) {
                    if ((mgdElmT = arrayOfManagedElement_T[i]) != null) {
                        printManagedElement_T(mgdElmT);
//                        System.out.println("�豸id:"+mgdElmT.name[1].value+"��Դ���ݲɼ�");
//                        //getAllPTPs(mgdElmT.name[1].value,emsSession_I);
//                        System.out.println("�豸id:"+mgdElmT.name[1].value+"�������ݲɼ�");
//                        getPTPAllCurrentPMData(mgdElmT.name[1].value,"123",emsSession_I);
                    }
                }
                if (meItrIH.value != null) {
                    boolean bool = true;
                    while (bool) {
                        bool = meItrIH.value.next_n(count, meLstTH);
                        if (meLstTH.value != null) {
                            int k = (arrayOfManagedElement_T = meLstTH.value).length;
                            for (j = 0; j < k; j++) {
                                if ((mgdElmT = arrayOfManagedElement_T[j]) != null) {
                                    printManagedElement_T(mgdElmT);
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

    //��ȡָ��EMS�����й��ϼ���������
//    private static void getAllResourceMonitorName(EmsSession_I emsSession_I) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
//                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
//                mgrIntf = comHldr.value;
//            }
//            if (mgrIntf == null) {
//                return;
//            }
//            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
//            StringHolder resourceMonitorName = new StringHolder();
//            if (kYLAND_pmMgr_I != null) {
//
//                kYLAND_pmMgr_I.getAllResourceMonitorName(getSelectPara(), resourceMonitorName);
//            }
//            System.out.println(resourceMonitorName.value);
//
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//    }
//
//    //��ȡָ��EMS�����й��ϼ�����
//    private static Resourcemonitor_T[] getAllResourceMonitor(EmsSession_I emsSession_I) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
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
//                System.out.println(resourcemonitorList_T.value[i].toString());
//            }
//            return resourcemonitorList_T.value;
//
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    private static void printSubnet_T(MultiLayerSubnetwork_T[] ems_T) {
        System.out.println("******************************************************");
        for (int i = 0; i < ems_T.length; i++) {

            for (NameAndStringValue_T nsv : ems_T[i].name) {
                printNameAndStringValue_T(nsv);
            }
        }

    }

    private static void printEMS_T(EMS_T ems_T) {
        System.out.println("******************************************************");
        System.out.println("name:");
        for (NameAndStringValue_T nsv : ems_T.name) {
            printNameAndStringValue_T(nsv);
        }
        System.out.println("userLabel     =" + ems_T.userLabel);
        System.out.println("nativeEMSName =" + ems_T.nativeEMSName);
        System.out.println("owner         =" + ems_T.owner);
        System.out.println("emsVersion    =" + ems_T.emsVersion);
        System.out.println("type          =" + ems_T.type);
        System.out.println("additionalInfo:");
        for (NameAndStringValue_T nsv : ems_T.additionalInfo) {
            printNameAndStringValue_T(nsv);
        }
    }

    private static void printManagedElement_T(ManagedElement_T mElement_T) {
        System.out.println("******************************************************");
        System.out.println("name:");
        for (NameAndStringValue_T nsv : mElement_T.name) {
            printNameAndStringValue_T(nsv);
        }
        System.out.println("userLabel          =" + mElement_T.userLabel);
        System.out.println("nativeEMSName      ="  );
        DongtuClient.ToGBKEncode(mElement_T.nativeEMSName);
        System.out.println("owner              =" + mElement_T.owner);
        System.out.println("location           =" + mElement_T.location);
        System.out.println("version            =" + mElement_T.version);
        System.out.println("productName        =" + mElement_T.productName);
        System.out.println("communicationState = " + mElement_T.communicationState.value());
        System.out.println("emsInSyncState     =" + mElement_T.emsInSyncState);
        System.out.print("supportedRates     =");
        for (short sh : mElement_T.supportedRates) {
            System.out.print(sh + ",");
        }
        System.out.println();
        System.out.println("additionalInfo:");
        for (NameAndStringValue_T nsv : mElement_T.additionalInfo) {
            printNameAndStringValue_T(nsv);
        }
    }

    private static void printNameAndStringValue_T(NameAndStringValue_T nsv) {
        System.out.println("  name =" + nsv.name + ", value =" + nsv.value);
    }

    private static PMTPSelect_T[] getSelectPara() {
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

//    //���ù�����ֵ
//    private static void updateResourceMonitor(EmsSession_I emsSession_I, Resourcemonitor_T resourcemonitor_T) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
//                emsSession_I.getManager("KYLAND_pmMgr", comHldr);
//                mgrIntf = comHldr.value;
//            }
//            if (mgrIntf == null) {
//                return;
//            }
//            KYLAND_pmMgr_I kYLAND_pmMgr_I = KYLAND_pmMgr_IHelper.narrow(mgrIntf);
//            //ResourcemonitorList_THolder resourcemonitorList_T = new ResourcemonitorList_THolder();
//            if (kYLAND_pmMgr_I != null) {
//
//                kYLAND_pmMgr_I.updateResourceMonitor(getSelectPara(), resourcemonitor_T);
//            }
//
//
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//    }
//
//    //��ȡʵʱ��������  deviceid
//    private static PMResource_T[] getAllCurrentPMDataNew(EmsSession_I emsSession_I, String deviceid) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
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
//                System.out.println(pmResourceList.value[i].toString());
//            }
//            return pmResourceList.value;
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//        return null;
//
//    }
//
//    //��ȡ��ʷ��������
//    private static PMResource_T[] getAllHisCurrentPMData(EmsSession_I emsSession_I, String deviceid, String resourceName, String monitorItem, int how_many, String startTime, String endTime, PMResourceIterator_IHolder pmIt) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
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
//                System.out.println(pmResourceList.value[i].toString());
//            }
//
//            return pmResourceList.value;
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    //��ȡ������Դ����
//    private static String getAllResourceType(EmsSession_I emsSession_I, String deviceid) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
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
//            System.out.println(resourceTypes.value.toString());
//            return resourceTypes.value;
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    //��ȡ������Դ����
//    private static String getAllResourceName(EmsSession_I emsSession_I, String deviceid) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
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
//                kYLAND_pmMgr_I.getAllResourceType(select_ts, resourceNames);
//            }
//            System.out.println(resourceNames.value.toString());
//            return resourceNames.value;
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    //��ȡ�������ܼ���������
//    private static String getAllResourceMonitorName(EmsSession_I emsSession_I, String deviceid, String resourceType) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
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
//                kYLAND_pmMgr_I.getAllResourceType(select_ts, resourceMonitorNames);
//            }
//            System.out.println(resourceMonitorNames.value.toString());
//            return resourceMonitorNames.value;
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    //��������
//    private static void addProcess(EmsSession_I emsSession_I, Process_T process, String deviceid) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
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
//    //ɾ������
//    private static void deleteProcess(EmsSession_I emsSession_I, Process_T process, String deviceid) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
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
//    //��ȡ���н���
//    private static Process_T[] FindAllProcess(EmsSession_I emsSession_I, String deviceid) {
//        try {
//            Common_IHolder comHldr = new Common_IHolder();
//            Common_I mgrIntf = null;
//            if (emsSession_I != null) {
//                //ͨ��Session��ȡ��Ӧ�Ĺ���ģ�������
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
//                System.out.println(process_t.toString());
//            }
//            return processList_tHolder.value;
//        } catch (ProcessingFailureException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

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
}
