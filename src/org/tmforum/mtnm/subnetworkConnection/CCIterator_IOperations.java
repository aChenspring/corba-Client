package org.tmforum.mtnm.subnetworkConnection;

/**
 *	Generated from IDL interface "CCIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface CCIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.tmforum.mtnm.subnetworkConnection.CrossConnectList_THolder ccList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	int getLength() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void destroy() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
