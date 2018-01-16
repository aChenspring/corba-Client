package org.omg.CORBA;


/**
 *	Generated from IDL interface "Principal"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class PrincipalHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.Principal s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CORBA.Principal extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:CORBA/Principal:1.0", "Principal");
	}
	public static String id()
	{
		return "IDL:CORBA/Principal:1.0";
	}
	public static Principal read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CORBA.Principal s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CORBA.Principal narrow(final java.lang.Object obj)
	{
		if (obj instanceof org.omg.CORBA.Principal)
		{
			return (org.omg.CORBA.Principal)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static org.omg.CORBA.Principal narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (org.omg.CORBA.Principal)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:CORBA/Principal:1.0"))
			{
				org.omg.CORBA._PrincipalStub stub;
				stub = new org.omg.CORBA._PrincipalStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static org.omg.CORBA.Principal unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (org.omg.CORBA.Principal)obj;
		}
		catch (ClassCastException c)
		{
				org.omg.CORBA._PrincipalStub stub;
				stub = new org.omg.CORBA._PrincipalStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
		}
	}
}
