package org.omg.DsEventLogAdmin;

/**
 *	Generated from IDL interface "EventLog"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class EventLogHolder	implements org.omg.CORBA.portable.Streamable{
	 public EventLog value;
	public EventLogHolder()
	{
	}
	public EventLogHolder (final EventLog initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EventLogHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EventLogHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EventLogHelper.write (_out,value);
	}
}
