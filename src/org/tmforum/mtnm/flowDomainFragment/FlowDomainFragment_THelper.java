package org.tmforum.mtnm.flowDomainFragment;


/**
 *	Generated from IDL definition of struct "FlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class FlowDomainFragment_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_THelper.id(),"FlowDomainFragment_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", org.tmforum.mtnm.transmissionParameters.LayeredParameters_THelper.type(), null),new org.omg.CORBA.StructMember("aEnd", org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("flexible", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("administrativeState", org.tmforum.mtnm.performance.AdministrativeState_THelper.type(), null),new org.omg.CORBA.StructMember("fdfrState", org.tmforum.mtnm.subnetworkConnection.SNCState_THelper.type(), null),new org.omg.CORBA.StructMember("fdfrType", org.tmforum.mtnm.flowDomainFragment.FDFrType_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomainFragment/FlowDomainFragment_T:1.0";
	}
	public static org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_T result = new org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_T();
		result.name = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.direction=org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.read(in);
		result.transmissionParams=org.tmforum.mtnm.transmissionParameters.LayeredParameters_THelper.read(in);
		result.aEnd = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(in);
		result.zEnd = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(in);
		result.networkAccessDomain=in.read_string();
		result.flexible=in.read_boolean();
		result.administrativeState=org.tmforum.mtnm.performance.AdministrativeState_THelper.read(in);
		result.fdfrState=org.tmforum.mtnm.subnetworkConnection.SNCState_THelper.read(in);
		result.fdfrType=in.read_string();
		result.additionalInfo = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_T s)
	{
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		org.tmforum.mtnm.transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(out,s.aEnd);
		org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(out,s.zEnd);
		out.write_string(s.networkAccessDomain);
		out.write_boolean(s.flexible);
		org.tmforum.mtnm.performance.AdministrativeState_THelper.write(out,s.administrativeState);
		org.tmforum.mtnm.subnetworkConnection.SNCState_THelper.write(out,s.fdfrState);
		out.write_string(s.fdfrType);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}