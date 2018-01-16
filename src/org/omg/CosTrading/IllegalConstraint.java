package org.omg.CosTrading;

/**
 *	Generated from IDL definition of exception "IllegalConstraint"
 *	@author JacORB IDL compiler 
 */

public final class IllegalConstraint
	extends org.omg.CORBA.UserException
{
	public IllegalConstraint()
	{
		super(org.omg.CosTrading.IllegalConstraintHelper.id());
	}

	public java.lang.String constr;
	public IllegalConstraint(java.lang.String _reason,java.lang.String constr)
	{
		super(org.omg.CosTrading.IllegalConstraintHelper.id()+ " " + _reason);
		this.constr = constr;
	}
	public IllegalConstraint(java.lang.String constr)
	{
		super(org.omg.CosTrading.IllegalConstraintHelper.id());
		this.constr = constr;
	}
}
