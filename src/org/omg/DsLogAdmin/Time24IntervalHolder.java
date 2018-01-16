package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of struct "Time24Interval"
 *	@author JacORB IDL compiler 
 */

public final class Time24IntervalHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.Time24Interval value;

	public Time24IntervalHolder ()
	{
	}
	public Time24IntervalHolder(final org.omg.DsLogAdmin.Time24Interval initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.Time24IntervalHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.Time24IntervalHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.Time24IntervalHelper.write(_out, value);
	}
}
