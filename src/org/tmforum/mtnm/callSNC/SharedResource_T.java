package org.tmforum.mtnm.callSNC;

/**
 *	Generated from IDL definition of struct "SharedResource_T"
 *	@author JacORB IDL compiler 
 */

public final class SharedResource_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SharedResource_T(){}
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name;
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] connectionNameList;
	public SharedResource_T(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] connectionNameList)
	{
		this.name = name;
		this.connectionNameList = connectionNameList;
	}
}
