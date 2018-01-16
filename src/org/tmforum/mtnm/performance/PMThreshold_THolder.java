package org.tmforum.mtnm.performance;

/**
 *	Generated from IDL definition of struct "PMThreshold_T"
 *	@author JacORB IDL compiler 
 */

public final class PMThreshold_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.performance.PMThreshold_T value;

	public PMThreshold_THolder ()
	{
	}
	public PMThreshold_THolder(final org.tmforum.mtnm.performance.PMThreshold_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.performance.PMThreshold_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.performance.PMThreshold_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.performance.PMThreshold_THelper.write(_out, value);
	}
}
