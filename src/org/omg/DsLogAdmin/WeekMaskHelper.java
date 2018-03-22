package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of alias "WeekMask"
 *	@author JacORB IDL compiler 
 */

public final class WeekMaskHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.DsLogAdmin.WeekMaskItem[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.DsLogAdmin.WeekMaskItem[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.DsLogAdmin.WeekMaskHelper.id(), "WeekMask",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.DsLogAdmin.WeekMaskItemHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/DsLogAdmin/WeekMask:1.0";
	}
	public static org.omg.DsLogAdmin.WeekMaskItem[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.DsLogAdmin.WeekMaskItem[] _result;
		int _l_result30 = _in.read_long();
		_result = new org.omg.DsLogAdmin.WeekMaskItem[_l_result30];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.DsLogAdmin.WeekMaskItemHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.DsLogAdmin.WeekMaskItem[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.DsLogAdmin.WeekMaskItemHelper.write(_out,_s[i]);
		}

	}
}