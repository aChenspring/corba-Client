package org.tmforum.mtnm.aSAP;


/**
 *	Generated from IDL definition of struct "ASAP_T"
 *	@author JacORB IDL compiler 
 */

public final class ASAP_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.aSAP.ASAP_THelper.id(),"ASAP_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("notModifiable", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("alarmSeverityAssignmentList", org.tmforum.mtnm.aSAP.AlarmSeverityAssignmentList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.aSAP.ASAP_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.aSAP.ASAP_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/aSAP/ASAP_T:1.0";
	}
	public static org.tmforum.mtnm.aSAP.ASAP_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.aSAP.ASAP_T result = new org.tmforum.mtnm.aSAP.ASAP_T();
		result.name = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.notModifiable=in.read_boolean();
		result.alarmSeverityAssignmentList = org.tmforum.mtnm.aSAP.AlarmSeverityAssignmentList_THelper.read(in);
		result.additionalInfo = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.aSAP.ASAP_T s)
	{
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		out.write_boolean(s.notModifiable);
		org.tmforum.mtnm.aSAP.AlarmSeverityAssignmentList_THelper.write(out,s.alarmSeverityAssignmentList);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
