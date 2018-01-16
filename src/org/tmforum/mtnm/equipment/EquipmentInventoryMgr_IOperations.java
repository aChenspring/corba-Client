package org.tmforum.mtnm.equipment;

/**
 *	Generated from IDL interface "EquipmentInventoryMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface EquipmentInventoryMgr_IOperations
	extends org.tmforum.mtnm.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void provisionEquipment(org.tmforum.mtnm.equipment.EQTCreateData_T equipmentCreateData, org.tmforum.mtnm.equipment.Equipment_THolder createdEquipment) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void unprovisionEquipment(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void setAlarmReportingOn(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentOrHolderName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void setAlarmReportingOff(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentOrHolderName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getContainedEquipment(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentHolderName, org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder equipmentOrHolderList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getEquipment(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentOrHolderName, org.tmforum.mtnm.equipment.EquipmentOrHolder_THolder equip) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllEquipment(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meOrHolderName, int how_many, org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder eqList, org.tmforum.mtnm.equipment.EquipmentOrHolderIterator_IHolder eqIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllEquipmentNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meOrHolderName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllSupportedPTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllSupportedPTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllSupportingEquipment(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ptpOrMfdName, org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder eqList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllSupportingEquipmentNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ptpOrMfdName, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getSupportingEquipment(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentName, org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder eqList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getSupportingEquipmentNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentName, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getSupportedEquipment(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentName, org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder eqList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getSupportedEquipmentNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentName, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
