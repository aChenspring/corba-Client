package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "StructuredProxyPullSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class StructuredProxyPullSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public StructuredProxyPullSupplier value;
	public StructuredProxyPullSupplierHolder()
	{
	}
	public StructuredProxyPullSupplierHolder (final StructuredProxyPullSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return StructuredProxyPullSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StructuredProxyPullSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StructuredProxyPullSupplierHelper.write (_out,value);
	}
}
