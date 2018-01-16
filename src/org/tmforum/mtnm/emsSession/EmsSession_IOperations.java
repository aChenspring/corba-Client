package org.tmforum.mtnm.emsSession;

/**
 *	Generated from IDL interface "EmsSession_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface EmsSession_IOperations
	extends org.tmforum.mtnm.session.Session_IOperations
{
	/* constants */
	/* operations  */
	void getSupportedManagers(org.tmforum.mtnm.emsSession.EmsSession_IPackage.managerNames_THolder supportedManagerList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getManager(java.lang.String managerName, org.tmforum.mtnm.common.Common_IHolder managerInterface) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void getEventChannel(org.omg.CosNotifyChannelAdmin.EventChannelHolder eventChannel) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
