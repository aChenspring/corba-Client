package org.omg.CosNaming;

/**
 *	Generated from IDL interface "BindingIterator"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface BindingIteratorOperations
{
	/* constants */
	/* operations  */
	boolean next_one(org.omg.CosNaming.BindingHolder b);
	boolean next_n(int how_many, org.omg.CosNaming.BindingListHolder bl);
	void destroy();
}
