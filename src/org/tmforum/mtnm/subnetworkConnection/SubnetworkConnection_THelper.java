package org.tmforum.mtnm.subnetworkConnection;


/**
 *	Generated from IDL definition of struct "SubnetworkConnection_T"
 *	@author JacORB IDL compiler 
 */

public final class SubnetworkConnection_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.id(),"SubnetworkConnection_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("sncState", org.tmforum.mtnm.subnetworkConnection.SNCState_THelper.type(), null),new org.omg.CORBA.StructMember("direction", org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("rate", org.tmforum.mtnm.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("staticProtectionLevel", org.tmforum.mtnm.subnetworkConnection.StaticProtectionLevel_THelper.type(), null),new org.omg.CORBA.StructMember("sncType", org.tmforum.mtnm.subnetworkConnection.SNCType_THelper.type(), null),new org.omg.CORBA.StructMember("aEnd", org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("rerouteAllowed", org.tmforum.mtnm.subnetworkConnection.Reroute_THelper.type(), null),new org.omg.CORBA.StructMember("networkRouted", org.tmforum.mtnm.subnetworkConnection.NetworkRouted_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/SubnetworkConnection_T:1.0";
	}
	public static org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_T result = new org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_T();
		result.name = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.sncState=org.tmforum.mtnm.subnetworkConnection.SNCState_THelper.read(in);
		result.direction=org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.read(in);
		result.rate=in.read_short();
		result.staticProtectionLevel=org.tmforum.mtnm.subnetworkConnection.StaticProtectionLevel_THelper.read(in);
		result.sncType=org.tmforum.mtnm.subnetworkConnection.SNCType_THelper.read(in);
		result.aEnd = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(in);
		result.zEnd = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(in);
		result.rerouteAllowed=org.tmforum.mtnm.subnetworkConnection.Reroute_THelper.read(in);
		result.networkRouted=org.tmforum.mtnm.subnetworkConnection.NetworkRouted_THelper.read(in);
		result.additionalInfo = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_T s)
	{
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		org.tmforum.mtnm.subnetworkConnection.SNCState_THelper.write(out,s.sncState);
		org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		out.write_short(s.rate);
		org.tmforum.mtnm.subnetworkConnection.StaticProtectionLevel_THelper.write(out,s.staticProtectionLevel);
		org.tmforum.mtnm.subnetworkConnection.SNCType_THelper.write(out,s.sncType);
		org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(out,s.aEnd);
		org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(out,s.zEnd);
		org.tmforum.mtnm.subnetworkConnection.Reroute_THelper.write(out,s.rerouteAllowed);
		org.tmforum.mtnm.subnetworkConnection.NetworkRouted_THelper.write(out,s.networkRouted);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
