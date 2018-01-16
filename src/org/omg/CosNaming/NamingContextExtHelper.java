package org.omg.CosNaming;


/**
 *	Generated from IDL interface "NamingContextExt"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class NamingContextExtHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNaming.NamingContextExt s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosNaming.NamingContextExt extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNaming/NamingContextExt:1.0", "NamingContextExt");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNaming/NamingContextExt:1.0";
	}
	public static NamingContextExt read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNaming.NamingContextExt s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNaming.NamingContextExt narrow(final java.lang.Object obj)
	{
		if (obj instanceof org.omg.CosNaming.NamingContextExt)
		{
			return (org.omg.CosNaming.NamingContextExt)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static org.omg.CosNaming.NamingContextExt narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (org.omg.CosNaming.NamingContextExt)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosNaming/NamingContextExt:1.0"))
			{
				org.omg.CosNaming._NamingContextExtStub stub;
				stub = new org.omg.CosNaming._NamingContextExtStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static org.omg.CosNaming.NamingContextExt unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (org.omg.CosNaming.NamingContextExt)obj;
		}
		catch (ClassCastException c)
		{
				org.omg.CosNaming._NamingContextExtStub stub;
				stub = new org.omg.CosNaming._NamingContextExtStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
		}
	}
}
