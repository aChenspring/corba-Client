package org.tmforum.mtnm.callSNC;

/**
 *	Generated from IDL definition of struct "Call_T"
 *	@author JacORB IDL compiler 
 */

public final class Call_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public Call_T(){}
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callName;
	public java.lang.String userLabel = "";
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String callId = "";
	public java.lang.String callState;
	public org.tmforum.mtnm.callSNC.CallEnd_T aEnd;
	public org.tmforum.mtnm.callSNC.CallEnd_T zEnd;
	public org.tmforum.mtnm.callSNC.CallParameterProfile_T callParameters;
	public org.tmforum.mtnm.callSNC.Diversity_T callDiversity;
	public java.lang.String diversitySynthesis = "";
	public org.tmforum.mtnm.callSNC.DiversityInfo_T linkDiversityViolations;
	public org.tmforum.mtnm.callSNC.DiversityInfo_T nodeDiversityViolations;
	public org.tmforum.mtnm.callSNC.DiversityInfo_T[] linkPartialDiversityList;
	public org.tmforum.mtnm.callSNC.DiversityInfo_T[] nodePartialDiversityList;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callAdditionalInfo;
	public Call_T(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callName, java.lang.String userLabel, java.lang.String owner, java.lang.String networkAccessDomain, java.lang.String nativeEMSName, java.lang.String callId, java.lang.String callState, org.tmforum.mtnm.callSNC.CallEnd_T aEnd, org.tmforum.mtnm.callSNC.CallEnd_T zEnd, org.tmforum.mtnm.callSNC.CallParameterProfile_T callParameters, org.tmforum.mtnm.callSNC.Diversity_T callDiversity, java.lang.String diversitySynthesis, org.tmforum.mtnm.callSNC.DiversityInfo_T linkDiversityViolations, org.tmforum.mtnm.callSNC.DiversityInfo_T nodeDiversityViolations, org.tmforum.mtnm.callSNC.DiversityInfo_T[] linkPartialDiversityList, org.tmforum.mtnm.callSNC.DiversityInfo_T[] nodePartialDiversityList, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callAdditionalInfo)
	{
		this.callName = callName;
		this.userLabel = userLabel;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.nativeEMSName = nativeEMSName;
		this.callId = callId;
		this.callState = callState;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.callParameters = callParameters;
		this.callDiversity = callDiversity;
		this.diversitySynthesis = diversitySynthesis;
		this.linkDiversityViolations = linkDiversityViolations;
		this.nodeDiversityViolations = nodeDiversityViolations;
		this.linkPartialDiversityList = linkPartialDiversityList;
		this.nodePartialDiversityList = nodePartialDiversityList;
		this.callAdditionalInfo = callAdditionalInfo;
	}
}
