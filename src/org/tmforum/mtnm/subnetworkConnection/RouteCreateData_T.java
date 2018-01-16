package org.tmforum.mtnm.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "RouteCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public RouteCreateData_T(){}
	public java.lang.String intended = "";
	public java.lang.String exclusive = "";
	public org.tmforum.mtnm.subnetworkConnection.CrossConnect_T[] ccInclusions;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public boolean fullRoute;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public RouteCreateData_T(java.lang.String intended, java.lang.String exclusive, org.tmforum.mtnm.subnetworkConnection.CrossConnect_T[] ccInclusions, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] neTpInclusions, boolean fullRoute, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] neTpSncExclusions, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.intended = intended;
		this.exclusive = exclusive;
		this.ccInclusions = ccInclusions;
		this.neTpInclusions = neTpInclusions;
		this.fullRoute = fullRoute;
		this.neTpSncExclusions = neTpSncExclusions;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
