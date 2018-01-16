package org.tmforum.mtnm.flowDomain;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "FlowDomainMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class FlowDomainMgr_IPOATie
	extends FlowDomainMgr_IPOA
{
	private FlowDomainMgr_IOperations _delegate;

	private POA _poa;
	public FlowDomainMgr_IPOATie(FlowDomainMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public FlowDomainMgr_IPOATie(FlowDomainMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.flowDomain.FlowDomainMgr_I _this()
	{
		return org.tmforum.mtnm.flowDomain.FlowDomainMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.flowDomain.FlowDomainMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.flowDomain.FlowDomainMgr_IHelper.narrow(_this_object(orb));
	}
	public FlowDomainMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FlowDomainMgr_IOperations delegate)
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
	public void getTransmissionParams(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THolder transmissionParams) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getTransmissionParams(name,filter,transmissionParams);
	}

	public void setNativeEMSName(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void assignCPTPsToMFD(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mfdName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] tpNames, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.assignCPTPsToMFD(mfdName,tpNames,tpsToModify,errorReason);
	}

	public void createFTP(org.tmforum.mtnm.flowDomain.FTPCreateData_T createData, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder theFTP, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.createFTP(createData,tpsToModify,theFTP,errorReason);
	}

	public void getAssigningMFD(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] cptpName, org.tmforum.mtnm.flowDomain.MatrixFlowDomain_THolder mfd) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAssigningMFD(cptpName,mfd);
	}

	public void createFlowDomain(org.tmforum.mtnm.flowDomain.FDCreateData_T createData, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder assignedCPTPs, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.flowDomain.FlowDomain_THolder theFD, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.createFlowDomain(createData,assignedCPTPs,tpsToModify,theFD,errorReason);
	}

	public void deleteMFD(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mfdName, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.deleteMFD(mfdName,tpsToModify,errorReason);
	}

	public void getFlowDomainsByUserLabel(java.lang.String userLabel, org.tmforum.mtnm.flowDomain.FDList_THolder flowDomains) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getFlowDomainsByUserLabel(userLabel,flowDomains);
	}

	public void modifyFDFr(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdfrName, org.tmforum.mtnm.flowDomainFragment.FDFrModifyData_T fdfrModifyData, org.tmforum.mtnm.flowDomain.ConnectivityRequirement_T connectivityRequirement, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder failedTPList, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.modifyFDFr(fdfrName,fdfrModifyData,connectivityRequirement,tpsToModify,failedTPList,parameterProblemsTPList,newFDFr,errorReason);
	}

	public void getAllTopologicalLinksOfFD(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] flowDomainName, int how_many, org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THolder topoList, org.tmforum.mtnm.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopologicalLinksOfFD(flowDomainName,how_many,topoList,topoIt);
	}

	public void getFDFr(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdfrName, org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_THolder fdfr) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getFDFr(fdfrName,fdfr);
	}

	public void deleteFTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ftpName, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.deleteFTP(ftpName,tpsToModify,errorReason);
	}

	public void getAllFDFrs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, org.tmforum.mtnm.flowDomainFragment.FDFrList_THolder fdfrList, org.tmforum.mtnm.flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllFDFrs(fdName,how_many,connectivityRateList,fdfrList,fdfrIt);
	}

	public void getAllAssignableCPTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mfdName, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder cptpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder cptpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllAssignableCPTPs(mfdName,how_many,cptpList,cptpIt);
	}

	public void setOwner(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void deleteFlowDomain(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdName, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.deleteFlowDomain(fdName,tpsToModify,errorReason);
	}

	public void deAssociateCPTPsFromFlowDomain(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] tpNames, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.deAssociateCPTPsFromFlowDomain(fdName,tpNames,tpsToModify,errorReason);
	}

	public void getAllCPTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdName, org.tmforum.mtnm.flowDomain.CPTP_Role_T cptpRole, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder cptpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder cptpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllCPTPs(fdName,cptpRole,how_many,cptpList,cptpIt);
	}

	public void getAllAssignedCPTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mfdName, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder cptpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder cptpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllAssignedCPTPs(mfdName,how_many,cptpList,cptpIt);
	}

	public void setAdditionalInfo(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void createMFD(org.tmforum.mtnm.flowDomain.MFDCreateData_T createData, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.flowDomain.MatrixFlowDomain_THolder theMFD, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.createMFD(createData,tpsToModify,theMFD,errorReason);
	}

	public void getFDFrsWithTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] cptpName, int how_many, org.tmforum.mtnm.flowDomainFragment.FDFrList_THolder fdfrList, org.tmforum.mtnm.flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsWithTP(cptpName,how_many,fdfrList,fdfrIt);
	}

	public void deactivateAndDeleteFDFr(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdfrName, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.deactivateAndDeleteFDFr(fdfrName,tpsToModify,theFDFr,errorReason);
	}

	public void getAllFlowDomains(int how_many, org.tmforum.mtnm.flowDomain.FDList_THolder flowDomains, org.tmforum.mtnm.flowDomain.FDIterator_IHolder fdIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllFlowDomains(how_many,flowDomains,fdIt);
	}

	public void deAssociateMFDsFromFlowDomain(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] mfdNames, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.deAssociateMFDsFromFlowDomain(fdName,mfdNames,tpsToModify,errorReason);
	}

	public void getAllSupportedMFDs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] holderName, int how_many, org.tmforum.mtnm.flowDomain.MFDList_THolder mfds, org.tmforum.mtnm.flowDomain.MFDIterator_IHolder mfdIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportedMFDs(holderName,how_many,mfds,mfdIt);
	}

	public void setUserLabel(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getMFD(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mfdName, org.tmforum.mtnm.flowDomain.MatrixFlowDomain_THolder mfd) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getMFD(mfdName,mfd);
	}

	public void getFDFrRoute(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdfrName, org.tmforum.mtnm.flowDomainFragment.FDFrRoute_THolder route) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrRoute(fdfrName,route);
	}

	public void getAssociatingFD(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mfdName, org.tmforum.mtnm.flowDomain.FlowDomain_THolder flowDomain) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAssociatingFD(mfdName,flowDomain);
	}

	public void createAndActivateFDFr(org.tmforum.mtnm.flowDomainFragment.FDFrCreateData_T createData, org.tmforum.mtnm.flowDomain.ConnectivityRequirement_T connectivityRequirement, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] aEnd, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] zEnd, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder internalTPs, org.tmforum.mtnm.flowDomainFragment.MatrixFlowDomainFragmentList_THolder mfdfrs, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_THolder theFDFr, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder notConnectableCPTPList, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.createAndActivateFDFr(createData,connectivityRequirement,aEnd,zEnd,internalTPs,mfdfrs,tpsToModify,theFDFr,notConnectableCPTPList,parameterProblemsTPList,errorReason);
	}

	public void modifyMFD(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mfdName, org.tmforum.mtnm.flowDomain.MFDModifyData_T mfdModifyData, org.tmforum.mtnm.flowDomain.MatrixFlowDomain_THolder newMFD, org.omg.CORBA.StringHolder failedAttributes, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.modifyMFD(mfdName,mfdModifyData,newMFD,failedAttributes,errorReason);
	}

	public void getFDFrsByUserLabel(java.lang.String userLabel, org.tmforum.mtnm.flowDomainFragment.FDFrList_THolder fdfrs) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsByUserLabel(userLabel,fdfrs);
	}

	public void unassignCPTPsFromMFD(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mfdName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] tpNames, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.unassignCPTPsFromMFD(mfdName,tpNames,tpsToModify,errorReason);
	}

	public void modifyFlowDomain(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdName, org.tmforum.mtnm.flowDomain.FDModifyData_T fdModifyData, org.tmforum.mtnm.flowDomain.FlowDomain_THolder modifiedFD, org.omg.CORBA.StringHolder failedAttributes, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.modifyFlowDomain(fdName,fdModifyData,modifiedFD,failedAttributes,errorReason);
	}

	public void associateMFDsWithFlowDomain(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] mfdNames, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.associateMFDsWithFlowDomain(fdName,mfdNames,tpsToModify,errorReason);
	}

	public void getCapabilities(org.tmforum.mtnm.common.CapabilityList_THolder capabilities) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void associateCPTPsWithFlowDomain(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] cptpNames, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.associateCPTPsWithFlowDomain(fdName,cptpNames,tpsToModify,errorReason);
	}

	public void getAllAssociatedMFDs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tmdOrFdName, int how_many, org.tmforum.mtnm.flowDomain.MFDList_THolder mfds, org.tmforum.mtnm.flowDomain.MFDIterator_IHolder mfdIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllAssociatedMFDs(tmdOrFdName,how_many,mfds,mfdIt);
	}

	public void getFlowDomain(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdName, org.tmforum.mtnm.flowDomain.FlowDomain_THolder flowDomain) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getFlowDomain(fdName,flowDomain);
	}

}
