package org.omg.DsLogAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "LogMgr"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class LogMgrPOATie
	extends LogMgrPOA
{
	private LogMgrOperations _delegate;

	private POA _poa;
	public LogMgrPOATie(LogMgrOperations delegate)
	{
		_delegate = delegate;
	}
	public LogMgrPOATie(LogMgrOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.DsLogAdmin.LogMgr _this()
	{
		return org.omg.DsLogAdmin.LogMgrHelper.narrow(_this_object());
	}
	public org.omg.DsLogAdmin.LogMgr _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.DsLogAdmin.LogMgrHelper.narrow(_this_object(orb));
	}
	public LogMgrOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(LogMgrOperations delegate)
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

	public int[] list_logs_by_id()
	{
		return _delegate.list_logs_by_id();
	}

	public org.omg.DsLogAdmin.Log find_log(int id)
	{
		return _delegate.find_log(id);
	}

}
