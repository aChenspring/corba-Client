package org.omg.CosTrading;

/**
 *	Generated from IDL interface "Register"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class RegisterHolder	implements org.omg.CORBA.portable.Streamable{
	 public Register value;
	public RegisterHolder()
	{
	}
	public RegisterHolder (final Register initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RegisterHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RegisterHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RegisterHelper.write (_out,value);
	}
}
