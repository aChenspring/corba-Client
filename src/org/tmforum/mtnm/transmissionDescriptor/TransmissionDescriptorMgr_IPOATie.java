package org.tmforum.mtnm.transmissionDescriptor;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TransmissionDescriptorMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class TransmissionDescriptorMgr_IPOATie
	extends TransmissionDescriptorMgr_IPOA
{
	private TransmissionDescriptorMgr_IOperations _delegate;

	private POA _poa;
	public TransmissionDescriptorMgr_IPOATie(TransmissionDescriptorMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TransmissionDescriptorMgr_IPOATie(TransmissionDescriptorMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptorMgr_I _this()
	{
		return org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptorMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptorMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptorMgr_IHelper.narrow(_this_object(orb));
	}
	public TransmissionDescriptorMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TransmissionDescriptorMgr_IOperations delegate)
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
	public void setTMDAssociation(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tmdName, org.tmforum.mtnm.transmissionDescriptor.TPorMFDorFDFr_THolder tPorMFDorFDFr) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setTMDAssociation(tmdName,tPorMFDorFDFr);
	}

	public void setNativeEMSName(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAllTransmissionDescriptorNames(int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllTransmissionDescriptorNames(how_many,nameList,nameIt);
	}

	public void setUserLabel(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void deleteTransmissionDescriptor(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] transmissionDescriptorName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.deleteTransmissionDescriptor(transmissionDescriptorName);
	}

	public void validateTMDAssignmentToObject(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.omg.CORBA.StringHolder objectAssignmentState, org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THolder transmissionParams, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalTPInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.validateTMDAssignmentToObject(objectName,objectAssignmentState,transmissionParams,additionalTPInfo);
	}

	public void getCapabilities(org.tmforum.mtnm.common.CapabilityList_THolder capabilities) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getTransmissionDescriptor(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tmdName, org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptor_THolder tmd) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getTransmissionDescriptor(tmdName,tmd);
	}

	public void setOwner(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getAssociatedTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] transmissionDescriptorName, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAssociatedTPs(transmissionDescriptorName,how_many,tpList,tpIt);
	}

	public void createTransmissionDescriptor(org.tmforum.mtnm.transmissionDescriptor.TMDCreateData_T newTMDCreateData, org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptor_THolder newTransmissionDescriptor) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.createTransmissionDescriptor(newTMDCreateData,newTransmissionDescriptor);
	}

	public void modifyTransmissionDescriptor(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tmdName, org.tmforum.mtnm.transmissionDescriptor.TMDModifyData_T tmdModifyData, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptor_THolder modifiedTransmissionDescriptor, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder failedMEList, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder failedTPsMFDsList, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.modifyTransmissionDescriptor(tmdName,tmdModifyData,tpsToModify,modifiedTransmissionDescriptor,failedMEList,failedTPsMFDsList,errorReason);
	}

	public void getAllTransmissionDescriptors(int how_many, org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptorList_THolder transmissionDescList, org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptorIterator_IHolder transmissionDescIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllTransmissionDescriptors(how_many,transmissionDescList,transmissionDescIt);
	}

	public void setAdditionalInfo(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

}
