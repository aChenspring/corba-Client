package org.tmforum.mtnm.callSNC;


/**
 *	Generated from IDL definition of struct "RouteGroupInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteGroupInfo_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.callSNC.RouteGroupInfo_THelper.id(),"RouteGroupInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("sNCname", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("routeGroupLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.callSNC.RouteGroupInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.callSNC.RouteGroupInfo_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/RouteGroupInfo_T:1.0";
	}
	public static org.tmforum.mtnm.callSNC.RouteGroupInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.callSNC.RouteGroupInfo_T result = new org.tmforum.mtnm.callSNC.RouteGroupInfo_T();
		result.sNCname = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.routeGroupLabel=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.callSNC.RouteGroupInfo_T s)
	{
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.sNCname);
		out.write_string(s.routeGroupLabel);
	}
}
