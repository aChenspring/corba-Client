package org.omg.DsLogAdmin;

/**
 *	Generated from IDL interface "LogMgr"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface LogMgrOperations
{
	/* constants */
	/* operations  */
	org.omg.DsLogAdmin.Log[] list_logs();
	org.omg.DsLogAdmin.Log find_log(int id);
	int[] list_logs_by_id();
}
