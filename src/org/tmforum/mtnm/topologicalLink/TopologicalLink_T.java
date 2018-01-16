package org.tmforum.mtnm.topologicalLink;

/**
 *	Generated from IDL definition of struct "TopologicalLink_T"
 *	@author JacORB IDL compiler 
 */

public final class TopologicalLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TopologicalLink_T(){}
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.tmforum.mtnm.globaldefs.ConnectionDirection_T direction;
	public short rate;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] aEndTP;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] zEndTP;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TopologicalLink_T(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.tmforum.mtnm.globaldefs.ConnectionDirection_T direction, short rate, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] aEndTP, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] zEndTP, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.rate = rate;
		this.aEndTP = aEndTP;
		this.zEndTP = zEndTP;
		this.additionalInfo = additionalInfo;
	}
}
