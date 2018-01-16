package org.tmforum.mtnm.terminationPoint;

/**
 *	Generated from IDL definition of struct "GTP_T"
 *	@author JacORB IDL compiler 
 */

public final class GTP_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.terminationPoint.GTP_T value;

	public GTP_THolder ()
	{
	}
	public GTP_THolder(final org.tmforum.mtnm.terminationPoint.GTP_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.terminationPoint.GTP_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.terminationPoint.GTP_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.terminationPoint.GTP_THelper.write(_out, value);
	}
}
