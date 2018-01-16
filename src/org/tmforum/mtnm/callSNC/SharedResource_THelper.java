package org.tmforum.mtnm.callSNC;


/**
 *	Generated from IDL definition of struct "SharedResource_T"
 *	@author JacORB IDL compiler 
 */

public final class SharedResource_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.callSNC.SharedResource_THelper.id(),"SharedResource_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("connectionNameList", org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.callSNC.SharedResource_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.callSNC.SharedResource_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/SharedResource_T:1.0";
	}
	public static org.tmforum.mtnm.callSNC.SharedResource_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.callSNC.SharedResource_T result = new org.tmforum.mtnm.callSNC.SharedResource_T();
		result.name = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.connectionNameList = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.callSNC.SharedResource_T s)
	{
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.name);
		org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(out,s.connectionNameList);
	}
}
