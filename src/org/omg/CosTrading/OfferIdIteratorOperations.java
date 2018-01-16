package org.omg.CosTrading;

/**
 *	Generated from IDL interface "OfferIdIterator"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface OfferIdIteratorOperations
{
	/* constants */
	/* operations  */
	int max_left() throws org.omg.CosTrading.UnknownMaxLeft;
	boolean next_n(int n, org.omg.CosTrading.OfferIdSeqHolder ids);
	void destroy();
}
