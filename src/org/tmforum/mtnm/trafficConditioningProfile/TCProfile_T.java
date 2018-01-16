package org.tmforum.mtnm.trafficConditioningProfile;

/**
 *	Generated from IDL definition of struct "TCProfile_T"
 *	@author JacORB IDL compiler 
 */

public final class TCProfile_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TCProfile_T(){}
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public boolean defaultProfile;
	public org.tmforum.mtnm.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TCProfile_T(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, boolean defaultProfile, org.tmforum.mtnm.transmissionParameters.LayeredParameters_T[] transmissionParams, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.defaultProfile = defaultProfile;
		this.transmissionParams = transmissionParams;
		this.additionalInfo = additionalInfo;
	}
}
