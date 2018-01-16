package org.omg.CosTrading;

/**
 *	Generated from IDL interface "OfferIterator"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface OfferIteratorOperations
{
	/* constants */
	/* operations  */
	int max_left() throws org.omg.CosTrading.UnknownMaxLeft;
	boolean next_n(int n, org.omg.CosTrading.OfferSeqHolder offers);
	void destroy();
}
