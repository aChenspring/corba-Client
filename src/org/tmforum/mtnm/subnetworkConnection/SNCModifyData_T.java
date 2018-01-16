package org.tmforum.mtnm.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "SNCModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNCModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public org.tmforum.mtnm.globaldefs.ConnectionDirection_T direction;
	public java.lang.String modifyType = "";
	public boolean retainOldSNC;
	public boolean modifyServers_allowed;
	public org.tmforum.mtnm.subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel;
	public org.tmforum.mtnm.subnetworkConnection.ProtectionEffort_T protectionEffort;
	public org.tmforum.mtnm.subnetworkConnection.Reroute_T rerouteAllowed;
	public org.tmforum.mtnm.subnetworkConnection.NetworkRouted_T networkRouted;
	public org.tmforum.mtnm.subnetworkConnection.SNCType_T sncType;
	public short layerRate;
	public org.tmforum.mtnm.subnetworkConnection.RouteDescriptor_T[] addedOrNewRoute;
	public org.tmforum.mtnm.subnetworkConnection.RouteDescriptor_T[] removedRoute;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public boolean fullRoute;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] aEnd;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] zEnd;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public SNCModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, org.tmforum.mtnm.globaldefs.ConnectionDirection_T direction, java.lang.String modifyType, boolean retainOldSNC, boolean modifyServers_allowed, org.tmforum.mtnm.subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel, org.tmforum.mtnm.subnetworkConnection.ProtectionEffort_T protectionEffort, org.tmforum.mtnm.subnetworkConnection.Reroute_T rerouteAllowed, org.tmforum.mtnm.subnetworkConnection.NetworkRouted_T networkRouted, org.tmforum.mtnm.subnetworkConnection.SNCType_T sncType, short layerRate, org.tmforum.mtnm.subnetworkConnection.RouteDescriptor_T[] addedOrNewRoute, org.tmforum.mtnm.subnetworkConnection.RouteDescriptor_T[] removedRoute, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] neTpInclusions, boolean fullRoute, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] neTpSncExclusions, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] aEnd, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] zEnd, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.direction = direction;
		this.modifyType = modifyType;
		this.retainOldSNC = retainOldSNC;
		this.modifyServers_allowed = modifyServers_allowed;
		this.staticProtectionLevel = staticProtectionLevel;
		this.protectionEffort = protectionEffort;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.sncType = sncType;
		this.layerRate = layerRate;
		this.addedOrNewRoute = addedOrNewRoute;
		this.removedRoute = removedRoute;
		this.neTpInclusions = neTpInclusions;
		this.fullRoute = fullRoute;
		this.neTpSncExclusions = neTpSncExclusions;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
