package org.tmforum.mtnm.mLSNPP;

/**
 *	Generated from IDL definition of struct "LayeredSNPP_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredSNPP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public LayeredSNPP_T(){}
	public short layerRate;
	public org.tmforum.mtnm.mLSNPP.SNPP_T[] SNPPList;
	public LayeredSNPP_T(short layerRate, org.tmforum.mtnm.mLSNPP.SNPP_T[] SNPPList)
	{
		this.layerRate = layerRate;
		this.SNPPList = SNPPList;
	}
}
