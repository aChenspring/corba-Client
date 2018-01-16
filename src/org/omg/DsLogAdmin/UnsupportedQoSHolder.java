package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of exception "UnsupportedQoS"
 *	@author JacORB IDL compiler 
 */

public final class UnsupportedQoSHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.UnsupportedQoS value;

	public UnsupportedQoSHolder ()
	{
	}
	public UnsupportedQoSHolder(final org.omg.DsLogAdmin.UnsupportedQoS initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.UnsupportedQoSHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.UnsupportedQoSHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.UnsupportedQoSHelper.write(_out, value);
	}
}
