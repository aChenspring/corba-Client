package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of exception "InvalidAttribute"
 *	@author JacORB IDL compiler 
 */

public final class InvalidAttributeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.InvalidAttribute value;

	public InvalidAttributeHolder ()
	{
	}
	public InvalidAttributeHolder(final org.omg.DsLogAdmin.InvalidAttribute initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.InvalidAttributeHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.InvalidAttributeHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.InvalidAttributeHelper.write(_out, value);
	}
}
