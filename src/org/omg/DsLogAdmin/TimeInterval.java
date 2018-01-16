package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of struct "TimeInterval"
 *	@author JacORB IDL compiler 
 */

public final class TimeInterval
	implements org.omg.CORBA.portable.IDLEntity
{
	public TimeInterval(){}
	public long start;
	public long stop;
	public TimeInterval(long start, long stop)
	{
		this.start = start;
		this.stop = stop;
	}
}
