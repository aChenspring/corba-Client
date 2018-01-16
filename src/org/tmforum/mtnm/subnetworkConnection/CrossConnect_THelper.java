package org.tmforum.mtnm.subnetworkConnection;


/**
 *	Generated from IDL definition of struct "CrossConnect_T"
 *	@author JacORB IDL compiler 
 */

public final class CrossConnect_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.subnetworkConnection.CrossConnect_THelper.id(),"CrossConnect_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("active", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("direction", org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("ccType", org.tmforum.mtnm.subnetworkConnection.SNCType_THelper.type(), null),new org.omg.CORBA.StructMember("aEndNameList", org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("zEndNameList", org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.subnetworkConnection.CrossConnect_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.subnetworkConnection.CrossConnect_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/CrossConnect_T:1.0";
	}
	public static org.tmforum.mtnm.subnetworkConnection.CrossConnect_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.subnetworkConnection.CrossConnect_T result = new org.tmforum.mtnm.subnetworkConnection.CrossConnect_T();
		result.active=in.read_boolean();
		result.direction=org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.read(in);
		result.ccType=org.tmforum.mtnm.subnetworkConnection.SNCType_THelper.read(in);
		result.aEndNameList = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(in);
		result.zEndNameList = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalInfo = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.subnetworkConnection.CrossConnect_T s)
	{
		out.write_boolean(s.active);
		org.tmforum.mtnm.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		org.tmforum.mtnm.subnetworkConnection.SNCType_THelper.write(out,s.ccType);
		org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(out,s.aEndNameList);
		org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(out,s.zEndNameList);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
