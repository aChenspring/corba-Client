package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of struct "NVPair"
 *	@author JacORB IDL compiler 
 */

public final class NVPairHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.NVPair value;

	public NVPairHolder ()
	{
	}
	public NVPairHolder(final org.omg.DsLogAdmin.NVPair initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.NVPairHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.NVPairHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.NVPairHelper.write(_out, value);
	}
}
