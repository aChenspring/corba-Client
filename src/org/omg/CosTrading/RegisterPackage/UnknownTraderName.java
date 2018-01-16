package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of exception "UnknownTraderName"
 *	@author JacORB IDL compiler 
 */

public final class UnknownTraderName
	extends org.omg.CORBA.UserException
{
	public UnknownTraderName()
	{
		super(org.omg.CosTrading.RegisterPackage.UnknownTraderNameHelper.id());
	}

	public java.lang.String[] name;
	public UnknownTraderName(java.lang.String _reason,java.lang.String[] name)
	{
		super(org.omg.CosTrading.RegisterPackage.UnknownTraderNameHelper.id()+ " " + _reason);
		this.name = name;
	}
	public UnknownTraderName(java.lang.String[] name)
	{
		super(org.omg.CosTrading.RegisterPackage.UnknownTraderNameHelper.id());
		this.name = name;
	}
}
