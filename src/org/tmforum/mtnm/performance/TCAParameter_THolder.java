package org.tmforum.mtnm.performance;

/**
 *	Generated from IDL definition of struct "TCAParameter_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAParameter_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.performance.TCAParameter_T value;

	public TCAParameter_THolder ()
	{
	}
	public TCAParameter_THolder(final org.tmforum.mtnm.performance.TCAParameter_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.performance.TCAParameter_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.performance.TCAParameter_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.performance.TCAParameter_THelper.write(_out, value);
	}
}
