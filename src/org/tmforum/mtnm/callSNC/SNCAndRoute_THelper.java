package org.tmforum.mtnm.callSNC;


/**
 *	Generated from IDL definition of struct "SNCAndRoute_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCAndRoute_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.callSNC.SNCAndRoute_THelper.id(),"SNCAndRoute_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("connection", org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.type(), null),new org.omg.CORBA.StructMember("connectionRoutes", org.tmforum.mtnm.subnetworkConnection.RouteList_THelper.type(), null),new org.omg.CORBA.StructMember("edgeMLSNPPLinks", org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THelper.type(), null),new org.omg.CORBA.StructMember("internalMLSNPPLinks", org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THelper.type(), null),new org.omg.CORBA.StructMember("routeType", org.tmforum.mtnm.callSNC.RouteType_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.callSNC.SNCAndRoute_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.callSNC.SNCAndRoute_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/SNCAndRoute_T:1.0";
	}
	public static org.tmforum.mtnm.callSNC.SNCAndRoute_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.callSNC.SNCAndRoute_T result = new org.tmforum.mtnm.callSNC.SNCAndRoute_T();
		result.connection=org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.read(in);
		result.connectionRoutes = org.tmforum.mtnm.subnetworkConnection.RouteList_THelper.read(in);
		result.edgeMLSNPPLinks = org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THelper.read(in);
		result.internalMLSNPPLinks = org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THelper.read(in);
		result.routeType=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.callSNC.SNCAndRoute_T s)
	{
		org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.write(out,s.connection);
		org.tmforum.mtnm.subnetworkConnection.RouteList_THelper.write(out,s.connectionRoutes);
		org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THelper.write(out,s.edgeMLSNPPLinks);
		org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THelper.write(out,s.internalMLSNPPLinks);
		out.write_string(s.routeType);
	}
}
