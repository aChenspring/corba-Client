package org.omg.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "SequencePullSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class SequencePullSupplierPOATie
	extends SequencePullSupplierPOA
{
	private SequencePullSupplierOperations _delegate;

	private POA _poa;
	public SequencePullSupplierPOATie(SequencePullSupplierOperations delegate)
	{
		_delegate = delegate;
	}
	public SequencePullSupplierPOATie(SequencePullSupplierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyComm.SequencePullSupplier _this()
	{
		return org.omg.CosNotifyComm.SequencePullSupplierHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyComm.SequencePullSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyComm.SequencePullSupplierHelper.narrow(_this_object(orb));
	}
	public SequencePullSupplierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SequencePullSupplierOperations delegate)
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
	public org.omg.CosNotification.StructuredEvent[] pull_structured_events(int max_number) throws org.omg.CosEventComm.Disconnected
	{
		return _delegate.pull_structured_events(max_number);
	}

	public void subscription_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.subscription_change(added,removed);
	}

	public void disconnect_sequence_pull_supplier()
	{
_delegate.disconnect_sequence_pull_supplier();
	}

	public org.omg.CosNotification.StructuredEvent[] try_pull_structured_events(int max_number, org.omg.CORBA.BooleanHolder has_event) throws org.omg.CosEventComm.Disconnected
	{
		return _delegate.try_pull_structured_events(max_number,has_event);
	}

}
