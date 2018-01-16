package org.tmforum.mtnm.trafficConditioningProfile;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TCProfileMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class TCProfileMgr_IPOATie
	extends TCProfileMgr_IPOA
{
	private TCProfileMgr_IOperations _delegate;

	private POA _poa;
	public TCProfileMgr_IPOATie(TCProfileMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TCProfileMgr_IPOATie(TCProfileMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.trafficConditioningProfile.TCProfileMgr_I _this()
	{
		return org.tmforum.mtnm.trafficConditioningProfile.TCProfileMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.trafficConditioningProfile.TCProfileMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.trafficConditioningProfile.TCProfileMgr_IHelper.narrow(_this_object(orb));
	}
	public TCProfileMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TCProfileMgr_IOperations delegate)
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
	public void setNativeEMSName(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setUserLabel(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getCapabilities(org.tmforum.mtnm.common.CapabilityList_THolder capabilities) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void createTCProfile(org.tmforum.mtnm.trafficConditioningProfile.TCProfileCreateData_T newTCProfileCreateData, org.tmforum.mtnm.trafficConditioningProfile.TCProfile_THolder newTCProfile) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.createTCProfile(newTCProfileCreateData,newTCProfile);
	}

	public void setOwner(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getTCProfile(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tcProfileName, org.tmforum.mtnm.trafficConditioningProfile.TCProfile_THolder tcProfile) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getTCProfile(tcProfileName,tcProfile);
	}

	public void getTCProfileAssociatedTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tcProfileName, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getTCProfileAssociatedTPs(tcProfileName,how_many,tpList,tpIt);
	}

	public void deleteTCProfile(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tcProfileName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.deleteTCProfile(tcProfileName);
	}

	public void getAllTCProfiles(int how_many, org.tmforum.mtnm.trafficConditioningProfile.TCProfileList_THolder tcProfileList, org.tmforum.mtnm.trafficConditioningProfile.TCProfileIterator_IHolder tcProfileIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllTCProfiles(how_many,tcProfileList,tcProfileIt);
	}

	public void setAdditionalInfo(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void modifyTCProfile(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tcProfileName, org.tmforum.mtnm.trafficConditioningProfile.TCProfileCreateData_T tcProfileModifyData, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.trafficConditioningProfile.TCProfile_THolder modifiedTCProfile, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.modifyTCProfile(tcProfileName,tcProfileModifyData,tpsToModify,modifiedTCProfile,errorReason);
	}

}
