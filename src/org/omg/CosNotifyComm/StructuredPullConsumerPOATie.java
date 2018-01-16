package org.omg.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "StructuredPullConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class StructuredPullConsumerPOATie
	extends StructuredPullConsumerPOA
{
	private StructuredPullConsumerOperations _delegate;

	private POA _poa;
	public StructuredPullConsumerPOATie(StructuredPullConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public StructuredPullConsumerPOATie(StructuredPullConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyComm.StructuredPullConsumer _this()
	{
		return org.omg.CosNotifyComm.StructuredPullConsumerHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyComm.StructuredPullConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyComm.StructuredPullConsumerHelper.narrow(_this_object(orb));
	}
	public StructuredPullConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(StructuredPullConsumerOperations delegate)
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
	public void disconnect_structured_pull_consumer()
	{
_delegate.disconnect_structured_pull_consumer();
	}

	public void offer_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.offer_change(added,removed);
	}

}
