package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of alias "Anys"
 *	@author JacORB IDL compiler 
 */

public final class AnysHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.Any[] value;

	public AnysHolder ()
	{
	}
	public AnysHolder (final org.omg.CORBA.Any[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AnysHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AnysHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AnysHelper.write (out,value);
	}
}
