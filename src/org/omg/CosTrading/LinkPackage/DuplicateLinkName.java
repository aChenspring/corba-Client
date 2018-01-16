package org.omg.CosTrading.LinkPackage;

/**
 *	Generated from IDL definition of exception "DuplicateLinkName"
 *	@author JacORB IDL compiler 
 */

public final class DuplicateLinkName
	extends org.omg.CORBA.UserException
{
	public DuplicateLinkName()
	{
		super(org.omg.CosTrading.LinkPackage.DuplicateLinkNameHelper.id());
	}

	public java.lang.String name;
	public DuplicateLinkName(java.lang.String _reason,java.lang.String name)
	{
		super(org.omg.CosTrading.LinkPackage.DuplicateLinkNameHelper.id()+ " " + _reason);
		this.name = name;
	}
	public DuplicateLinkName(java.lang.String name)
	{
		super(org.omg.CosTrading.LinkPackage.DuplicateLinkNameHelper.id());
		this.name = name;
	}
}
