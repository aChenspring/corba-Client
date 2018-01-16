package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of struct "Time24"
 *	@author JacORB IDL compiler 
 */

public final class Time24Holder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.Time24 value;

	public Time24Holder ()
	{
	}
	public Time24Holder(final org.omg.DsLogAdmin.Time24 initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.Time24Helper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.Time24Helper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.Time24Helper.write(_out, value);
	}
}
