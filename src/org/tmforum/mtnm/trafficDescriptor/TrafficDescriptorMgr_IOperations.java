package org.tmforum.mtnm.trafficDescriptor;

/**
 *	Generated from IDL interface "TrafficDescriptorMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface TrafficDescriptorMgr_IOperations
	extends org.tmforum.mtnm.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllTrafficDescriptors(int how_many, org.tmforum.mtnm.trafficDescriptor.TrafficDescriptorList_THolder trafficDescList, org.tmforum.mtnm.trafficDescriptor.TrafficDescriptorIterator_IHolder trafficDescIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllTrafficDescriptorNames(int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getTrafficDescriptor(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tdName, org.tmforum.mtnm.trafficDescriptor.TrafficDescriptor_THolder td) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAssociatedCTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] trafficDescriptorName, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void createTrafficDescriptor(org.tmforum.mtnm.trafficDescriptor.TDCreateData_T newTDCreateData, org.tmforum.mtnm.trafficDescriptor.TrafficDescriptor_THolder newTrafficDescriptor) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void deleteTrafficDescriptor(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] descriptorName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
