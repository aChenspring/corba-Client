package org.tmforum.mtnm.mLSNPPLink;


/**
 *	Generated from IDL definition of struct "SNPPLink_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPPLink_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.mLSNPPLink.SNPPLink_THelper.id(),"SNPPLink_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("SNPPLinkId", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("aEnd", org.tmforum.mtnm.mLSNPP.SNPP_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", org.tmforum.mtnm.mLSNPP.SNPP_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.mLSNPPLink.SNPPLink_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.mLSNPPLink.SNPPLink_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/mLSNPPLink/SNPPLink_T:1.0";
	}
	public static org.tmforum.mtnm.mLSNPPLink.SNPPLink_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.mLSNPPLink.SNPPLink_T result = new org.tmforum.mtnm.mLSNPPLink.SNPPLink_T();
		result.SNPPLinkId=in.read_string();
		result.aEnd=org.tmforum.mtnm.mLSNPP.SNPP_THelper.read(in);
		result.zEnd=org.tmforum.mtnm.mLSNPP.SNPP_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.mLSNPPLink.SNPPLink_T s)
	{
		out.write_string(s.SNPPLinkId);
		org.tmforum.mtnm.mLSNPP.SNPP_THelper.write(out,s.aEnd);
		org.tmforum.mtnm.mLSNPP.SNPP_THelper.write(out,s.zEnd);
	}
}
