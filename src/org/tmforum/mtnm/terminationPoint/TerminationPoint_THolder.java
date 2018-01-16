package org.tmforum.mtnm.terminationPoint;

/**
 *	Generated from IDL definition of struct "TerminationPoint_T"
 *	@author JacORB IDL compiler 
 */

public final class TerminationPoint_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.terminationPoint.TerminationPoint_T value;

	public TerminationPoint_THolder ()
	{
	}
	public TerminationPoint_THolder(final org.tmforum.mtnm.terminationPoint.TerminationPoint_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.terminationPoint.TerminationPoint_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.terminationPoint.TerminationPoint_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.terminationPoint.TerminationPoint_THelper.write(_out, value);
	}
}
