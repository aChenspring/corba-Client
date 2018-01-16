package org.tmforum.mtnm.callSNC;

/**
 *	Generated from IDL definition of struct "CallAndTopLevelConnectionsAndSNCs_T"
 *	@author JacORB IDL compiler 
 */

public final class CallAndTopLevelConnectionsAndSNCs_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CallAndTopLevelConnectionsAndSNCs_T(){}
	public org.tmforum.mtnm.callSNC.Call_T theCall;
	public org.tmforum.mtnm.callSNC.ConnectionAndSupportingSNCs_T[] topLevelConnectionsAndSNCsList;
	public CallAndTopLevelConnectionsAndSNCs_T(org.tmforum.mtnm.callSNC.Call_T theCall, org.tmforum.mtnm.callSNC.ConnectionAndSupportingSNCs_T[] topLevelConnectionsAndSNCsList)
	{
		this.theCall = theCall;
		this.topLevelConnectionsAndSNCsList = topLevelConnectionsAndSNCsList;
	}
}
