package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of alias "RecordList"
 *	@author JacORB IDL compiler 
 */

public final class RecordListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.LogRecord[] value;

	public RecordListHolder ()
	{
	}
	public RecordListHolder (final org.omg.DsLogAdmin.LogRecord[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RecordListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RecordListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RecordListHelper.write (out,value);
	}
}
