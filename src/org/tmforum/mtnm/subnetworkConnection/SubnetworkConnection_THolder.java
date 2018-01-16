package org.tmforum.mtnm.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "SubnetworkConnection_T"
 *	@author JacORB IDL compiler 
 */

public final class SubnetworkConnection_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_T value;

	public SubnetworkConnection_THolder ()
	{
	}
	public SubnetworkConnection_THolder(final org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.write(_out, value);
	}
}
