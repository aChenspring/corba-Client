package org.tmforum.mtnm.callSNC;

/**
 *	Generated from IDL interface "CallAndTopLevelConnectionsIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface CallAndTopLevelConnectionsIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	int getLength() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void destroy() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
