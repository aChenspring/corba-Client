package org.tmforum.mtnm.transmissionDescriptor;

/**
 *	Generated from IDL interface "TransmissionDescriptorIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface TransmissionDescriptorIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptorList_THolder transmissionDescList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	int getLength() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void destroy() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
