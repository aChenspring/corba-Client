package org.omg.DsLogAdmin;
/**
 *	Generated from IDL definition of enum "OperationalState"
 *	@author JacORB IDL compiler 
 */

public final class OperationalStateHolder
	implements org.omg.CORBA.portable.Streamable
{
	public OperationalState value;

	public OperationalStateHolder ()
	{
	}
	public OperationalStateHolder (final OperationalState initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return OperationalStateHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = OperationalStateHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		OperationalStateHelper.write (out,value);
	}
}
