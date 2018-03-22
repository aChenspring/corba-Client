package org.tmforum.mtnm.KYLAND_alarmMgr;

/**
 *	Generated from IDL interface "KYLAND_alarmMgr_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface KYLAND_alarmMgr_IOperations
	extends org.tmforum.mtnm.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllHisAlarms(java.lang.String[] excludeProbCauseList, org.tmforum.mtnm.notifications.PerceivedSeverity_T[] excludeSeverityList, int[] excludeTypeList, int how_many, java.lang.String startTime, java.lang.String endTime, org.tmforum.mtnm.notifications.EventList_THolder eventList, org.tmforum.mtnm.notifications.EventIterator_IHolder eventIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getMEHisAlarms(java.lang.String[] excludeProbCauseList, org.tmforum.mtnm.notifications.PerceivedSeverity_T[] excludeSeverityList, int[] excludeTypeList, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, java.lang.String startTime, java.lang.String endTime, org.tmforum.mtnm.notifications.EventList_THolder eventList, org.tmforum.mtnm.notifications.EventIterator_IHolder eventIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
