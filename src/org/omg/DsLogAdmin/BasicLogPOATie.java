package org.omg.DsLogAdmin;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "BasicLog"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class BasicLogPOATie
	extends BasicLogPOA
{
	private BasicLogOperations _delegate;

	private POA _poa;
	public BasicLogPOATie(BasicLogOperations delegate)
	{
		_delegate = delegate;
	}
	public BasicLogPOATie(BasicLogOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.DsLogAdmin.BasicLog _this()
	{
		return org.omg.DsLogAdmin.BasicLogHelper.narrow(_this_object());
	}
	public org.omg.DsLogAdmin.BasicLog _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.DsLogAdmin.BasicLogHelper.narrow(_this_object(orb));
	}
	public BasicLogOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(BasicLogOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public long get_max_size()
	{
		return _delegate.get_max_size();
	}

	public int id()
	{
		return _delegate.id();
	}

	public org.omg.DsLogAdmin.AdministrativeState get_administrative_state()
	{
		return _delegate.get_administrative_state();
	}

	public int set_records_attribute(java.lang.String grammar, java.lang.String c, org.omg.DsLogAdmin.NVPair[] attr_list) throws org.omg.DsLogAdmin.InvalidConstraint,org.omg.DsLogAdmin.InvalidGrammar,org.omg.DsLogAdmin.InvalidAttribute
	{
		return _delegate.set_records_attribute(grammar,c,attr_list);
	}

	public int delete_records_by_id(long[] ids)
	{
		return _delegate.delete_records_by_id(ids);
	}

	public int match(java.lang.String grammar, java.lang.String c) throws org.omg.DsLogAdmin.InvalidConstraint,org.omg.DsLogAdmin.InvalidGrammar
	{
		return _delegate.match(grammar,c);
	}

	public org.omg.DsLogAdmin.ForwardingState get_forwarding_state()
	{
		return _delegate.get_forwarding_state();
	}

	public org.omg.DsLogAdmin.TimeInterval get_interval()
	{
		return _delegate.get_interval();
	}

	public void set_log_full_action(short action) throws org.omg.DsLogAdmin.InvalidLogFullAction
	{
_delegate.set_log_full_action(action);
	}

	public void set_administrative_state(org.omg.DsLogAdmin.AdministrativeState state)
	{
_delegate.set_administrative_state(state);
	}

	public org.omg.DsLogAdmin.LogMgr my_factory()
	{
		return _delegate.my_factory();
	}

	public org.omg.DsLogAdmin.NVPair[] get_record_attribute(long id) throws org.omg.DsLogAdmin.InvalidRecordId
	{
		return _delegate.get_record_attribute(id);
	}

	public long get_current_size()
	{
		return _delegate.get_current_size();
	}

	public org.omg.DsLogAdmin.LogRecord[] query(java.lang.String grammar, java.lang.String c, org.omg.DsLogAdmin.IteratorHolder i) throws org.omg.DsLogAdmin.InvalidConstraint,org.omg.DsLogAdmin.InvalidGrammar
	{
		return _delegate.query(grammar,c,i);
	}

	public void set_max_size(long size) throws org.omg.DsLogAdmin.InvalidParam
	{
_delegate.set_max_size(size);
	}

	public void set_log_qos(short[] qos) throws org.omg.DsLogAdmin.UnsupportedQoS
	{
_delegate.set_log_qos(qos);
	}

	public void set_week_mask(org.omg.DsLogAdmin.WeekMaskItem[] masks) throws org.omg.DsLogAdmin.InvalidMask,org.omg.DsLogAdmin.InvalidTimeInterval,org.omg.DsLogAdmin.InvalidTime
	{
_delegate.set_week_mask(masks);
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public void set_max_record_life(int life)
	{
_delegate.set_max_record_life(life);
	}

	public org.omg.DsLogAdmin.LogRecord[] retrieve(long from_time, int how_many, org.omg.DsLogAdmin.IteratorHolder i)
	{
		return _delegate.retrieve(from_time,how_many,i);
	}

	public void set_record_attribute(long id, org.omg.DsLogAdmin.NVPair[] attr_list) throws org.omg.DsLogAdmin.InvalidAttribute,org.omg.DsLogAdmin.InvalidRecordId
	{
_delegate.set_record_attribute(id,attr_list);
	}

	public void set_interval(org.omg.DsLogAdmin.TimeInterval interval) throws org.omg.DsLogAdmin.InvalidTimeInterval,org.omg.DsLogAdmin.InvalidTime
	{
_delegate.set_interval(interval);
	}

	public void flush() throws org.omg.DsLogAdmin.UnsupportedQoS
	{
_delegate.flush();
	}

	public void set_forwarding_state(org.omg.DsLogAdmin.ForwardingState state)
	{
_delegate.set_forwarding_state(state);
	}

	public short[] get_capacity_alarm_thresholds()
	{
		return _delegate.get_capacity_alarm_thresholds();
	}

	public int delete_records(java.lang.String grammar, java.lang.String c) throws org.omg.DsLogAdmin.InvalidConstraint,org.omg.DsLogAdmin.InvalidGrammar
	{
		return _delegate.delete_records(grammar,c);
	}

	public org.omg.DsLogAdmin.Log copy(org.omg.CORBA.IntHolder id)
	{
		return _delegate.copy(id);
	}

	public org.omg.DsLogAdmin.AvailabilityStatus get_availability_status()
	{
		return _delegate.get_availability_status();
	}

	public int get_max_record_life()
	{
		return _delegate.get_max_record_life();
	}

	public org.omg.DsLogAdmin.WeekMaskItem[] get_week_mask()
	{
		return _delegate.get_week_mask();
	}

	public short[] get_log_qos()
	{
		return _delegate.get_log_qos();
	}

	public void write_records(org.omg.CORBA.Any[] records) throws org.omg.DsLogAdmin.LogDisabled,org.omg.DsLogAdmin.LogOffDuty,org.omg.DsLogAdmin.LogLocked,org.omg.DsLogAdmin.LogFull
	{
_delegate.write_records(records);
	}

	public org.omg.DsLogAdmin.Log copy_with_id(int id) throws org.omg.DsLogAdmin.LogIdAlreadyExists
	{
		return _delegate.copy_with_id(id);
	}

	public org.omg.DsLogAdmin.OperationalState get_operational_state()
	{
		return _delegate.get_operational_state();
	}

	public void set_capacity_alarm_thresholds(short[] threshs) throws org.omg.DsLogAdmin.InvalidThreshold
	{
_delegate.set_capacity_alarm_thresholds(threshs);
	}

	public short get_log_full_action()
	{
		return _delegate.get_log_full_action();
	}

	public long get_n_records()
	{
		return _delegate.get_n_records();
	}

}
