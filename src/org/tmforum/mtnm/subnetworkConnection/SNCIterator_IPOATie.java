package org.tmforum.mtnm.subnetworkConnection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "SNCIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class SNCIterator_IPOATie
	extends SNCIterator_IPOA
{
	private SNCIterator_IOperations _delegate;

	private POA _poa;
	public SNCIterator_IPOATie(SNCIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public SNCIterator_IPOATie(SNCIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.subnetworkConnection.SNCIterator_I _this()
	{
		return org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.subnetworkConnection.SNCIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHelper.narrow(_this_object(orb));
	}
	public SNCIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SNCIterator_IOperations delegate)
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

	public boolean next_n(int how_many, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,sncList);
	}

	public void destroy() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
