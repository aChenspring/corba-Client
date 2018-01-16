package org.tmforum.mtnm.mLSNPPLink;


/**
 *	Generated from IDL definition of struct "MultiLayerSNPPLink_T"
 *	@author JacORB IDL compiler 
 */

public final class MultiLayerSNPPLink_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_THelper.id(),"MultiLayerSNPPLink_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("aMLRAName", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("zMLRAName", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("aTNAName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("zTNAName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("aTNAGroupName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("zTNAGroupName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("sNPPLinkList", org.tmforum.mtnm.mLSNPPLink.LayeredSNPPLinkList_THelper.type(), null),new org.omg.CORBA.StructMember("interfaceType", org.tmforum.mtnm.mLSNPPLink.InterfaceType_THelper.type(), null),new org.omg.CORBA.StructMember("signallingParameters", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("signallingControllerIdentifier", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("signallingProtocol", org.tmforum.mtnm.mLSNPPLink.SignallingProtocol_THelper.type(), null),new org.omg.CORBA.StructMember("signallingEnabled", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("cost", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("discovered", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("availability", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("linkSRG", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/mLSNPPLink/MultiLayerSNPPLink_T:1.0";
	}
	public static org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_T result = new org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_T();
		result.name = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.direction=org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.read(in);
		result.aMLRAName = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.zMLRAName = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.aTNAName=in.read_string();
		result.zTNAName=in.read_string();
		result.aTNAGroupName=in.read_string();
		result.zTNAGroupName=in.read_string();
		result.sNPPLinkList = org.tmforum.mtnm.mLSNPPLink.LayeredSNPPLinkList_THelper.read(in);
		result.interfaceType=in.read_string();
		result.signallingParameters = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.signallingControllerIdentifier=in.read_string();
		result.signallingProtocol=in.read_string();
		result.signallingEnabled=in.read_boolean();
		result.cost = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.discovered=in.read_boolean();
		result.availability = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.linkSRG=in.read_string();
		result.additionalInfo = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_T s)
	{
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.aMLRAName);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.zMLRAName);
		out.write_string(s.aTNAName);
		out.write_string(s.zTNAName);
		out.write_string(s.aTNAGroupName);
		out.write_string(s.zTNAGroupName);
		org.tmforum.mtnm.mLSNPPLink.LayeredSNPPLinkList_THelper.write(out,s.sNPPLinkList);
		out.write_string(s.interfaceType);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.signallingParameters);
		out.write_string(s.signallingControllerIdentifier);
		out.write_string(s.signallingProtocol);
		out.write_boolean(s.signallingEnabled);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.cost);
		out.write_boolean(s.discovered);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.availability);
		out.write_string(s.linkSRG);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
