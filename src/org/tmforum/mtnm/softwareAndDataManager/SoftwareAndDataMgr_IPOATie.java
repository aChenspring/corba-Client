package org.tmforum.mtnm.softwareAndDataManager;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "SoftwareAndDataMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class SoftwareAndDataMgr_IPOATie
	extends SoftwareAndDataMgr_IPOA
{
	private SoftwareAndDataMgr_IOperations _delegate;

	private POA _poa;
	public SoftwareAndDataMgr_IPOATie(SoftwareAndDataMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public SoftwareAndDataMgr_IPOATie(SoftwareAndDataMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.softwareAndDataManager.SoftwareAndDataMgr_I _this()
	{
		return org.tmforum.mtnm.softwareAndDataManager.SoftwareAndDataMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.softwareAndDataManager.SoftwareAndDataMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.softwareAndDataManager.SoftwareAndDataMgr_IHelper.narrow(_this_object(orb));
	}
	public SoftwareAndDataMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SoftwareAndDataMgr_IOperations delegate)
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

	public void backupME(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.backupME(managedElementName);
	}

	public void getBackupList(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] managedElementNameList, int how_many, org.tmforum.mtnm.softwareAndDataManager.BackupIdList_THolder backupList, org.tmforum.mtnm.softwareAndDataManager.BackupIdIterator_IHolder backupIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getBackupList(managedElementNameList,how_many,backupList,backupIt);
	}

	public void getCapabilities(org.tmforum.mtnm.common.CapabilityList_THolder capabilities) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getMEBackupStatus(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, org.tmforum.mtnm.softwareAndDataManager.BackupStatus_THolder backupStatus) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getMEBackupStatus(managedElementName,backupStatus);
	}

	public void setOwner(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void abortMEBackup(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.abortMEBackup(managedElementName);
	}

	public void setAdditionalInfo(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

}
