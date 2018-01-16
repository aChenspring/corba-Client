package org.tmforum.mtnm.notifications;


/**
 *	Generated from IDL definition of struct "CorrelatedNotifications_T"
 *	@author JacORB IDL compiler 
 */

public final class CorrelatedNotifications_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.notifications.CorrelatedNotifications_THelper.id(),"CorrelatedNotifications_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("source", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("notifIDs", org.tmforum.mtnm.notifications.NotifIDList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.notifications.CorrelatedNotifications_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.notifications.CorrelatedNotifications_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/notifications/CorrelatedNotifications_T:1.0";
	}
	public static org.tmforum.mtnm.notifications.CorrelatedNotifications_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.notifications.CorrelatedNotifications_T result = new org.tmforum.mtnm.notifications.CorrelatedNotifications_T();
		result.source = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.notifIDs = org.tmforum.mtnm.notifications.NotifIDList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.notifications.CorrelatedNotifications_T s)
	{
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.source);
		org.tmforum.mtnm.notifications.NotifIDList_THelper.write(out,s.notifIDs);
	}
}
