package org.tmforum.mtnm.mLSNPPLink;

/**
 *	Generated from IDL definition of struct "SNPPLink_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPPLink_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.mLSNPPLink.SNPPLink_T value;

	public SNPPLink_THolder ()
	{
	}
	public SNPPLink_THolder(final org.tmforum.mtnm.mLSNPPLink.SNPPLink_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.mLSNPPLink.SNPPLink_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.mLSNPPLink.SNPPLink_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.mLSNPPLink.SNPPLink_THelper.write(_out, value);
	}
}
