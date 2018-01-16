package org.omg.DsLogAdmin;


/**
 *	Generated from IDL definition of exception "LogFull"
 *	@author JacORB IDL compiler 
 */

public final class LogFullHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.DsLogAdmin.LogFullHelper.id(),"LogFull",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("n_records_written", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.DsLogAdmin.LogFull s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.DsLogAdmin.LogFull extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/DsLogAdmin/LogFull:1.0";
	}
	public static org.omg.DsLogAdmin.LogFull read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.DsLogAdmin.LogFull result = new org.omg.DsLogAdmin.LogFull();
		if (!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.n_records_written=in.read_short();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.DsLogAdmin.LogFull s)
	{
		out.write_string(id());
		out.write_short(s.n_records_written);
	}
}
