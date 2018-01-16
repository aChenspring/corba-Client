package org.omg.DsLogAdmin;


/**
 *	Generated from IDL definition of struct "TimeInterval"
 *	@author JacORB IDL compiler 
 */

public final class TimeIntervalHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.DsLogAdmin.TimeIntervalHelper.id(),"TimeInterval",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("start", org.omg.DsLogAdmin.TimeTHelper.type(), null),new org.omg.CORBA.StructMember("stop", org.omg.DsLogAdmin.TimeTHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.DsLogAdmin.TimeInterval s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.DsLogAdmin.TimeInterval extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/DsLogAdmin/TimeInterval:1.0";
	}
	public static org.omg.DsLogAdmin.TimeInterval read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.DsLogAdmin.TimeInterval result = new org.omg.DsLogAdmin.TimeInterval();
		result.start=in.read_ulonglong();
		result.stop=in.read_ulonglong();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.DsLogAdmin.TimeInterval s)
	{
		out.write_ulonglong(s.start);
		out.write_ulonglong(s.stop);
	}
}
