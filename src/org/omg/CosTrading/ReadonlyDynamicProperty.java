package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "ReadonlyDynamicProperty"
 *	@author JacORB IDL compiler 
 */

public final class ReadonlyDynamicProperty
	extends org.omg.CORBA.UserException
{
	public ReadonlyDynamicProperty()
	{
		super(org.omg.CosTrading.ReadonlyDynamicPropertyHelper.id());
	}

	public java.lang.String type;
	public java.lang.String name;
	public ReadonlyDynamicProperty(java.lang.String _reason,java.lang.String type, java.lang.String name)
	{
		super(org.omg.CosTrading.ReadonlyDynamicPropertyHelper.id()+ " " + _reason);
		this.type = type;
		this.name = name;
	}
	public ReadonlyDynamicProperty(java.lang.String type, java.lang.String name)
	{
		super(org.omg.CosTrading.ReadonlyDynamicPropertyHelper.id());
		this.type = type;
		this.name = name;
	}
}
