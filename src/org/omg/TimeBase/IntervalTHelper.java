package org.omg.TimeBase;


/**
 *	Generated from IDL definition of struct "IntervalT"
 *	@author JacORB IDL compiler 
 */

public final class IntervalTHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.TimeBase.IntervalTHelper.id(),"IntervalT",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("lower_bound", org.omg.TimeBase.TimeTHelper.type(), null),new org.omg.CORBA.StructMember("upper_bound", org.omg.TimeBase.TimeTHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.TimeBase.IntervalT s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.TimeBase.IntervalT extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/TimeBase/IntervalT:1.0";
	}
	public static org.omg.TimeBase.IntervalT read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.TimeBase.IntervalT result = new org.omg.TimeBase.IntervalT();
		result.lower_bound=in.read_ulonglong();
		result.upper_bound=in.read_ulonglong();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.TimeBase.IntervalT s)
	{
		out.write_ulonglong(s.lower_bound);
		out.write_ulonglong(s.upper_bound);
	}
}
