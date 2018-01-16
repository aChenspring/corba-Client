package org.omg.DsNotifyLogAdmin;

/**
 *	Generated from IDL interface "NotifyLog"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface NotifyLogOperations
	extends org.omg.DsEventLogAdmin.EventLogOperations , org.omg.CosNotifyChannelAdmin.EventChannelOperations
{
	/* constants */
	/* operations  */
	org.omg.CosNotifyFilter.Filter get_filter();
	void set_filter(org.omg.CosNotifyFilter.Filter filter);
}
