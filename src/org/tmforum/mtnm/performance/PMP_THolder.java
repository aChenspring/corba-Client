package org.tmforum.mtnm.performance;

/**
 *	Generated from IDL definition of struct "PMP_T"
 *	@author JacORB IDL compiler 
 */

public final class PMP_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.performance.PMP_T value;

	public PMP_THolder ()
	{
	}
	public PMP_THolder(final org.tmforum.mtnm.performance.PMP_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.performance.PMP_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.performance.PMP_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.performance.PMP_THelper.write(_out, value);
	}
}
