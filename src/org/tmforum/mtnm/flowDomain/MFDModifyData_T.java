package org.tmforum.mtnm.flowDomain;

/**
 *	Generated from IDL definition of struct "MFDModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class MFDModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MFDModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public org.tmforum.mtnm.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalModificationInfo;
	public MFDModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, org.tmforum.mtnm.transmissionParameters.LayeredParameters_T[] transmissionParams, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalModificationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.transmissionParams = transmissionParams;
		this.additionalModificationInfo = additionalModificationInfo;
	}
}
