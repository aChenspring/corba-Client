package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of exception "LogOffDuty"
 *	@author JacORB IDL compiler 
 */

public final class LogOffDutyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.LogOffDuty value;

	public LogOffDutyHolder ()
	{
	}
	public LogOffDutyHolder(final org.omg.DsLogAdmin.LogOffDuty initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.LogOffDutyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.LogOffDutyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.LogOffDutyHelper.write(_out, value);
	}
}
