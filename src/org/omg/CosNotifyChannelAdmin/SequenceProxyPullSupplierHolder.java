package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "SequenceProxyPullSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class SequenceProxyPullSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequenceProxyPullSupplier value;
	public SequenceProxyPullSupplierHolder()
	{
	}
	public SequenceProxyPullSupplierHolder (final SequenceProxyPullSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SequenceProxyPullSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequenceProxyPullSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequenceProxyPullSupplierHelper.write (_out,value);
	}
}
