package org.tmforum.mtnm.mLSNPP;

/**
 *	Generated from IDL interface "MLSNPPMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface MLSNPPMgr_IOperations
	extends org.tmforum.mtnm.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getMLSNPP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPName, org.tmforum.mtnm.mLSNPP.MultiLayerSNPP_THolder theMLSNPP) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void setTNANameForMLSNPP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPName, org.tmforum.mtnm.mLSNPP.SNPTNAData_T[] sNPTNADataList, org.tmforum.mtnm.mLSNPP.SNPPTNAPair_T[] sNPPTNAPairList, java.lang.String tNAName, java.lang.String tNAGroupName, org.tmforum.mtnm.mLSNPP.MultiLayerSNPP_THolder mLSNPP) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
