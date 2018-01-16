package org.tmforum.mtnm.performance;


/**
 *	Generated from IDL definition of struct "PMParameter_T"
 *	@author JacORB IDL compiler 
 */

public final class PMParameter_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.performance.PMParameter_THelper.id(),"PMParameter_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("pmParameterName", org.tmforum.mtnm.performance.PMParameterName_THelper.type(), null),new org.omg.CORBA.StructMember("pmLocation", org.tmforum.mtnm.performance.PMLocation_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.performance.PMParameter_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.performance.PMParameter_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMParameter_T:1.0";
	}
	public static org.tmforum.mtnm.performance.PMParameter_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.performance.PMParameter_T result = new org.tmforum.mtnm.performance.PMParameter_T();
		result.pmParameterName=in.read_string();
		result.pmLocation=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.performance.PMParameter_T s)
	{
		out.write_string(s.pmParameterName);
		out.write_string(s.pmLocation);
	}
}
