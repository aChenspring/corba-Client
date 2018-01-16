package org.tmforum.mtnm.topologicalLink;

/**
 *	Generated from IDL definition of struct "TLCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TLCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.topologicalLink.TLCreateData_T value;

	public TLCreateData_THolder ()
	{
	}
	public TLCreateData_THolder(final org.tmforum.mtnm.topologicalLink.TLCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.topologicalLink.TLCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.topologicalLink.TLCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.topologicalLink.TLCreateData_THelper.write(_out, value);
	}
}
