package org.omg.DsLogAdmin;


/**
 *	Generated from IDL definition of struct "LogRecord"
 *	@author JacORB IDL compiler 
 */

public final class LogRecordHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.DsLogAdmin.LogRecordHelper.id(),"LogRecord",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("id", org.omg.DsLogAdmin.RecordIdHelper.type(), null),new org.omg.CORBA.StructMember("time", org.omg.DsLogAdmin.TimeTHelper.type(), null),new org.omg.CORBA.StructMember("attr_list", org.omg.DsLogAdmin.NVListHelper.type(), null),new org.omg.CORBA.StructMember("info", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.DsLogAdmin.LogRecord s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.DsLogAdmin.LogRecord extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/DsLogAdmin/LogRecord:1.0";
	}
	public static org.omg.DsLogAdmin.LogRecord read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.DsLogAdmin.LogRecord result = new org.omg.DsLogAdmin.LogRecord();
		result.id=in.read_ulonglong();
		result.time=in.read_ulonglong();
		result.attr_list = org.omg.DsLogAdmin.NVListHelper.read(in);
		result.info=in.read_any();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.DsLogAdmin.LogRecord s)
	{
		out.write_ulonglong(s.id);
		out.write_ulonglong(s.time);
		org.omg.DsLogAdmin.NVListHelper.write(out,s.attr_list);
		out.write_any(s.info);
	}
}
