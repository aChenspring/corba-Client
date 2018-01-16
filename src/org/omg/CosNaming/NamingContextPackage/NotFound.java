package org.omg.CosNaming.NamingContextPackage;

/**
 *	Generated from IDL definition of exception "NotFound"
 *	@author JacORB IDL compiler 
 */

public final class NotFound
	extends org.omg.CORBA.UserException
{
	public NotFound()
	{
		super(org.omg.CosNaming.NamingContextPackage.NotFoundHelper.id());
	}

	public org.omg.CosNaming.NamingContextPackage.NotFoundReason why;
	public org.omg.CosNaming.NameComponent[] rest_of_name;
	public NotFound(java.lang.String _reason,org.omg.CosNaming.NamingContextPackage.NotFoundReason why, org.omg.CosNaming.NameComponent[] rest_of_name)
	{
		super(org.omg.CosNaming.NamingContextPackage.NotFoundHelper.id()+ " " + _reason);
		this.why = why;
		this.rest_of_name = rest_of_name;
	}
	public NotFound(org.omg.CosNaming.NamingContextPackage.NotFoundReason why, org.omg.CosNaming.NameComponent[] rest_of_name)
	{
		super(org.omg.CosNaming.NamingContextPackage.NotFoundHelper.id());
		this.why = why;
		this.rest_of_name = rest_of_name;
	}
}
