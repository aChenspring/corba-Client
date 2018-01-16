package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of exception "LogFull"
 *	@author JacORB IDL compiler 
 */

public final class LogFull
	extends org.omg.CORBA.UserException
{
	public LogFull()
	{
		super(org.omg.DsLogAdmin.LogFullHelper.id());
	}

	public short n_records_written;
	public LogFull(java.lang.String _reason,short n_records_written)
	{
		super(org.omg.DsLogAdmin.LogFullHelper.id()+ " " + _reason);
		this.n_records_written = n_records_written;
	}
	public LogFull(short n_records_written)
	{
		super(org.omg.DsLogAdmin.LogFullHelper.id());
		this.n_records_written = n_records_written;
	}
}
