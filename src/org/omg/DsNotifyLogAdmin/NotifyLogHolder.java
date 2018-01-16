package org.omg.DsNotifyLogAdmin;

/**
 *	Generated from IDL interface "NotifyLog"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class NotifyLogHolder	implements org.omg.CORBA.portable.Streamable{
	 public NotifyLog value;
	public NotifyLogHolder()
	{
	}
	public NotifyLogHolder (final NotifyLog initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return NotifyLogHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NotifyLogHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		NotifyLogHelper.write (_out,value);
	}
}
