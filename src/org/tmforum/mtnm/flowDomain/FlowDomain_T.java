package org.tmforum.mtnm.flowDomain;

/**
 *	Generated from IDL definition of struct "FlowDomain_T"
 *	@author JacORB IDL compiler 
 */

public final class FlowDomain_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FlowDomain_T(){}
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.tmforum.mtnm.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public java.lang.String networkAccessDomain = "";
	public org.tmforum.mtnm.flowDomain.ConnectivityState_T fDConnectivityState;
	public java.lang.String fdType;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo;
	public FlowDomain_T(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.tmforum.mtnm.transmissionParameters.LayeredParameters_T[] transmissionParams, java.lang.String networkAccessDomain, org.tmforum.mtnm.flowDomain.ConnectivityState_T fDConnectivityState, java.lang.String fdType, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.networkAccessDomain = networkAccessDomain;
		this.fDConnectivityState = fDConnectivityState;
		this.fdType = fdType;
		this.additionalInfo = additionalInfo;
	}
}
