package org.tmforum.mtnm.multiLayerSubnetwork;

/**
 *	Generated from IDL definition of struct "TPPoolCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TPPoolCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.multiLayerSubnetwork.TPPoolCreateData_T value;

	public TPPoolCreateData_THolder ()
	{
	}
	public TPPoolCreateData_THolder(final org.tmforum.mtnm.multiLayerSubnetwork.TPPoolCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.multiLayerSubnetwork.TPPoolCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.multiLayerSubnetwork.TPPoolCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.multiLayerSubnetwork.TPPoolCreateData_THelper.write(_out, value);
	}
}
