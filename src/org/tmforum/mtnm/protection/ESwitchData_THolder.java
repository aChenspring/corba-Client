package org.tmforum.mtnm.protection;

/**
 *	Generated from IDL definition of struct "ESwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class ESwitchData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.protection.ESwitchData_T value;

	public ESwitchData_THolder ()
	{
	}
	public ESwitchData_THolder(final org.tmforum.mtnm.protection.ESwitchData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.protection.ESwitchData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.protection.ESwitchData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.protection.ESwitchData_THelper.write(_out, value);
	}
}
