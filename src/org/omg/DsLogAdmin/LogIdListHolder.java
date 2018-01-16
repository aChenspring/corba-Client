package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of alias "LogIdList"
 *	@author JacORB IDL compiler 
 */

public final class LogIdListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public LogIdListHolder ()
	{
	}
	public LogIdListHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LogIdListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LogIdListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LogIdListHelper.write (out,value);
	}
}
