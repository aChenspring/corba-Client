package org.tmforum.mtnm.maintenanceOps;

/**
 *	Generated from IDL definition of struct "CurrentMaintenanceOperation_T"
 *	@author JacORB IDL compiler 
 */

public final class CurrentMaintenanceOperation_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperation_T value;

	public CurrentMaintenanceOperation_THolder ()
	{
	}
	public CurrentMaintenanceOperation_THolder(final org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperation_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperation_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperation_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperation_THelper.write(_out, value);
	}
}
