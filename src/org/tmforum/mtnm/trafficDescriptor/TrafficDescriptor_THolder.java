package org.tmforum.mtnm.trafficDescriptor;

/**
 *	Generated from IDL definition of struct "TrafficDescriptor_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficDescriptor_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.trafficDescriptor.TrafficDescriptor_T value;

	public TrafficDescriptor_THolder ()
	{
	}
	public TrafficDescriptor_THolder(final org.tmforum.mtnm.trafficDescriptor.TrafficDescriptor_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.trafficDescriptor.TrafficDescriptor_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.trafficDescriptor.TrafficDescriptor_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.trafficDescriptor.TrafficDescriptor_THelper.write(_out, value);
	}
}
