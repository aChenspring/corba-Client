package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of struct "WeekMaskItem"
 *	@author JacORB IDL compiler 
 */

public final class WeekMaskItemHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.WeekMaskItem value;

	public WeekMaskItemHolder ()
	{
	}
	public WeekMaskItemHolder(final org.omg.DsLogAdmin.WeekMaskItem initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.WeekMaskItemHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.WeekMaskItemHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.WeekMaskItemHelper.write(_out, value);
	}
}
