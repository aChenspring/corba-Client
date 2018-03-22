package org.tmforum.mtnm.KYLAND_alarmMgr;

import org.omg.PortableServer.POA;
import org.tmforum.mtnm.globaldefs.NVSList_THolder;
import org.tmforum.mtnm.globaldefs.NameAndStringValue_T;
import org.tmforum.mtnm.globaldefs.ProcessingFailureException;

/**
 *	Generated from IDL interface "KYLAND_alarmMgr_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class KYLAND_alarmMgr_IPOATie
	extends KYLAND_alarmMgr_IPOA
{
	private KYLAND_alarmMgr_IOperations _delegate;

	private POA _poa;
	public KYLAND_alarmMgr_IPOATie(KYLAND_alarmMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public KYLAND_alarmMgr_IPOATie(KYLAND_alarmMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.KYLAND_alarmMgr.KYLAND_alarmMgr_I _this()
	{
		return org.tmforum.mtnm.KYLAND_alarmMgr.KYLAND_alarmMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.KYLAND_alarmMgr.KYLAND_alarmMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.KYLAND_alarmMgr.KYLAND_alarmMgr_IHelper.narrow(_this_object(orb));
	}
	public KYLAND_alarmMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(KYLAND_alarmMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public void setUserLabel(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAllHisAlarms(java.lang.String[] excludeProbCauseList, org.tmforum.mtnm.notifications.PerceivedSeverity_T[] excludeSeverityList, int[] excludeTypeList, int how_many, java.lang.String startTime, java.lang.String endTime, org.tmforum.mtnm.notifications.EventList_THolder eventList, org.tmforum.mtnm.notifications.EventIterator_IHolder eventIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllHisAlarms(excludeProbCauseList,excludeSeverityList,excludeTypeList,how_many,startTime,endTime,eventList,eventIt);
	}

	public void getCapabilities(org.tmforum.mtnm.common.CapabilityList_THolder capabilities) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	@Override
	public void setAdditionalInfo(NameAndStringValue_T[] objectName, NVSList_THolder additionalInfo) throws ProcessingFailureException {

	}

	public void getMEHisAlarms(java.lang.String[] excludeProbCauseList, org.tmforum.mtnm.notifications.PerceivedSeverity_T[] excludeSeverityList, int[] excludeTypeList, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, java.lang.String startTime, java.lang.String endTime, org.tmforum.mtnm.notifications.EventList_THolder eventList, org.tmforum.mtnm.notifications.EventIterator_IHolder eventIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getMEHisAlarms(excludeProbCauseList,excludeSeverityList,excludeTypeList,managedElementName,how_many,startTime,endTime,eventList,eventIt);
	}

	public void setOwner(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

}
