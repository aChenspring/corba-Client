package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "InvalidLookupRef"
 *	@author JacORB IDL compiler 
 */

public final class InvalidLookupRef
	extends org.omg.CORBA.UserException
{
	public InvalidLookupRef()
	{
		super(org.omg.CosTrading.InvalidLookupRefHelper.id());
	}

	public org.omg.CosTrading.Lookup target;
	public InvalidLookupRef(java.lang.String _reason,org.omg.CosTrading.Lookup target)
	{
		super(org.omg.CosTrading.InvalidLookupRefHelper.id()+ " " + _reason);
		this.target = target;
	}
	public InvalidLookupRef(org.omg.CosTrading.Lookup target)
	{
		super(org.omg.CosTrading.InvalidLookupRefHelper.id());
		this.target = target;
	}
}
