package org.omg.CosNotifyComm;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "SequencePullConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class SequencePullConsumerPOATie
	extends SequencePullConsumerPOA
{
	private SequencePullConsumerOperations _delegate;

	private POA _poa;
	public SequencePullConsumerPOATie(SequencePullConsumerOperations delegate)
	{
		_delegate = delegate;
	}
	public SequencePullConsumerPOATie(SequencePullConsumerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotifyComm.SequencePullConsumer _this()
	{
		return org.omg.CosNotifyComm.SequencePullConsumerHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyComm.SequencePullConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyComm.SequencePullConsumerHelper.narrow(_this_object(orb));
	}
	public SequencePullConsumerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SequencePullConsumerOperations delegate)
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
	public void disconnect_sequence_pull_consumer()
	{
_delegate.disconnect_sequence_pull_consumer();
	}

	public void offer_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType
	{
_delegate.offer_change(added,removed);
	}

}
