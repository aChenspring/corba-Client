package org.omg.DsLogAdmin;

/**
 *	Generated from IDL interface "BasicLogFactory"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface BasicLogFactoryOperations
	extends org.omg.DsLogAdmin.LogMgrOperations
{
	/* constants */
	/* operations  */
	org.omg.DsLogAdmin.BasicLog create(short full_action, long max_size, org.omg.CORBA.IntHolder id) throws org.omg.DsLogAdmin.InvalidLogFullAction;
	org.omg.DsLogAdmin.BasicLog create_with_id(int id, short full_action, long max_size) throws org.omg.DsLogAdmin.LogIdAlreadyExists,org.omg.DsLogAdmin.InvalidLogFullAction;
}
