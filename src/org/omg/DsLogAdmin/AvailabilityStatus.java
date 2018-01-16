package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of struct "AvailabilityStatus"
 *	@author JacORB IDL compiler 
 */

public final class AvailabilityStatus
	implements org.omg.CORBA.portable.IDLEntity
{
	public AvailabilityStatus(){}
	public boolean off_duty;
	public boolean log_full;
	public AvailabilityStatus(boolean off_duty, boolean log_full)
	{
		this.off_duty = off_duty;
		this.log_full = log_full;
	}
}
