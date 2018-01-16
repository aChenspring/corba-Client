package org.omg.CosNotifyFilter;

/**
 *	Generated from IDL definition of struct "MappingConstraintInfo"
 *	@author JacORB IDL compiler 
 */

public final class MappingConstraintInfo
	implements org.omg.CORBA.portable.IDLEntity
{
	public MappingConstraintInfo(){}
	public org.omg.CosNotifyFilter.ConstraintExp constraint_expression;
	public int constraint_id;
	public org.omg.CORBA.Any value;
	public MappingConstraintInfo(org.omg.CosNotifyFilter.ConstraintExp constraint_expression, int constraint_id, org.omg.CORBA.Any value)
	{
		this.constraint_expression = constraint_expression;
		this.constraint_id = constraint_id;
		this.value = value;
	}
}
