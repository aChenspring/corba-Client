package org.omg.CosTrading.LinkPackage;

/**
 *	Generated from IDL definition of exception "IllegalLinkName"
 *	@author JacORB IDL compiler 
 */

public final class IllegalLinkName
	extends org.omg.CORBA.UserException
{
	public IllegalLinkName()
	{
		super(org.omg.CosTrading.LinkPackage.IllegalLinkNameHelper.id());
	}

	public java.lang.String name;
	public IllegalLinkName(java.lang.String _reason,java.lang.String name)
	{
		super(org.omg.CosTrading.LinkPackage.IllegalLinkNameHelper.id()+ " " + _reason);
		this.name = name;
	}
	public IllegalLinkName(java.lang.String name)
	{
		super(org.omg.CosTrading.LinkPackage.IllegalLinkNameHelper.id());
		this.name = name;
	}
}
