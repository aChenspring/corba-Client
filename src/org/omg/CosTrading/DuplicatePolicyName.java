package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "DuplicatePolicyName"
 *	@author JacORB IDL compiler 
 */

public final class DuplicatePolicyName
	extends org.omg.CORBA.UserException
{
	public DuplicatePolicyName()
	{
		super(org.omg.CosTrading.DuplicatePolicyNameHelper.id());
	}

	public java.lang.String name;
	public DuplicatePolicyName(java.lang.String _reason,java.lang.String name)
	{
		super(org.omg.CosTrading.DuplicatePolicyNameHelper.id()+ " " + _reason);
		this.name = name;
	}
	public DuplicatePolicyName(java.lang.String name)
	{
		super(org.omg.CosTrading.DuplicatePolicyNameHelper.id());
		this.name = name;
	}
}
