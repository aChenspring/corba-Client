package org.omg.DsEventLogAdmin;

/**
 *	Generated from IDL interface "EventLogFactory"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class EventLogFactoryPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.DsEventLogAdmin.EventLogFactoryOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "obtain_pull_supplier", new java.lang.Integer(0));
		m_opsHash.put ( "list_logs", new java.lang.Integer(1));
		m_opsHash.put ( "list_logs_by_id", new java.lang.Integer(2));
		m_opsHash.put ( "create", new java.lang.Integer(3));
		m_opsHash.put ( "create_with_id", new java.lang.Integer(4));
		m_opsHash.put ( "find_log", new java.lang.Integer(5));
		m_opsHash.put ( "obtain_push_supplier", new java.lang.Integer(6));
	}
	private String[] ids = {"IDL:omg.org/DsEventLogAdmin/EventLogFactory:1.0","IDL:omg.org/DsLogAdmin/LogMgr:1.0","IDL:omg.org/CosEventChannelAdmin/ConsumerAdmin:1.0"};
	public org.omg.DsEventLogAdmin.EventLogFactory _this()
	{
		return org.omg.DsEventLogAdmin.EventLogFactoryHelper.narrow(_this_object());
	}
	public org.omg.DsEventLogAdmin.EventLogFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.DsEventLogAdmin.EventLogFactoryHelper.narrow(_this_object(orb));
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
			case 0: // obtain_pull_supplier
			{
				_out = handler.createReply();
				org.omg.CosEventChannelAdmin.ProxyPullSupplierHelper.write(_out,obtain_pull_supplier());
				break;
			}
			case 1: // list_logs
			{
				_out = handler.createReply();
				org.omg.DsLogAdmin.LogListHelper.write(_out,list_logs());
				break;
			}
			case 2: // list_logs_by_id
			{
				_out = handler.createReply();
				org.omg.DsLogAdmin.LogIdListHelper.write(_out,list_logs_by_id());
				break;
			}
			case 3: // create
			{
			try
			{
				short _arg0=_input.read_ushort();
				long _arg1=_input.read_ulonglong();
				short[] _arg2=org.omg.DsLogAdmin.CapacityAlarmThresholdListHelper.read(_input);
				org.omg.CORBA.IntHolder _arg3= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				org.omg.DsEventLogAdmin.EventLogHelper.write(_out,create(_arg0,_arg1,_arg2,_arg3));
				_out.write_ulong(_arg3.value);
			}
			catch(org.omg.DsLogAdmin.InvalidThreshold _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidThresholdHelper.write(_out, _ex0);
			}
			catch(org.omg.DsLogAdmin.InvalidLogFullAction _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidLogFullActionHelper.write(_out, _ex1);
			}
				break;
			}
			case 4: // create_with_id
			{
			try
			{
				int _arg0=_input.read_ulong();
				short _arg1=_input.read_ushort();
				long _arg2=_input.read_ulonglong();
				short[] _arg3=org.omg.DsLogAdmin.CapacityAlarmThresholdListHelper.read(_input);
				_out = handler.createReply();
				org.omg.DsEventLogAdmin.EventLogHelper.write(_out,create_with_id(_arg0,_arg1,_arg2,_arg3));
			}
			catch(org.omg.DsLogAdmin.InvalidThreshold _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidThresholdHelper.write(_out, _ex0);
			}
			catch(org.omg.DsLogAdmin.LogIdAlreadyExists _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.LogIdAlreadyExistsHelper.write(_out, _ex1);
			}
			catch(org.omg.DsLogAdmin.InvalidLogFullAction _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidLogFullActionHelper.write(_out, _ex2);
			}
				break;
			}
			case 5: // find_log
			{
				int _arg0=_input.read_ulong();
				_out = handler.createReply();
				org.omg.DsLogAdmin.LogHelper.write(_out,find_log(_arg0));
				break;
			}
			case 6: // obtain_push_supplier
			{
				_out = handler.createReply();
				org.omg.CosEventChannelAdmin.ProxyPushSupplierHelper.write(_out,obtain_push_supplier());
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
