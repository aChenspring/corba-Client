package org.tmforum.mtnm.protection;

/**
 *	Generated from IDL definition of struct "SwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class SwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SwitchData_T(){}
	public org.tmforum.mtnm.protection.ProtectionType_T protectionType;
	public org.tmforum.mtnm.protection.SwitchReason_T switchReason;
	public short layerRate;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] groupName;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] protectedTP;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] switchToTP;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo;
	public SwitchData_T(org.tmforum.mtnm.protection.ProtectionType_T protectionType, org.tmforum.mtnm.protection.SwitchReason_T switchReason, short layerRate, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] groupName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] protectedTP, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] switchToTP, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.protectionType = protectionType;
		this.switchReason = switchReason;
		this.layerRate = layerRate;
		this.groupName = groupName;
		this.protectedTP = protectedTP;
		this.switchToTP = switchToTP;
		this.additionalInfo = additionalInfo;
	}
}
