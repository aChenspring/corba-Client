package org.tmforum.mtnm.performance;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "PerformanceManagementMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class PerformanceManagementMgr_IPOATie
	extends PerformanceManagementMgr_IPOA
{
	private PerformanceManagementMgr_IOperations _delegate;

	private POA _poa;
	public PerformanceManagementMgr_IPOATie(PerformanceManagementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public PerformanceManagementMgr_IPOATie(PerformanceManagementMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.performance.PerformanceManagementMgr_I _this()
	{
		return org.tmforum.mtnm.performance.PerformanceManagementMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.performance.PerformanceManagementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.performance.PerformanceManagementMgr_IHelper.narrow(_this_object(orb));
	}
	public PerformanceManagementMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PerformanceManagementMgr_IOperations delegate)
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
	public void enablePMData(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, org.tmforum.mtnm.performance.PMTPSelectList_THolder failedTPSelectList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.enablePMData(pmTPSelectList,failedTPSelectList);
	}

	public void setTCATPParameter(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, org.tmforum.mtnm.performance.TCAParameters_THolder tcaParameters) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setTCATPParameter(tpName,tcaParameters);
	}

	public void setTCAParameterProfile(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tcaParameterProfileName, org.tmforum.mtnm.performance.TCAParameter_T[] listOfTCAParameter, int how_many, org.tmforum.mtnm.performance.TCAParameterProfile_THolder tcaParameterProfile, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder failedTPList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setTCAParameterProfile(tcaParameterProfileName,listOfTCAParameter,how_many,tcaParameterProfile,failedTPList,nameIt);
	}

	public void setTCAParameterProfilePointer(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] addTCAParameterProfile, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] removeTCAParameterProfile) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setTCAParameterProfilePointer(tpName,addTCAParameterProfile,removeTCAParameterProfile);
	}

	public void getMEPMcapabilities(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, short layerRate, org.tmforum.mtnm.performance.PMParameterList_THolder pmParameterList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getMEPMcapabilities(meName,layerRate,pmParameterList);
	}

	public void getTCATPParameter(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, org.tmforum.mtnm.performance.TCAParameters_THolder tcaParameter) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getTCATPParameter(tpName,layerRate,granularity,tcaParameter);
	}

	public void getProfileAssociatedTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] profileName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder tpNames, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getProfileAssociatedTPs(profileName,how_many,tpNames,nameIt);
	}

	public void getHoldingTime(org.tmforum.mtnm.performance.HoldingTime_THolder holdingTime) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getHoldingTime(holdingTime);
	}

	public void getAllTCAParameterProfileNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder tcaParameterProfileNames, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllTCAParameterProfileNames(meName,how_many,tcaParameterProfileNames,nameIt);
	}

	public void enableTCA(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, org.tmforum.mtnm.performance.PMTPSelectList_THolder failedTPSelectList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.enableTCA(pmTPSelectList,failedTPSelectList);
	}

	public void getAllCurrentPMData(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, org.tmforum.mtnm.performance.PMDataList_THolder pmDataList, org.tmforum.mtnm.performance.PMDataIterator_IHolder pmIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllCurrentPMData(pmTPSelectList,pmParameters,how_many,pmDataList,pmIt);
	}

	public void clearPMData(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, org.tmforum.mtnm.performance.PMTPSelectList_THolder failedTPSelectList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.clearPMData(pmTPSelectList,failedTPSelectList);
	}

	public void getAllPMPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllPMPNames(tpOrMeName,how_many,nameList,nameIt);
	}

	public void disablePMData(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, org.tmforum.mtnm.performance.PMTPSelectList_THolder failedTPSelectList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.disablePMData(pmTPSelectList,failedTPSelectList);
	}

	public void getHistoryPMData(java.lang.String destination, java.lang.String userName, java.lang.String password, org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getHistoryPMData(destination,userName,password,pmTPSelectList,pmParameters,startTime,endTime,forceUpload);
	}

	public void disableTCA(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, org.tmforum.mtnm.performance.PMTPSelectList_THolder failedTPSelectList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.disableTCA(pmTPSelectList,failedTPSelectList);
	}

	public void setAdditionalInfo(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getCapabilities(org.tmforum.mtnm.common.CapabilityList_THolder capabilities) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setOwner(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void setNativeEMSName(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getTPHistoryPMData(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, int how_many, org.tmforum.mtnm.performance.PMDataList_THolder pmDataList, org.tmforum.mtnm.performance.PMDataIterator_IHolder pmIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getTPHistoryPMData(pmTPSelectList,pmParameters,startTime,endTime,how_many,pmDataList,pmIt);
	}

	public void getTCAParameterProfile(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tcaParameterProfileName, org.tmforum.mtnm.performance.TCAParameterProfile_THolder tcaParameterProfile) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getTCAParameterProfile(tcaParameterProfileName,tcaParameterProfile);
	}

	public void getAllPMPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, org.tmforum.mtnm.performance.PMPList_THolder pmpList, org.tmforum.mtnm.performance.PMPIterator_IHolder pmpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllPMPs(tpOrMeName,how_many,pmpList,pmpIt);
	}

	public void createTCAParameterProfile(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short layerRate, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo, org.tmforum.mtnm.performance.TCAParameter_T[] listOfTCAParameter, org.tmforum.mtnm.performance.TCAParameterProfile_THolder tcaParameterProfile) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.createTCAParameterProfile(managedElementName,layerRate,userLabel,forceUniqueness,owner,additionalInfo,listOfTCAParameter,tcaParameterProfile);
	}

	public void setUserLabel(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getAllTCAParameterProfiles(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, int how_many, org.tmforum.mtnm.performance.TCAParameterProfileList_THolder tcaParameterProfileList, org.tmforum.mtnm.performance.TCAParameterProfileIterator_IHolder tcaParameterProfileIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllTCAParameterProfiles(meName,how_many,tcaParameterProfileList,tcaParameterProfileIt);
	}

	public void deleteTCAParameterProfile(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tcaParameterProfileName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.deleteTCAParameterProfile(tcaParameterProfileName);
	}

}
