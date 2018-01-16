package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of alias "WeekMask"
 *	@author JacORB IDL compiler 
 */

public final class WeekMaskHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.WeekMaskItem[] value;

	public WeekMaskHolder ()
	{
	}
	public WeekMaskHolder (final org.omg.DsLogAdmin.WeekMaskItem[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return WeekMaskHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = WeekMaskHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		WeekMaskHelper.write (out,value);
	}
}
