package org.omg.DsLogAdmin;


/**
 *	Generated from IDL definition of struct "NVPair"
 *	@author JacORB IDL compiler 
 */

public final class NVPairHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.DsLogAdmin.NVPairHelper.id(),"NVPair",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.DsLogAdmin.NVPair s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.DsLogAdmin.NVPair extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/DsLogAdmin/NVPair:1.0";
	}
	public static org.omg.DsLogAdmin.NVPair read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.DsLogAdmin.NVPair result = new org.omg.DsLogAdmin.NVPair();
		result.name=in.read_string();
		result.value=in.read_any();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.DsLogAdmin.NVPair s)
	{
		out.write_string(s.name);
		out.write_any(s.value);
	}
}
