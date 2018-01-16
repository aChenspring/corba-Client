package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of exception "ReadonlyProperty"
 *	@author JacORB IDL compiler 
 */

public final class ReadonlyProperty
	extends org.omg.CORBA.UserException
{
	public ReadonlyProperty()
	{
		super(org.omg.CosTrading.RegisterPackage.ReadonlyPropertyHelper.id());
	}

	public java.lang.String type;
	public java.lang.String name;
	public ReadonlyProperty(java.lang.String _reason,java.lang.String type, java.lang.String name)
	{
		super(org.omg.CosTrading.RegisterPackage.ReadonlyPropertyHelper.id()+ " " + _reason);
		this.type = type;
		this.name = name;
	}
	public ReadonlyProperty(java.lang.String type, java.lang.String name)
	{
		super(org.omg.CosTrading.RegisterPackage.ReadonlyPropertyHelper.id());
		this.type = type;
		this.name = name;
	}
}
