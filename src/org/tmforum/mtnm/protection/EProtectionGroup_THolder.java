package org.tmforum.mtnm.protection;

/**
 *	Generated from IDL definition of struct "EProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class EProtectionGroup_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.protection.EProtectionGroup_T value;

	public EProtectionGroup_THolder ()
	{
	}
	public EProtectionGroup_THolder(final org.tmforum.mtnm.protection.EProtectionGroup_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.protection.EProtectionGroup_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.protection.EProtectionGroup_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.protection.EProtectionGroup_THelper.write(_out, value);
	}
}
