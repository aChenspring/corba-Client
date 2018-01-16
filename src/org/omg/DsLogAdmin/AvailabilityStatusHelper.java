package org.omg.DsLogAdmin;


/**
 *	Generated from IDL definition of struct "AvailabilityStatus"
 *	@author JacORB IDL compiler 
 */

public final class AvailabilityStatusHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.DsLogAdmin.AvailabilityStatusHelper.id(),"AvailabilityStatus",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("off_duty", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("log_full", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.DsLogAdmin.AvailabilityStatus s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.DsLogAdmin.AvailabilityStatus extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/DsLogAdmin/AvailabilityStatus:1.0";
	}
	public static org.omg.DsLogAdmin.AvailabilityStatus read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.DsLogAdmin.AvailabilityStatus result = new org.omg.DsLogAdmin.AvailabilityStatus();
		result.off_duty=in.read_boolean();
		result.log_full=in.read_boolean();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.DsLogAdmin.AvailabilityStatus s)
	{
		out.write_boolean(s.off_duty);
		out.write_boolean(s.log_full);
	}
}
