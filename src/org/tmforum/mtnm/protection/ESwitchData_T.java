package org.tmforum.mtnm.protection;

/**
 *	Generated from IDL definition of struct "ESwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class ESwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ESwitchData_T(){}
	public java.lang.String eProtectionGroupType;
	public java.lang.String eSwitchReason;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ePGPName;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] protectedE;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] switchToE;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo;
	public ESwitchData_T(java.lang.String eProtectionGroupType, java.lang.String eSwitchReason, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ePGPName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] protectedE, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] switchToE, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.eProtectionGroupType = eProtectionGroupType;
		this.eSwitchReason = eSwitchReason;
		this.ePGPName = ePGPName;
		this.protectedE = protectedE;
		this.switchToE = switchToE;
		this.additionalInfo = additionalInfo;
	}
}
