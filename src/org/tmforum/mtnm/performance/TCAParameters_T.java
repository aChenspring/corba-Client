package org.tmforum.mtnm.performance;

/**
 *	Generated from IDL definition of struct "TCAParameters_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAParameters_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TCAParameters_T(){}
	public short layerRate;
	public java.lang.String granularity;
	public org.tmforum.mtnm.performance.PMThresholdValue_T[] tcaTypeValues;
	public TCAParameters_T(short layerRate, java.lang.String granularity, org.tmforum.mtnm.performance.PMThresholdValue_T[] tcaTypeValues)
	{
		this.layerRate = layerRate;
		this.granularity = granularity;
		this.tcaTypeValues = tcaTypeValues;
	}
}
