package org.tmforum.mtnm.protection;

/**
 *	Generated from IDL interface "ProtectionMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface ProtectionMgr_IOperations
	extends org.tmforum.mtnm.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllProtectionGroups(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, int how_many, org.tmforum.mtnm.protection.ProtectionGroupList_THolder pgList, org.tmforum.mtnm.protection.ProtectionGroupIterator_IHolder pgpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllEProtectionGroups(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, int how_many, org.tmforum.mtnm.protection.EProtectionGroupList_THolder epgpList, org.tmforum.mtnm.protection.EProtectionGroupIterator_IHolder epgpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getProtectionGroup(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] pgName, org.tmforum.mtnm.protection.ProtectionGroup_THolder protectionGroup) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getEProtectionGroup(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ePGPname, org.tmforum.mtnm.protection.EProtectionGroup_THolder eProtectionGroup) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllNUTTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] pgName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllPreemptibleTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] pgName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllProtectedTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] pgName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void retrieveSwitchData(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, org.tmforum.mtnm.protection.SwitchDataList_THolder switchData) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void retrieveESwitchData(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ePGPName, org.tmforum.mtnm.protection.ESwitchDataList_THolder eSwitchDataList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void performProtectionCommand(org.tmforum.mtnm.protection.ProtectionCommand_T protectionCommand, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fromTp, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] toTp, org.tmforum.mtnm.protection.SwitchData_THolder switchData) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getContainingPGNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] pTPName, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder pgNameList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
