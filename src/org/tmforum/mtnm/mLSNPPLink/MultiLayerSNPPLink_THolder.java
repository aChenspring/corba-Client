package org.tmforum.mtnm.mLSNPPLink;

/**
 *	Generated from IDL definition of struct "MultiLayerSNPPLink_T"
 *	@author JacORB IDL compiler 
 */

public final class MultiLayerSNPPLink_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_T value;

	public MultiLayerSNPPLink_THolder ()
	{
	}
	public MultiLayerSNPPLink_THolder(final org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_THelper.write(_out, value);
	}
}
