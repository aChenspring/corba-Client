package org.tmforum.mtnm.flowDomainFragment;


/**
 *	Generated from IDL definition of struct "FDFrCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.flowDomainFragment.FDFrCreateData_THelper.id(),"FDFrCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("administrativeState", org.tmforum.mtnm.performance.AdministrativeState_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", org.tmforum.mtnm.transmissionParameters.LayeredParameters_THelper.type(), null),new org.omg.CORBA.StructMember("fullRoute", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("fdfrType", org.tmforum.mtnm.flowDomainFragment.FDFrType_THelper.type(), null),new org.omg.CORBA.StructMember("additionalCreationInfo", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.flowDomainFragment.FDFrCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.flowDomainFragment.FDFrCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomainFragment/FDFrCreateData_T:1.0";
	}
	public static org.tmforum.mtnm.flowDomainFragment.FDFrCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.flowDomainFragment.FDFrCreateData_T result = new org.tmforum.mtnm.flowDomainFragment.FDFrCreateData_T();
		result.name = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.networkAccessDomain=in.read_string();
		result.direction=org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.read(in);
		result.administrativeState=org.tmforum.mtnm.performance.AdministrativeState_THelper.read(in);
		result.transmissionParams=org.tmforum.mtnm.transmissionParameters.LayeredParameters_THelper.read(in);
		result.fullRoute=in.read_boolean();
		result.fdfrType=in.read_string();
		result.additionalCreationInfo = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.flowDomainFragment.FDFrCreateData_T s)
	{
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		out.write_string(s.networkAccessDomain);
		org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		org.tmforum.mtnm.performance.AdministrativeState_THelper.write(out,s.administrativeState);
		org.tmforum.mtnm.transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		out.write_boolean(s.fullRoute);
		out.write_string(s.fdfrType);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
