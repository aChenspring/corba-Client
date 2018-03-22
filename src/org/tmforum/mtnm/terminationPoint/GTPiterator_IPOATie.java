package org.tmforum.mtnm.terminationPoint;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "GTPiterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class GTPiterator_IPOATie
	extends GTPiterator_IPOA
{
	private GTPiterator_IOperations _delegate;

	private POA _poa;
	public GTPiterator_IPOATie(GTPiterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public GTPiterator_IPOATie(GTPiterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.terminationPoint.GTPiterator_I _this()
	{
		return org.tmforum.mtnm.terminationPoint.GTPiterator_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.terminationPoint.GTPiterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.terminationPoint.GTPiterator_IHelper.narrow(_this_object(orb));
	}
	public GTPiterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(GTPiterator_IOperations delegate)
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

	public boolean next_n(int how_many, org.tmforum.mtnm.terminationPoint.GTPlist_THolder gtpList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,gtpList);
	}

	public void destroy() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}