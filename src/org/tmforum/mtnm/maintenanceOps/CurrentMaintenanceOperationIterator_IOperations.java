package org.tmforum.mtnm.maintenanceOps;

/**
 *	Generated from IDL interface "CurrentMaintenanceOperationIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface CurrentMaintenanceOperationIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperationList_THolder cMOList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	int getLength() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void destroy() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
