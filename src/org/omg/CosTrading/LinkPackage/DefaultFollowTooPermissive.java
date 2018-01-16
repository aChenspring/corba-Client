package org.omg.CosTrading.LinkPackage;

/**
 *	Generated from IDL definition of exception "DefaultFollowTooPermissive"
 *	@author JacORB IDL compiler 
 */

public final class DefaultFollowTooPermissive
	extends org.omg.CORBA.UserException
{
	public DefaultFollowTooPermissive()
	{
		super(org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissiveHelper.id());
	}

	public org.omg.CosTrading.FollowOption def_pass_on_follow_rule;
	public org.omg.CosTrading.FollowOption limiting_follow_rule;
	public DefaultFollowTooPermissive(java.lang.String _reason,org.omg.CosTrading.FollowOption def_pass_on_follow_rule, org.omg.CosTrading.FollowOption limiting_follow_rule)
	{
		super(org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissiveHelper.id()+ " " + _reason);
		this.def_pass_on_follow_rule = def_pass_on_follow_rule;
		this.limiting_follow_rule = limiting_follow_rule;
	}
	public DefaultFollowTooPermissive(org.omg.CosTrading.FollowOption def_pass_on_follow_rule, org.omg.CosTrading.FollowOption limiting_follow_rule)
	{
		super(org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissiveHelper.id());
		this.def_pass_on_follow_rule = def_pass_on_follow_rule;
		this.limiting_follow_rule = limiting_follow_rule;
	}
}
