package org.omg.CosNaming.NamingContextPackage;


/**
 *	Generated from IDL definition of exception "InvalidName"
 *	@author JacORB IDL compiler 
 */

public final class InvalidNameHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.id(),"InvalidName",new org.omg.CORBA.StructMember[0]);
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNaming.NamingContextPackage.InvalidName s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNaming.NamingContextPackage.InvalidName extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0";
	}
	public static org.omg.CosNaming.NamingContextPackage.InvalidName read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosNaming.NamingContextPackage.InvalidName result = new org.omg.CosNaming.NamingContextPackage.InvalidName();
		if (!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNaming.NamingContextPackage.InvalidName s)
	{
		out.write_string(id());
	}
}
