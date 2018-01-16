package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of struct "LogRecord"
 *	@author JacORB IDL compiler 
 */

public final class LogRecord
	implements org.omg.CORBA.portable.IDLEntity
{
	public LogRecord(){}
	public long id;
	public long time;
	public org.omg.DsLogAdmin.NVPair[] attr_list;
	public org.omg.CORBA.Any info;
	public LogRecord(long id, long time, org.omg.DsLogAdmin.NVPair[] attr_list, org.omg.CORBA.Any info)
	{
		this.id = id;
		this.time = time;
		this.attr_list = attr_list;
		this.info = info;
	}
}
