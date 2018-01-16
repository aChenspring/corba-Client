package org.omg.DsLogAdmin;


/**
 *	Generated from IDL definition of struct "WeekMaskItem"
 *	@author JacORB IDL compiler 
 */

public final class WeekMaskItemHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.DsLogAdmin.WeekMaskItemHelper.id(),"WeekMaskItem",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("days", org.omg.DsLogAdmin.DaysOfWeekHelper.type(), null),new org.omg.CORBA.StructMember("intervals", org.omg.DsLogAdmin.IntervalsOfDayHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.DsLogAdmin.WeekMaskItem s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.DsLogAdmin.WeekMaskItem extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/DsLogAdmin/WeekMaskItem:1.0";
	}
	public static org.omg.DsLogAdmin.WeekMaskItem read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.DsLogAdmin.WeekMaskItem result = new org.omg.DsLogAdmin.WeekMaskItem();
		result.days=in.read_ushort();
		result.intervals = org.omg.DsLogAdmin.IntervalsOfDayHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.DsLogAdmin.WeekMaskItem s)
	{
		out.write_ushort(s.days);
		org.omg.DsLogAdmin.IntervalsOfDayHelper.write(out,s.intervals);
	}
}
