package org.tmforum.mtnm.globaldefs;

/**
 *	Generated from IDL definition of exception "ProcessingFailureException"
 *	@author JacORB IDL compiler 
 */

public final class ProcessingFailureExceptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.globaldefs.ProcessingFailureException value;

	public ProcessingFailureExceptionHolder ()
	{
	}
	public ProcessingFailureExceptionHolder(final org.tmforum.mtnm.globaldefs.ProcessingFailureException initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, value);
	}
}
