package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of exception "UnknownPropertyName"
 *	@author JacORB IDL compiler 
 */

public final class UnknownPropertyName
	extends org.omg.CORBA.UserException
{
	public UnknownPropertyName()
	{
		super(org.omg.CosTrading.RegisterPackage.UnknownPropertyNameHelper.id());
	}

	public java.lang.String name;
	public UnknownPropertyName(java.lang.String _reason,java.lang.String name)
	{
		super(org.omg.CosTrading.RegisterPackage.UnknownPropertyNameHelper.id()+ " " + _reason);
		this.name = name;
	}
	public UnknownPropertyName(java.lang.String name)
	{
		super(org.omg.CosTrading.RegisterPackage.UnknownPropertyNameHelper.id());
		this.name = name;
	}
}
