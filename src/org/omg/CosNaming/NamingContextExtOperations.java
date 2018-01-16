package org.omg.CosNaming;

/**
 *	Generated from IDL interface "NamingContextExt"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface NamingContextExtOperations
	extends org.omg.CosNaming.NamingContextOperations
{
	/* constants */
	/* operations  */
	java.lang.String to_string(org.omg.CosNaming.NameComponent[] n) throws org.omg.CosNaming.NamingContextPackage.InvalidName;
	org.omg.CosNaming.NameComponent[] to_name(java.lang.String sn) throws org.omg.CosNaming.NamingContextPackage.InvalidName;
	java.lang.String to_url(java.lang.String addr, java.lang.String sn) throws org.omg.CosNaming.NamingContextPackage.InvalidName,org.omg.CosNaming.NamingContextExtPackage.InvalidAddress;
	org.omg.CORBA.Object resolve_str(java.lang.String n) throws org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName;
}
