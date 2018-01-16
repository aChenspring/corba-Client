package org.tmforum.mtnm.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "TPData_T"
 *	@author JacORB IDL compiler 
 */

public final class TPData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TPData_T(){}
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName;
	public org.tmforum.mtnm.terminationPoint.TerminationMode_T tpMappingMode;
	public org.tmforum.mtnm.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName;
	public TPData_T(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, org.tmforum.mtnm.terminationPoint.TerminationMode_T tpMappingMode, org.tmforum.mtnm.transmissionParameters.LayeredParameters_T[] transmissionParams, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName)
	{
		this.tpName = tpName;
		this.tpMappingMode = tpMappingMode;
		this.transmissionParams = transmissionParams;
		this.ingressTrafficDescriptorName = ingressTrafficDescriptorName;
		this.egressTrafficDescriptorName = egressTrafficDescriptorName;
	}
}
