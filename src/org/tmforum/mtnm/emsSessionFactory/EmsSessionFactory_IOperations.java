package org.tmforum.mtnm.emsSessionFactory;

/**
 *	Generated from IDL interface "EmsSessionFactory_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface EmsSessionFactory_IOperations
	extends org.tmforum.mtnm.mtnmVersion.Version_IOperations
{
	/* constants */
	/* operations  */
	void getEmsSession(java.lang.String user, java.lang.String password, org.tmforum.mtnm.nmsSession.NmsSession_I client, org.tmforum.mtnm.emsSession.EmsSession_IHolder emsSessionInterface) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
