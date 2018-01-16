package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of exception "UnsupportedQoS"
 *	@author JacORB IDL compiler 
 */

public final class UnsupportedQoS
	extends org.omg.CORBA.UserException
{
	public UnsupportedQoS()
	{
		super(org.omg.DsLogAdmin.UnsupportedQoSHelper.id());
	}

	public short[] denied;
	public UnsupportedQoS(java.lang.String _reason,short[] denied)
	{
		super(org.omg.DsLogAdmin.UnsupportedQoSHelper.id()+ " " + _reason);
		this.denied = denied;
	}
	public UnsupportedQoS(short[] denied)
	{
		super(org.omg.DsLogAdmin.UnsupportedQoSHelper.id());
		this.denied = denied;
	}
}
