package org.tmforum.mtnm.mLSNPPLink;

/**
 *	Generated from IDL definition of struct "MultiLayerSNPPLink_T"
 *	@author JacORB IDL compiler 
 */

public final class MultiLayerSNPPLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MultiLayerSNPPLink_T(){}
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.tmforum.mtnm.globaldefs.ConnectionDirection_T direction;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] aMLRAName;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] zMLRAName;
	public java.lang.String aTNAName = "";
	public java.lang.String zTNAName = "";
	public java.lang.String aTNAGroupName = "";
	public java.lang.String zTNAGroupName = "";
	public org.tmforum.mtnm.mLSNPPLink.LayeredSNPPLink_T[] sNPPLinkList;
	public java.lang.String interfaceType;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] signallingParameters;
	public java.lang.String signallingControllerIdentifier = "";
	public java.lang.String signallingProtocol;
	public boolean signallingEnabled;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] cost;
	public boolean discovered;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] availability;
	public java.lang.String linkSRG = "";
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo;
	public MultiLayerSNPPLink_T(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.tmforum.mtnm.globaldefs.ConnectionDirection_T direction, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] aMLRAName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] zMLRAName, java.lang.String aTNAName, java.lang.String zTNAName, java.lang.String aTNAGroupName, java.lang.String zTNAGroupName, org.tmforum.mtnm.mLSNPPLink.LayeredSNPPLink_T[] sNPPLinkList, java.lang.String interfaceType, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] signallingParameters, java.lang.String signallingControllerIdentifier, java.lang.String signallingProtocol, boolean signallingEnabled, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] cost, boolean discovered, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] availability, java.lang.String linkSRG, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.aMLRAName = aMLRAName;
		this.zMLRAName = zMLRAName;
		this.aTNAName = aTNAName;
		this.zTNAName = zTNAName;
		this.aTNAGroupName = aTNAGroupName;
		this.zTNAGroupName = zTNAGroupName;
		this.sNPPLinkList = sNPPLinkList;
		this.interfaceType = interfaceType;
		this.signallingParameters = signallingParameters;
		this.signallingControllerIdentifier = signallingControllerIdentifier;
		this.signallingProtocol = signallingProtocol;
		this.signallingEnabled = signallingEnabled;
		this.cost = cost;
		this.discovered = discovered;
		this.availability = availability;
		this.linkSRG = linkSRG;
		this.additionalInfo = additionalInfo;
	}
}
