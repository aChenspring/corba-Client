package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "IllegalOfferId"
 *	@author JacORB IDL compiler 
 */

public final class IllegalOfferId
	extends org.omg.CORBA.UserException
{
	public IllegalOfferId()
	{
		super(org.omg.CosTrading.IllegalOfferIdHelper.id());
	}

	public java.lang.String id;
	public IllegalOfferId(java.lang.String _reason,java.lang.String id)
	{
		super(org.omg.CosTrading.IllegalOfferIdHelper.id()+ " " + _reason);
		this.id = id;
	}
	public IllegalOfferId(java.lang.String id)
	{
		super(org.omg.CosTrading.IllegalOfferIdHelper.id());
		this.id = id;
	}
}
