package org.omg.DsLogAdmin;


/**
 *	Generated from IDL definition of exception "InvalidParam"
 *	@author JacORB IDL compiler 
 */

public final class InvalidParamHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.DsLogAdmin.InvalidParamHelper.id(),"InvalidParam",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("details", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.DsLogAdmin.InvalidParam s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.DsLogAdmin.InvalidParam extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/DsLogAdmin/InvalidParam:1.0";
	}
	public static org.omg.DsLogAdmin.InvalidParam read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.DsLogAdmin.InvalidParam result = new org.omg.DsLogAdmin.InvalidParam();
		if (!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.details=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.DsLogAdmin.InvalidParam s)
	{
		out.write_string(id());
		out.write_string(s.details);
	}
}
