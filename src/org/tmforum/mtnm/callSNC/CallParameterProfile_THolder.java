package org.tmforum.mtnm.callSNC;

/**
 *	Generated from IDL definition of struct "CallParameterProfile_T"
 *	@author JacORB IDL compiler 
 */

public final class CallParameterProfile_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.callSNC.CallParameterProfile_T value;

	public CallParameterProfile_THolder ()
	{
	}
	public CallParameterProfile_THolder(final org.tmforum.mtnm.callSNC.CallParameterProfile_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.callSNC.CallParameterProfile_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.callSNC.CallParameterProfile_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.callSNC.CallParameterProfile_THelper.write(_out, value);
	}
}
