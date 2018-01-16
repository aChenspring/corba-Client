package org.tmforum.mtnm.flowDomainFragment;

/**
 *	Generated from IDL definition of struct "MatrixFlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class MatrixFlowDomainFragment_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.flowDomainFragment.MatrixFlowDomainFragment_T value;

	public MatrixFlowDomainFragment_THolder ()
	{
	}
	public MatrixFlowDomainFragment_THolder(final org.tmforum.mtnm.flowDomainFragment.MatrixFlowDomainFragment_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.flowDomainFragment.MatrixFlowDomainFragment_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.flowDomainFragment.MatrixFlowDomainFragment_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.flowDomainFragment.MatrixFlowDomainFragment_THelper.write(_out, value);
	}
}
