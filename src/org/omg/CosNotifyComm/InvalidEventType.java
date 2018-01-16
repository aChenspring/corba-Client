package org.omg.CosNotifyComm;

/**
 *	Generated from IDL definition of exception "InvalidEventType"
 *	@author JacORB IDL compiler 
 */

public final class InvalidEventType
	extends org.omg.CORBA.UserException
{
	public InvalidEventType()
	{
		super(org.omg.CosNotifyComm.InvalidEventTypeHelper.id());
	}

	public org.omg.CosNotification.EventType type;
	public InvalidEventType(java.lang.String _reason,org.omg.CosNotification.EventType type)
	{
		super(org.omg.CosNotifyComm.InvalidEventTypeHelper.id()+ " " + _reason);
		this.type = type;
	}
	public InvalidEventType(org.omg.CosNotification.EventType type)
	{
		super(org.omg.CosNotifyComm.InvalidEventTypeHelper.id());
		this.type = type;
	}
}
