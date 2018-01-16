package org.tmforum.mtnm.flowDomain;

/**
 *	Generated from IDL definition of struct "MFDCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class MFDCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.flowDomain.MFDCreateData_T value;

	public MFDCreateData_THolder ()
	{
	}
	public MFDCreateData_THolder(final org.tmforum.mtnm.flowDomain.MFDCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.flowDomain.MFDCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.flowDomain.MFDCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.flowDomain.MFDCreateData_THelper.write(_out, value);
	}
}
