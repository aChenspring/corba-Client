package org.tmforum.mtnm.managedElementManager;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "ManagedElementMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class ManagedElementMgr_IPOATie
	extends ManagedElementMgr_IPOA
{
	private ManagedElementMgr_IOperations _delegate;

	private POA _poa;
	public ManagedElementMgr_IPOATie(ManagedElementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ManagedElementMgr_IPOATie(ManagedElementMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.managedElementManager.ManagedElementMgr_I _this()
	{
		return org.tmforum.mtnm.managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.managedElementManager.ManagedElementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object(orb));
	}
	public ManagedElementMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ManagedElementMgr_IOperations delegate)
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
	public void getAllCrossConnections(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.tmforum.mtnm.subnetworkConnection.CrossConnectList_THolder ccList, org.tmforum.mtnm.subnetworkConnection.CCIterator_IHolder ccIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllCrossConnections(managedElementName,connectionRateList,how_many,ccList,ccIt);
	}

	public void getAllActiveAlarms(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, java.lang.String[] excludeProbCauseList, org.tmforum.mtnm.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.tmforum.mtnm.notifications.EventList_THolder eventList, org.tmforum.mtnm.notifications.EventIterator_IHolder eventIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllActiveAlarms(meName,excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getAllPTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllPTPNames(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,nameList,nameIt);
	}

	public void getContainedInUseTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getContainedInUseTPNames(tpName,layerRateList,how_many,nameList,nameIt);
	}

	public void setNativeEMSName(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAllFixedCrossConnections(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.tmforum.mtnm.subnetworkConnection.CrossConnectList_THolder ccList, org.tmforum.mtnm.subnetworkConnection.CCIterator_IHolder ccIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllFixedCrossConnections(managedElementName,connectionRateList,how_many,ccList,ccIt);
	}

	public void getGTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] gtpName, org.tmforum.mtnm.terminationPoint.GTP_THolder gtp) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getGTP(gtpName,gtp);
	}

	public void getAllFTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllFTPNames(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,nameList,nameIt);
	}

	public void deleteGTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] gtpName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.deleteGTP(gtpName);
	}

	public void setGtpAlarmReportingOff(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] gtpName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setGtpAlarmReportingOff(gtpName);
	}

	public void getContainedCurrentTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getContainedCurrentTPNames(tpName,layerRateList,how_many,nameList,nameIt);
	}

	public void getContainingSubnetworkNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder subnetNames) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getContainingSubnetworkNames(managedElementName,subnetNames);
	}

	public void setOwner(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void createGTP(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] listOfTPs, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] initialCTPname, int numberOfCTPs, org.tmforum.mtnm.terminationPoint.GTPEffort_T gtpEffort, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalCreationInfo, org.tmforum.mtnm.terminationPoint.GTP_THolder newGTP) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.createGTP(userLabel,forceUniqueness,owner,listOfTPs,initialCTPname,numberOfCTPs,gtpEffort,additionalCreationInfo,newGTP);
	}

	public void getAllManagedElements(int how_many, org.tmforum.mtnm.managedElement.ManagedElementList_THolder meList, org.tmforum.mtnm.managedElement.ManagedElementIterator_IHolder meIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElements(how_many,meList,meIt);
	}

	public void getTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder tp) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getTP(tpName,tp);
	}

	public void getContainedPotentialTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getContainedPotentialTPNames(tpName,layerRateList,how_many,nameList,nameIt);
	}

	public void getPotentialFixedCCs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] inputTP, org.tmforum.mtnm.globaldefs.NVSList_THolder ContainingTP, org.tmforum.mtnm.globaldefs.NVSList_THolder potentialCCList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getPotentialFixedCCs(inputTP,ContainingTP,potentialCCList);
	}

	public void setAdditionalInfo(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getContainedCurrentTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getContainedCurrentTPs(tpName,layerRateList,how_many,tpList,tpIt);
	}

	public void getAllPTPsWithoutFTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllPTPsWithoutFTPs(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,tpList,tpIt);
	}

	public void getAllPTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllPTPs(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,tpList,tpIt);
	}

	public void getContainingTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getContainingTPs(tpName,tpList);
	}

	public void getAllUnacknowledgedActiveAlarms(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, java.lang.String[] excludeProbCauseList, org.tmforum.mtnm.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.tmforum.mtnm.notifications.EventList_THolder eventList, org.tmforum.mtnm.notifications.EventIterator_IHolder eventIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllUnacknowledgedActiveAlarms(meName,excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void setGtpAlarmReportingOn(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] gtpName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setGtpAlarmReportingOn(gtpName);
	}

	public void setTPData(org.tmforum.mtnm.subnetworkConnection.TPData_T tpInfo, org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder modifiedTP) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setTPData(tpInfo,modifiedTP);
	}

	public void getContainingGTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ctpName, org.tmforum.mtnm.terminationPoint.GTP_THolder gtp) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getContainingGTP(ctpName,gtp);
	}

	public void setUserLabel(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getManagedElement(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, org.tmforum.mtnm.managedElement.ManagedElement_THolder me) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getManagedElement(managedElementName,me);
	}

	public void getAllFTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllFTPs(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,tpList,tpIt);
	}

	public void verifyTMDAssignment(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, org.tmforum.mtnm.terminationPoint.Directionality_T direction, org.omg.CORBA.StringHolder tmdAssignmentState, org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THolder transmissionParams, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalTPInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.verifyTMDAssignment(tpName,direction,tmdAssignmentState,transmissionParams,additionalTPInfo);
	}

	public void getAllPTPNamesWithoutFTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllPTPNamesWithoutFTPs(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,nameList,nameIt);
	}

	public void getAllManagedElementNames(int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElementNames(how_many,nameList,nameIt);
	}

	public void getAllGTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, int how_many, org.tmforum.mtnm.terminationPoint.GTPlist_THolder gtpList, org.tmforum.mtnm.terminationPoint.GTPiterator_IHolder gtpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllGTPs(managedElementName,tpLayerRateList,how_many,gtpList,gtpIt);
	}

	public void getContainedPotentialTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getContainedPotentialTPs(tpName,layerRateList,how_many,tpList,tpIt);
	}

	public void getContainedInUseTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getContainedInUseTPs(tpName,layerRateList,how_many,tpList,tpIt);
	}

	public void modifyGTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] gtpName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] tpNames, java.lang.String actionType, org.tmforum.mtnm.terminationPoint.GTP_THolder modifiedGTP) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.modifyGTP(gtpName,tpNames,actionType,modifiedGTP);
	}

	public void getContainingTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder tpNameList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getContainingTPNames(tpName,tpNameList);
	}

	public void getAllGTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllGTPNames(managedElementName,tpLayerRateList,how_many,nameList,nameIt);
	}

	public void getCapabilities(org.tmforum.mtnm.common.CapabilityList_THolder capabilities) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

}
