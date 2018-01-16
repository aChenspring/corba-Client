package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of struct "Time24Interval"
 *	@author JacORB IDL compiler 
 */

public final class Time24Interval
	implements org.omg.CORBA.portable.IDLEntity
{
	public Time24Interval(){}
	public org.omg.DsLogAdmin.Time24 start;
	public org.omg.DsLogAdmin.Time24 stop;
	public Time24Interval(org.omg.DsLogAdmin.Time24 start, org.omg.DsLogAdmin.Time24 stop)
	{
		this.start = start;
		this.stop = stop;
	}
}
