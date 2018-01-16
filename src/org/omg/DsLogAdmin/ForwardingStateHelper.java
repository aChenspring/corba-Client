package org.omg.DsLogAdmin;
/**
 *	Generated from IDL definition of enum "ForwardingState"
 *	@author JacORB IDL compiler 
 */

public final class ForwardingStateHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.DsLogAdmin.ForwardingStateHelper.id(),"ForwardingState",new String[]{"on","off"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.DsLogAdmin.ForwardingState s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.DsLogAdmin.ForwardingState extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/DsLogAdmin/ForwardingState:1.0";
	}
	public static ForwardingState read (final org.omg.CORBA.portable.InputStream in)
	{
		return ForwardingState.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ForwardingState s)
	{
		out.write_long(s.value());
	}
}
