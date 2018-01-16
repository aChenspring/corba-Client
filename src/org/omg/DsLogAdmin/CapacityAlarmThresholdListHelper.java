package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of alias "CapacityAlarmThresholdList"
 *	@author JacORB IDL compiler 
 */

public final class CapacityAlarmThresholdListHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, short[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static short[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.DsLogAdmin.CapacityAlarmThresholdListHelper.id(), "CapacityAlarmThresholdList",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.DsLogAdmin.ThresholdHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/DsLogAdmin/CapacityAlarmThresholdList:1.0";
	}
	public static short[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		short[] _result;
		int _l_result31 = _in.read_long();
		_result = new short[_l_result31];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=_in.read_ushort();
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, short[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			_out.write_ushort(_s[i]);
		}

	}
}
