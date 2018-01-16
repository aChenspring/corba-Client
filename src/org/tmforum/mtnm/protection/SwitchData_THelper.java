package org.tmforum.mtnm.protection;


/**
 *	Generated from IDL definition of struct "SwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class SwitchData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.protection.SwitchData_THelper.id(),"SwitchData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("protectionType", org.tmforum.mtnm.protection.ProtectionType_THelper.type(), null),new org.omg.CORBA.StructMember("switchReason", org.tmforum.mtnm.protection.SwitchReason_THelper.type(), null),new org.omg.CORBA.StructMember("layerRate", org.tmforum.mtnm.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("groupName", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("protectedTP", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("switchToTP", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.protection.SwitchData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.protection.SwitchData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/SwitchData_T:1.0";
	}
	public static org.tmforum.mtnm.protection.SwitchData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.protection.SwitchData_T result = new org.tmforum.mtnm.protection.SwitchData_T();
		result.protectionType=org.tmforum.mtnm.protection.ProtectionType_THelper.read(in);
		result.switchReason=org.tmforum.mtnm.protection.SwitchReason_THelper.read(in);
		result.layerRate=in.read_short();
		result.groupName = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.protectedTP = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.switchToTP = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.protection.SwitchData_T s)
	{
		org.tmforum.mtnm.protection.ProtectionType_THelper.write(out,s.protectionType);
		org.tmforum.mtnm.protection.SwitchReason_THelper.write(out,s.switchReason);
		out.write_short(s.layerRate);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.groupName);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.protectedTP);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.switchToTP);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
