package org.tmforum.mtnm.guiCutThrough;

/**
 *	Generated from IDL definition of struct "GCTProfileInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class GCTProfileInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public GCTProfileInfo_T(){}
	public org.tmforum.mtnm.guiCutThrough.ServerLaunchCapability_T serverLaunchCapability;
	public java.lang.String gctHostname = "";
	public java.lang.String emsGctPlatform = "";
	public org.tmforum.mtnm.guiCutThrough.GuiCutThroughData_T[] guiCutThroughDataList;
	public GCTProfileInfo_T(org.tmforum.mtnm.guiCutThrough.ServerLaunchCapability_T serverLaunchCapability, java.lang.String gctHostname, java.lang.String emsGctPlatform, org.tmforum.mtnm.guiCutThrough.GuiCutThroughData_T[] guiCutThroughDataList)
	{
		this.serverLaunchCapability = serverLaunchCapability;
		this.gctHostname = gctHostname;
		this.emsGctPlatform = emsGctPlatform;
		this.guiCutThroughDataList = guiCutThroughDataList;
	}
}
