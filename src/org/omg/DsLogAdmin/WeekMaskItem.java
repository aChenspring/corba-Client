package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of struct "WeekMaskItem"
 *	@author JacORB IDL compiler 
 */

public final class WeekMaskItem
	implements org.omg.CORBA.portable.IDLEntity
{
	public WeekMaskItem(){}
	public short days;
	public org.omg.DsLogAdmin.Time24Interval[] intervals;
	public WeekMaskItem(short days, org.omg.DsLogAdmin.Time24Interval[] intervals)
	{
		this.days = days;
		this.intervals = intervals;
	}
}
