package org.tmforum.mtnm.flowDomainFragment;

/**
 *	Generated from IDL definition of struct "FDFrCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FDFrCreateData_T(){}
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public org.tmforum.mtnm.globaldefs.ConnectionDirection_T direction;
	public org.tmforum.mtnm.performance.AdministrativeState_T administrativeState;
	public org.tmforum.mtnm.transmissionParameters.LayeredParameters_T transmissionParams;
	public boolean fullRoute;
	public java.lang.String fdfrType;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public FDFrCreateData_T(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, org.tmforum.mtnm.globaldefs.ConnectionDirection_T direction, org.tmforum.mtnm.performance.AdministrativeState_T administrativeState, org.tmforum.mtnm.transmissionParameters.LayeredParameters_T transmissionParams, boolean fullRoute, java.lang.String fdfrType, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.direction = direction;
		this.administrativeState = administrativeState;
		this.transmissionParams = transmissionParams;
		this.fullRoute = fullRoute;
		this.fdfrType = fdfrType;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
