package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of exception "IllegalTraderName"
 *	@author JacORB IDL compiler 
 */

public final class IllegalTraderName
	extends org.omg.CORBA.UserException
{
	public IllegalTraderName()
	{
		super(org.omg.CosTrading.RegisterPackage.IllegalTraderNameHelper.id());
	}

	public java.lang.String[] name;
	public IllegalTraderName(java.lang.String _reason,java.lang.String[] name)
	{
		super(org.omg.CosTrading.RegisterPackage.IllegalTraderNameHelper.id()+ " " + _reason);
		this.name = name;
	}
	public IllegalTraderName(java.lang.String[] name)
	{
		super(org.omg.CosTrading.RegisterPackage.IllegalTraderNameHelper.id());
		this.name = name;
	}
}
