package org.omg.CosNotifyComm;

/**
 *	Generated from IDL interface "SequencePullConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class SequencePullConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequencePullConsumer value;
	public SequencePullConsumerHolder()
	{
	}
	public SequencePullConsumerHolder (final SequencePullConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SequencePullConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequencePullConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequencePullConsumerHelper.write (_out,value);
	}
}
