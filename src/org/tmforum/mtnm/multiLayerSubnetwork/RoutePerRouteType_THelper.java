package org.tmforum.mtnm.multiLayerSubnetwork;

/**
 *	Generated from IDL definition of alias "RoutePerRouteType_T"
 *	@author JacORB IDL compiler 
 */

public final class RoutePerRouteType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.tmforum.mtnm.multiLayerSubnetwork.RouteAndRouteType_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.tmforum.mtnm.multiLayerSubnetwork.RouteAndRouteType_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.tmforum.mtnm.multiLayerSubnetwork.RoutePerRouteType_THelper.id(), "RoutePerRouteType_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.tmforum.mtnm.multiLayerSubnetwork.RouteAndRouteType_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/multiLayerSubnetwork/RoutePerRouteType_T:1.0";
	}
	public static org.tmforum.mtnm.multiLayerSubnetwork.RouteAndRouteType_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.tmforum.mtnm.multiLayerSubnetwork.RouteAndRouteType_T[] _result;
		int _l_result39 = _in.read_long();
		_result = new org.tmforum.mtnm.multiLayerSubnetwork.RouteAndRouteType_T[_l_result39];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.tmforum.mtnm.multiLayerSubnetwork.RouteAndRouteType_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.tmforum.mtnm.multiLayerSubnetwork.RouteAndRouteType_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.tmforum.mtnm.multiLayerSubnetwork.RouteAndRouteType_THelper.write(_out,_s[i]);
		}

	}
}