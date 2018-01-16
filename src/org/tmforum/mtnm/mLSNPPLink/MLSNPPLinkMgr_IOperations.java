package org.tmforum.mtnm.mLSNPPLink;

/**
 *	Generated from IDL interface "MLSNPPLinkMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface MLSNPPLinkMgr_IOperations
	extends org.tmforum.mtnm.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAvailableCapacity(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, short layerRate, org.tmforum.mtnm.mLSNPPLink.AvailableCapacity_THolder availableCapacity) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void assignSignallingController(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, java.lang.String signallingControllerIdentifier) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void deassignSignallingController(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void setSignallingProtocolAndParameters(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, java.lang.String signallingProtocol, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] signallingParameters) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void setTNANameForMLSNPPLinkEnd(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, org.tmforum.mtnm.mLSNPP.SNPTNAData_T[] sNPTNADataList, org.tmforum.mtnm.mLSNPP.SNPPTNAPair_T[] sNPPTNAPairList, java.lang.String aTNAName, java.lang.String zTNAName, java.lang.String aTNAGroupName, java.lang.String zTNAGroupName, org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_THolder mLSNPPLink) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void modifySignallingProtocolParameters(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, org.tmforum.mtnm.globaldefs.NVSList_THolder signallingParameters) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void enableSignalling(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void disableSignalling(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
