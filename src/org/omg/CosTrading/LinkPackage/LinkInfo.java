package org.omg.CosTrading.LinkPackage;

/**
 *	Generated from IDL definition of struct "LinkInfo"
 *	@author JacORB IDL compiler 
 */

public final class LinkInfo
	implements org.omg.CORBA.portable.IDLEntity
{
	public LinkInfo(){}
	public org.omg.CosTrading.Lookup target;
	public org.omg.CosTrading.Register target_reg;
	public org.omg.CosTrading.FollowOption def_pass_on_follow_rule;
	public org.omg.CosTrading.FollowOption limiting_follow_rule;
	public LinkInfo(org.omg.CosTrading.Lookup target, org.omg.CosTrading.Register target_reg, org.omg.CosTrading.FollowOption def_pass_on_follow_rule, org.omg.CosTrading.FollowOption limiting_follow_rule)
	{
		this.target = target;
		this.target_reg = target_reg;
		this.def_pass_on_follow_rule = def_pass_on_follow_rule;
		this.limiting_follow_rule = limiting_follow_rule;
	}
}
