package org.tmforum.mtnm.protection;

/**
 *	Generated from IDL definition of struct "SwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class SwitchData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.protection.SwitchData_T value;

	public SwitchData_THolder ()
	{
	}
	public SwitchData_THolder(final org.tmforum.mtnm.protection.SwitchData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.protection.SwitchData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.protection.SwitchData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.protection.SwitchData_THelper.write(_out, value);
	}
}