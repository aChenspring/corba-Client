package org.tmforum.mtnm.equipment;

/**
 *	Generated from IDL definition of union "EquipmentOrHolder_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentOrHolder_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private org.tmforum.mtnm.equipment.EquipmentTypeQualifier_T discriminator;
	private org.tmforum.mtnm.equipment.Equipment_T equip;
	private org.tmforum.mtnm.equipment.EquipmentHolder_T holder;

	public EquipmentOrHolder_T ()
	{
	}

	public org.tmforum.mtnm.equipment.EquipmentTypeQualifier_T discriminator ()
	{
		return discriminator;
	}

	public org.tmforum.mtnm.equipment.Equipment_T equip ()
	{
		if (discriminator != org.tmforum.mtnm.equipment.EquipmentTypeQualifier_T.EQT)
			throw new org.omg.CORBA.BAD_OPERATION();
		return equip;
	}

	public void equip (org.tmforum.mtnm.equipment.Equipment_T _x)
	{
		discriminator = org.tmforum.mtnm.equipment.EquipmentTypeQualifier_T.EQT;
		equip = _x;
	}

	public org.tmforum.mtnm.equipment.EquipmentHolder_T holder ()
	{
		if (discriminator != org.tmforum.mtnm.equipment.EquipmentTypeQualifier_T.EQT_HOLDER)
			throw new org.omg.CORBA.BAD_OPERATION();
		return holder;
	}

	public void holder (org.tmforum.mtnm.equipment.EquipmentHolder_T _x)
	{
		discriminator = org.tmforum.mtnm.equipment.EquipmentTypeQualifier_T.EQT_HOLDER;
		holder = _x;
	}

}
