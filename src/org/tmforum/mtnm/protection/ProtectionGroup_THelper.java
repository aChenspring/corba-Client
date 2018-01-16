package org.tmforum.mtnm.protection;


/**
 *	Generated from IDL definition of struct "ProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionGroup_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.protection.ProtectionGroup_THelper.id(),"ProtectionGroup_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectionGroupType", org.tmforum.mtnm.protection.ProtectionGroupType_THelper.type(), null),new org.omg.CORBA.StructMember("protectionSchemeState", org.tmforum.mtnm.protection.ProtectionSchemeState_THelper.type(), null),new org.omg.CORBA.StructMember("reversionMode", org.tmforum.mtnm.protection.ReversionMode_THelper.type(), null),new org.omg.CORBA.StructMember("rate", org.tmforum.mtnm.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("pgpTPList", org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("pgpParameters", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.protection.ProtectionGroup_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.protection.ProtectionGroup_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/ProtectionGroup_T:1.0";
	}
	public static org.tmforum.mtnm.protection.ProtectionGroup_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.protection.ProtectionGroup_T result = new org.tmforum.mtnm.protection.ProtectionGroup_T();
		result.name = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.protectionGroupType=org.tmforum.mtnm.protection.ProtectionGroupType_THelper.read(in);
		result.protectionSchemeState=org.tmforum.mtnm.protection.ProtectionSchemeState_THelper.read(in);
		result.reversionMode=org.tmforum.mtnm.protection.ReversionMode_THelper.read(in);
		result.rate=in.read_short();
		result.pgpTPList = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(in);
		result.pgpParameters = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.protection.ProtectionGroup_T s)
	{
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		org.tmforum.mtnm.protection.ProtectionGroupType_THelper.write(out,s.protectionGroupType);
		org.tmforum.mtnm.protection.ProtectionSchemeState_THelper.write(out,s.protectionSchemeState);
		org.tmforum.mtnm.protection.ReversionMode_THelper.write(out,s.reversionMode);
		out.write_short(s.rate);
		org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(out,s.pgpTPList);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.pgpParameters);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
