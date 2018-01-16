package org.tmforum.mtnm.flowDomain;

/**
 *	Generated from IDL definition of struct "FTPCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FTPCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FTPCreateData_T(){}
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentName;
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ingressTransmissionDescriptorName;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] egressTransmissionDescriptorName;
	public org.tmforum.mtnm.terminationPoint.TerminationMode_T tpMappingMode;
	public org.tmforum.mtnm.terminationPoint.Directionality_T direction;
	public org.tmforum.mtnm.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public FTPCreateData_T(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] equipmentName, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ingressTransmissionDescriptorName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] egressTransmissionDescriptorName, org.tmforum.mtnm.terminationPoint.TerminationMode_T tpMappingMode, org.tmforum.mtnm.terminationPoint.Directionality_T direction, org.tmforum.mtnm.transmissionParameters.LayeredParameters_T[] transmissionParams, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.equipmentName = equipmentName;
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.ingressTransmissionDescriptorName = ingressTransmissionDescriptorName;
		this.egressTransmissionDescriptorName = egressTransmissionDescriptorName;
		this.tpMappingMode = tpMappingMode;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
