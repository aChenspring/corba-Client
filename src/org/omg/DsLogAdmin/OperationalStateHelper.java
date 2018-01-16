package org.omg.DsLogAdmin;
/**
 *	Generated from IDL definition of enum "OperationalState"
 *	@author JacORB IDL compiler 
 */

public final class OperationalStateHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.DsLogAdmin.OperationalStateHelper.id(),"OperationalState",new String[]{"disabled","enabled"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.DsLogAdmin.OperationalState s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.DsLogAdmin.OperationalState extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/DsLogAdmin/OperationalState:1.0";
	}
	public static OperationalState read (final org.omg.CORBA.portable.InputStream in)
	{
		return OperationalState.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final OperationalState s)
	{
		out.write_long(s.value());
	}
}
