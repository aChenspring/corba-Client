package org.omg.CosNaming;

/**
 *	Generated from IDL definition of struct "Binding"
 *	@author JacORB IDL compiler 
 */

public final class Binding
	implements org.omg.CORBA.portable.IDLEntity
{
	public Binding(){}
	public org.omg.CosNaming.NameComponent[] binding_name;
	public org.omg.CosNaming.BindingType binding_type;
	public Binding(org.omg.CosNaming.NameComponent[] binding_name, org.omg.CosNaming.BindingType binding_type)
	{
		this.binding_name = binding_name;
		this.binding_type = binding_type;
	}
}
