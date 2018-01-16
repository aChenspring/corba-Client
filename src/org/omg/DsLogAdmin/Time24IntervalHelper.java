package org.omg.DsLogAdmin;


/**
 *	Generated from IDL definition of struct "Time24Interval"
 *	@author JacORB IDL compiler 
 */

public final class Time24IntervalHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.DsLogAdmin.Time24IntervalHelper.id(),"Time24Interval",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("start", org.omg.DsLogAdmin.Time24Helper.type(), null),new org.omg.CORBA.StructMember("stop", org.omg.DsLogAdmin.Time24Helper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.DsLogAdmin.Time24Interval s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.DsLogAdmin.Time24Interval extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/DsLogAdmin/Time24Interval:1.0";
	}
	public static org.omg.DsLogAdmin.Time24Interval read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.DsLogAdmin.Time24Interval result = new org.omg.DsLogAdmin.Time24Interval();
		result.start=org.omg.DsLogAdmin.Time24Helper.read(in);
		result.stop=org.omg.DsLogAdmin.Time24Helper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.DsLogAdmin.Time24Interval s)
	{
		org.omg.DsLogAdmin.Time24Helper.write(out,s.start);
		org.omg.DsLogAdmin.Time24Helper.write(out,s.stop);
	}
}
