package org.omg.DsLogAdmin;
/**
 *	Generated from IDL definition of enum "OperationalState"
 *	@author JacORB IDL compiler 
 */

public final class OperationalState
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _disabled = 0;
	public static final OperationalState disabled = new OperationalState(_disabled);
	public static final int _enabled = 1;
	public static final OperationalState enabled = new OperationalState(_enabled);
	public int value()
	{
		return value;
	}
	public static OperationalState from_int(int value)
	{
		switch (value) {
			case _disabled: return disabled;
			case _enabled: return enabled;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected OperationalState(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
