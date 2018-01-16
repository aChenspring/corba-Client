package org.tmforum.mtnm.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "SNCCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T value;

	public SNCCreateData_THolder ()
	{
	}
	public SNCCreateData_THolder(final org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.subnetworkConnection.SNCCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.subnetworkConnection.SNCCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.subnetworkConnection.SNCCreateData_THelper.write(_out, value);
	}
}
