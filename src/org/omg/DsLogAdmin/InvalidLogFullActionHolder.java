package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of exception "InvalidLogFullAction"
 *	@author JacORB IDL compiler 
 */

public final class InvalidLogFullActionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.InvalidLogFullAction value;

	public InvalidLogFullActionHolder ()
	{
	}
	public InvalidLogFullActionHolder(final org.omg.DsLogAdmin.InvalidLogFullAction initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.InvalidLogFullActionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.InvalidLogFullActionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.InvalidLogFullActionHelper.write(_out, value);
	}
}
