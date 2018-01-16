package org.omg.DsEventLogAdmin;

/**
 *	Generated from IDL interface "EventLogFactory"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface EventLogFactoryOperations
	extends org.omg.DsLogAdmin.LogMgrOperations , org.omg.CosEventChannelAdmin.ConsumerAdminOperations
{
	/* constants */
	/* operations  */
	org.omg.DsEventLogAdmin.EventLog create(short full_action, long max_size, short[] thresholds, org.omg.CORBA.IntHolder id) throws org.omg.DsLogAdmin.InvalidThreshold,org.omg.DsLogAdmin.InvalidLogFullAction;
	org.omg.DsEventLogAdmin.EventLog create_with_id(int id, short full_action, long max_size, short[] thresholds) throws org.omg.DsLogAdmin.InvalidThreshold,org.omg.DsLogAdmin.LogIdAlreadyExists,org.omg.DsLogAdmin.InvalidLogFullAction;
}
