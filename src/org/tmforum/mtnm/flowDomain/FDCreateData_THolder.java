package org.tmforum.mtnm.flowDomain;

/**
 *	Generated from IDL definition of struct "FDCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.flowDomain.FDCreateData_T value;

	public FDCreateData_THolder ()
	{
	}
	public FDCreateData_THolder(final org.tmforum.mtnm.flowDomain.FDCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.flowDomain.FDCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.flowDomain.FDCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.flowDomain.FDCreateData_THelper.write(_out, value);
	}
}
