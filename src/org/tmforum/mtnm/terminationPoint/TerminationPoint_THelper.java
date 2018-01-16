package org.tmforum.mtnm.terminationPoint;


/**
 *	Generated from IDL definition of struct "TerminationPoint_T"
 *	@author JacORB IDL compiler 
 */

public final class TerminationPoint_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.terminationPoint.TerminationPoint_THelper.id(),"TerminationPoint_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("ingressTrafficDescriptorName", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("egressTrafficDescriptorName", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("type", org.tmforum.mtnm.terminationPoint.TPType_THelper.type(), null),new org.omg.CORBA.StructMember("connectionState", org.tmforum.mtnm.terminationPoint.TPConnectionState_THelper.type(), null),new org.omg.CORBA.StructMember("tpMappingMode", org.tmforum.mtnm.terminationPoint.TerminationMode_THelper.type(), null),new org.omg.CORBA.StructMember("direction", org.tmforum.mtnm.terminationPoint.Directionality_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("tpProtectionAssociation", org.tmforum.mtnm.terminationPoint.TPProtectionAssociation_THelper.type(), null),new org.omg.CORBA.StructMember("edgePoint", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("additionalInfo", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.terminationPoint.TerminationPoint_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.terminationPoint.TerminationPoint_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/terminationPoint/TerminationPoint_T:1.0";
	}
	public static org.tmforum.mtnm.terminationPoint.TerminationPoint_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.terminationPoint.TerminationPoint_T result = new org.tmforum.mtnm.terminationPoint.TerminationPoint_T();
		result.name = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.ingressTrafficDescriptorName = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.egressTrafficDescriptorName = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.type=org.tmforum.mtnm.terminationPoint.TPType_THelper.read(in);
		result.connectionState=org.tmforum.mtnm.terminationPoint.TPConnectionState_THelper.read(in);
		result.tpMappingMode=org.tmforum.mtnm.terminationPoint.TerminationMode_THelper.read(in);
		result.direction=org.tmforum.mtnm.terminationPoint.Directionality_THelper.read(in);
		result.transmissionParams = org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THelper.read(in);
		result.tpProtectionAssociation=org.tmforum.mtnm.terminationPoint.TPProtectionAssociation_THelper.read(in);
		result.edgePoint=in.read_boolean();
		result.additionalInfo = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.terminationPoint.TerminationPoint_T s)
	{
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.ingressTrafficDescriptorName);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.egressTrafficDescriptorName);
		org.tmforum.mtnm.terminationPoint.TPType_THelper.write(out,s.type);
		org.tmforum.mtnm.terminationPoint.TPConnectionState_THelper.write(out,s.connectionState);
		org.tmforum.mtnm.terminationPoint.TerminationMode_THelper.write(out,s.tpMappingMode);
		org.tmforum.mtnm.terminationPoint.Directionality_THelper.write(out,s.direction);
		org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
		org.tmforum.mtnm.terminationPoint.TPProtectionAssociation_THelper.write(out,s.tpProtectionAssociation);
		out.write_boolean(s.edgePoint);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
