package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of exception "LogLocked"
 *	@author JacORB IDL compiler 
 */

public final class LogLockedHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.LogLocked value;

	public LogLockedHolder ()
	{
	}
	public LogLockedHolder(final org.omg.DsLogAdmin.LogLocked initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.LogLockedHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.LogLockedHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.LogLockedHelper.write(_out, value);
	}
}
