package org.tmforum.mtnm.emsMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EMSMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class EMSMgr_IPOATie
	extends EMSMgr_IPOA
{
	private EMSMgr_IOperations _delegate;

	private POA _poa;
	public EMSMgr_IPOATie(EMSMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EMSMgr_IPOATie(EMSMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.emsMgr.EMSMgr_I _this()
	{
		return org.tmforum.mtnm.emsMgr.EMSMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.emsMgr.EMSMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.emsMgr.EMSMgr_IHelper.narrow(_this_object(orb));
	}
	public EMSMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EMSMgr_IOperations delegate)
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
	public void getAllMLSNPPsWithTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tPName, boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPP.MLSNPPList_THolder mLSNPPList, org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPsWithTP(tPName,sNPListRequested,how_many,mLSNPPList,mLSNPPIt);
	}

	public void unacknowledgeAlarms(org.tmforum.mtnm.notifications.AlarmOrTCAIdentifier_T[] unacknowledgeIDList, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo, org.tmforum.mtnm.notifications.AlarmAndTCAIDList_THolder failedunAcknowledgeIDList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.unacknowledgeAlarms(unacknowledgeIDList,additionalInfo,failedunAcknowledgeIDList);
	}

	public void setNativeEMSName(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAllASAPs(int how_many, org.tmforum.mtnm.aSAP.ASAPList_THolder aSAPList, org.tmforum.mtnm.aSAP.ASAPIterator_IHolder asapIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllASAPs(how_many,aSAPList,asapIt);
	}

	public void getAllEMSSystemActiveAlarms(org.tmforum.mtnm.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.tmforum.mtnm.notifications.EventList_THolder eventList, org.tmforum.mtnm.notifications.EventIterator_IHolder eventIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllEMSSystemActiveAlarms(excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getAllMLSNPPsWithTNA(java.lang.String[] tNAList, boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPP.MLSNPPList_THolder mLSNPPList, org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPsWithTNA(tNAList,sNPListRequested,how_many,mLSNPPList,mLSNPPIt);
	}

	public void createTopologicalLink(org.tmforum.mtnm.topologicalLink.TLCreateData_T newTLCreateData, org.tmforum.mtnm.topologicalLink.TopologicalLink_THolder newTopologicalLink) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.createTopologicalLink(newTLCreateData,newTopologicalLink);
	}

	public void acknowledgeAlarms(org.tmforum.mtnm.notifications.AlarmOrTCAIdentifier_T[] acknowledgeIDList, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo, org.tmforum.mtnm.notifications.AlarmAndTCAIDList_THolder failedAcknowledgeIDList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.acknowledgeAlarms(acknowledgeIDList,additionalInfo,failedAcknowledgeIDList);
	}

	public void getASAPbyResource(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] resourceName, short[] layerRateList, int how_many, org.tmforum.mtnm.aSAP.ASAPList_THolder aSAPList, org.tmforum.mtnm.aSAP.ASAPIterator_IHolder asapIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getASAPbyResource(resourceName,layerRateList,how_many,aSAPList,asapIt);
	}

	public void getAllASAPNames(int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllASAPNames(how_many,nameList,nameIt);
	}

	public void getAllEMSSystemUnacknowledgedActiveAlarms(org.tmforum.mtnm.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.tmforum.mtnm.notifications.EventList_THolder eventList, org.tmforum.mtnm.notifications.EventIterator_IHolder eventIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllEMSSystemUnacknowledgedActiveAlarms(excludeSeverityList,how_many,eventList,eventIt);
	}

	public void deassignASAP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] resourceName, short layerRate, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.deassignASAP(resourceName,layerRate,additionalInfo);
	}

	public void getAllMLSNPPLinksWithMLSNs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] mLRANames, boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPLinksWithMLSNs(mLRANames,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void assignASAP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] aSAPName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] resourceName, short layerRate, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.assignASAP(aSAPName,resourceName,layerRate,additionalInfo);
	}

	public void setOwner(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getAllMLSNPPs(boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPP.MLSNPPList_THolder mLSNPPList, org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPs(sNPListRequested,how_many,mLSNPPList,mLSNPPIt);
	}

	public void deleteTopologicalLink(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] topoLinkName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.deleteTopologicalLink(topoLinkName);
	}

	public void getASAPAssociatedResourceNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] aSAPName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getASAPAssociatedResourceNames(aSAPName,how_many,nameList,nameIt);
	}

	public void setAdditionalInfo(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getAllTopLevelSubnetworks(int how_many, org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkList_THolder sList, org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkIterator_IHolder sIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelSubnetworks(how_many,sList,sIt);
	}

	public void getAllTopLevelTopologicalLinkNames(int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelTopologicalLinkNames(how_many,nameList,nameIt);
	}

	public void deleteASAP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] aSAPName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.deleteASAP(aSAPName,additionalInfo);
	}

	public void getAllMLRAs(int how_many, org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkList_THolder mLRAList, org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkIterator_IHolder sIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLRAs(how_many,mLRAList,sIt);
	}

	public void getAllEMSAndMEUnacknowledgedActiveAlarms(java.lang.String[] excludeProbCauseList, org.tmforum.mtnm.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.tmforum.mtnm.notifications.EventList_THolder eventList, org.tmforum.mtnm.notifications.EventIterator_IHolder eventIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllEMSAndMEUnacknowledgedActiveAlarms(excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getAllMLSNPPLinksWithTNAs(java.lang.String[] tNAList, boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPLinksWithTNAs(tNAList,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void getAllTopLevelTopologicalLinks(int how_many, org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THolder topoList, org.tmforum.mtnm.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelTopologicalLinks(how_many,topoList,topoIt);
	}

	public void setUserLabel(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void modifyASAP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] aSAPName, org.tmforum.mtnm.aSAP.ASAPCreateModifyData_T aSAPModifyData, org.tmforum.mtnm.aSAP.ASAP_THolder newASAP, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.modifyASAP(aSAPName,aSAPModifyData,newASAP,additionalInfo);
	}

	public void getAllTopLevelSubnetworkNames(int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelSubnetworkNames(how_many,nameList,nameIt);
	}

	public void getEMS(org.tmforum.mtnm.emsMgr.EMS_THolder emsInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getEMS(emsInfo);
	}

	public void getASAP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] aSAPName, org.tmforum.mtnm.aSAP.ASAP_THolder anASAP) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getASAP(aSAPName,anASAP);
	}

	public void createASAP(org.tmforum.mtnm.aSAP.ASAPCreateModifyData_T newASAPCreateData, org.tmforum.mtnm.aSAP.ASAP_THolder newASAP, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.createASAP(newASAPCreateData,newASAP,additionalInfo);
	}

	public void getAllEMSAndMEActiveAlarms(java.lang.String[] excludeProbCauseList, org.tmforum.mtnm.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.tmforum.mtnm.notifications.EventList_THolder eventList, org.tmforum.mtnm.notifications.EventIterator_IHolder eventIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllEMSAndMEActiveAlarms(excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getTopLevelTopologicalLink(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] topoLinkName, org.tmforum.mtnm.topologicalLink.TopologicalLink_THolder topoLink) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getTopLevelTopologicalLink(topoLinkName,topoLink);
	}

	public void getAllMLSNPPLinksWithTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tPName, boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPLinksWithTP(tPName,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void getAllMLSNPPLinks(boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllMLSNPPLinks(sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
	}

	public void getCapabilities(org.tmforum.mtnm.common.CapabilityList_THolder capabilities) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

}
