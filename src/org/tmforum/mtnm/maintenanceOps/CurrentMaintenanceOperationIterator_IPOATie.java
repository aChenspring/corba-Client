package org.tmforum.mtnm.maintenanceOps;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "CurrentMaintenanceOperationIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class CurrentMaintenanceOperationIterator_IPOATie
	extends CurrentMaintenanceOperationIterator_IPOA
{
	private CurrentMaintenanceOperationIterator_IOperations _delegate;

	private POA _poa;
	public CurrentMaintenanceOperationIterator_IPOATie(CurrentMaintenanceOperationIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public CurrentMaintenanceOperationIterator_IPOATie(CurrentMaintenanceOperationIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperationIterator_I _this()
	{
		return org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperationIterator_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperationIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperationIterator_IHelper.narrow(_this_object(orb));
	}
	public CurrentMaintenanceOperationIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CurrentMaintenanceOperationIterator_IOperations delegate)
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

	public boolean next_n(int how_many, org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperationList_THolder cMOList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,cMOList);
	}

	public void destroy() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
