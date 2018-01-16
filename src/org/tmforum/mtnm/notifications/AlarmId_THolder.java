package org.tmforum.mtnm.notifications;

/**
 *	Generated from IDL definition of struct "AlarmId_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmId_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.notifications.AlarmId_T value;

	public AlarmId_THolder ()
	{
	}
	public AlarmId_THolder(final org.tmforum.mtnm.notifications.AlarmId_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.notifications.AlarmId_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.notifications.AlarmId_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.notifications.AlarmId_THelper.write(_out, value);
	}
}
