package org.tmforum.mtnm.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "SNCCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNCCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public org.tmforum.mtnm.globaldefs.ConnectionDirection_T direction;
	public org.tmforum.mtnm.subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel;
	public org.tmforum.mtnm.subnetworkConnection.ProtectionEffort_T protectionEffort;
	public org.tmforum.mtnm.subnetworkConnection.Reroute_T rerouteAllowed;
	public org.tmforum.mtnm.subnetworkConnection.NetworkRouted_T networkRouted;
	public org.tmforum.mtnm.subnetworkConnection.SNCType_T sncType;
	public short layerRate;
	public org.tmforum.mtnm.subnetworkConnection.CrossConnect_T[] ccInclusions;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public boolean fullRoute;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] aEnd;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] zEnd;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public SNCCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, org.tmforum.mtnm.globaldefs.ConnectionDirection_T direction, org.tmforum.mtnm.subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel, org.tmforum.mtnm.subnetworkConnection.ProtectionEffort_T protectionEffort, org.tmforum.mtnm.subnetworkConnection.Reroute_T rerouteAllowed, org.tmforum.mtnm.subnetworkConnection.NetworkRouted_T networkRouted, org.tmforum.mtnm.subnetworkConnection.SNCType_T sncType, short layerRate, org.tmforum.mtnm.subnetworkConnection.CrossConnect_T[] ccInclusions, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] neTpInclusions, boolean fullRoute, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] neTpSncExclusions, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] aEnd, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] zEnd, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.direction = direction;
		this.staticProtectionLevel = staticProtectionLevel;
		this.protectionEffort = protectionEffort;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.sncType = sncType;
		this.layerRate = layerRate;
		this.ccInclusions = ccInclusions;
		this.neTpInclusions = neTpInclusions;
		this.fullRoute = fullRoute;
		this.neTpSncExclusions = neTpSncExclusions;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
