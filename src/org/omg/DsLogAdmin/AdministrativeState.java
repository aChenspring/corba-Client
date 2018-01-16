package org.omg.DsLogAdmin;
/**
 *	Generated from IDL definition of enum "AdministrativeState"
 *	@author JacORB IDL compiler 
 */

public final class AdministrativeState
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _locked = 0;
	public static final AdministrativeState locked = new AdministrativeState(_locked);
	public static final int _unlocked = 1;
	public static final AdministrativeState unlocked = new AdministrativeState(_unlocked);
	public int value()
	{
		return value;
	}
	public static AdministrativeState from_int(int value)
	{
		switch (value) {
			case _locked: return locked;
			case _unlocked: return unlocked;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected AdministrativeState(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
