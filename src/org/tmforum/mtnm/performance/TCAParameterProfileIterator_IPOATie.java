package org.tmforum.mtnm.performance;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TCAParameterProfileIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class TCAParameterProfileIterator_IPOATie
	extends TCAParameterProfileIterator_IPOA
{
	private TCAParameterProfileIterator_IOperations _delegate;

	private POA _poa;
	public TCAParameterProfileIterator_IPOATie(TCAParameterProfileIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TCAParameterProfileIterator_IPOATie(TCAParameterProfileIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.performance.TCAParameterProfileIterator_I _this()
	{
		return org.tmforum.mtnm.performance.TCAParameterProfileIterator_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.performance.TCAParameterProfileIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.performance.TCAParameterProfileIterator_IHelper.narrow(_this_object(orb));
	}
	public TCAParameterProfileIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TCAParameterProfileIterator_IOperations delegate)
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

	public boolean next_n(int how_many, org.tmforum.mtnm.performance.TCAParameterProfileList_THolder tcaParameterProfileList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,tcaParameterProfileList);
	}

	public void destroy() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
