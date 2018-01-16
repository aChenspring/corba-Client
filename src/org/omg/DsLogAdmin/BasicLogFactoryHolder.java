package org.omg.DsLogAdmin;

/**
 *	Generated from IDL interface "BasicLogFactory"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class BasicLogFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public BasicLogFactory value;
	public BasicLogFactoryHolder()
	{
	}
	public BasicLogFactoryHolder (final BasicLogFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return BasicLogFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BasicLogFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BasicLogFactoryHelper.write (_out,value);
	}
}
