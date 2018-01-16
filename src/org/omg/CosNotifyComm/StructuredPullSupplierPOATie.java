package org.omg.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "StructuredPullSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class StructuredPullSupplierPOATie
	extends StructuredPullSupplierPOA
{
	private StructuredPullSupplierOperations _delegate;

	private POA _poa;
	public StructuredPullSupplierPOATie(StructuredPullSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public StructuredPullSupplierPOATie(StructuredPullSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyComm.StructuredPullSupplier _this()
	{
		return org.omg.CosNotifyComm.StructuredPullSupplierHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyComm.StructuredPullSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyComm.StructuredPullSupplierHelper.narrow(_this_object(orb));
	}
	public StructuredPullSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(StructuredPullSupplierOperations delegate)
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
	public void subscription_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.subscription_change(added,removed);
	}

	public void disconnect_structured_pull_supplier()
	{
_delegate.disconnect_structured_pull_supplier();
	}

	public org.omg.CosNotification.StructuredEvent pull_structured_event() throws org.omg.CosEventComm.Disconnected
	{
		return _delegate.pull_structured_event();
	}

	public org.omg.CosNotification.StructuredEvent try_pull_structured_event(org.omg.CORBA.BooleanHolder has_event) throws org.omg.CosEventComm.Disconnected
	{
		return _delegate.try_pull_structured_event(has_event);
	}

}
