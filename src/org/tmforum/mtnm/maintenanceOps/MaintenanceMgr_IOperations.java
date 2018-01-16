package org.tmforum.mtnm.maintenanceOps;

/**
 *	Generated from IDL interface "MaintenanceMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface MaintenanceMgr_IOperations
	extends org.tmforum.mtnm.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void performMaintenanceOperation(org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, org.tmforum.mtnm.maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getActiveMaintenanceOperations(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperationList_THolder currentMaintenanceOperationList, org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperationIterator_IHolder cmoIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
