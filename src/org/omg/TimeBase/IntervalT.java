package org.omg.TimeBase;

/**
 *	Generated from IDL definition of struct "IntervalT"
 *	@author JacORB IDL compiler 
 */

public final class IntervalT
	implements org.omg.CORBA.portable.IDLEntity
{
	public IntervalT(){}
	public long lower_bound;
	public long upper_bound;
	public IntervalT(long lower_bound, long upper_bound)
	{
		this.lower_bound = lower_bound;
		this.upper_bound = upper_bound;
	}
}
