package org.tmforum.mtnm.mLSNPP;

/**
 *	Generated from IDL definition of struct "SNPPTNAPair_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPPTNAPair_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.mLSNPP.SNPPTNAPair_T value;

	public SNPPTNAPair_THolder ()
	{
	}
	public SNPPTNAPair_THolder(final org.tmforum.mtnm.mLSNPP.SNPPTNAPair_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.mLSNPP.SNPPTNAPair_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.mLSNPP.SNPPTNAPair_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.mLSNPP.SNPPTNAPair_THelper.write(_out, value);
	}
}
