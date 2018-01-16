package org.omg.CosNaming.NamingContextPackage;

/**
 *	Generated from IDL definition of exception "CannotProceed"
 *	@author JacORB IDL compiler 
 */

public final class CannotProceed
	extends org.omg.CORBA.UserException
{
	public CannotProceed()
	{
		super(org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.id());
	}

	public org.omg.CosNaming.NamingContext cxt;
	public org.omg.CosNaming.NameComponent[] rest_of_name;
	public CannotProceed(java.lang.String _reason,org.omg.CosNaming.NamingContext cxt, org.omg.CosNaming.NameComponent[] rest_of_name)
	{
		super(org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.id()+ " " + _reason);
		this.cxt = cxt;
		this.rest_of_name = rest_of_name;
	}
	public CannotProceed(org.omg.CosNaming.NamingContext cxt, org.omg.CosNaming.NameComponent[] rest_of_name)
	{
		super(org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.id());
		this.cxt = cxt;
		this.rest_of_name = rest_of_name;
	}
}
