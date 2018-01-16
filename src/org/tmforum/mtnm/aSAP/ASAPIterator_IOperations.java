package org.tmforum.mtnm.aSAP;

/**
 *	Generated from IDL interface "ASAPIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface ASAPIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.tmforum.mtnm.aSAP.ASAPList_THolder aSAPList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	int getLength() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void destroy() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
