package org.tmforum.mtnm.callSNC;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "CallAndTopLevelConnectionsIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class CallAndTopLevelConnectionsIterator_IPOATie
	extends CallAndTopLevelConnectionsIterator_IPOA
{
	private CallAndTopLevelConnectionsIterator_IOperations _delegate;

	private POA _poa;
	public CallAndTopLevelConnectionsIterator_IPOATie(CallAndTopLevelConnectionsIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public CallAndTopLevelConnectionsIterator_IPOATie(CallAndTopLevelConnectionsIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsIterator_I _this()
	{
		return org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsIterator_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsIterator_IHelper.narrow(_this_object(orb));
	}
	public CallAndTopLevelConnectionsIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CallAndTopLevelConnectionsIterator_IOperations delegate)
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
	public int getLength() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,callAndTopLevelConnectionsList);
	}

	public void destroy() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
