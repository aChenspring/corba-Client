package org.omg.DsNotifyLogAdmin;

/**
 *	Generated from IDL interface "NotifyLogFactory"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class NotifyLogFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public NotifyLogFactory value;
	public NotifyLogFactoryHolder()
	{
	}
	public NotifyLogFactoryHolder (final NotifyLogFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return NotifyLogFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NotifyLogFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		NotifyLogFactoryHelper.write (_out,value);
	}
}
