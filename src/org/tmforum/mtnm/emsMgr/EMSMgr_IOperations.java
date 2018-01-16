package org.tmforum.mtnm.emsMgr;

/**
 *	Generated from IDL interface "EMSMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface EMSMgr_IOperations
	extends org.tmforum.mtnm.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getEMS(org.tmforum.mtnm.emsMgr.EMS_THolder emsInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllMLRAs(int how_many, org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkList_THolder mLRAList, org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkIterator_IHolder sIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllTopLevelSubnetworks(int how_many, org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkList_THolder sList, org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkIterator_IHolder sIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllTopLevelSubnetworkNames(int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllMLSNPPLinks(boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllMLSNPPLinksWithTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tPName, boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllMLSNPPLinksWithMLSNs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] mLRANames, boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllMLSNPPLinksWithTNAs(java.lang.String[] tNAList, boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllMLSNPPs(boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPP.MLSNPPList_THolder mLSNPPList, org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllMLSNPPsWithTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tPName, boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPP.MLSNPPList_THolder mLSNPPList, org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllMLSNPPsWithTNA(java.lang.String[] tNAList, boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPP.MLSNPPList_THolder mLSNPPList, org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllTopLevelTopologicalLinks(int how_many, org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THolder topoList, org.tmforum.mtnm.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllTopLevelTopologicalLinkNames(int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getTopLevelTopologicalLink(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] topoLinkName, org.tmforum.mtnm.topologicalLink.TopologicalLink_THolder topoLink) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllEMSAndMEActiveAlarms(java.lang.String[] excludeProbCauseList, org.tmforum.mtnm.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.tmforum.mtnm.notifications.EventList_THolder eventList, org.tmforum.mtnm.notifications.EventIterator_IHolder eventIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllEMSSystemActiveAlarms(org.tmforum.mtnm.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.tmforum.mtnm.notifications.EventList_THolder eventList, org.tmforum.mtnm.notifications.EventIterator_IHolder eventIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void createTopologicalLink(org.tmforum.mtnm.topologicalLink.TLCreateData_T newTLCreateData, org.tmforum.mtnm.topologicalLink.TopologicalLink_THolder newTopologicalLink) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void deleteTopologicalLink(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] topoLinkName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void acknowledgeAlarms(org.tmforum.mtnm.notifications.AlarmOrTCAIdentifier_T[] acknowledgeIDList, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo, org.tmforum.mtnm.notifications.AlarmAndTCAIDList_THolder failedAcknowledgeIDList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void unacknowledgeAlarms(org.tmforum.mtnm.notifications.AlarmOrTCAIdentifier_T[] unacknowledgeIDList, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo, org.tmforum.mtnm.notifications.AlarmAndTCAIDList_THolder failedunAcknowledgeIDList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllEMSAndMEUnacknowledgedActiveAlarms(java.lang.String[] excludeProbCauseList, org.tmforum.mtnm.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.tmforum.mtnm.notifications.EventList_THolder eventList, org.tmforum.mtnm.notifications.EventIterator_IHolder eventIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllEMSSystemUnacknowledgedActiveAlarms(org.tmforum.mtnm.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.tmforum.mtnm.notifications.EventList_THolder eventList, org.tmforum.mtnm.notifications.EventIterator_IHolder eventIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void createASAP(org.tmforum.mtnm.aSAP.ASAPCreateModifyData_T newASAPCreateData, org.tmforum.mtnm.aSAP.ASAP_THolder newASAP, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void deleteASAP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] aSAPName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void assignASAP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] aSAPName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] resourceName, short layerRate, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void deassignASAP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] resourceName, short layerRate, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void modifyASAP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] aSAPName, org.tmforum.mtnm.aSAP.ASAPCreateModifyData_T aSAPModifyData, org.tmforum.mtnm.aSAP.ASAP_THolder newASAP, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllASAPs(int how_many, org.tmforum.mtnm.aSAP.ASAPList_THolder aSAPList, org.tmforum.mtnm.aSAP.ASAPIterator_IHolder asapIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllASAPNames(int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getASAP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] aSAPName, org.tmforum.mtnm.aSAP.ASAP_THolder anASAP) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getASAPbyResource(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] resourceName, short[] layerRateList, int how_many, org.tmforum.mtnm.aSAP.ASAPList_THolder aSAPList, org.tmforum.mtnm.aSAP.ASAPIterator_IHolder asapIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getASAPAssociatedResourceNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] aSAPName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
