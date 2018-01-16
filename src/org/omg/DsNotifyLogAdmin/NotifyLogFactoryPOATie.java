package org.omg.DsNotifyLogAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "NotifyLogFactory"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class NotifyLogFactoryPOATie
	extends NotifyLogFactoryPOA
{
	private NotifyLogFactoryOperations _delegate;

	private POA _poa;
	public NotifyLogFactoryPOATie(NotifyLogFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public NotifyLogFactoryPOATie(NotifyLogFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.DsNotifyLogAdmin.NotifyLogFactory _this()
	{
		return org.omg.DsNotifyLogAdmin.NotifyLogFactoryHelper.narrow(_this_object());
	}
	public org.omg.DsNotifyLogAdmin.NotifyLogFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.DsNotifyLogAdmin.NotifyLogFactoryHelper.narrow(_this_object(orb));
	}
	public NotifyLogFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(NotifyLogFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public int[] get_all_filters()
	{
		return _delegate.get_all_filters();
	}

	public org.omg.DsNotifyLogAdmin.NotifyLog create(short full_action, long max_size, short[] thresholds, org.omg.CosNotification.Property[] initial_qos, org.omg.CosNotification.Property[] initial_admin, org.omg.CORBA.IntHolder id) throws org.omg.CosNotification.UnsupportedAdmin,org.omg.DsLogAdmin.InvalidThreshold,org.omg.CosNotification.UnsupportedQoS,org.omg.DsLogAdmin.InvalidLogFullAction
	{
		return _delegate.create(full_action,max_size,thresholds,initial_qos,initial_admin,id);
	}

	public org.omg.CosEventChannelAdmin.ProxyPullSupplier obtain_pull_supplier()
	{
		return _delegate.obtain_pull_supplier();
	}

	public org.omg.CosNotifyChannelAdmin.ProxySupplier get_proxy_supplier(int proxy_id) throws org.omg.CosNotifyChannelAdmin.ProxyNotFound
	{
		return _delegate.get_proxy_supplier(proxy_id);
	}

	public int MyID()
	{
		return _delegate.MyID();
	}

	public org.omg.CosNotification.Property[] get_qos()
	{
		return _delegate.get_qos();
	}

	public org.omg.DsLogAdmin.Log[] list_logs()
	{
		return _delegate.list_logs();
	}

	public org.omg.CosNotifyFilter.MappingFilter lifetime_filter()
	{
		return _delegate.lifetime_filter();
	}

	public org.omg.CosNotifyFilter.MappingFilter priority_filter()
	{
		return _delegate.priority_filter();
	}

	public org.omg.CosNotifyFilter.Filter get_filter(int filter) throws org.omg.CosNotifyFilter.FilterNotFound
	{
		return _delegate.get_filter(filter);
	}

	public org.omg.CosNotifyChannelAdmin.ProxySupplier obtain_notification_pull_supplier(org.omg.CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws org.omg.CosNotifyChannelAdmin.AdminLimitExceeded
	{
		return _delegate.obtain_notification_pull_supplier(ctype,proxy_id);
	}

	public org.omg.CosNotifyChannelAdmin.InterFilterGroupOperator MyOperator()
	{
		return _delegate.MyOperator();
	}

	public org.omg.DsLogAdmin.Log find_log(int id)
	{
		return _delegate.find_log(id);
	}

	public org.omg.DsNotifyLogAdmin.NotifyLog create_with_id(int id, short full_action, long max_size, short[] thresholds, org.omg.CosNotification.Property[] initial_qos, org.omg.CosNotification.Property[] initial_admin) throws org.omg.CosNotification.UnsupportedAdmin,org.omg.DsLogAdmin.InvalidThreshold,org.omg.DsLogAdmin.LogIdAlreadyExists,org.omg.CosNotification.UnsupportedQoS,org.omg.DsLogAdmin.InvalidLogFullAction
	{
		return _delegate.create_with_id(id,full_action,max_size,thresholds,initial_qos,initial_admin);
	}

	public void set_qos(org.omg.CosNotification.Property[] qos) throws org.omg.CosNotification.UnsupportedQoS
	{
_delegate.set_qos(qos);
	}

	public int[] list_logs_by_id()
	{
		return _delegate.list_logs_by_id();
	}

	public int[] pull_suppliers()
	{
		return _delegate.pull_suppliers();
	}

	public org.omg.CosNotifyChannelAdmin.ProxySupplier obtain_notification_push_supplier(org.omg.CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws org.omg.CosNotifyChannelAdmin.AdminLimitExceeded
	{
		return _delegate.obtain_notification_push_supplier(ctype,proxy_id);
	}

	public int add_filter(org.omg.CosNotifyFilter.Filter new_filter)
	{
		return _delegate.add_filter(new_filter);
	}

	public void subscription_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.subscription_change(added,removed);
	}

	public void priority_filter(org.omg.CosNotifyFilter.MappingFilter a)
	{
		_delegate.priority_filter(a);
	}

	public org.omg.CosEventChannelAdmin.ProxyPushSupplier obtain_push_supplier()
	{
		return _delegate.obtain_push_supplier();
	}

	public void remove_filter(int filter) throws org.omg.CosNotifyFilter.FilterNotFound
	{
_delegate.remove_filter(filter);
	}

	public void remove_all_filters()
	{
_delegate.remove_all_filters();
	}

	public org.omg.CosNotifyChannelAdmin.EventChannel MyChannel()
	{
		return _delegate.MyChannel();
	}

	public void lifetime_filter(org.omg.CosNotifyFilter.MappingFilter a)
	{
		_delegate.lifetime_filter(a);
	}

	public void validate_qos(org.omg.CosNotification.Property[] required_qos, org.omg.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.CosNotification.UnsupportedQoS
	{
_delegate.validate_qos(required_qos,available_qos);
	}

	public int[] push_suppliers()
	{
		return _delegate.push_suppliers();
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
