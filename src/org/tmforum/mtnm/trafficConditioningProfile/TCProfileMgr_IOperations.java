package org.tmforum.mtnm.trafficConditioningProfile;

/**
 *	Generated from IDL interface "TCProfileMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface TCProfileMgr_IOperations
	extends org.tmforum.mtnm.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllTCProfiles(int how_many, org.tmforum.mtnm.trafficConditioningProfile.TCProfileList_THolder tcProfileList, org.tmforum.mtnm.trafficConditioningProfile.TCProfileIterator_IHolder tcProfileIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getTCProfile(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tcProfileName, org.tmforum.mtnm.trafficConditioningProfile.TCProfile_THolder tcProfile) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getTCProfileAssociatedTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tcProfileName, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void createTCProfile(org.tmforum.mtnm.trafficConditioningProfile.TCProfileCreateData_T newTCProfileCreateData, org.tmforum.mtnm.trafficConditioningProfile.TCProfile_THolder newTCProfile) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void deleteTCProfile(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tcProfileName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void modifyTCProfile(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tcProfileName, org.tmforum.mtnm.trafficConditioningProfile.TCProfileCreateData_T tcProfileModifyData, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.trafficConditioningProfile.TCProfile_THolder modifiedTCProfile, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
