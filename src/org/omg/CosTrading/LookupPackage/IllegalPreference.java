package org.omg.CosTrading.LookupPackage;

/**
 *	Generated from IDL definition of exception "IllegalPreference"
 *	@author JacORB IDL compiler 
 */

public final class IllegalPreference
	extends org.omg.CORBA.UserException
{
	public IllegalPreference()
	{
		super(org.omg.CosTrading.LookupPackage.IllegalPreferenceHelper.id());
	}

	public java.lang.String pref;
	public IllegalPreference(java.lang.String _reason,java.lang.String pref)
	{
		super(org.omg.CosTrading.LookupPackage.IllegalPreferenceHelper.id()+ " " + _reason);
		this.pref = pref;
	}
	public IllegalPreference(java.lang.String pref)
	{
		super(org.omg.CosTrading.LookupPackage.IllegalPreferenceHelper.id());
		this.pref = pref;
	}
}
