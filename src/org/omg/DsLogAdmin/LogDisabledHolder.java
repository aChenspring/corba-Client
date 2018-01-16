package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of exception "LogDisabled"
 *	@author JacORB IDL compiler 
 */

public final class LogDisabledHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.LogDisabled value;

	public LogDisabledHolder ()
	{
	}
	public LogDisabledHolder(final org.omg.DsLogAdmin.LogDisabled initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.LogDisabledHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.LogDisabledHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.LogDisabledHelper.write(_out, value);
	}
}
