package org.tmforum.mtnm.multiLayerSubnetwork;

/**
 *	Generated from IDL definition of struct "RouteAndRouteType_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteAndRouteType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.multiLayerSubnetwork.RouteAndRouteType_T value;

	public RouteAndRouteType_THolder ()
	{
	}
	public RouteAndRouteType_THolder(final org.tmforum.mtnm.multiLayerSubnetwork.RouteAndRouteType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.multiLayerSubnetwork.RouteAndRouteType_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.multiLayerSubnetwork.RouteAndRouteType_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.multiLayerSubnetwork.RouteAndRouteType_THelper.write(_out, value);
	}
}
