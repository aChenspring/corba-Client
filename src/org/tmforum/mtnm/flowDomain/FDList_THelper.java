package org.tmforum.mtnm.flowDomain;

/**
 *	Generated from IDL definition of alias "FDList_T"
 *	@author JacORB IDL compiler 
 */

public final class FDList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.tmforum.mtnm.flowDomain.FlowDomain_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.tmforum.mtnm.flowDomain.FlowDomain_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.tmforum.mtnm.flowDomain.FDList_THelper.id(), "FDList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.tmforum.mtnm.flowDomain.FlowDomain_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomain/FDList_T:1.0";
	}
	public static org.tmforum.mtnm.flowDomain.FlowDomain_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.tmforum.mtnm.flowDomain.FlowDomain_T[] _result;
		int _l_result15 = _in.read_long();
		_result = new org.tmforum.mtnm.flowDomain.FlowDomain_T[_l_result15];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.tmforum.mtnm.flowDomain.FlowDomain_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.tmforum.mtnm.flowDomain.FlowDomain_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.tmforum.mtnm.flowDomain.FlowDomain_THelper.write(_out,_s[i]);
		}

	}
}
