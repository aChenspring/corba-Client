package org.tmforum.mtnm.callSNC;

/**
 *	Generated from IDL definition of struct "CallModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class CallModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.callSNC.CallModifyData_T value;

	public CallModifyData_THolder ()
	{
	}
	public CallModifyData_THolder(final org.tmforum.mtnm.callSNC.CallModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.callSNC.CallModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.callSNC.CallModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.callSNC.CallModifyData_THelper.write(_out, value);
	}
}
