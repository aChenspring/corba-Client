package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of exception "InvalidObjectRef"
 *	@author JacORB IDL compiler 
 */

public final class InvalidObjectRef
	extends org.omg.CORBA.UserException
{
	public InvalidObjectRef()
	{
		super(org.omg.CosTrading.RegisterPackage.InvalidObjectRefHelper.id());
	}

	public org.omg.CORBA.Object ref;
	public InvalidObjectRef(java.lang.String _reason,org.omg.CORBA.Object ref)
	{
		super(org.omg.CosTrading.RegisterPackage.InvalidObjectRefHelper.id()+ " " + _reason);
		this.ref = ref;
	}
	public InvalidObjectRef(org.omg.CORBA.Object ref)
	{
		super(org.omg.CosTrading.RegisterPackage.InvalidObjectRefHelper.id());
		this.ref = ref;
	}
}
