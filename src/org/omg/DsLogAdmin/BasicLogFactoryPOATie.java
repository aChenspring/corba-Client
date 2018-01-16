package org.omg.DsLogAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "BasicLogFactory"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class BasicLogFactoryPOATie
	extends BasicLogFactoryPOA
{
	private BasicLogFactoryOperations _delegate;

	private POA _poa;
	public BasicLogFactoryPOATie(BasicLogFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public BasicLogFactoryPOATie(BasicLogFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.DsLogAdmin.BasicLogFactory _this()
	{
		return org.omg.DsLogAdmin.BasicLogFactoryHelper.narrow(_this_object());
	}
	public org.omg.DsLogAdmin.BasicLogFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.DsLogAdmin.BasicLogFactoryHelper.narrow(_this_object(orb));
	}
	public BasicLogFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(BasicLogFactoryOperations delegate)
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
	public org.omg.DsLogAdmin.Log[] list_logs()
	{
		return _delegate.list_logs();
	}

	public org.omg.DsLogAdmin.BasicLog create(short full_action, long max_size, org.omg.CORBA.IntHolder id) throws org.omg.DsLogAdmin.InvalidLogFullAction
	{
		return _delegate.create(full_action,max_size,id);
	}

	public int[] list_logs_by_id()
	{
		return _delegate.list_logs_by_id();
	}

	public org.omg.DsLogAdmin.BasicLog create_with_id(int id, short full_action, long max_size) throws org.omg.DsLogAdmin.LogIdAlreadyExists,org.omg.DsLogAdmin.InvalidLogFullAction
	{
		return _delegate.create_with_id(id,full_action,max_size);
	}

	public org.omg.DsLogAdmin.Log find_log(int id)
	{
		return _delegate.find_log(id);
	}

}
