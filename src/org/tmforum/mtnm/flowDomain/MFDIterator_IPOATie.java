package org.tmforum.mtnm.flowDomain;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "MFDIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class MFDIterator_IPOATie
	extends MFDIterator_IPOA
{
	private MFDIterator_IOperations _delegate;

	private POA _poa;
	public MFDIterator_IPOATie(MFDIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MFDIterator_IPOATie(MFDIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.flowDomain.MFDIterator_I _this()
	{
		return org.tmforum.mtnm.flowDomain.MFDIterator_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.flowDomain.MFDIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.flowDomain.MFDIterator_IHelper.narrow(_this_object(orb));
	}
	public MFDIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MFDIterator_IOperations delegate)
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

	public boolean next_n(int how_many, org.tmforum.mtnm.flowDomain.MFDList_THolder mfdList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,mfdList);
	}

	public void destroy() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
