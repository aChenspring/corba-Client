package org.omg.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "StructuredProxyPullConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class StructuredProxyPullConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public StructuredProxyPullConsumer value;
	public StructuredProxyPullConsumerHolder()
	{
	}
	public StructuredProxyPullConsumerHolder (final StructuredProxyPullConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return StructuredProxyPullConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StructuredProxyPullConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StructuredProxyPullConsumerHelper.write (_out,value);
	}
}
