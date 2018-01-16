package org.tmforum.mtnm.aSAP;

/**
 *	Generated from IDL definition of struct "AlarmSeverityAssignment_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmSeverityAssignment_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public AlarmSeverityAssignment_T(){}
	public java.lang.String probableCause = "";
	public java.lang.String probableCauseQualifier = "";
	public java.lang.String nativeProbableCause = "";
	public org.tmforum.mtnm.aSAP.AssignedSeverity_T serviceAffecting;
	public org.tmforum.mtnm.aSAP.AssignedSeverity_T serviceNonAffecting;
	public org.tmforum.mtnm.aSAP.AssignedSeverity_T serviceIndependentOrUnknown;
	public AlarmSeverityAssignment_T(java.lang.String probableCause, java.lang.String probableCauseQualifier, java.lang.String nativeProbableCause, org.tmforum.mtnm.aSAP.AssignedSeverity_T serviceAffecting, org.tmforum.mtnm.aSAP.AssignedSeverity_T serviceNonAffecting, org.tmforum.mtnm.aSAP.AssignedSeverity_T serviceIndependentOrUnknown)
	{
		this.probableCause = probableCause;
		this.probableCauseQualifier = probableCauseQualifier;
		this.nativeProbableCause = nativeProbableCause;
		this.serviceAffecting = serviceAffecting;
		this.serviceNonAffecting = serviceNonAffecting;
		this.serviceIndependentOrUnknown = serviceIndependentOrUnknown;
	}
}
