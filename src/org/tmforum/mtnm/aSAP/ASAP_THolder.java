package org.tmforum.mtnm.aSAP;

/**
 *	Generated from IDL definition of struct "ASAP_T"
 *	@author JacORB IDL compiler 
 */

public final class ASAP_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.aSAP.ASAP_T value;

	public ASAP_THolder ()
	{
	}
	public ASAP_THolder(final org.tmforum.mtnm.aSAP.ASAP_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.aSAP.ASAP_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.aSAP.ASAP_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.aSAP.ASAP_THelper.write(_out, value);
	}
}
