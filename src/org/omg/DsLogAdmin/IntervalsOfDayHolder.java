package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of alias "IntervalsOfDay"
 *	@author JacORB IDL compiler 
 */

public final class IntervalsOfDayHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.Time24Interval[] value;

	public IntervalsOfDayHolder ()
	{
	}
	public IntervalsOfDayHolder (final org.omg.DsLogAdmin.Time24Interval[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return IntervalsOfDayHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IntervalsOfDayHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		IntervalsOfDayHelper.write (out,value);
	}
}
