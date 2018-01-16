package org.tmforum.mtnm.flowDomain;

/**
 *	Generated from IDL definition of struct "MFDCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class MFDCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MFDCreateData_T(){}
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] unassignedCPTPs;
	public org.tmforum.mtnm.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public MFDCreateData_T(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] unassignedCPTPs, org.tmforum.mtnm.transmissionParameters.LayeredParameters_T[] transmissionParams, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.unassignedCPTPs = unassignedCPTPs;
		this.transmissionParams = transmissionParams;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
