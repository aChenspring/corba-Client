package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of exception "InvalidAttribute"
 *	@author JacORB IDL compiler 
 */

public final class InvalidAttribute
	extends org.omg.CORBA.UserException
{
	public InvalidAttribute()
	{
		super(org.omg.DsLogAdmin.InvalidAttributeHelper.id());
	}

	public java.lang.String attr_name = "";
	public org.omg.CORBA.Any value;
	public InvalidAttribute(java.lang.String _reason,java.lang.String attr_name, org.omg.CORBA.Any value)
	{
		super(org.omg.DsLogAdmin.InvalidAttributeHelper.id()+ " " + _reason);
		this.attr_name = attr_name;
		this.value = value;
	}
	public InvalidAttribute(java.lang.String attr_name, org.omg.CORBA.Any value)
	{
		super(org.omg.DsLogAdmin.InvalidAttributeHelper.id());
		this.attr_name = attr_name;
		this.value = value;
	}
}
