package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of exception "LogIdAlreadyExists"
 *	@author JacORB IDL compiler 
 */

public final class LogIdAlreadyExistsHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.LogIdAlreadyExists value;

	public LogIdAlreadyExistsHolder ()
	{
	}
	public LogIdAlreadyExistsHolder(final org.omg.DsLogAdmin.LogIdAlreadyExists initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.LogIdAlreadyExistsHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.LogIdAlreadyExistsHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.LogIdAlreadyExistsHelper.write(_out, value);
	}
}
