package org.tmforum.mtnm.subnetworkConnection;


/**
 *	Generated from IDL definition of struct "SNCCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.subnetworkConnection.SNCCreateData_THelper.id(),"SNCCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("staticProtectionLevel", org.tmforum.mtnm.subnetworkConnection.StaticProtectionLevel_THelper.type(), null),new org.omg.CORBA.StructMember("protectionEffort", org.tmforum.mtnm.subnetworkConnection.ProtectionEffort_THelper.type(), null),new org.omg.CORBA.StructMember("rerouteAllowed", org.tmforum.mtnm.subnetworkConnection.Reroute_THelper.type(), null),new org.omg.CORBA.StructMember("networkRouted", org.tmforum.mtnm.subnetworkConnection.NetworkRouted_THelper.type(), null),new org.omg.CORBA.StructMember("sncType", org.tmforum.mtnm.subnetworkConnection.SNCType_THelper.type(), null),new org.omg.CORBA.StructMember("layerRate", org.tmforum.mtnm.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("ccInclusions", org.tmforum.mtnm.subnetworkConnection.CrossConnectList_THelper.type(), null),new org.omg.CORBA.StructMember("neTpInclusions", org.tmforum.mtnm.subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("fullRoute", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("neTpSncExclusions", org.tmforum.mtnm.subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("aEnd", org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalCreationInfo", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/SNCCreateData_T:1.0";
	}
	public static org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T result = new org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.direction=org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.read(in);
		result.staticProtectionLevel=org.tmforum.mtnm.subnetworkConnection.StaticProtectionLevel_THelper.read(in);
		result.protectionEffort=org.tmforum.mtnm.subnetworkConnection.ProtectionEffort_THelper.read(in);
		result.rerouteAllowed=org.tmforum.mtnm.subnetworkConnection.Reroute_THelper.read(in);
		result.networkRouted=org.tmforum.mtnm.subnetworkConnection.NetworkRouted_THelper.read(in);
		result.sncType=org.tmforum.mtnm.subnetworkConnection.SNCType_THelper.read(in);
		result.layerRate=in.read_short();
		result.ccInclusions = org.tmforum.mtnm.subnetworkConnection.CrossConnectList_THelper.read(in);
		result.neTpInclusions = org.tmforum.mtnm.subnetworkConnection.ResourceList_THelper.read(in);
		result.fullRoute=in.read_boolean();
		result.neTpSncExclusions = org.tmforum.mtnm.subnetworkConnection.ResourceList_THelper.read(in);
		result.aEnd = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(in);
		result.zEnd = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalCreationInfo = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T s)
	{
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		org.tmforum.mtnm.subnetworkConnection.StaticProtectionLevel_THelper.write(out,s.staticProtectionLevel);
		org.tmforum.mtnm.subnetworkConnection.ProtectionEffort_THelper.write(out,s.protectionEffort);
		org.tmforum.mtnm.subnetworkConnection.Reroute_THelper.write(out,s.rerouteAllowed);
		org.tmforum.mtnm.subnetworkConnection.NetworkRouted_THelper.write(out,s.networkRouted);
		org.tmforum.mtnm.subnetworkConnection.SNCType_THelper.write(out,s.sncType);
		out.write_short(s.layerRate);
		org.tmforum.mtnm.subnetworkConnection.CrossConnectList_THelper.write(out,s.ccInclusions);
		org.tmforum.mtnm.subnetworkConnection.ResourceList_THelper.write(out,s.neTpInclusions);
		out.write_boolean(s.fullRoute);
		org.tmforum.mtnm.subnetworkConnection.ResourceList_THelper.write(out,s.neTpSncExclusions);
		org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(out,s.aEnd);
		org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(out,s.zEnd);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
