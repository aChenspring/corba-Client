package org.tmforum.mtnm.guiCutThrough;


/**
 *	Generated from IDL definition of struct "GCTProfileInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class GCTProfileInfo_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.guiCutThrough.GCTProfileInfo_THelper.id(),"GCTProfileInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("serverLaunchCapability", org.tmforum.mtnm.guiCutThrough.ServerLaunchCapability_THelper.type(), null),new org.omg.CORBA.StructMember("gctHostname", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("emsGctPlatform", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("guiCutThroughDataList", org.tmforum.mtnm.guiCutThrough.GuiCutThroughDataList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.guiCutThrough.GCTProfileInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.guiCutThrough.GCTProfileInfo_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/guiCutThrough/GCTProfileInfo_T:1.0";
	}
	public static org.tmforum.mtnm.guiCutThrough.GCTProfileInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.guiCutThrough.GCTProfileInfo_T result = new org.tmforum.mtnm.guiCutThrough.GCTProfileInfo_T();
		result.serverLaunchCapability=org.tmforum.mtnm.guiCutThrough.ServerLaunchCapability_THelper.read(in);
		result.gctHostname=in.read_string();
		result.emsGctPlatform=in.read_string();
		result.guiCutThroughDataList = org.tmforum.mtnm.guiCutThrough.GuiCutThroughDataList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.guiCutThrough.GCTProfileInfo_T s)
	{
		org.tmforum.mtnm.guiCutThrough.ServerLaunchCapability_THelper.write(out,s.serverLaunchCapability);
		out.write_string(s.gctHostname);
		out.write_string(s.emsGctPlatform);
		org.tmforum.mtnm.guiCutThrough.GuiCutThroughDataList_THelper.write(out,s.guiCutThroughDataList);
	}
}
