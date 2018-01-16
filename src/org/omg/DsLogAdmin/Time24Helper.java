package org.omg.DsLogAdmin;


/**
 *	Generated from IDL definition of struct "Time24"
 *	@author JacORB IDL compiler 
 */

public final class Time24Helper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.DsLogAdmin.Time24Helper.id(),"Time24",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("hour", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null),new org.omg.CORBA.StructMember("minute", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.DsLogAdmin.Time24 s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.DsLogAdmin.Time24 extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/DsLogAdmin/Time24:1.0";
	}
	public static org.omg.DsLogAdmin.Time24 read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.DsLogAdmin.Time24 result = new org.omg.DsLogAdmin.Time24();
		result.hour=in.read_ushort();
		result.minute=in.read_ushort();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.DsLogAdmin.Time24 s)
	{
		out.write_ushort(s.hour);
		out.write_ushort(s.minute);
	}
}
