package org.omg.DsLogAdmin;

/**
 *	Generated from IDL interface "BasicLog"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class BasicLogHolder	implements org.omg.CORBA.portable.Streamable{
	 public BasicLog value;
	public BasicLogHolder()
	{
	}
	public BasicLogHolder (final BasicLog initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return BasicLogHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BasicLogHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BasicLogHelper.write (_out,value);
	}
}
