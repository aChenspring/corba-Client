package org.tmforum.mtnm.callSNC;


/**
 *	Generated from IDL definition of struct "CallAndTopLevelConnections_T"
 *	@author JacORB IDL compiler 
 */

public final class CallAndTopLevelConnections_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.callSNC.CallAndTopLevelConnections_THelper.id(),"CallAndTopLevelConnections_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("theCall", org.tmforum.mtnm.callSNC.Call_THelper.type(), null),new org.omg.CORBA.StructMember("topLevelConnectionsList", org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.callSNC.CallAndTopLevelConnections_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.callSNC.CallAndTopLevelConnections_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/CallAndTopLevelConnections_T:1.0";
	}
	public static org.tmforum.mtnm.callSNC.CallAndTopLevelConnections_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.callSNC.CallAndTopLevelConnections_T result = new org.tmforum.mtnm.callSNC.CallAndTopLevelConnections_T();
		result.theCall=org.tmforum.mtnm.callSNC.Call_THelper.read(in);
		result.topLevelConnectionsList = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.callSNC.CallAndTopLevelConnections_T s)
	{
		org.tmforum.mtnm.callSNC.Call_THelper.write(out,s.theCall);
		org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.write(out,s.topLevelConnectionsList);
	}
}
