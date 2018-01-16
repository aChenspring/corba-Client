package org.tmforum.mtnm.softwareAndDataManager;

/**
 *	Generated from IDL definition of struct "BackupStatus_T"
 *	@author JacORB IDL compiler 
 */

public final class BackupStatus_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public BackupStatus_T(){}
	public org.tmforum.mtnm.softwareAndDataManager.Current_OperationStatus_T opStatus;
	public java.lang.String failureReason = "";
	public BackupStatus_T(org.tmforum.mtnm.softwareAndDataManager.Current_OperationStatus_T opStatus, java.lang.String failureReason)
	{
		this.opStatus = opStatus;
		this.failureReason = failureReason;
	}
}
