package org.omg.DsLogAdmin;

/**
 *	Generated from IDL interface "Log"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class LogHolder	implements org.omg.CORBA.portable.Streamable{
	 public Log value;
	public LogHolder()
	{
	}
	public LogHolder (final Log initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return LogHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LogHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		LogHelper.write (_out,value);
	}
}
