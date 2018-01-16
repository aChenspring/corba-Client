package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "StructuredProxyPullSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface StructuredProxyPullSupplierOperations
	extends org.omg.CosNotifyChannelAdmin.ProxySupplierOperations , org.omg.CosNotifyComm.StructuredPullSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_structured_pull_consumer(org.omg.CosNotifyComm.StructuredPullConsumer pull_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}
