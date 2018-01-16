package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of alias "LogList"
 *	@author JacORB IDL compiler 
 */

public final class LogListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.Log[] value;

	public LogListHolder ()
	{
	}
	public LogListHolder (final org.omg.DsLogAdmin.Log[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LogListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LogListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LogListHelper.write (out,value);
	}
}
