package org.tmforum.mtnm.trafficConditioningProfile;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TCProfileIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class TCProfileIterator_IPOATie
	extends TCProfileIterator_IPOA
{
	private TCProfileIterator_IOperations _delegate;

	private POA _poa;
	public TCProfileIterator_IPOATie(TCProfileIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TCProfileIterator_IPOATie(TCProfileIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.trafficConditioningProfile.TCProfileIterator_I _this()
	{
		return org.tmforum.mtnm.trafficConditioningProfile.TCProfileIterator_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.trafficConditioningProfile.TCProfileIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.trafficConditioningProfile.TCProfileIterator_IHelper.narrow(_this_object(orb));
	}
	public TCProfileIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TCProfileIterator_IOperations delegate)
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
	public boolean next_n(int how_many, org.tmforum.mtnm.trafficConditioningProfile.TCProfileList_THolder tcProfileList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,tcProfileList);
	}

	public int getLength() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public void destroy() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
