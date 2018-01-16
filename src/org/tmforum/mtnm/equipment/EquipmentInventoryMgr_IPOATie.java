package org.tmforum.mtnm.equipment;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EquipmentInventoryMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class EquipmentInventoryMgr_IPOATie
	extends EquipmentInventoryMgr_IPOA
{
	private EquipmentInventoryMgr_IOperations _delegate;

	private POA _poa;
	public EquipmentInventoryMgr_IPOATie(EquipmentInventoryMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EquipmentInventoryMgr_IPOATie(EquipmentInventoryMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.equipment.EquipmentInventoryMgr_I _this()
	{
		return org.tmforum.mtnm.equipment.EquipmentInventoryMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.equipment.EquipmentInventoryMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.equipment.EquipmentInventoryMgr_IHelper.narrow(_this_object(orb));
	}
	public EquipmentInventoryMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EquipmentInventoryMgr_IOperations delegate)
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
	public void setAlarmReportingOff(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentOrHolderName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setAlarmReportingOff(equipmentOrHolderName);
	}

	public void getContainedEquipment(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentHolderName, org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder equipmentOrHolderList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getContainedEquipment(equipmentHolderName,equipmentOrHolderList);
	}

	public void getAllEquipment(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meOrHolderName, int how_many, org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder eqList, org.tmforum.mtnm.equipment.EquipmentOrHolderIterator_IHolder eqIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllEquipment(meOrHolderName,how_many,eqList,eqIt);
	}

	public void unprovisionEquipment(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.unprovisionEquipment(equipmentName);
	}

	public void setAlarmReportingOn(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentOrHolderName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setAlarmReportingOn(equipmentOrHolderName);
	}

	public void getSupportedEquipment(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentName, org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder eqList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getSupportedEquipment(equipmentName,eqList);
	}

	public void getSupportedEquipmentNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentName, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getSupportedEquipmentNames(equipmentName,nameList);
	}

	public void getAllEquipmentNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meOrHolderName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllEquipmentNames(meOrHolderName,how_many,nameList,nameIt);
	}

	public void getAllSupportedPTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportedPTPNames(equipmentName,how_many,nameList,nameIt);
	}

	public void setAdditionalInfo(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getCapabilities(org.tmforum.mtnm.common.CapabilityList_THolder capabilities) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setOwner(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getSupportingEquipmentNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentName, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getSupportingEquipmentNames(equipmentName,nameList);
	}

	public void getSupportingEquipment(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentName, org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder eqList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getSupportingEquipment(equipmentName,eqList);
	}

	public void setNativeEMSName(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAllSupportingEquipment(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ptpOrMfdName, org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder eqList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportingEquipment(ptpOrMfdName,eqList);
	}

	public void provisionEquipment(org.tmforum.mtnm.equipment.EQTCreateData_T equipmentCreateData, org.tmforum.mtnm.equipment.Equipment_THolder createdEquipment) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.provisionEquipment(equipmentCreateData,createdEquipment);
	}

	public void getEquipment(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentOrHolderName, org.tmforum.mtnm.equipment.EquipmentOrHolder_THolder equip) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getEquipment(equipmentOrHolderName,equip);
	}

	public void getAllSupportedPTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportedPTPs(equipmentName,how_many,tpList,tpIt);
	}

	public void getAllSupportingEquipmentNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ptpOrMfdName, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportingEquipmentNames(ptpOrMfdName,nameList);
	}

	public void setUserLabel(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

}
