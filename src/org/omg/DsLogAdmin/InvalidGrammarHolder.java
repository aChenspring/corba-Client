package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of exception "InvalidGrammar"
 *	@author JacORB IDL compiler 
 */

public final class InvalidGrammarHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DsLogAdmin.InvalidGrammar value;

	public InvalidGrammarHolder ()
	{
	}
	public InvalidGrammarHolder(final org.omg.DsLogAdmin.InvalidGrammar initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DsLogAdmin.InvalidGrammarHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DsLogAdmin.InvalidGrammarHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DsLogAdmin.InvalidGrammarHelper.write(_out, value);
	}
}
