package org.tmforum.mtnm.callSNC;

/**
 *	Generated from IDL definition of struct "CallEnd_T"
 *	@author JacORB IDL compiler 
 */

public final class CallEnd_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CallEnd_T(){}
	public java.lang.String tNANameOrGroupTNAName;
	public java.lang.String sNPPid = "";
	public java.lang.String sNPid = "";
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName;
	public CallEnd_T(java.lang.String tNANameOrGroupTNAName, java.lang.String sNPPid, java.lang.String sNPid, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName)
	{
		this.tNANameOrGroupTNAName = tNANameOrGroupTNAName;
		this.sNPPid = sNPPid;
		this.sNPid = sNPid;
		this.tpName = tpName;
	}
}
