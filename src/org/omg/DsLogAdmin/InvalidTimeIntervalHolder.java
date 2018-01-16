package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of exception "InvalidTimeInterval"
 *	@author JacORB IDL compiler 
 */

public final class InvalidTimeIntervalHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.InvalidTimeInterval value;

	public InvalidTimeIntervalHolder ()
	{
	}
	public InvalidTimeIntervalHolder(final org.omg.DsLogAdmin.InvalidTimeInterval initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.InvalidTimeIntervalHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.InvalidTimeIntervalHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.InvalidTimeIntervalHelper.write(_out, value);
	}
}
