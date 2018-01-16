package org.tmforum.mtnm.trafficDescriptor;

/**
 *	Generated from IDL interface "TrafficDescriptorIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface TrafficDescriptorIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.tmforum.mtnm.trafficDescriptor.TrafficDescriptorList_THolder trafficDescList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	int getLength() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void destroy() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
