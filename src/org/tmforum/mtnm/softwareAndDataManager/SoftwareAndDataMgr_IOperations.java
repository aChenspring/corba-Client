package org.tmforum.mtnm.softwareAndDataManager;

/**
 *	Generated from IDL interface "SoftwareAndDataMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface SoftwareAndDataMgr_IOperations
	extends org.tmforum.mtnm.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void backupME(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getMEBackupStatus(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, org.tmforum.mtnm.softwareAndDataManager.BackupStatus_THolder backupStatus) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void abortMEBackup(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getBackupList(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] managedElementNameList, int how_many, org.tmforum.mtnm.softwareAndDataManager.BackupIdList_THolder backupList, org.tmforum.mtnm.softwareAndDataManager.BackupIdIterator_IHolder backupIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
