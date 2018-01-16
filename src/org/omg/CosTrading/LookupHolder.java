package org.omg.CosTrading;

/**
 *	Generated from IDL interface "Lookup"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class LookupHolder	implements org.omg.CORBA.portable.Streamable{
	 public Lookup value;
	public LookupHolder()
	{
	}
	public LookupHolder (final Lookup initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return LookupHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LookupHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		LookupHelper.write (_out,value);
	}
}
