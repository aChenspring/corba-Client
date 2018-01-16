package org.omg.CosTrading.RegisterPackage;


/**
 *	Generated from IDL definition of exception "UnknownTraderName"
 *	@author JacORB IDL compiler 
 */

public final class UnknownTraderNameHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosTrading.RegisterPackage.UnknownTraderNameHelper.id(),"UnknownTraderName",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CosTrading.TraderNameHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.RegisterPackage.UnknownTraderName s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.RegisterPackage.UnknownTraderName extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/Register/UnknownTraderName:1.0";
	}
	public static org.omg.CosTrading.RegisterPackage.UnknownTraderName read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.RegisterPackage.UnknownTraderName result = new org.omg.CosTrading.RegisterPackage.UnknownTraderName();
		if (!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.name = org.omg.CosTrading.LinkNameSeqHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.RegisterPackage.UnknownTraderName s)
	{
		out.write_string(id());
		org.omg.CosTrading.LinkNameSeqHelper.write(out,s.name);
	}
}
