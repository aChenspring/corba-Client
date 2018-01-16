package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of struct "TimeInterval"
 *	@author JacORB IDL compiler 
 */

public final class TimeIntervalHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.TimeInterval value;

	public TimeIntervalHolder ()
	{
	}
	public TimeIntervalHolder(final org.omg.DsLogAdmin.TimeInterval initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.TimeIntervalHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.TimeIntervalHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.TimeIntervalHelper.write(_out, value);
	}
}
