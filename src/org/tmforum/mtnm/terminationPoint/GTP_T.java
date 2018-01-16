package org.tmforum.mtnm.terminationPoint;

/**
 *	Generated from IDL definition of struct "GTP_T"
 *	@author JacORB IDL compiler 
 */

public final class GTP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public GTP_T(){}
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public boolean alarmReportingIndicator;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] listOfTPs;
	public org.tmforum.mtnm.terminationPoint.TPConnectionState_T gtpConnectionState;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo;
	public GTP_T(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, boolean alarmReportingIndicator, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] listOfTPs, org.tmforum.mtnm.terminationPoint.TPConnectionState_T gtpConnectionState, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.alarmReportingIndicator = alarmReportingIndicator;
		this.listOfTPs = listOfTPs;
		this.gtpConnectionState = gtpConnectionState;
		this.additionalInfo = additionalInfo;
	}
}
