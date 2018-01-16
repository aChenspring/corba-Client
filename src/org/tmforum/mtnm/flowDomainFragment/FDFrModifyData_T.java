package org.tmforum.mtnm.flowDomainFragment;

/**
 *	Generated from IDL definition of struct "FDFrModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FDFrModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public org.tmforum.mtnm.performance.AdministrativeState_T administrativeState;
	public org.tmforum.mtnm.transmissionParameters.LayeredParameters_T transmissionParams;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] tpNamesToRemove;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] aEndTPNames;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] zEndTPNames;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] internalTPNames;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalModificationInfo;
	public FDFrModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, org.tmforum.mtnm.performance.AdministrativeState_T administrativeState, org.tmforum.mtnm.transmissionParameters.LayeredParameters_T transmissionParams, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] tpNamesToRemove, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] aEndTPNames, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] zEndTPNames, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] internalTPNames, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalModificationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.administrativeState = administrativeState;
		this.transmissionParams = transmissionParams;
		this.tpNamesToRemove = tpNamesToRemove;
		this.aEndTPNames = aEndTPNames;
		this.zEndTPNames = zEndTPNames;
		this.internalTPNames = internalTPNames;
		this.additionalModificationInfo = additionalModificationInfo;
	}
}
