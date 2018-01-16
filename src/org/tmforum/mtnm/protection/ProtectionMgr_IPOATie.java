package org.tmforum.mtnm.protection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "ProtectionMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class ProtectionMgr_IPOATie
	extends ProtectionMgr_IPOA
{
	private ProtectionMgr_IOperations _delegate;

	private POA _poa;
	public ProtectionMgr_IPOATie(ProtectionMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ProtectionMgr_IPOATie(ProtectionMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.protection.ProtectionMgr_I _this()
	{
		return org.tmforum.mtnm.protection.ProtectionMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.protection.ProtectionMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.protection.ProtectionMgr_IHelper.narrow(_this_object(orb));
	}
	public ProtectionMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProtectionMgr_IOperations delegate)
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

	public void retrieveSwitchData(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, org.tmforum.mtnm.protection.SwitchDataList_THolder switchData) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.retrieveSwitchData(reliableSinkCtpOrGroupName,switchData);
	}

	public void getAllProtectedTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] pgName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllProtectedTPNames(pgName,how_many,nameList,nameIt);
	}

	public void retrieveESwitchData(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ePGPName, org.tmforum.mtnm.protection.ESwitchDataList_THolder eSwitchDataList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.retrieveESwitchData(ePGPName,eSwitchDataList);
	}

	public void getEProtectionGroup(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ePGPname, org.tmforum.mtnm.protection.EProtectionGroup_THolder eProtectionGroup) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getEProtectionGroup(ePGPname,eProtectionGroup);
	}

	public void getCapabilities(org.tmforum.mtnm.common.CapabilityList_THolder capabilities) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void performProtectionCommand(org.tmforum.mtnm.protection.ProtectionCommand_T protectionCommand, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fromTp, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] toTp, org.tmforum.mtnm.protection.SwitchData_THolder switchData) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.performProtectionCommand(protectionCommand,reliableSinkCtpOrGroupName,fromTp,toTp,switchData);
	}

	public void setOwner(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getAllProtectionGroups(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, int how_many, org.tmforum.mtnm.protection.ProtectionGroupList_THolder pgList, org.tmforum.mtnm.protection.ProtectionGroupIterator_IHolder pgpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllProtectionGroups(meName,how_many,pgList,pgpIt);
	}

	public void getAllPreemptibleTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] pgName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllPreemptibleTPNames(pgName,how_many,nameList,nameIt);
	}

	public void getAllNUTTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] pgName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllNUTTPNames(pgName,how_many,nameList,nameIt);
	}

	public void getProtectionGroup(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] pgName, org.tmforum.mtnm.protection.ProtectionGroup_THolder protectionGroup) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getProtectionGroup(pgName,protectionGroup);
	}

	public void getAllEProtectionGroups(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, int how_many, org.tmforum.mtnm.protection.EProtectionGroupList_THolder epgpList, org.tmforum.mtnm.protection.EProtectionGroupIterator_IHolder epgpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllEProtectionGroups(meName,how_many,epgpList,epgpIt);
	}

	public void setAdditionalInfo(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getContainingPGNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] pTPName, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder pgNameList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getContainingPGNames(pTPName,pgNameList);
	}

}
