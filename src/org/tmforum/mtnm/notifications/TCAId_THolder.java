package org.tmforum.mtnm.notifications;

/**
 *	Generated from IDL definition of struct "TCAId_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAId_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.notifications.TCAId_T value;

	public TCAId_THolder ()
	{
	}
	public TCAId_THolder(final org.tmforum.mtnm.notifications.TCAId_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.notifications.TCAId_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.notifications.TCAId_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.notifications.TCAId_THelper.write(_out, value);
	}
}
