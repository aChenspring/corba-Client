package org.omg.CosNotifyComm;


/**
 *	Generated from IDL interface "StructuredPullConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class StructuredPullConsumerHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyComm.StructuredPullConsumer s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosNotifyComm.StructuredPullConsumer extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyComm/StructuredPullConsumer:1.0", "StructuredPullConsumer");
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyComm/StructuredPullConsumer:1.0";
	}
	public static StructuredPullConsumer read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNotifyComm.StructuredPullConsumer s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNotifyComm.StructuredPullConsumer narrow(final java.lang.Object obj)
	{
		if (obj instanceof org.omg.CosNotifyComm.StructuredPullConsumer)
		{
			return (org.omg.CosNotifyComm.StructuredPullConsumer)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static org.omg.CosNotifyComm.StructuredPullConsumer narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (org.omg.CosNotifyComm.StructuredPullConsumer)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:omg.org/CosNotifyComm/StructuredPullConsumer:1.0"))
			{
				org.omg.CosNotifyComm._StructuredPullConsumerStub stub;
				stub = new org.omg.CosNotifyComm._StructuredPullConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static org.omg.CosNotifyComm.StructuredPullConsumer unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (org.omg.CosNotifyComm.StructuredPullConsumer)obj;
		}
		catch (ClassCastException c)
		{
				org.omg.CosNotifyComm._StructuredPullConsumerStub stub;
				stub = new org.omg.CosNotifyComm._StructuredPullConsumerStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
		}
	}
}
