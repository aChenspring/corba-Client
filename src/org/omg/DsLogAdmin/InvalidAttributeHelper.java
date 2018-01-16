package org.omg.DsLogAdmin;


/**
 *	Generated from IDL definition of exception "InvalidAttribute"
 *	@author JacORB IDL compiler 
 */

public final class InvalidAttributeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.DsLogAdmin.InvalidAttributeHelper.id(),"InvalidAttribute",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("attr_name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.DsLogAdmin.InvalidAttribute s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.DsLogAdmin.InvalidAttribute extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/DsLogAdmin/InvalidAttribute:1.0";
	}
	public static org.omg.DsLogAdmin.InvalidAttribute read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.DsLogAdmin.InvalidAttribute result = new org.omg.DsLogAdmin.InvalidAttribute();
		if (!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.attr_name=in.read_string();
		result.value=in.read_any();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.DsLogAdmin.InvalidAttribute s)
	{
		out.write_string(id());
		out.write_string(s.attr_name);
		out.write_any(s.value);
	}
}
