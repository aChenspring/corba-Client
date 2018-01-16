package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of exception "InvalidThreshold"
 *	@author JacORB IDL compiler 
 */

public final class InvalidThresholdHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.InvalidThreshold value;

	public InvalidThresholdHolder ()
	{
	}
	public InvalidThresholdHolder(final org.omg.DsLogAdmin.InvalidThreshold initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.InvalidThresholdHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.InvalidThresholdHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.InvalidThresholdHelper.write(_out, value);
	}
}
