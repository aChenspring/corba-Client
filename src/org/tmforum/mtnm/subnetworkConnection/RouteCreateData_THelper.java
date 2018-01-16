package org.tmforum.mtnm.subnetworkConnection;


/**
 *	Generated from IDL definition of struct "RouteCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.subnetworkConnection.RouteCreateData_THelper.id(),"RouteCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("intended", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("exclusive", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("ccInclusions", org.tmforum.mtnm.subnetworkConnection.CrossConnectList_THelper.type(), null),new org.omg.CORBA.StructMember("neTpInclusions", org.tmforum.mtnm.subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("fullRoute", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("neTpSncExclusions", org.tmforum.mtnm.subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalCreationInfo", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.subnetworkConnection.RouteCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.subnetworkConnection.RouteCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/RouteCreateData_T:1.0";
	}
	public static org.tmforum.mtnm.subnetworkConnection.RouteCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.subnetworkConnection.RouteCreateData_T result = new org.tmforum.mtnm.subnetworkConnection.RouteCreateData_T();
		result.intended=in.read_string();
		result.exclusive=in.read_string();
		result.ccInclusions = org.tmforum.mtnm.subnetworkConnection.CrossConnectList_THelper.read(in);
		result.neTpInclusions = org.tmforum.mtnm.subnetworkConnection.ResourceList_THelper.read(in);
		result.fullRoute=in.read_boolean();
		result.neTpSncExclusions = org.tmforum.mtnm.subnetworkConnection.ResourceList_THelper.read(in);
		result.additionalCreationInfo = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.subnetworkConnection.RouteCreateData_T s)
	{
		out.write_string(s.intended);
		out.write_string(s.exclusive);
		org.tmforum.mtnm.subnetworkConnection.CrossConnectList_THelper.write(out,s.ccInclusions);
		org.tmforum.mtnm.subnetworkConnection.ResourceList_THelper.write(out,s.neTpInclusions);
		out.write_boolean(s.fullRoute);
		org.tmforum.mtnm.subnetworkConnection.ResourceList_THelper.write(out,s.neTpSncExclusions);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
