package org.omg.DsLogAdmin;

/**
 *	Generated from IDL interface "LogMgr"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class LogMgrHolder	implements org.omg.CORBA.portable.Streamable{
	 public LogMgr value;
	public LogMgrHolder()
	{
	}
	public LogMgrHolder (final LogMgr initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return LogMgrHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LogMgrHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		LogMgrHelper.write (_out,value);
	}
}
