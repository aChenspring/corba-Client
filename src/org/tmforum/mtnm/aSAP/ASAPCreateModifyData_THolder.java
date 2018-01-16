package org.tmforum.mtnm.aSAP;

/**
 *	Generated from IDL definition of struct "ASAPCreateModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class ASAPCreateModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.aSAP.ASAPCreateModifyData_T value;

	public ASAPCreateModifyData_THolder ()
	{
	}
	public ASAPCreateModifyData_THolder(final org.tmforum.mtnm.aSAP.ASAPCreateModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.aSAP.ASAPCreateModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.aSAP.ASAPCreateModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.aSAP.ASAPCreateModifyData_THelper.write(_out, value);
	}
}
