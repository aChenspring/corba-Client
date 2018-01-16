package org.omg.DsLogAdmin;

/**
 *	Generated from IDL interface "BasicLog"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class BasicLogPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.DsLogAdmin.BasicLogOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "get_max_size", new java.lang.Integer(0));
		m_opsHash.put ( "id", new java.lang.Integer(1));
		m_opsHash.put ( "get_administrative_state", new java.lang.Integer(2));
		m_opsHash.put ( "set_records_attribute", new java.lang.Integer(3));
		m_opsHash.put ( "delete_records_by_id", new java.lang.Integer(4));
		m_opsHash.put ( "match", new java.lang.Integer(5));
		m_opsHash.put ( "get_forwarding_state", new java.lang.Integer(6));
		m_opsHash.put ( "get_interval", new java.lang.Integer(7));
		m_opsHash.put ( "set_log_full_action", new java.lang.Integer(8));
		m_opsHash.put ( "set_administrative_state", new java.lang.Integer(9));
		m_opsHash.put ( "my_factory", new java.lang.Integer(10));
		m_opsHash.put ( "get_record_attribute", new java.lang.Integer(11));
		m_opsHash.put ( "get_current_size", new java.lang.Integer(12));
		m_opsHash.put ( "query", new java.lang.Integer(13));
		m_opsHash.put ( "set_max_size", new java.lang.Integer(14));
		m_opsHash.put ( "set_log_qos", new java.lang.Integer(15));
		m_opsHash.put ( "set_week_mask", new java.lang.Integer(16));
		m_opsHash.put ( "destroy", new java.lang.Integer(17));
		m_opsHash.put ( "set_max_record_life", new java.lang.Integer(18));
		m_opsHash.put ( "retrieve", new java.lang.Integer(19));
		m_opsHash.put ( "set_record_attribute", new java.lang.Integer(20));
		m_opsHash.put ( "set_interval", new java.lang.Integer(21));
		m_opsHash.put ( "flush", new java.lang.Integer(22));
		m_opsHash.put ( "set_forwarding_state", new java.lang.Integer(23));
		m_opsHash.put ( "get_capacity_alarm_thresholds", new java.lang.Integer(24));
		m_opsHash.put ( "delete_records", new java.lang.Integer(25));
		m_opsHash.put ( "copy", new java.lang.Integer(26));
		m_opsHash.put ( "get_availability_status", new java.lang.Integer(27));
		m_opsHash.put ( "get_max_record_life", new java.lang.Integer(28));
		m_opsHash.put ( "get_week_mask", new java.lang.Integer(29));
		m_opsHash.put ( "get_log_qos", new java.lang.Integer(30));
		m_opsHash.put ( "write_records", new java.lang.Integer(31));
		m_opsHash.put ( "copy_with_id", new java.lang.Integer(32));
		m_opsHash.put ( "get_operational_state", new java.lang.Integer(33));
		m_opsHash.put ( "set_capacity_alarm_thresholds", new java.lang.Integer(34));
		m_opsHash.put ( "get_log_full_action", new java.lang.Integer(35));
		m_opsHash.put ( "get_n_records", new java.lang.Integer(36));
	}
	private String[] ids = {"IDL:omg.org/DsLogAdmin/BasicLog:1.0","IDL:omg.org/DsLogAdmin/Log:1.0"};
	public org.omg.DsLogAdmin.BasicLog _this()
	{
		return org.omg.DsLogAdmin.BasicLogHelper.narrow(_this_object());
	}
	public org.omg.DsLogAdmin.BasicLog _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.DsLogAdmin.BasicLogHelper.narrow(_this_object(orb));
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
			case 0: // get_max_size
			{
				_out = handler.createReply();
				_out.write_ulonglong(get_max_size());
				break;
			}
			case 1: // id
			{
				_out = handler.createReply();
				_out.write_ulong(id());
				break;
			}
			case 2: // get_administrative_state
			{
				_out = handler.createReply();
				org.omg.DsLogAdmin.AdministrativeStateHelper.write(_out,get_administrative_state());
				break;
			}
			case 3: // set_records_attribute
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				org.omg.DsLogAdmin.NVPair[] _arg2=org.omg.DsLogAdmin.NVListHelper.read(_input);
				_out = handler.createReply();
				_out.write_ulong(set_records_attribute(_arg0,_arg1,_arg2));
			}
			catch(org.omg.DsLogAdmin.InvalidConstraint _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidConstraintHelper.write(_out, _ex0);
			}
			catch(org.omg.DsLogAdmin.InvalidGrammar _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidGrammarHelper.write(_out, _ex1);
			}
			catch(org.omg.DsLogAdmin.InvalidAttribute _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidAttributeHelper.write(_out, _ex2);
			}
				break;
			}
			case 4: // delete_records_by_id
			{
				long[] _arg0=org.omg.DsLogAdmin.RecordIdListHelper.read(_input);
				_out = handler.createReply();
				_out.write_ulong(delete_records_by_id(_arg0));
				break;
			}
			case 5: // match
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				_out.write_ulong(match(_arg0,_arg1));
			}
			catch(org.omg.DsLogAdmin.InvalidConstraint _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidConstraintHelper.write(_out, _ex0);
			}
			catch(org.omg.DsLogAdmin.InvalidGrammar _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidGrammarHelper.write(_out, _ex1);
			}
				break;
			}
			case 6: // get_forwarding_state
			{
				_out = handler.createReply();
				org.omg.DsLogAdmin.ForwardingStateHelper.write(_out,get_forwarding_state());
				break;
			}
			case 7: // get_interval
			{
				_out = handler.createReply();
				org.omg.DsLogAdmin.TimeIntervalHelper.write(_out,get_interval());
				break;
			}
			case 8: // set_log_full_action
			{
			try
			{
				short _arg0=_input.read_ushort();
				_out = handler.createReply();
				set_log_full_action(_arg0);
			}
			catch(org.omg.DsLogAdmin.InvalidLogFullAction _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidLogFullActionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // set_administrative_state
			{
				org.omg.DsLogAdmin.AdministrativeState _arg0=org.omg.DsLogAdmin.AdministrativeStateHelper.read(_input);
				_out = handler.createReply();
				set_administrative_state(_arg0);
				break;
			}
			case 10: // my_factory
			{
				_out = handler.createReply();
				org.omg.DsLogAdmin.LogMgrHelper.write(_out,my_factory());
				break;
			}
			case 11: // get_record_attribute
			{
			try
			{
				long _arg0=_input.read_ulonglong();
				_out = handler.createReply();
				org.omg.DsLogAdmin.NVListHelper.write(_out,get_record_attribute(_arg0));
			}
			catch(org.omg.DsLogAdmin.InvalidRecordId _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidRecordIdHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // get_current_size
			{
				_out = handler.createReply();
				_out.write_ulonglong(get_current_size());
				break;
			}
			case 13: // query
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				org.omg.DsLogAdmin.IteratorHolder _arg2= new org.omg.DsLogAdmin.IteratorHolder();
				_out = handler.createReply();
				org.omg.DsLogAdmin.RecordListHelper.write(_out,query(_arg0,_arg1,_arg2));
				org.omg.DsLogAdmin.IteratorHelper.write(_out,_arg2.value);
			}
			catch(org.omg.DsLogAdmin.InvalidConstraint _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidConstraintHelper.write(_out, _ex0);
			}
			catch(org.omg.DsLogAdmin.InvalidGrammar _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidGrammarHelper.write(_out, _ex1);
			}
				break;
			}
			case 14: // set_max_size
			{
			try
			{
				long _arg0=_input.read_ulonglong();
				_out = handler.createReply();
				set_max_size(_arg0);
			}
			catch(org.omg.DsLogAdmin.InvalidParam _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidParamHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // set_log_qos
			{
			try
			{
				short[] _arg0=org.omg.DsLogAdmin.QoSListHelper.read(_input);
				_out = handler.createReply();
				set_log_qos(_arg0);
			}
			catch(org.omg.DsLogAdmin.UnsupportedQoS _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.UnsupportedQoSHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // set_week_mask
			{
			try
			{
				org.omg.DsLogAdmin.WeekMaskItem[] _arg0=org.omg.DsLogAdmin.WeekMaskHelper.read(_input);
				_out = handler.createReply();
				set_week_mask(_arg0);
			}
			catch(org.omg.DsLogAdmin.InvalidMask _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidMaskHelper.write(_out, _ex0);
			}
			catch(org.omg.DsLogAdmin.InvalidTimeInterval _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidTimeIntervalHelper.write(_out, _ex1);
			}
			catch(org.omg.DsLogAdmin.InvalidTime _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidTimeHelper.write(_out, _ex2);
			}
				break;
			}
			case 17: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 18: // set_max_record_life
			{
				int _arg0=_input.read_ulong();
				_out = handler.createReply();
				set_max_record_life(_arg0);
				break;
			}
			case 19: // retrieve
			{
				long _arg0=_input.read_ulonglong();
				int _arg1=_input.read_long();
				org.omg.DsLogAdmin.IteratorHolder _arg2= new org.omg.DsLogAdmin.IteratorHolder();
				_out = handler.createReply();
				org.omg.DsLogAdmin.RecordListHelper.write(_out,retrieve(_arg0,_arg1,_arg2));
				org.omg.DsLogAdmin.IteratorHelper.write(_out,_arg2.value);
				break;
			}
			case 20: // set_record_attribute
			{
			try
			{
				long _arg0=_input.read_ulonglong();
				org.omg.DsLogAdmin.NVPair[] _arg1=org.omg.DsLogAdmin.NVListHelper.read(_input);
				_out = handler.createReply();
				set_record_attribute(_arg0,_arg1);
			}
			catch(org.omg.DsLogAdmin.InvalidAttribute _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidAttributeHelper.write(_out, _ex0);
			}
			catch(org.omg.DsLogAdmin.InvalidRecordId _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidRecordIdHelper.write(_out, _ex1);
			}
				break;
			}
			case 21: // set_interval
			{
			try
			{
				org.omg.DsLogAdmin.TimeInterval _arg0=org.omg.DsLogAdmin.TimeIntervalHelper.read(_input);
				_out = handler.createReply();
				set_interval(_arg0);
			}
			catch(org.omg.DsLogAdmin.InvalidTimeInterval _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidTimeIntervalHelper.write(_out, _ex0);
			}
			catch(org.omg.DsLogAdmin.InvalidTime _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidTimeHelper.write(_out, _ex1);
			}
				break;
			}
			case 22: // flush
			{
			try
			{
				_out = handler.createReply();
				flush();
			}
			catch(org.omg.DsLogAdmin.UnsupportedQoS _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.UnsupportedQoSHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // set_forwarding_state
			{
				org.omg.DsLogAdmin.ForwardingState _arg0=org.omg.DsLogAdmin.ForwardingStateHelper.read(_input);
				_out = handler.createReply();
				set_forwarding_state(_arg0);
				break;
			}
			case 24: // get_capacity_alarm_thresholds
			{
				_out = handler.createReply();
				org.omg.DsLogAdmin.CapacityAlarmThresholdListHelper.write(_out,get_capacity_alarm_thresholds());
				break;
			}
			case 25: // delete_records
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				_out.write_ulong(delete_records(_arg0,_arg1));
			}
			catch(org.omg.DsLogAdmin.InvalidConstraint _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidConstraintHelper.write(_out, _ex0);
			}
			catch(org.omg.DsLogAdmin.InvalidGrammar _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidGrammarHelper.write(_out, _ex1);
			}
				break;
			}
			case 26: // copy
			{
				org.omg.CORBA.IntHolder _arg0= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				org.omg.DsLogAdmin.LogHelper.write(_out,copy(_arg0));
				_out.write_ulong(_arg0.value);
				break;
			}
			case 27: // get_availability_status
			{
				_out = handler.createReply();
				org.omg.DsLogAdmin.AvailabilityStatusHelper.write(_out,get_availability_status());
				break;
			}
			case 28: // get_max_record_life
			{
				_out = handler.createReply();
				_out.write_ulong(get_max_record_life());
				break;
			}
			case 29: // get_week_mask
			{
				_out = handler.createReply();
				org.omg.DsLogAdmin.WeekMaskHelper.write(_out,get_week_mask());
				break;
			}
			case 30: // get_log_qos
			{
				_out = handler.createReply();
				org.omg.DsLogAdmin.QoSListHelper.write(_out,get_log_qos());
				break;
			}
			case 31: // write_records
			{
			try
			{
				org.omg.CORBA.Any[] _arg0=org.omg.DsLogAdmin.AnysHelper.read(_input);
				_out = handler.createReply();
				write_records(_arg0);
			}
			catch(org.omg.DsLogAdmin.LogDisabled _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.LogDisabledHelper.write(_out, _ex0);
			}
			catch(org.omg.DsLogAdmin.LogOffDuty _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.LogOffDutyHelper.write(_out, _ex1);
			}
			catch(org.omg.DsLogAdmin.LogLocked _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.LogLockedHelper.write(_out, _ex2);
			}
			catch(org.omg.DsLogAdmin.LogFull _ex3)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.LogFullHelper.write(_out, _ex3);
			}
				break;
			}
			case 32: // copy_with_id
			{
			try
			{
				int _arg0=_input.read_ulong();
				_out = handler.createReply();
				org.omg.DsLogAdmin.LogHelper.write(_out,copy_with_id(_arg0));
			}
			catch(org.omg.DsLogAdmin.LogIdAlreadyExists _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.LogIdAlreadyExistsHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // get_operational_state
			{
				_out = handler.createReply();
				org.omg.DsLogAdmin.OperationalStateHelper.write(_out,get_operational_state());
				break;
			}
			case 34: // set_capacity_alarm_thresholds
			{
			try
			{
				short[] _arg0=org.omg.DsLogAdmin.CapacityAlarmThresholdListHelper.read(_input);
				_out = handler.createReply();
				set_capacity_alarm_thresholds(_arg0);
			}
			catch(org.omg.DsLogAdmin.InvalidThreshold _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidThresholdHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // get_log_full_action
			{
				_out = handler.createReply();
				_out.write_ushort(get_log_full_action());
				break;
			}
			case 36: // get_n_records
			{
				_out = handler.createReply();
				_out.write_ulonglong(get_n_records());
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
