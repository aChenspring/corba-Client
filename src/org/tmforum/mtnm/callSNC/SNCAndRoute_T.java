package org.tmforum.mtnm.callSNC;

/**
 *	Generated from IDL definition of struct "SNCAndRoute_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCAndRoute_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNCAndRoute_T(){}
	public org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_T connection;
	public org.tmforum.mtnm.subnetworkConnection.RouteDescriptor_T[] connectionRoutes;
	public org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_T[] edgeMLSNPPLinks;
	public org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_T[] internalMLSNPPLinks;
	public java.lang.String routeType;
	public SNCAndRoute_T(org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_T connection, org.tmforum.mtnm.subnetworkConnection.RouteDescriptor_T[] connectionRoutes, org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_T[] edgeMLSNPPLinks, org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_T[] internalMLSNPPLinks, java.lang.String routeType)
	{
		this.connection = connection;
		this.connectionRoutes = connectionRoutes;
		this.edgeMLSNPPLinks = edgeMLSNPPLinks;
		this.internalMLSNPPLinks = internalMLSNPPLinks;
		this.routeType = routeType;
	}
}
