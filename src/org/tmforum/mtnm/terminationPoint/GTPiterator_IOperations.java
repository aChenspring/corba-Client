package org.tmforum.mtnm.terminationPoint;

/**
 *	Generated from IDL interface "GTPiterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface GTPiterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.tmforum.mtnm.terminationPoint.GTPlist_THolder gtpList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	int getLength() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
	void destroy() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException;
}
