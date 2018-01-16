package org.tmforum.mtnm.subnetworkConnection;


/**
 *	Generated from IDL definition of struct "TPData_T"
 *	@author JacORB IDL compiler 
 */

public final class TPData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.subnetworkConnection.TPData_THelper.id(),"TPData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tpName", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("tpMappingMode", org.tmforum.mtnm.terminationPoint.TerminationMode_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("ingressTrafficDescriptorName", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("egressTrafficDescriptorName", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.subnetworkConnection.TPData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.subnetworkConnection.TPData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/TPData_T:1.0";
	}
	public static org.tmforum.mtnm.subnetworkConnection.TPData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.subnetworkConnection.TPData_T result = new org.tmforum.mtnm.subnetworkConnection.TPData_T();
		result.tpName = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.tpMappingMode=org.tmforum.mtnm.terminationPoint.TerminationMode_THelper.read(in);
		result.transmissionParams = org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THelper.read(in);
		result.ingressTrafficDescriptorName = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.egressTrafficDescriptorName = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.subnetworkConnection.TPData_T s)
	{
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.tpName);
		org.tmforum.mtnm.terminationPoint.TerminationMode_THelper.write(out,s.tpMappingMode);
		org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.ingressTrafficDescriptorName);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.egressTrafficDescriptorName);
	}
}
