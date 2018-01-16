package org.tmforum.mtnm.transmissionDescriptor;

/**
 *	Generated from IDL definition of struct "TMDModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class TMDModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TMDModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public org.tmforum.mtnm.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalObjectInfo;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] containingTMDName;
	public java.lang.String externalRepresentationReference = "";
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public TMDModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, org.tmforum.mtnm.transmissionParameters.LayeredParameters_T[] transmissionParams, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalObjectInfo, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] containingTMDName, java.lang.String externalRepresentationReference, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.additionalObjectInfo = additionalObjectInfo;
		this.containingTMDName = containingTMDName;
		this.externalRepresentationReference = externalRepresentationReference;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
