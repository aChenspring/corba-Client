package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of exception "InvalidRecordId"
 *	@author JacORB IDL compiler 
 */

public final class InvalidRecordIdHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.InvalidRecordId value;

	public InvalidRecordIdHolder ()
	{
	}
	public InvalidRecordIdHolder(final org.omg.DsLogAdmin.InvalidRecordId initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.InvalidRecordIdHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.InvalidRecordIdHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.InvalidRecordIdHelper.write(_out, value);
	}
}
