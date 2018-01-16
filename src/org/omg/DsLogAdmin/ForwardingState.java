package org.omg.DsLogAdmin;
/**
 *	Generated from IDL definition of enum "ForwardingState"
 *	@author JacORB IDL compiler 
 */

public final class ForwardingState
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _on = 0;
	public static final ForwardingState on = new ForwardingState(_on);
	public static final int _off = 1;
	public static final ForwardingState off = new ForwardingState(_off);
	public int value()
	{
		return value;
	}
	public static ForwardingState from_int(int value)
	{
		switch (value) {
			case _on: return on;
			case _off: return off;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ForwardingState(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
