package org.tmforum.mtnm.protection;

/**
 *	Generated from IDL definition of struct "ProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionGroup_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.protection.ProtectionGroup_T value;

	public ProtectionGroup_THolder ()
	{
	}
	public ProtectionGroup_THolder(final org.tmforum.mtnm.protection.ProtectionGroup_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.protection.ProtectionGroup_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.protection.ProtectionGroup_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.protection.ProtectionGroup_THelper.write(_out, value);
	}
}
