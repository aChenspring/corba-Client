package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of exception "RegisterNotSupported"
 *	@author JacORB IDL compiler 
 */

public final class RegisterNotSupported
	extends org.omg.CORBA.UserException
{
	public RegisterNotSupported()
	{
		super(org.omg.CosTrading.RegisterPackage.RegisterNotSupportedHelper.id());
	}

	public java.lang.String[] name;
	public RegisterNotSupported(java.lang.String _reason,java.lang.String[] name)
	{
		super(org.omg.CosTrading.RegisterPackage.RegisterNotSupportedHelper.id()+ " " + _reason);
		this.name = name;
	}
	public RegisterNotSupported(java.lang.String[] name)
	{
		super(org.omg.CosTrading.RegisterPackage.RegisterNotSupportedHelper.id());
		this.name = name;
	}
}
