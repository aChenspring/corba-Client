package org.tmforum.mtnm.trafficDescriptor;

/**
 *	Generated from IDL definition of struct "TrafficDescriptor_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficDescriptor_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TrafficDescriptor_T(){}
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.tmforum.mtnm.trafficDescriptor.ServiceCategory_T serviceCategory;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] trafficParameters;
	public java.lang.String conformanceDefinition = "";
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TrafficDescriptor_T(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.tmforum.mtnm.trafficDescriptor.ServiceCategory_T serviceCategory, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] trafficParameters, java.lang.String conformanceDefinition, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.serviceCategory = serviceCategory;
		this.trafficParameters = trafficParameters;
		this.conformanceDefinition = conformanceDefinition;
		this.additionalInfo = additionalInfo;
	}
}
