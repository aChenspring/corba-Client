package org.tmforum.mtnm.flowDomainFragment;

/**
 *	Generated from IDL definition of struct "FDFrModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.flowDomainFragment.FDFrModifyData_T value;

	public FDFrModifyData_THolder ()
	{
	}
	public FDFrModifyData_THolder(final org.tmforum.mtnm.flowDomainFragment.FDFrModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.flowDomainFragment.FDFrModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.flowDomainFragment.FDFrModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.flowDomainFragment.FDFrModifyData_THelper.write(_out, value);
	}
}
