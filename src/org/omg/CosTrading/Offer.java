package org.omg.CosTrading;

/**
 *	Generated from IDL definition of struct "Offer"
 *	@author JacORB IDL compiler 
 */

public final class Offer
	implements org.omg.CORBA.portable.IDLEntity
{
	public Offer(){}
	public org.omg.CORBA.Object reference;
	public org.omg.CosTrading.Property[] properties;
	public Offer(org.omg.CORBA.Object reference, org.omg.CosTrading.Property[] properties)
	{
		this.reference = reference;
		this.properties = properties;
	}
}
