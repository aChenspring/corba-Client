package org.tmforum.mtnm.callSNC;

/**
 *	Generated from IDL definition of struct "CallAndTopLevelConnections_T"
 *	@author JacORB IDL compiler 
 */

public final class CallAndTopLevelConnections_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CallAndTopLevelConnections_T(){}
	public org.tmforum.mtnm.callSNC.Call_T theCall;
	public org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_T[] topLevelConnectionsList;
	public CallAndTopLevelConnections_T(org.tmforum.mtnm.callSNC.Call_T theCall, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_T[] topLevelConnectionsList)
	{
		this.theCall = theCall;
		this.topLevelConnectionsList = topLevelConnectionsList;
	}
}
