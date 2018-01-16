package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of alias "NVList"
 *	@author JacORB IDL compiler 
 */

public final class NVListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.NVPair[] value;

	public NVListHolder ()
	{
	}
	public NVListHolder (final org.omg.DsLogAdmin.NVPair[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NVListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NVListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NVListHelper.write (out,value);
	}
}
