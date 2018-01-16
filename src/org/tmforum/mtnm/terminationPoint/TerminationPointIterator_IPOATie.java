package org.tmforum.mtnm.terminationPoint;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TerminationPointIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class TerminationPointIterator_IPOATie
	extends TerminationPointIterator_IPOA
{
	private TerminationPointIterator_IOperations _delegate;

	private POA _poa;
	public TerminationPointIterator_IPOATie(TerminationPointIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TerminationPointIterator_IPOATie(TerminationPointIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.terminationPoint.TerminationPointIterator_I _this()
	{
		return org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.terminationPoint.TerminationPointIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHelper.narrow(_this_object(orb));
	}
	public TerminationPointIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TerminationPointIterator_IOperations delegate)
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

	public void destroy() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

	public boolean next_n(int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,tpList);
	}

}
