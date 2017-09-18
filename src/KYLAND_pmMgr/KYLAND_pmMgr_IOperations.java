package KYLAND_pmMgr;


/**
 * KYLAND_pmMgr/KYLAND_pmMgr_IOperations.java .
 * ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
 * ��KYLAND_pmMgr.idl
 * 2017��9��7�� ������ ����03ʱ39��29�� CST
 */

public interface KYLAND_pmMgr_IOperations extends common.Common_IOperations {

    //~?G9??FX?HA?20170630?*?p?
    void getAllCurrentPMData(performance.PMTPSelect_T[] pmTPSelectList, int how_many, performance.PMDataList_THolder pmDataList, performance.PMDataIterator_IHolder pmIt) throws globaldefs.ProcessingFailureException;

    //~?G???`?????
    void getResourceMonitor(performance.PMTPSelect_T[] pmTPSelectList, KYLAND_pmMgr.ResourcemonitorList_THolder resourcemonitorList_T) throws globaldefs.ProcessingFailureException;

    //?g??t��???
    void updateResourceMonitor(performance.PMTPSelect_T[] pmTPSelectList, KYLAND_pmMgr.Resourcemonitor_T resourcemonitor_T) throws globaldefs.ProcessingFailureException;

    //~?G9??FX?HA
    void getAllCurrentPMDataNew(performance.PMTPSelect_T[] pmTPSelectList, KYLAND_pmMgr.PMResourceList_THolder pmResourceList) throws globaldefs.ProcessingFailureException;

    //~?GX��v?FX?HA
    void getAllHisCurrentPMData(performance.PMTPSelect_T[] pmTPSelectList, int how_many, String startTime, String endTime, KYLAND_pmMgr.PMResourceList_THolder pmResourceList, KYLAND_pmMgr.PMResourceIterator_IHolder pmIt) throws globaldefs.ProcessingFailureException;

    //~?G???kg.?h?
    void getAllResourceType(performance.PMTPSelect_T[] pmTPSelectList, org.omg.CORBA.StringHolder resourceType) throws globaldefs.ProcessingFailureException;

    //~?G???kg,???
    void getAllResourceName(performance.PMTPSelect_T[] pmTPSelectList, org.omg.CORBA.StringHolder resourceName) throws globaldefs.ProcessingFailureException;

    //~?G????FX)#Kc%???
    void getAllResourceMonitorName(performance.PMTPSelect_T[] pmTPSelectList, org.omg.CORBA.StringHolder ResourceMonitorName) throws globaldefs.ProcessingFailureException;

    //??i??
    void addProcess(performance.PMTPSelect_T[] pmTPSelectList, KYLAND_pmMgr.Process_T process) throws globaldefs.ProcessingFailureException;

    //R??i??
    void deleteProcess(performance.PMTPSelect_T[] pmTPSelectList, KYLAND_pmMgr.Process_T process) throws globaldefs.ProcessingFailureException;

    //~?G???X??
    void FindAllProcess(performance.PMTPSelect_T[] pmTPSelectList, KYLAND_pmMgr.ProcessList_THolder processList) throws globaldefs.ProcessingFailureException;
} // interface KYLAND_pmMgr_IOperations
