package org.tmforum.mtnm.terminationPoint;

/**
 *	Generated from IDL definition of struct "TerminationPoint_T"
 *	@author JacORB IDL compiler 
 */

public final class TerminationPoint_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TerminationPoint_T(){}
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName;
	public org.tmforum.mtnm.terminationPoint.TPType_T type;
	public org.tmforum.mtnm.terminationPoint.TPConnectionState_T connectionState;
	public org.tmforum.mtnm.terminationPoint.TerminationMode_T tpMappingMode;
	public org.tmforum.mtnm.terminationPoint.Directionality_T direction;
	public org.tmforum.mtnm.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.tmforum.mtnm.terminationPoint.TPProtectionAssociation_T tpProtectionAssociation;
	public boolean edgePoint;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TerminationPoint_T(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName, org.tmforum.mtnm.terminationPoint.TPType_T type, org.tmforum.mtnm.terminationPoint.TPConnectionState_T connectionState, org.tmforum.mtnm.terminationPoint.TerminationMode_T tpMappingMode, org.tmforum.mtnm.terminationPoint.Directionality_T direction, org.tmforum.mtnm.transmissionParameters.LayeredParameters_T[] transmissionParams, org.tmforum.mtnm.terminationPoint.TPProtectionAssociation_T tpProtectionAssociation, boolean edgePoint, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.ingressTrafficDescriptorName = ingressTrafficDescriptorName;
		this.egressTrafficDescriptorName = egressTrafficDescriptorName;
		this.type = type;
		this.connectionState = connectionState;
		this.tpMappingMode = tpMappingMode;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.tpProtectionAssociation = tpProtectionAssociation;
		this.edgePoint = edgePoint;
		this.additionalInfo = additionalInfo;
	}
}
