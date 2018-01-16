package org.tmforum.mtnm.multiLayerSubnetwork;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "MultiLayerSubnetworkMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class MultiLayerSubnetworkMgr_IPOATie
	extends MultiLayerSubnetworkMgr_IPOA
{
	private MultiLayerSubnetworkMgr_IOperations _delegate;

	private POA _poa;
	public MultiLayerSubnetworkMgr_IPOATie(MultiLayerSubnetworkMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MultiLayerSubnetworkMgr_IPOATie(MultiLayerSubnetworkMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this()
	{
		return org.tmforum.mtnm.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object(orb));
	}
	public MultiLayerSubnetworkMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MultiLayerSubnetworkMgr_IOperations delegate)
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
	public void removeConnections(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] connectionNamesList, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder sNCsNotDeleted, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.removeConnections(callName,connectionNamesList,tpsToModify,sNCsNotDeleted,errorReason);
	}

	public void getAllEdgeMLSNPPLinks(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllEdgeMLSNPPLinks(subnetName,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void modifyDiversityAndCorouting(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callName, org.tmforum.mtnm.callSNC.Diversity_T callDiversity, org.tmforum.mtnm.callSNC.RouteGroupInfo_T[] routeGroupInfoList, boolean connectionRouteReArrangementAllowed, java.lang.String routeGroupsNumber, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo, org.tmforum.mtnm.callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.modifyDiversityAndCorouting(callName,callDiversity,routeGroupInfoList,connectionRouteReArrangementAllowed,routeGroupsNumber,additionalInfo,callAndTopLevelConnections);
	}

	public void setNativeEMSName(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAllCallIdsWithSNPPOrTNAName(org.tmforum.mtnm.globaldefs.NameAndStringValue_T sNPPOrTNAName, org.tmforum.mtnm.callSNC.CallIdList_THolder callIdList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllCallIdsWithSNPPOrTNAName(sNPPOrTNAName,callIdList);
	}

	public void getIntendedRoute(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo, org.tmforum.mtnm.subnetworkConnection.Route_THolder route) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getIntendedRoute(sncName,includeHigherOrderCCs,additionalInfo,route);
	}

	public void getCapabilities(org.tmforum.mtnm.common.CapabilityList_THolder capabilities) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getSNC(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder snc) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getSNC(sncName,snc);
	}

	public void getConnectionsAndRouteDetails(java.lang.String callID, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLRAName, java.lang.String sNPOrSNPPID, boolean mLSNPPLinkRequested, java.lang.String routeType, org.tmforum.mtnm.callSNC.SNCAndRouteList_THolder connectionAndRouteList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getConnectionsAndRouteDetails(callID,mLRAName,sNPOrSNPPID,mLSNPPLinkRequested,routeType,connectionAndRouteList);
	}

	public void setUserLabel(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void addRoute(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, org.tmforum.mtnm.subnetworkConnection.RouteCreateData_T createRoute, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.RouteDescriptor_THolder theRoute, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.addRoute(sncName,createRoute,tolerableImpact,emsFreedomLevel,theRoute,errorReason);
	}

	public void getAllSubnetworkConnectionNamesWithTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnectionNamesWithTP(tpName,connectionRateList,how_many,nameList,nameIt);
	}

	public void getBackupRoutes(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, boolean includeHigherOrderCCs, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo, org.tmforum.mtnm.subnetworkConnection.RouteList_THolder routeList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getBackupRoutes(sncName,routeId,includeHigherOrderCCs,additionalInfo,routeList);
	}

	public void getAllSubnetworkConnectionNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnectionNames(subnetName,connectionRateList,how_many,nameList,nameIt);
	}

	public void setRoutesAdminState(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, org.tmforum.mtnm.subnetworkConnection.RouteNameAndAdminStateList_THolder routeNameAndAdminStateList, org.tmforum.mtnm.subnetworkConnection.SNCState_THolder sncState) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setRoutesAdminState(sncName,routeNameAndAdminStateList,sncState);
	}

	public void getMLSNPPLink(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, boolean sNPListRequested, org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_THolder theMLSNPPLink) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getMLSNPPLink(mLSNPPLinkName,sNPListRequested,theMLSNPPLink);
	}

	public void getSNCsByUserLabel(java.lang.String userLabel, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getSNCsByUserLabel(userLabel,sncList);
	}

	public void getTPGroupingRelationships(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getTPGroupingRelationships(tpName,how_many,nameList,nameIt);
	}

	public void getAllEdgePoints(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllEdgePoints(subnetName,tpLayerRateList,connectionLayerRateList,how_many,tpList,tpIt);
	}

	public void getAllTopologicalLinks(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THolder topoList, org.tmforum.mtnm.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopologicalLinks(subnetName,how_many,topoList,topoIt);
	}

	public void modifyCall(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callName, org.tmforum.mtnm.callSNC.CallModifyData_T callModifyData, org.tmforum.mtnm.callSNC.Call_THolder modifiedCall) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.modifyCall(callName,callModifyData,modifiedCall);
	}

	public void getAssociatedTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAssociatedTP(tpName,tpList);
	}

	public void getRouteAndTopologicalLinks(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, org.tmforum.mtnm.subnetworkConnection.Route_THolder route, org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THolder topologicalLinkList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getRouteAndTopologicalLinks(sncName,route,topologicalLinkList);
	}

	public void releaseCall(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callName, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder remainingSNCs, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.releaseCall(callName,tpsToModify,remainingSNCs,errorReason);
	}

	public void setOwner(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void createSNC(org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T createData, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.createSNC(createData,tolerableImpact,emsFreedomLevel,theSNC,errorReason);
	}

	public void getAllEdgePointNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, short[] layerRateList, short[] connectionLayerRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllEdgePointNames(subnetName,layerRateList,connectionLayerRateList,how_many,nameList,nameIt);
	}

	public void getRoute(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, org.tmforum.mtnm.subnetworkConnection.Route_THolder route) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getRoute(sncName,includeHigherOrderCCs,route);
	}

	public void getAllTopologicalLinkNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopologicalLinkNames(subnetName,how_many,nameList,nameIt);
	}

	public void getAllManagedElementNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElementNames(subnetName,how_many,nameList,nameIt);
	}

	public void getTPPool(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tPPoolName, org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder tPPool, org.omg.CORBA.IntHolder numberOfMembers, org.omg.CORBA.IntHolder numberOfIdleMembers, org.omg.CORBA.StringHolder descriptionOfUse) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getTPPool(tPPoolName,tPPool,numberOfMembers,numberOfIdleMembers,descriptionOfUse);
	}

	public void getAllSubnetworkConnections(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHolder sncIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnections(subnetName,connectionRateList,how_many,sncList,sncIt);
	}

	public void swapSNC(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] nameOfSNCtoBeDeactivated, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] nameOfSNCtoBeActivated, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SNCState_THolder stateOfActivatedSNC, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.swapSNC(nameOfSNCtoBeDeactivated,nameOfSNCtoBeActivated,emsFreedomLevel,tolerableImpact,tpsToModify,stateOfActivatedSNC,errorReason);
	}

	public void getAllTPPoolNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllTPPoolNames(subnetworkName,how_many,nameList,nameIt);
	}

	public void getAllFixedSubnetworkConnectionNamesWithTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllFixedSubnetworkConnectionNamesWithTP(tpName,connectionRateList,how_many,nameList,nameIt);
	}

	public void getAllMLSNPPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPP.MLSNPPList_THolder mLSNPPList, org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPs(subnetName,sNPListRequested,how_many,mLSNPPList,mLSNPPIt);
	}

	public void removeRoute(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.removeRoute(sncName,routeId,emsFreedomLevel,additionalInfo);
	}

	public void deactivateSNC(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.deactivateSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void switchRoute(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo, org.tmforum.mtnm.subnetworkConnection.SNCState_THolder sncState, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.switchRoute(sncName,routeId,tolerableImpact,emsFreedomLevel,tpsToModify,additionalInfo,sncState,errorReason);
	}

	public void getAllCallIdsWithTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tPName, org.tmforum.mtnm.callSNC.CallIdList_THolder callIdList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllCallIdsWithTP(tPName,callIdList);
	}

	public void getAllCallsAndTopLevelConnectionsAndSNCs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnectionsAndSNCs(subnetName,how_many,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
	}

	public void checkValidSNC(org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T createData, org.tmforum.mtnm.subnetworkConnection.TPData_T[] tpsToModify, boolean considerResources, org.omg.CORBA.BooleanHolder valid) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.checkValidSNC(createData,tpsToModify,considerResources,valid);
	}

	public void getAllSubordinateMLSNs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkList_THolder subordinateMLSNsList, org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkIterator_IHolder subnetIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllSubordinateMLSNs(subnetName,how_many,subordinateMLSNsList,subnetIt);
	}

	public void modifySNC(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.tmforum.mtnm.subnetworkConnection.SNCModifyData_T SNCModifyData, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.subnetworkConnection.ProtectionEffort_T tolerableImpactEffort, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder newSNC, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.modifySNC(sncName,routeId,SNCModifyData,tolerableImpact,tolerableImpactEffort,emsFreedomLevel,tpsToModify,newSNC,errorReason);
	}

	public void getAllCallsAndTopLevelConnectionsAndSNCsWithTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tPName, int how_many, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnectionsAndSNCsWithTP(subnetName,tPName,how_many,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
	}

	public void establishCall(org.tmforum.mtnm.callSNC.CallCreateData_T callCreateData, org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T[] connectionCreateDataList, java.lang.String routeGroupsNumber, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCs_THolder callAndTopLevelConnectionsAndSNCs, org.tmforum.mtnm.subnetworkConnection.SNCCreateDataList_THolder sNCsNotCreated, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder partialSNCs, org.omg.CORBA.StringHolder callErrorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.establishCall(callCreateData,connectionCreateDataList,routeGroupsNumber,tpsToModify,callAndTopLevelConnectionsAndSNCs,sNCsNotCreated,partialSNCs,callErrorReason);
	}

	public void getAllCallsAndTopLevelConnectionsWithME(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, int how_many, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsIterator_IHolder callAndTopLevelConnectionsIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnectionsWithME(subnetName,meName,how_many,callAndTopLevelConnectionsList,callAndTopLevelConnectionsIt);
	}

	public void getAllCallsAndTopLevelConnections(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsIterator_IHolder callAndTopLevelConnectionsIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnections(subnetName,how_many,callAndTopLevelConnectionsList,callAndTopLevelConnectionsIt);
	}

	public void deleteTPPool(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpPoolName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.deleteTPPool(tpPoolName);
	}

	public void createAndActivateSNC(org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T createData, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.createAndActivateSNC(createData,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void createTPPool(org.tmforum.mtnm.multiLayerSubnetwork.TPPoolCreateData_T newTPPoolCreateData, org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder newTPPool) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.createTPPool(newTPPoolCreateData,newTPPool);
	}

	public void getAllInternalMLSNPPLinks(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllInternalMLSNPPLinks(subnetName,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void getAllManagedElements(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.tmforum.mtnm.managedElement.ManagedElementList_THolder meList, org.tmforum.mtnm.managedElement.ManagedElementIterator_IHolder meIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElements(subnetName,how_many,meList,meIt);
	}

	public void getCall(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callName, org.tmforum.mtnm.callSNC.Call_THolder theCall) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCall(callName,theCall);
	}

	public void addConnections(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callName, org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T[] connectionsToAdd, boolean connectionRouteReArrangementAllowed, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder connectionList, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder partialSNCs, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.addConnections(callName,connectionsToAdd,connectionRouteReArrangementAllowed,tpsToModify,connectionList,partialSNCs,errorReason);
	}

	public void deactivateAndDeleteSNC(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.deactivateAndDeleteSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void getAllFixedSubnetworkConnections(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHolder sncIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllFixedSubnetworkConnections(subnetName,connectionRateList,how_many,sncList,sncIt);
	}

	public void getAllSubordinateRAidsWithConnection(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] connection, java.lang.String routeType, org.tmforum.mtnm.multiLayerSubnetwork.RoutePerRouteType_THolder routePerRouteType) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllSubordinateRAidsWithConnection(subnetName,connection,routeType,routePerRouteType);
	}

	public void createModifiedSNC(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.tmforum.mtnm.subnetworkConnection.SNCModifyData_T SNCModifyData, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.subnetworkConnection.ProtectionEffort_T tolerableImpactEffort, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder newSNC, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.createModifiedSNC(sncName,routeId,SNCModifyData,tolerableImpact,tolerableImpactEffort,emsFreedomLevel,tpsToModify,newSNC,errorReason);
	}

	public void modifyTPPool(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tPPoolName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] containedMembers, java.lang.String actionType, org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder modifiedTPPool) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.modifyTPPool(tPPoolName,containedMembers,actionType,modifiedTPPool);
	}

	public void getCallAndTopLevelConnections(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callName, java.lang.String callId, org.tmforum.mtnm.callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCallAndTopLevelConnections(callName,callId,callAndTopLevelConnections);
	}

	public void getAllSubnetworkConnectionsWithTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHolder sncIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnectionsWithTP(tpName,connectionRateList,how_many,sncList,sncIt);
	}

	public void getMultiLayerSubnetwork(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, org.tmforum.mtnm.multiLayerSubnetwork.MultiLayerSubnetwork_THolder subnetwork) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getMultiLayerSubnetwork(subnetName,subnetwork);
	}

	public void activateSNC(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.activateSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void getTopologicalLink(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] topoLinkName, org.tmforum.mtnm.topologicalLink.TopologicalLink_THolder topoLink) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getTopologicalLink(topoLinkName,topoLink);
	}

	public void setAdditionalInfo(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getAllTPPools(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllTPPools(subnetworkName,how_many,tpList,tpIt);
	}

	public void deleteSNC(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.deleteSNC(sncName,emsFreedomLevel);
	}

	public void getAllFixedSubnetworkConnectionNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllFixedSubnetworkConnectionNames(subnetName,connectionRateList,how_many,nameList,nameIt);
	}

	public void getCallAndTopLevelConnectionsAndSNCs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callName, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCs_THolder callAndTopLevelConnectionsAndSNCs) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCallAndTopLevelConnectionsAndSNCs(callName,callAndTopLevelConnectionsAndSNCs);
	}

	public void getAllFixedSubnetworkConnectionsWithTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHolder sncIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllFixedSubnetworkConnectionsWithTP(tpName,connectionRateList,how_many,sncList,sncIt);
	}

	public void setIntendedRoute(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setIntendedRoute(sncName,routeId,additionalInfo);
	}

	public void getAllMLSNPPLinks(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPLinks(subnetName,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void getAllCallsAndTopLevelConnectionsAndSNCsWithME(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, int how_many, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllCallsAndTopLevelConnectionsAndSNCsWithME(subnetName,meName,how_many,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
	}

}
