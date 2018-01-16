package org.omg.DsLogAdmin;

/**
 *	Generated from IDL interface "Iterator"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface IteratorOperations
{
	/* constants */
	/* operations  */
	org.omg.DsLogAdmin.LogRecord[] get(int position, int how_many) throws org.omg.DsLogAdmin.InvalidParam;
	void destroy();
}
