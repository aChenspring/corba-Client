package org.omg.DsLogAdmin;
/**
 *	Generated from IDL definition of enum "AdministrativeState"
 *	@author JacORB IDL compiler 
 */

public final class AdministrativeStateHolder
	implements org.omg.CORBA.portable.Streamable
{
	public AdministrativeState value;

	public AdministrativeStateHolder ()
	{
	}
	public AdministrativeStateHolder (final AdministrativeState initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AdministrativeStateHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AdministrativeStateHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AdministrativeStateHelper.write (out,value);
	}
}
