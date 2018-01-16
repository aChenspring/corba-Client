package org.tmforum.mtnm.flowDomainFragment;


/**
 *	Generated from IDL definition of struct "MatrixFlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class MatrixFlowDomainFragment_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.flowDomainFragment.MatrixFlowDomainFragment_THelper.id(),"MatrixFlowDomainFragment_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("direction", org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", org.tmforum.mtnm.transmissionParameters.LayeredParameters_THelper.type(), null),new org.omg.CORBA.StructMember("aEnd", org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("flexible", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("active", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("mfdfrType", org.tmforum.mtnm.flowDomainFragment.FDFrType_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.flowDomainFragment.MatrixFlowDomainFragment_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.flowDomainFragment.MatrixFlowDomainFragment_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomainFragment/MatrixFlowDomainFragment_T:1.0";
	}
	public static org.tmforum.mtnm.flowDomainFragment.MatrixFlowDomainFragment_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.flowDomainFragment.MatrixFlowDomainFragment_T result = new org.tmforum.mtnm.flowDomainFragment.MatrixFlowDomainFragment_T();
		result.direction=org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.read(in);
		result.transmissionParams=org.tmforum.mtnm.transmissionParameters.LayeredParameters_THelper.read(in);
		result.aEnd = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(in);
		result.zEnd = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(in);
		result.flexible=in.read_boolean();
		result.active=in.read_boolean();
		result.mfdfrType=in.read_string();
		result.additionalInfo = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.flowDomainFragment.MatrixFlowDomainFragment_T s)
	{
		org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		org.tmforum.mtnm.transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(out,s.aEnd);
		org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(out,s.zEnd);
		out.write_boolean(s.flexible);
		out.write_boolean(s.active);
		out.write_string(s.mfdfrType);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
