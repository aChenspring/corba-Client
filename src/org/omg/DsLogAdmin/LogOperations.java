package org.omg.DsLogAdmin;

/**
 *	Generated from IDL interface "Log"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface LogOperations
{
	/* constants */
	/* operations  */
	org.omg.DsLogAdmin.LogMgr my_factory();
	int id();
	short[] get_log_qos();
	void set_log_qos(short[] qos) throws org.omg.DsLogAdmin.UnsupportedQoS;
	int get_max_record_life();
	void set_max_record_life(int life);
	long get_max_size();
	void set_max_size(long size) throws org.omg.DsLogAdmin.InvalidParam;
	long get_current_size();
	long get_n_records();
	short get_log_full_action();
	void set_log_full_action(short action) throws org.omg.DsLogAdmin.InvalidLogFullAction;
	org.omg.DsLogAdmin.AdministrativeState get_administrative_state();
	void set_administrative_state(org.omg.DsLogAdmin.AdministrativeState state);
	org.omg.DsLogAdmin.ForwardingState get_forwarding_state();
	void set_forwarding_state(org.omg.DsLogAdmin.ForwardingState state);
	org.omg.DsLogAdmin.OperationalState get_operational_state();
	org.omg.DsLogAdmin.TimeInterval get_interval();
	void set_interval(org.omg.DsLogAdmin.TimeInterval interval) throws org.omg.DsLogAdmin.InvalidTimeInterval,org.omg.DsLogAdmin.InvalidTime;
	org.omg.DsLogAdmin.AvailabilityStatus get_availability_status();
	short[] get_capacity_alarm_thresholds();
	void set_capacity_alarm_thresholds(short[] threshs) throws org.omg.DsLogAdmin.InvalidThreshold;
	org.omg.DsLogAdmin.WeekMaskItem[] get_week_mask();
	void set_week_mask(org.omg.DsLogAdmin.WeekMaskItem[] masks) throws org.omg.DsLogAdmin.InvalidMask,org.omg.DsLogAdmin.InvalidTimeInterval,org.omg.DsLogAdmin.InvalidTime;
	org.omg.DsLogAdmin.LogRecord[] query(java.lang.String grammar, java.lang.String c, org.omg.DsLogAdmin.IteratorHolder i) throws org.omg.DsLogAdmin.InvalidConstraint,org.omg.DsLogAdmin.InvalidGrammar;
	org.omg.DsLogAdmin.LogRecord[] retrieve(long from_time, int how_many, org.omg.DsLogAdmin.IteratorHolder i);
	int match(java.lang.String grammar, java.lang.String c) throws org.omg.DsLogAdmin.InvalidConstraint,org.omg.DsLogAdmin.InvalidGrammar;
	int delete_records(java.lang.String grammar, java.lang.String c) throws org.omg.DsLogAdmin.InvalidConstraint,org.omg.DsLogAdmin.InvalidGrammar;
	int delete_records_by_id(long[] ids);
	void write_records(org.omg.CORBA.Any[] records) throws org.omg.DsLogAdmin.LogDisabled,org.omg.DsLogAdmin.LogOffDuty,org.omg.DsLogAdmin.LogLocked,org.omg.DsLogAdmin.LogFull;
	void set_record_attribute(long id, org.omg.DsLogAdmin.NVPair[] attr_list) throws org.omg.DsLogAdmin.InvalidAttribute,org.omg.DsLogAdmin.InvalidRecordId;
	int set_records_attribute(java.lang.String grammar, java.lang.String c, org.omg.DsLogAdmin.NVPair[] attr_list) throws org.omg.DsLogAdmin.InvalidConstraint,org.omg.DsLogAdmin.InvalidGrammar,org.omg.DsLogAdmin.InvalidAttribute;
	org.omg.DsLogAdmin.NVPair[] get_record_attribute(long id) throws org.omg.DsLogAdmin.InvalidRecordId;
	org.omg.DsLogAdmin.Log copy(org.omg.CORBA.IntHolder id);
	org.omg.DsLogAdmin.Log copy_with_id(int id) throws org.omg.DsLogAdmin.LogIdAlreadyExists;
	void flush() throws org.omg.DsLogAdmin.UnsupportedQoS;
}
