package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of alias "RecordIdList"
 *	@author JacORB IDL compiler 
 */

public final class RecordIdListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public long[] value;

	public RecordIdListHolder ()
	{
	}
	public RecordIdListHolder (final long[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RecordIdListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RecordIdListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RecordIdListHelper.write (out,value);
	}
}
