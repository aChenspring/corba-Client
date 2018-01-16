package org.omg.DsLogAdmin;


/**
 *	Generated from IDL definition of exception "InvalidTimeInterval"
 *	@author JacORB IDL compiler 
 */

public final class InvalidTimeIntervalHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.DsLogAdmin.InvalidTimeIntervalHelper.id(),"InvalidTimeInterval",new org.omg.CORBA.StructMember[0]);
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.DsLogAdmin.InvalidTimeInterval s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.DsLogAdmin.InvalidTimeInterval extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/DsLogAdmin/InvalidTimeInterval:1.0";
	}
	public static org.omg.DsLogAdmin.InvalidTimeInterval read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.DsLogAdmin.InvalidTimeInterval result = new org.omg.DsLogAdmin.InvalidTimeInterval();
		if (!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.DsLogAdmin.InvalidTimeInterval s)
	{
		out.write_string(id());
	}
}
