package org.tmforum.mtnm.mLSNPPLink;

/**
 *	Generated from IDL definition of struct "LayeredSNPPLink_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredSNPPLink_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.mLSNPPLink.LayeredSNPPLink_T value;

	public LayeredSNPPLink_THolder ()
	{
	}
	public LayeredSNPPLink_THolder(final org.tmforum.mtnm.mLSNPPLink.LayeredSNPPLink_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.mLSNPPLink.LayeredSNPPLink_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.mLSNPPLink.LayeredSNPPLink_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.mLSNPPLink.LayeredSNPPLink_THelper.write(_out, value);
	}
}
