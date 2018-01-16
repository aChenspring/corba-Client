package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of struct "AvailabilityStatus"
 *	@author JacORB IDL compiler 
 */

public final class AvailabilityStatusHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.AvailabilityStatus value;

	public AvailabilityStatusHolder ()
	{
	}
	public AvailabilityStatusHolder(final org.omg.DsLogAdmin.AvailabilityStatus initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.AvailabilityStatusHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.AvailabilityStatusHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.AvailabilityStatusHelper.write(_out, value);
	}
}
