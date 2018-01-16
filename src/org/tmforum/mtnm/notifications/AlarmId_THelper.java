package org.tmforum.mtnm.notifications;


/**
 *	Generated from IDL definition of struct "AlarmId_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmId_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.notifications.AlarmId_THelper.id(),"AlarmId_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("objectName", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("layerRate", org.tmforum.mtnm.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("probableCause", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("probableCauseQualifier", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.notifications.AlarmId_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.notifications.AlarmId_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/notifications/AlarmId_T:1.0";
	}
	public static org.tmforum.mtnm.notifications.AlarmId_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.notifications.AlarmId_T result = new org.tmforum.mtnm.notifications.AlarmId_T();
		result.objectName = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.layerRate=in.read_short();
		result.probableCause=in.read_string();
		result.probableCauseQualifier=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.notifications.AlarmId_T s)
	{
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.objectName);
		out.write_short(s.layerRate);
		out.write_string(s.probableCause);
		out.write_string(s.probableCauseQualifier);
	}
}
