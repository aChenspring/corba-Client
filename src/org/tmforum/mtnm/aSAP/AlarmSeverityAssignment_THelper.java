package org.tmforum.mtnm.aSAP;


/**
 *	Generated from IDL definition of struct "AlarmSeverityAssignment_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmSeverityAssignment_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.aSAP.AlarmSeverityAssignment_THelper.id(),"AlarmSeverityAssignment_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("probableCause", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("probableCauseQualifier", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeProbableCause", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("serviceAffecting", org.tmforum.mtnm.aSAP.AssignedSeverity_THelper.type(), null),new org.omg.CORBA.StructMember("serviceNonAffecting", org.tmforum.mtnm.aSAP.AssignedSeverity_THelper.type(), null),new org.omg.CORBA.StructMember("serviceIndependentOrUnknown", org.tmforum.mtnm.aSAP.AssignedSeverity_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.aSAP.AlarmSeverityAssignment_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.aSAP.AlarmSeverityAssignment_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/aSAP/AlarmSeverityAssignment_T:1.0";
	}
	public static org.tmforum.mtnm.aSAP.AlarmSeverityAssignment_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.aSAP.AlarmSeverityAssignment_T result = new org.tmforum.mtnm.aSAP.AlarmSeverityAssignment_T();
		result.probableCause=in.read_string();
		result.probableCauseQualifier=in.read_string();
		result.nativeProbableCause=in.read_string();
		result.serviceAffecting=org.tmforum.mtnm.aSAP.AssignedSeverity_THelper.read(in);
		result.serviceNonAffecting=org.tmforum.mtnm.aSAP.AssignedSeverity_THelper.read(in);
		result.serviceIndependentOrUnknown=org.tmforum.mtnm.aSAP.AssignedSeverity_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.aSAP.AlarmSeverityAssignment_T s)
	{
		out.write_string(s.probableCause);
		out.write_string(s.probableCauseQualifier);
		out.write_string(s.nativeProbableCause);
		org.tmforum.mtnm.aSAP.AssignedSeverity_THelper.write(out,s.serviceAffecting);
		org.tmforum.mtnm.aSAP.AssignedSeverity_THelper.write(out,s.serviceNonAffecting);
		org.tmforum.mtnm.aSAP.AssignedSeverity_THelper.write(out,s.serviceIndependentOrUnknown);
	}
}
