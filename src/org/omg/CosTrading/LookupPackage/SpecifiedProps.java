package org.omg.CosTrading.LookupPackage;

/**
 *	Generated from IDL definition of union "SpecifiedProps"
 *	@author JacORB IDL compiler 
 */

public final class SpecifiedProps
	implements org.omg.CORBA.portable.IDLEntity
{
	private org.omg.CosTrading.LookupPackage.HowManyProps discriminator;
	private java.lang.String[] prop_names;
	private short none_dummy;
	private short all_dummy;

	public SpecifiedProps ()
	{
	}

	public org.omg.CosTrading.LookupPackage.HowManyProps discriminator ()
	{
		return discriminator;
	}

	public java.lang.String[] prop_names ()
	{
		if (discriminator != org.omg.CosTrading.LookupPackage.HowManyProps.some)
			throw new org.omg.CORBA.BAD_OPERATION();
		return prop_names;
	}

	public void prop_names (java.lang.String[] _x)
	{
		discriminator = org.omg.CosTrading.LookupPackage.HowManyProps.some;
		prop_names = _x;
	}

	public short none_dummy ()
	{
		if (discriminator != org.omg.CosTrading.LookupPackage.HowManyProps.none)
			throw new org.omg.CORBA.BAD_OPERATION();
		return none_dummy;
	}

	public void none_dummy (short _x)
	{
		discriminator = org.omg.CosTrading.LookupPackage.HowManyProps.none;
		none_dummy = _x;
	}

	public short all_dummy ()
	{
		if (discriminator != org.omg.CosTrading.LookupPackage.HowManyProps.all)
			throw new org.omg.CORBA.BAD_OPERATION();
		return all_dummy;
	}

	public void all_dummy (short _x)
	{
		discriminator = org.omg.CosTrading.LookupPackage.HowManyProps.all;
		all_dummy = _x;
	}

}
