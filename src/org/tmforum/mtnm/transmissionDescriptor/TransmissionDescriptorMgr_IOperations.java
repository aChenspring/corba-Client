package org.tmforum.mtnm.transmissionDescriptor;

/**
 *	Generated from IDL interface "TransmissionDescriptorMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface TransmissionDescriptorMgr_IOperations
	extends org.tmforum.mtnm.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllTransmissionDescriptors(int how_many, org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptorList_THolder transmissionDescList, org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptorIterator_IHolder transmissionDescIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllTransmissionDescriptorNames(int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getTransmissionDescriptor(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tmdName, org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptor_THolder tmd) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAssociatedTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] transmissionDescriptorName, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void createTransmissionDescriptor(org.tmforum.mtnm.transmissionDescriptor.TMDCreateData_T newTMDCreateData, org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptor_THolder newTransmissionDescriptor) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void deleteTransmissionDescriptor(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] transmissionDescriptorName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void modifyTransmissionDescriptor(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tmdName, org.tmforum.mtnm.transmissionDescriptor.TMDModifyData_T tmdModifyData, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptor_THolder modifiedTransmissionDescriptor, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder failedMEList, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder failedTPsMFDsList, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void validateTMDAssignmentToObject(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.omg.CORBA.StringHolder objectAssignmentState, org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THolder transmissionParams, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalTPInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void setTMDAssociation(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tmdName, org.tmforum.mtnm.transmissionDescriptor.TPorMFDorFDFr_THolder tPorMFDorFDFr) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
