package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of struct "NVPair"
 *	@author JacORB IDL compiler 
 */

public final class NVPair
	implements org.omg.CORBA.portable.IDLEntity
{
	public NVPair(){}
	public java.lang.String name = "";
	public org.omg.CORBA.Any value;
	public NVPair(java.lang.String name, org.omg.CORBA.Any value)
	{
		this.name = name;
		this.value = value;
	}
}
