package org.tmforum.mtnm.mLSNPP;

/**
 *	Generated from IDL definition of struct "SNPTNAData_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPTNAData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.mLSNPP.SNPTNAData_T value;

	public SNPTNAData_THolder ()
	{
	}
	public SNPTNAData_THolder(final org.tmforum.mtnm.mLSNPP.SNPTNAData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.mLSNPP.SNPTNAData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.mLSNPP.SNPTNAData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.mLSNPP.SNPTNAData_THelper.write(_out, value);
	}
}
