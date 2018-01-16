package org.tmforum.mtnm.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "CrossConnect_T"
 *	@author JacORB IDL compiler 
 */

public final class CrossConnect_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CrossConnect_T(){}
	public boolean active;
	public org.tmforum.mtnm.globaldefs.ConnectionDirection_T direction;
	public org.tmforum.mtnm.subnetworkConnection.SNCType_T ccType;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] aEndNameList;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] zEndNameList;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo;
	public CrossConnect_T(boolean active, org.tmforum.mtnm.globaldefs.ConnectionDirection_T direction, org.tmforum.mtnm.subnetworkConnection.SNCType_T ccType, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] aEndNameList, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] zEndNameList, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.active = active;
		this.direction = direction;
		this.ccType = ccType;
		this.aEndNameList = aEndNameList;
		this.zEndNameList = zEndNameList;
		this.additionalInfo = additionalInfo;
	}
}
