package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of exception "InvalidParam"
 *	@author JacORB IDL compiler 
 */

public final class InvalidParamHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.InvalidParam value;

	public InvalidParamHolder ()
	{
	}
	public InvalidParamHolder(final org.omg.DsLogAdmin.InvalidParam initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.InvalidParamHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.InvalidParamHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.InvalidParamHelper.write(_out, value);
	}
}
