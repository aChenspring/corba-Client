package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of alias "RecordIdList"
 *	@author JacORB IDL compiler 
 */

public final class RecordIdListHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, long[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static long[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.DsLogAdmin.RecordIdListHelper.id(), "RecordIdList",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.DsLogAdmin.RecordIdHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/DsLogAdmin/RecordIdList:1.0";
	}
	public static long[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		long[] _result;
		int _l_result25 = _in.read_long();
		_result = new long[_l_result25];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=_in.read_ulonglong();
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, long[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			_out.write_ulonglong(_s[i]);
		}

	}
}
