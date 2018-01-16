package org.omg.DsEventLogAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EventLogFactory"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class EventLogFactoryPOATie
	extends EventLogFactoryPOA
{
	private EventLogFactoryOperations _delegate;

	private POA _poa;
	public EventLogFactoryPOATie(EventLogFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public EventLogFactoryPOATie(EventLogFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.DsEventLogAdmin.EventLogFactory _this()
	{
		return org.omg.DsEventLogAdmin.EventLogFactoryHelper.narrow(_this_object());
	}
	public org.omg.DsEventLogAdmin.EventLogFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.DsEventLogAdmin.EventLogFactoryHelper.narrow(_this_object(orb));
	}
	public EventLogFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EventLogFactoryOperations delegate)
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
	public org.omg.CosEventChannelAdmin.ProxyPullSupplier obtain_pull_supplier()
	{
		return _delegate.obtain_pull_supplier();
	}

	public org.omg.DsLogAdmin.Log[] list_logs()
	{
		return _delegate.list_logs();
	}

	public int[] list_logs_by_id()
	{
		return _delegate.list_logs_by_id();
	}

	public org.omg.DsEventLogAdmin.EventLog create(short full_action, long max_size, short[] thresholds, org.omg.CORBA.IntHolder id) throws org.omg.DsLogAdmin.InvalidThreshold,org.omg.DsLogAdmin.InvalidLogFullAction
	{
		return _delegate.create(full_action,max_size,thresholds,id);
	}

	public org.omg.DsEventLogAdmin.EventLog create_with_id(int id, short full_action, long max_size, short[] thresholds) throws org.omg.DsLogAdmin.InvalidThreshold,org.omg.DsLogAdmin.LogIdAlreadyExists,org.omg.DsLogAdmin.InvalidLogFullAction
	{
		return _delegate.create_with_id(id,full_action,max_size,thresholds);
	}

	public org.omg.DsLogAdmin.Log find_log(int id)
	{
		return _delegate.find_log(id);
	}

	public org.omg.CosEventChannelAdmin.ProxyPushSupplier obtain_push_supplier()
	{
		return _delegate.obtain_push_supplier();
	}

}
