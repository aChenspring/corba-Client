package org.tmforum.mtnm.topologicalLink;


/**
 *	Generated from IDL definition of struct "TLCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TLCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.topologicalLink.TLCreateData_THelper.id(),"TLCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("rate", org.tmforum.mtnm.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("aEndTP", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("zEndTP", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalCreationInfo", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.topologicalLink.TLCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.topologicalLink.TLCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/topologicalLink/TLCreateData_T:1.0";
	}
	public static org.tmforum.mtnm.topologicalLink.TLCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.topologicalLink.TLCreateData_T result = new org.tmforum.mtnm.topologicalLink.TLCreateData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.direction=org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.read(in);
		result.rate=in.read_short();
		result.aEndTP = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.zEndTP = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.additionalCreationInfo = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.topologicalLink.TLCreateData_T s)
	{
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		out.write_short(s.rate);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.aEndTP);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.zEndTP);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
