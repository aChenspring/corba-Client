package org.tmforum.mtnm.flowDomain;

/**
 *	Generated from IDL definition of struct "FTPCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FTPCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.flowDomain.FTPCreateData_T value;

	public FTPCreateData_THolder ()
	{
	}
	public FTPCreateData_THolder(final org.tmforum.mtnm.flowDomain.FTPCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.flowDomain.FTPCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.flowDomain.FTPCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.flowDomain.FTPCreateData_THelper.write(_out, value);
	}
}
