package org.tmforum.mtnm.performance;

/**
 *	Generated from IDL definition of struct "PMParameter_T"
 *	@author JacORB IDL compiler 
 */

public final class PMParameter_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.performance.PMParameter_T value;

	public PMParameter_THolder ()
	{
	}
	public PMParameter_THolder(final org.tmforum.mtnm.performance.PMParameter_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.performance.PMParameter_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.performance.PMParameter_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.performance.PMParameter_THelper.write(_out, value);
	}
}