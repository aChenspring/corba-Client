package org.omg.CosNotifyComm;

/**
 *	Generated from IDL interface "StructuredPullSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class StructuredPullSupplierPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosNotifyComm.StructuredPullSupplierOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "subscription_change", new java.lang.Integer(0));
		m_opsHash.put ( "disconnect_structured_pull_supplier", new java.lang.Integer(1));
		m_opsHash.put ( "pull_structured_event", new java.lang.Integer(2));
		m_opsHash.put ( "try_pull_structured_event", new java.lang.Integer(3));
	}
	private String[] ids = {"IDL:omg.org/CosNotifyComm/StructuredPullSupplier:1.0","IDL:omg.org/CosNotifyComm/NotifySubscribe:1.0"};
	public org.omg.CosNotifyComm.StructuredPullSupplier _this()
	{
		return org.omg.CosNotifyComm.StructuredPullSupplierHelper.narrow(_this_object());
	}
	public org.omg.CosNotifyComm.StructuredPullSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotifyComm.StructuredPullSupplierHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // subscription_change
			{
			try
			{
				org.omg.CosNotification.EventType[] _arg0=org.omg.CosNotification.EventTypeSeqHelper.read(_input);
				org.omg.CosNotification.EventType[] _arg1=org.omg.CosNotification.EventTypeSeqHelper.read(_input);
				_out = handler.createReply();
				subscription_change(_arg0,_arg1);
			}
			catch(org.omg.CosNotifyComm.InvalidEventType _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyComm.InvalidEventTypeHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // disconnect_structured_pull_supplier
			{
				_out = handler.createReply();
				disconnect_structured_pull_supplier();
				break;
			}
			case 2: // pull_structured_event
			{
			try
			{
				_out = handler.createReply();
				org.omg.CosNotification.StructuredEventHelper.write(_out,pull_structured_event());
			}
			catch(org.omg.CosEventComm.Disconnected _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosEventComm.DisconnectedHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // try_pull_structured_event
			{
			try
			{
				org.omg.CORBA.BooleanHolder _arg0= new org.omg.CORBA.BooleanHolder();
				_out = handler.createReply();
				org.omg.CosNotification.StructuredEventHelper.write(_out,try_pull_structured_event(_arg0));
				_out.write_boolean(_arg0.value);
			}
			catch(org.omg.CosEventComm.Disconnected _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosEventComm.DisconnectedHelper.write(_out, _ex0);
			}
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
