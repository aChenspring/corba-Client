package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of exception "NoMatchingOffers"
 *	@author JacORB IDL compiler 
 */

public final class NoMatchingOffers
	extends org.omg.CORBA.UserException
{
	public NoMatchingOffers()
	{
		super(org.omg.CosTrading.RegisterPackage.NoMatchingOffersHelper.id());
	}

	public java.lang.String constr;
	public NoMatchingOffers(java.lang.String _reason,java.lang.String constr)
	{
		super(org.omg.CosTrading.RegisterPackage.NoMatchingOffersHelper.id()+ " " + _reason);
		this.constr = constr;
	}
	public NoMatchingOffers(java.lang.String constr)
	{
		super(org.omg.CosTrading.RegisterPackage.NoMatchingOffersHelper.id());
		this.constr = constr;
	}
}
