package org.tmforum.mtnm.KYLAND_alarmMgr;

/**
 *	Generated from IDL interface "KYLAND_alarmMgr_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class KYLAND_alarmMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public KYLAND_alarmMgr_I value;
	public KYLAND_alarmMgr_IHolder()
	{
	}
	public KYLAND_alarmMgr_IHolder (final KYLAND_alarmMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return KYLAND_alarmMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = KYLAND_alarmMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		KYLAND_alarmMgr_IHelper.write (_out,value);
	}
}
