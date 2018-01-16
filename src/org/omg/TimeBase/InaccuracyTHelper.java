package org.omg.TimeBase;

/**
 *	Generated from IDL definition of alias "InaccuracyT"
 *	@author JacORB IDL compiler 
 */

public final class InaccuracyTHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, long s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static long extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.TimeBase.InaccuracyTHelper.id(), "InaccuracyT",org.omg.TimeBase.TimeTHelper.type());
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/TimeBase/InaccuracyT:1.0";
	}
	public static long read (final org.omg.CORBA.portable.InputStream _in)
	{
		long _result;
		_result=_in.read_ulonglong();
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, long _s)
	{
		_out.write_ulonglong(_s);
	}
}
