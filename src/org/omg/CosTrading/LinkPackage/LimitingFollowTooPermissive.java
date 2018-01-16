package org.omg.CosTrading.LinkPackage;

/**
 *	Generated from IDL definition of exception "LimitingFollowTooPermissive"
 *	@author JacORB IDL compiler 
 */

public final class LimitingFollowTooPermissive
	extends org.omg.CORBA.UserException
{
	public LimitingFollowTooPermissive()
	{
		super(org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissiveHelper.id());
	}

	public org.omg.CosTrading.FollowOption limiting_follow_rule;
	public org.omg.CosTrading.FollowOption max_link_follow_policy;
	public LimitingFollowTooPermissive(java.lang.String _reason,org.omg.CosTrading.FollowOption limiting_follow_rule, org.omg.CosTrading.FollowOption max_link_follow_policy)
	{
		super(org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissiveHelper.id()+ " " + _reason);
		this.limiting_follow_rule = limiting_follow_rule;
		this.max_link_follow_policy = max_link_follow_policy;
	}
	public LimitingFollowTooPermissive(org.omg.CosTrading.FollowOption limiting_follow_rule, org.omg.CosTrading.FollowOption max_link_follow_policy)
	{
		super(org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissiveHelper.id());
		this.limiting_follow_rule = limiting_follow_rule;
		this.max_link_follow_policy = max_link_follow_policy;
	}
}
