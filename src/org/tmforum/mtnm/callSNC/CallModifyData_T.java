package org.tmforum.mtnm.callSNC;

/**
 *	Generated from IDL definition of struct "CallModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class CallModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CallModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalModificationInfo;
	public CallModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalModificationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.additionalModificationInfo = additionalModificationInfo;
	}
}
