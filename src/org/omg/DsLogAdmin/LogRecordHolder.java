package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of struct "LogRecord"
 *	@author JacORB IDL compiler 
 */

public final class LogRecordHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.LogRecord value;

	public LogRecordHolder ()
	{
	}
	public LogRecordHolder(final org.omg.DsLogAdmin.LogRecord initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.LogRecordHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.LogRecordHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.LogRecordHelper.write(_out, value);
	}
}
