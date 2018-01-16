package org.tmforum.mtnm.transmissionDescriptor;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TransmissionDescriptorIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class TransmissionDescriptorIterator_IPOATie
	extends TransmissionDescriptorIterator_IPOA
{
	private TransmissionDescriptorIterator_IOperations _delegate;

	private POA _poa;
	public TransmissionDescriptorIterator_IPOATie(TransmissionDescriptorIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TransmissionDescriptorIterator_IPOATie(TransmissionDescriptorIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptorIterator_I _this()
	{
		return org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptorIterator_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptorIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptorIterator_IHelper.narrow(_this_object(orb));
	}
	public TransmissionDescriptorIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TransmissionDescriptorIterator_IOperations delegate)
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

	public boolean next_n(int how_many, org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptorList_THolder transmissionDescList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,transmissionDescList);
	}

	public void destroy() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
