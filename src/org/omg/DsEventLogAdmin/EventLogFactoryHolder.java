package org.omg.DsEventLogAdmin;

/**
 *	Generated from IDL interface "EventLogFactory"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class EventLogFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public EventLogFactory value;
	public EventLogFactoryHolder()
	{
	}
	public EventLogFactoryHolder (final EventLogFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EventLogFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EventLogFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EventLogFactoryHelper.write (_out,value);
	}
}
