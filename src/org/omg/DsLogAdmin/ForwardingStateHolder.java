package org.omg.DsLogAdmin;
/**
 *	Generated from IDL definition of enum "ForwardingState"
 *	@author JacORB IDL compiler 
 */

public final class ForwardingStateHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ForwardingState value;

	public ForwardingStateHolder ()
	{
	}
	public ForwardingStateHolder (final ForwardingState initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ForwardingStateHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ForwardingStateHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ForwardingStateHelper.write (out,value);
	}
}
