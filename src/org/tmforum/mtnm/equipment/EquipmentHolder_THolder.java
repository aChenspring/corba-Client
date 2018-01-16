package org.tmforum.mtnm.equipment;

/**
 *	Generated from IDL definition of struct "EquipmentHolder_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentHolder_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.equipment.EquipmentHolder_T value;

	public EquipmentHolder_THolder ()
	{
	}
	public EquipmentHolder_THolder(final org.tmforum.mtnm.equipment.EquipmentHolder_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.equipment.EquipmentHolder_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.equipment.EquipmentHolder_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.equipment.EquipmentHolder_THelper.write(_out, value);
	}
}
