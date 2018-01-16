package org.omg.DsLogAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "Iterator"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class IteratorPOATie
	extends IteratorPOA
{
	private IteratorOperations _delegate;

	private POA _poa;
	public IteratorPOATie(IteratorOperations delegate)
	{
		_delegate = delegate;
	}
	public IteratorPOATie(IteratorOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.DsLogAdmin.Iterator _this()
	{
		return org.omg.DsLogAdmin.IteratorHelper.narrow(_this_object());
	}
	public org.omg.DsLogAdmin.Iterator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.DsLogAdmin.IteratorHelper.narrow(_this_object(orb));
	}
	public IteratorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(IteratorOperations delegate)
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
	public org.omg.DsLogAdmin.LogRecord[] get(int position, int how_many) throws org.omg.DsLogAdmin.InvalidParam
	{
		return _delegate.get(position,how_many);
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
