package org.tmforum.mtnm.aSAP;

/**
 *	Generated from IDL definition of struct "ASAP_T"
 *	@author JacORB IDL compiler 
 */

public final class ASAP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ASAP_T(){}
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public boolean notModifiable;
	public org.tmforum.mtnm.aSAP.AlarmSeverityAssignment_T[] alarmSeverityAssignmentList;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo;
	public ASAP_T(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, boolean notModifiable, org.tmforum.mtnm.aSAP.AlarmSeverityAssignment_T[] alarmSeverityAssignmentList, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.notModifiable = notModifiable;
		this.alarmSeverityAssignmentList = alarmSeverityAssignmentList;
		this.additionalInfo = additionalInfo;
	}
}
