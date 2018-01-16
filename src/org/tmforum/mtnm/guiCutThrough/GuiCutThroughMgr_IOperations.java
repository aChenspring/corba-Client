package org.tmforum.mtnm.guiCutThrough;

/**
 *	Generated from IDL interface "GuiCutThroughMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface GuiCutThroughMgr_IOperations
	extends org.tmforum.mtnm.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getGCTProfileInfo(org.tmforum.mtnm.guiCutThrough.GCTProfileInfo_THolder gctProfileInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void launchGCT(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String gctContext, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] userInfo, java.lang.String displayAddress, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInputInfo, org.omg.CORBA.BooleanHolder closingEnabled, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalOutputInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void destroyGCT(java.lang.String displayAddress) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
