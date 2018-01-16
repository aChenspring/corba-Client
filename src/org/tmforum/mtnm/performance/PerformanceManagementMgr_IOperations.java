package org.tmforum.mtnm.performance;

/**
 *	Generated from IDL interface "PerformanceManagementMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface PerformanceManagementMgr_IOperations
	extends org.tmforum.mtnm.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getMEPMcapabilities(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, short layerRate, org.tmforum.mtnm.performance.PMParameterList_THolder pmParameterList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void disablePMData(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, org.tmforum.mtnm.performance.PMTPSelectList_THolder failedTPSelectList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void enablePMData(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, org.tmforum.mtnm.performance.PMTPSelectList_THolder failedTPSelectList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void clearPMData(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, org.tmforum.mtnm.performance.PMTPSelectList_THolder failedTPSelectList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getHoldingTime(org.tmforum.mtnm.performance.HoldingTime_THolder holdingTime) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getTCATPParameter(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, org.tmforum.mtnm.performance.TCAParameters_THolder tcaParameter) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getHistoryPMData(java.lang.String destination, java.lang.String userName, java.lang.String password, org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllCurrentPMData(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, org.tmforum.mtnm.performance.PMDataList_THolder pmDataList, org.tmforum.mtnm.performance.PMDataIterator_IHolder pmIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void setTCATPParameter(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, org.tmforum.mtnm.performance.TCAParameters_THolder tcaParameters) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void enableTCA(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, org.tmforum.mtnm.performance.PMTPSelectList_THolder failedTPSelectList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void disableTCA(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, org.tmforum.mtnm.performance.PMTPSelectList_THolder failedTPSelectList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getProfileAssociatedTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] profileName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder tpNames, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void createTCAParameterProfile(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short layerRate, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo, org.tmforum.mtnm.performance.TCAParameter_T[] listOfTCAParameter, org.tmforum.mtnm.performance.TCAParameterProfile_THolder tcaParameterProfile) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void deleteTCAParameterProfile(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tcaParameterProfileName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getTCAParameterProfile(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tcaParameterProfileName, org.tmforum.mtnm.performance.TCAParameterProfile_THolder tcaParameterProfile) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void setTCAParameterProfile(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tcaParameterProfileName, org.tmforum.mtnm.performance.TCAParameter_T[] listOfTCAParameter, int how_many, org.tmforum.mtnm.performance.TCAParameterProfile_THolder tcaParameterProfile, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder failedTPList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllTCAParameterProfileNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder tcaParameterProfileNames, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getTPHistoryPMData(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, int how_many, org.tmforum.mtnm.performance.PMDataList_THolder pmDataList, org.tmforum.mtnm.performance.PMDataIterator_IHolder pmIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllPMPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, org.tmforum.mtnm.performance.PMPList_THolder pmpList, org.tmforum.mtnm.performance.PMPIterator_IHolder pmpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllPMPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void setTCAParameterProfilePointer(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] addTCAParameterProfile, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] removeTCAParameterProfile) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getAllTCAParameterProfiles(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, int how_many, org.tmforum.mtnm.performance.TCAParameterProfileList_THolder tcaParameterProfileList, org.tmforum.mtnm.performance.TCAParameterProfileIterator_IHolder tcaParameterProfileIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
