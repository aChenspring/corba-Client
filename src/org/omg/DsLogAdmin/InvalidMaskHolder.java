package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of exception "InvalidMask"
 *	@author JacORB IDL compiler 
 */

public final class InvalidMaskHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.InvalidMask value;

	public InvalidMaskHolder ()
	{
	}
	public InvalidMaskHolder(final org.omg.DsLogAdmin.InvalidMask initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.InvalidMaskHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.InvalidMaskHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.InvalidMaskHelper.write(_out, value);
	}
}
