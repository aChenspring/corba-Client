package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of exception "InvalidTime"
 *	@author JacORB IDL compiler 
 */

public final class InvalidTimeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.InvalidTime value;

	public InvalidTimeHolder ()
	{
	}
	public InvalidTimeHolder(final org.omg.DsLogAdmin.InvalidTime initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.InvalidTimeHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.InvalidTimeHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.InvalidTimeHelper.write(_out, value);
	}
}
