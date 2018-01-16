package org.tmforum.mtnm.softwareAndDataManager;

/**
 *	Generated from IDL definition of struct "BackupStatus_T"
 *	@author JacORB IDL compiler 
 */

public final class BackupStatus_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.softwareAndDataManager.BackupStatus_T value;

	public BackupStatus_THolder ()
	{
	}
	public BackupStatus_THolder(final org.tmforum.mtnm.softwareAndDataManager.BackupStatus_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.softwareAndDataManager.BackupStatus_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.softwareAndDataManager.BackupStatus_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.softwareAndDataManager.BackupStatus_THelper.write(_out, value);
	}
}
