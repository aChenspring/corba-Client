package org.tmforum.mtnm.flowDomainFragment;

/**
 *	Generated from IDL definition of struct "FlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class FlowDomainFragment_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FlowDomainFragment_T(){}
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.tmforum.mtnm.globaldefs.ConnectionDirection_T direction;
	public org.tmforum.mtnm.transmissionParameters.LayeredParameters_T transmissionParams;
	public org.tmforum.mtnm.subnetworkConnection.TPData_T[] aEnd;
	public org.tmforum.mtnm.subnetworkConnection.TPData_T[] zEnd;
	public java.lang.String networkAccessDomain = "";
	public boolean flexible;
	public org.tmforum.mtnm.performance.AdministrativeState_T administrativeState;
	public org.tmforum.mtnm.subnetworkConnection.SNCState_T fdfrState;
	public java.lang.String fdfrType;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo;
	public FlowDomainFragment_T(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.tmforum.mtnm.globaldefs.ConnectionDirection_T direction, org.tmforum.mtnm.transmissionParameters.LayeredParameters_T transmissionParams, org.tmforum.mtnm.subnetworkConnection.TPData_T[] aEnd, org.tmforum.mtnm.subnetworkConnection.TPData_T[] zEnd, java.lang.String networkAccessDomain, boolean flexible, org.tmforum.mtnm.performance.AdministrativeState_T administrativeState, org.tmforum.mtnm.subnetworkConnection.SNCState_T fdfrState, java.lang.String fdfrType, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.networkAccessDomain = networkAccessDomain;
		this.flexible = flexible;
		this.administrativeState = administrativeState;
		this.fdfrState = fdfrState;
		this.fdfrType = fdfrType;
		this.additionalInfo = additionalInfo;
	}
}
