package org.tmforum.mtnm.performance;

/**
 *	Generated from IDL definition of alias "PMParameterWithThresholdsList_T"
 *	@author JacORB IDL compiler 
 */

public final class PMParameterWithThresholdsList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.tmforum.mtnm.performance.PMParameterWithThresholds_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.tmforum.mtnm.performance.PMParameterWithThresholds_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.tmforum.mtnm.performance.PMParameterWithThresholdsList_THelper.id(), "PMParameterWithThresholdsList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.tmforum.mtnm.performance.PMParameterWithThresholds_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMParameterWithThresholdsList_T:1.0";
	}
	public static org.tmforum.mtnm.performance.PMParameterWithThresholds_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.tmforum.mtnm.performance.PMParameterWithThresholds_T[] _result;
		int _l_result60 = _in.read_long();
		_result = new org.tmforum.mtnm.performance.PMParameterWithThresholds_T[_l_result60];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.tmforum.mtnm.performance.PMParameterWithThresholds_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.tmforum.mtnm.performance.PMParameterWithThresholds_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.tmforum.mtnm.performance.PMParameterWithThresholds_THelper.write(_out,_s[i]);
		}

	}
}
