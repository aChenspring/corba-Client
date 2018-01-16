package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of exception "InvalidParam"
 *	@author JacORB IDL compiler 
 */

public final class InvalidParam
	extends org.omg.CORBA.UserException
{
	public InvalidParam()
	{
		super(org.omg.DsLogAdmin.InvalidParamHelper.id());
	}

	public java.lang.String details = "";
	public InvalidParam(java.lang.String _reason,java.lang.String details)
	{
		super(org.omg.DsLogAdmin.InvalidParamHelper.id()+ " " + _reason);
		this.details = details;
	}
	public InvalidParam(java.lang.String details)
	{
		super(org.omg.DsLogAdmin.InvalidParamHelper.id());
		this.details = details;
	}
}
