package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "IllegalPropertyName"
 *	@author JacORB IDL compiler 
 */

public final class IllegalPropertyName
	extends org.omg.CORBA.UserException
{
	public IllegalPropertyName()
	{
		super(org.omg.CosTrading.IllegalPropertyNameHelper.id());
	}

	public java.lang.String name;
	public IllegalPropertyName(java.lang.String _reason,java.lang.String name)
	{
		super(org.omg.CosTrading.IllegalPropertyNameHelper.id()+ " " + _reason);
		this.name = name;
	}
	public IllegalPropertyName(java.lang.String name)
	{
		super(org.omg.CosTrading.IllegalPropertyNameHelper.id());
		this.name = name;
	}
}
