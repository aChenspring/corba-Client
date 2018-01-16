package org.omg.DsNotifyLogAdmin;

/**
 *	Generated from IDL interface "NotifyLogFactory"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface NotifyLogFactoryOperations
	extends org.omg.DsLogAdmin.LogMgrOperations , org.omg.CosNotifyChannelAdmin.ConsumerAdminOperations
{
	/* constants */
	/* operations  */
	org.omg.DsNotifyLogAdmin.NotifyLog create(short full_action, long max_size, short[] thresholds, org.omg.CosNotification.Property[] initial_qos, org.omg.CosNotification.Property[] initial_admin, org.omg.CORBA.IntHolder id) throws org.omg.CosNotification.UnsupportedAdmin,org.omg.DsLogAdmin.InvalidThreshold,org.omg.CosNotification.UnsupportedQoS,org.omg.DsLogAdmin.InvalidLogFullAction;
	org.omg.DsNotifyLogAdmin.NotifyLog create_with_id(int id, short full_action, long max_size, short[] thresholds, org.omg.CosNotification.Property[] initial_qos, org.omg.CosNotification.Property[] initial_admin) throws org.omg.CosNotification.UnsupportedAdmin,org.omg.DsLogAdmin.InvalidThreshold,org.omg.DsLogAdmin.LogIdAlreadyExists,org.omg.CosNotification.UnsupportedQoS,org.omg.DsLogAdmin.InvalidLogFullAction;
}
