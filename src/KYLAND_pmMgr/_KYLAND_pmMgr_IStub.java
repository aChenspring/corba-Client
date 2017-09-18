package KYLAND_pmMgr;


/**
 * KYLAND_pmMgr/_KYLAND_pmMgr_IStub.java .
 * ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
 * ��KYLAND_pmMgr.idl
 * 2017��9��7�� ������ ����03ʱ39��29�� CST
 */

public class _KYLAND_pmMgr_IStub extends org.omg.CORBA.portable.ObjectImpl implements KYLAND_pmMgr.KYLAND_pmMgr_I {


    //~?G9??FX?HA?20170630?*?p?
    public void getAllCurrentPMData(performance.PMTPSelect_T[] pmTPSelectList, int how_many, performance.PMDataList_THolder pmDataList, performance.PMDataIterator_IHolder pmIt) throws globaldefs.ProcessingFailureException {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("getAllCurrentPMData", true);
            performance.PMTPSelectList_THelper.write($out, pmTPSelectList);
            $out.write_ulong(how_many);
            $in = _invoke($out);
            pmDataList.value = performance.PMDataList_THelper.read($in);
            pmIt.value = performance.PMDataIterator_IHelper.read($in);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                throw globaldefs.ProcessingFailureExceptionHelper.read($in);
            else
                throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            getAllCurrentPMData(pmTPSelectList, how_many, pmDataList, pmIt);
        } finally {
            _releaseReply($in);
        }
    } // getAllCurrentPMData


    //~?G???`?????
    public void getResourceMonitor(performance.PMTPSelect_T[] pmTPSelectList, KYLAND_pmMgr.ResourcemonitorList_THolder resourcemonitorList_T) throws globaldefs.ProcessingFailureException {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("getResourceMonitor", true);
            performance.PMTPSelectList_THelper.write($out, pmTPSelectList);
            $in = _invoke($out);
            resourcemonitorList_T.value = KYLAND_pmMgr.ResourcemonitorList_THelper.read($in);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                throw globaldefs.ProcessingFailureExceptionHelper.read($in);
            else
                throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            getResourceMonitor(pmTPSelectList, resourcemonitorList_T);
        } finally {
            _releaseReply($in);
        }
    } // getResourceMonitor


    //?g??t��???
    public void updateResourceMonitor(performance.PMTPSelect_T[] pmTPSelectList, KYLAND_pmMgr.Resourcemonitor_T resourcemonitor_T) throws globaldefs.ProcessingFailureException {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("updateResourceMonitor", true);
            performance.PMTPSelectList_THelper.write($out, pmTPSelectList);
            KYLAND_pmMgr.Resourcemonitor_THelper.write($out, resourcemonitor_T);
            $in = _invoke($out);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                throw globaldefs.ProcessingFailureExceptionHelper.read($in);
            else
                throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            updateResourceMonitor(pmTPSelectList, resourcemonitor_T);
        } finally {
            _releaseReply($in);
        }
    } // updateResourceMonitor


    //~?G9??FX?HA
    public void getAllCurrentPMDataNew(performance.PMTPSelect_T[] pmTPSelectList, KYLAND_pmMgr.PMResourceList_THolder pmResourceList) throws globaldefs.ProcessingFailureException {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("getAllCurrentPMDataNew", true);
            performance.PMTPSelectList_THelper.write($out, pmTPSelectList);
            $in = _invoke($out);
            pmResourceList.value = KYLAND_pmMgr.PMResourceList_THelper.read($in);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                throw globaldefs.ProcessingFailureExceptionHelper.read($in);
            else
                throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            getAllCurrentPMDataNew(pmTPSelectList, pmResourceList);
        } finally {
            _releaseReply($in);
        }
    } // getAllCurrentPMDataNew


    //~?GX��v?FX?HA
    public void getAllHisCurrentPMData(performance.PMTPSelect_T[] pmTPSelectList, int how_many, String startTime, String endTime, KYLAND_pmMgr.PMResourceList_THolder pmResourceList, KYLAND_pmMgr.PMResourceIterator_IHolder pmIt) throws globaldefs.ProcessingFailureException {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("getAllHisCurrentPMData", true);
            performance.PMTPSelectList_THelper.write($out, pmTPSelectList);
            $out.write_ulong(how_many);
            $out.write_string(startTime);
            $out.write_string(endTime);
            $in = _invoke($out);
            pmResourceList.value = KYLAND_pmMgr.PMResourceList_THelper.read($in);
            pmIt.value = KYLAND_pmMgr.PMResourceIterator_IHelper.read($in);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                throw globaldefs.ProcessingFailureExceptionHelper.read($in);
            else
                throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            getAllHisCurrentPMData(pmTPSelectList, how_many, startTime, endTime, pmResourceList, pmIt);
        } finally {
            _releaseReply($in);
        }
    } // getAllHisCurrentPMData


    //~?G???kg.?h?
    public void getAllResourceType(performance.PMTPSelect_T[] pmTPSelectList, org.omg.CORBA.StringHolder resourceType) throws globaldefs.ProcessingFailureException {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("getAllResourceType", true);
            performance.PMTPSelectList_THelper.write($out, pmTPSelectList);
            $in = _invoke($out);
            resourceType.value = $in.read_string();
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                throw globaldefs.ProcessingFailureExceptionHelper.read($in);
            else
                throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            getAllResourceType(pmTPSelectList, resourceType);
        } finally {
            _releaseReply($in);
        }
    } // getAllResourceType


    //~?G???kg,???
    public void getAllResourceName(performance.PMTPSelect_T[] pmTPSelectList, org.omg.CORBA.StringHolder resourceName) throws globaldefs.ProcessingFailureException {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("getAllResourceName", true);
            performance.PMTPSelectList_THelper.write($out, pmTPSelectList);
            $in = _invoke($out);
            resourceName.value = $in.read_string();
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                throw globaldefs.ProcessingFailureExceptionHelper.read($in);
            else
                throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            getAllResourceName(pmTPSelectList, resourceName);
        } finally {
            _releaseReply($in);
        }
    } // getAllResourceName


    //~?G????FX)#Kc%???
    public void getAllResourceMonitorName(performance.PMTPSelect_T[] pmTPSelectList, org.omg.CORBA.StringHolder ResourceMonitorName) throws globaldefs.ProcessingFailureException {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("getAllResourceMonitorName", true);
            performance.PMTPSelectList_THelper.write($out, pmTPSelectList);
            $in = _invoke($out);
            ResourceMonitorName.value = $in.read_string();
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                throw globaldefs.ProcessingFailureExceptionHelper.read($in);
            else
                throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            getAllResourceMonitorName(pmTPSelectList, ResourceMonitorName);
        } finally {
            _releaseReply($in);
        }
    } // getAllResourceMonitorName


    //??i??
    public void addProcess(performance.PMTPSelect_T[] pmTPSelectList, KYLAND_pmMgr.Process_T process) throws globaldefs.ProcessingFailureException {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("addProcess", true);
            performance.PMTPSelectList_THelper.write($out, pmTPSelectList);
            KYLAND_pmMgr.Process_THelper.write($out, process);
            $in = _invoke($out);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                throw globaldefs.ProcessingFailureExceptionHelper.read($in);
            else
                throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            addProcess(pmTPSelectList, process);
        } finally {
            _releaseReply($in);
        }
    } // addProcess


    //R??i??
    public void deleteProcess(performance.PMTPSelect_T[] pmTPSelectList, KYLAND_pmMgr.Process_T process) throws globaldefs.ProcessingFailureException {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("deleteProcess", true);
            performance.PMTPSelectList_THelper.write($out, pmTPSelectList);
            KYLAND_pmMgr.Process_THelper.write($out, process);
            $in = _invoke($out);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                throw globaldefs.ProcessingFailureExceptionHelper.read($in);
            else
                throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            deleteProcess(pmTPSelectList, process);
        } finally {
            _releaseReply($in);
        }
    } // deleteProcess


    //~?G???X??
    public void FindAllProcess(performance.PMTPSelect_T[] pmTPSelectList, KYLAND_pmMgr.ProcessList_THolder processList) throws globaldefs.ProcessingFailureException {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("FindAllProcess", true);
            performance.PMTPSelectList_THelper.write($out, pmTPSelectList);
            $in = _invoke($out);
            processList.value = KYLAND_pmMgr.ProcessList_THelper.read($in);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                throw globaldefs.ProcessingFailureExceptionHelper.read($in);
            else
                throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            FindAllProcess(pmTPSelectList, processList);
        } finally {
            _releaseReply($in);
        }
    } // FindAllProcess


    /**
     * <p>The nativeEMSName is owned by the EMS.  It represents how an EMS user addresses an object
     * on the EMS GUI.  The EMS may or may not support changing this value.</p>
     * <p>
     * <p>When an object is created by the EMS, the EMS selects the nativeEMSName for the object.</p>
     * <p>
     * <p>When an object is created by an NMS, the NMS specifies the userLabel for the object.
     * If the EMS supports setting of nativeEMSNames, the nativeEMSName should be set to the same
     * value as the userLabel.  If the EMS does not support setting of nativeEMSNames, or if the
     * nativeEMSName has constraints that the
     * userLabel does not satisfy, the EMS selects the nativeEMSName for the object.</p>
     * <p>
     * <p>After an object has been created, the nativeEMSName may be changed by the NMS, if the
     * EMS supports this functionality, using the setNativeEMSName operation.</p>
     * <p>
     * <br> globaldefs::NamingAttributes_T objectName
     * <br> string nativeEMSName
     * <br> globaldefs::ProcessingFailureException<br>
     * EXCPT_NOT_IMPLEMENTED - If EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal failure<br>
     * EXCPT_INVALID_INPUT - Raised when objectName is incorrectly formed<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when objectName references object which does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised when the nativeEMSName can not be set for the specified
     * object<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is lost
     * <br>
     **/
    public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, String nativeEMSName) throws globaldefs.ProcessingFailureException {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("setNativeEMSName", true);
            globaldefs.NamingAttributes_THelper.write($out, objectName);
            $out.write_string(nativeEMSName);
            $in = _invoke($out);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                throw globaldefs.ProcessingFailureExceptionHelper.read($in);
            else
                throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            setNativeEMSName(objectName, nativeEMSName);
        } finally {
            _releaseReply($in);
        }
    } // setNativeEMSName


    /**
     * <p>The userLabel is owned by the NMSes.  It is a string assigned by an NMS to an object.
     * The difference between the userLabel and the NamingAttributes name
     * is that the userLabel is an attribute of the objects that
     * may be "set" by the NMS through well defined interfaces (setUserLabel).</p>
     * <p>
     * <p>When an object is created by an NMS, the NMS specifies the userLabel for the object.</p>
     * <p>
     * <p>When an object is created by the EMS, the EMS sets the userLabel to the nativeEMSName.</p>
     * <p>
     * <p>Once an object is created, the userLabel may only be changed by an NMS through the
     * setUserLabel operation.</p>
     * <p>
     * <br> globaldefs::NamingAttributes_T objectName: Name of the object for which to change the
     * userLabel.
     * <br> string userLabel: New user label to assign to the object
     * <br> boolean enforceUniqueness: Specifies whether or not userLabel should be checked for
     * uniqueness amongst objects of the same class within the EMS.  If true, then the operation
     * will fail if userLabel is already in use.
     * <br> globaldefs::ProcessingFailureException<br>
     * EXCPT_NOT_IMPLEMENTED - If EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal failure<br>
     * EXCPT_INVALID_INPUT - Raised when objectName is incorrectly formed<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when objectName references object which does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised when the userLabel can not be set for the specified object<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is lost<br>
     * EXCPT_USERLABEL_IN_USE - Raised when the userLabel uniqueness constraint is not met<br>
     * <br>
     **/
    public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("setUserLabel", true);
            globaldefs.NamingAttributes_THelper.write($out, objectName);
            $out.write_string(userLabel);
            $out.write_boolean(enforceUniqueness);
            $in = _invoke($out);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                throw globaldefs.ProcessingFailureExceptionHelper.read($in);
            else
                throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            setUserLabel(objectName, userLabel, enforceUniqueness);
        } finally {
            _releaseReply($in);
        }
    } // setUserLabel


    /**
     * <p>This service sets the owner attribute of the specified object.</p>
     * <p>
     * <br> globaldefs::NamingAttributes_T objectName
     * <br> string owner
     * <br> globaldefs::ProcessingFailureException<br>
     * EXCPT_NOT_IMPLEMENTED - If EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal failure<br>
     * EXCPT_INVALID_INPUT - Raised when objectName is incorrectly formed<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when objectName references an object
     * that does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised when the owner can not be set for the specified object<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is lost<br>
     * <br>
     **/
    public void setOwner(globaldefs.NameAndStringValue_T[] objectName, String owner) throws globaldefs.ProcessingFailureException {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("setOwner", true);
            globaldefs.NamingAttributes_THelper.write($out, objectName);
            $out.write_string(owner);
            $in = _invoke($out);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                throw globaldefs.ProcessingFailureExceptionHelper.read($in);
            else
                throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            setOwner(objectName, owner);
        } finally {
            _releaseReply($in);
        }
    } // setOwner


    /**
     * <p>This service retrieves the capabilities of the manager.
     * All non-specified capabilities are assumed to be unsupported.</p>
     * <p>
     * <br> CapabilityList_T capabilities
     * <br> globaldefs::ProcessingFailureException:<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal failure.
     * <br>
     **/
    public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("getCapabilities", true);
            $in = _invoke($out);
            capabilities.value = common.CapabilityList_THelper.read($in);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                throw globaldefs.ProcessingFailureExceptionHelper.read($in);
            else
                throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            getCapabilities(capabilities);
        } finally {
            _releaseReply($in);
        }
    } // getCapabilities

    // Type-specific CORBA::Object operations
    private static String[] __ids = {
            "IDL:mtnm.tmforum.org/KYLAND_pmMgr/KYLAND_pmMgr_I:1.0",
            "IDL:mtnm.tmforum.org/common/Common_I:1.0"};

    public String[] _ids() {
        return (String[]) __ids.clone();
    }

    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException {
        String str = s.readUTF();
        String[] args = null;
        java.util.Properties props = null;
        org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, props);
        try {
            org.omg.CORBA.Object obj = orb.string_to_object(str);
            org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate();
            _set_delegate(delegate);
        } finally {
            orb.destroy();
        }
    }

    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
        String[] args = null;
        java.util.Properties props = null;
        org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, props);
        try {
            String str = orb.object_to_string(this);
            s.writeUTF(str);
        } finally {
            orb.destroy();
        }
    }
} // class _KYLAND_pmMgr_IStub
