package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of exception "LogFull"
 *	@author JacORB IDL compiler 
 */

public final class LogFullHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.LogFull value;

	public LogFullHolder ()
	{
	}
	public LogFullHolder(final org.omg.DsLogAdmin.LogFull initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.LogFullHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.LogFullHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.LogFullHelper.write(_out, value);
	}
}
