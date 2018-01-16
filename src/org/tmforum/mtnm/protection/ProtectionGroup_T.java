package org.tmforum.mtnm.protection;

/**
 *	Generated from IDL definition of struct "ProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ProtectionGroup_T(){}
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.tmforum.mtnm.protection.ProtectionGroupType_T protectionGroupType;
	public org.tmforum.mtnm.protection.ProtectionSchemeState_T protectionSchemeState;
	public org.tmforum.mtnm.protection.ReversionMode_T reversionMode;
	public short rate;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] pgpTPList;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] pgpParameters;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo;
	public ProtectionGroup_T(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.tmforum.mtnm.protection.ProtectionGroupType_T protectionGroupType, org.tmforum.mtnm.protection.ProtectionSchemeState_T protectionSchemeState, org.tmforum.mtnm.protection.ReversionMode_T reversionMode, short rate, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] pgpTPList, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] pgpParameters, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionGroupType = protectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.rate = rate;
		this.pgpTPList = pgpTPList;
		this.pgpParameters = pgpParameters;
		this.additionalInfo = additionalInfo;
	}
}
