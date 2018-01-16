package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "UnknownServiceType"
 *	@author JacORB IDL compiler 
 */

public final class UnknownServiceType
	extends org.omg.CORBA.UserException
{
	public UnknownServiceType()
	{
		super(org.omg.CosTrading.UnknownServiceTypeHelper.id());
	}

	public java.lang.String type;
	public UnknownServiceType(java.lang.String _reason,java.lang.String type)
	{
		super(org.omg.CosTrading.UnknownServiceTypeHelper.id()+ " " + _reason);
		this.type = type;
	}
	public UnknownServiceType(java.lang.String type)
	{
		super(org.omg.CosTrading.UnknownServiceTypeHelper.id());
		this.type = type;
	}
}
