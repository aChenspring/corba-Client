package org.omg.CosTrading.RegisterPackage;

/**
 *	Generated from IDL definition of struct "OfferInfo"
 *	@author JacORB IDL compiler 
 */

public final class OfferInfo
	implements org.omg.CORBA.portable.IDLEntity
{
	public OfferInfo(){}
	public org.omg.CORBA.Object reference;
	public java.lang.String type;
	public org.omg.CosTrading.Property[] properties;
	public OfferInfo(org.omg.CORBA.Object reference, java.lang.String type, org.omg.CosTrading.Property[] properties)
	{
		this.reference = reference;
		this.type = type;
		this.properties = properties;
	}
}
