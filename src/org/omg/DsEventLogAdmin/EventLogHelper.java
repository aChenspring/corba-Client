package org.omg.DsEventLogAdmin;


/**
 *	Generated from IDL interface "EventLog"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class EventLogHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.DsEventLogAdmin.EventLog s)
	{
			any.insert_Object(s);
	}
	public static org.omg.DsEventLogAdmin.EventLog extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/DsEventLogAdmin/EventLog:1.0", "EventLog");
	}
	public static String id()
	{
		return "IDL:omg.org/DsEventLogAdmin/EventLog:1.0";
	}
	public static EventLog read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.DsEventLogAdmin.EventLog s)
	{
		_out.write_Object(s);
	}
	public static org.omg.DsEventLogAdmin.EventLog narrow(final java.lang.Object obj)
	{
		if (obj instanceof org.omg.DsEventLogAdmin.EventLog)
		{
			return (org.omg.DsEventLogAdmin.EventLog)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static org.omg.DsEventLogAdmin.EventLog narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (org.omg.DsEventLogAdmin.EventLog)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/DsEventLogAdmin/EventLog:1.0"))
			{
				org.omg.DsEventLogAdmin._EventLogStub stub;
				stub = new org.omg.DsEventLogAdmin._EventLogStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static org.omg.DsEventLogAdmin.EventLog unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (org.omg.DsEventLogAdmin.EventLog)obj;
		}
		catch (ClassCastException c)
		{
				org.omg.DsEventLogAdmin._EventLogStub stub;
				stub = new org.omg.DsEventLogAdmin._EventLogStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
		}
	}
}
