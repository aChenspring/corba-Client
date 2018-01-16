package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of alias "CapacityAlarmThresholdList"
 *	@author JacORB IDL compiler 
 */

public final class CapacityAlarmThresholdListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public short[] value;

	public CapacityAlarmThresholdListHolder ()
	{
	}
	public CapacityAlarmThresholdListHolder (final short[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CapacityAlarmThresholdListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CapacityAlarmThresholdListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CapacityAlarmThresholdListHelper.write (out,value);
	}
}
