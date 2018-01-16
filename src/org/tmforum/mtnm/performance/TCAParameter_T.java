package org.tmforum.mtnm.performance;

/**
 *	Generated from IDL definition of struct "TCAParameter_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAParameter_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TCAParameter_T(){}
	public java.lang.String pmParameterName;
	public java.lang.String granularity;
	public java.lang.String pmLocation;
	public org.tmforum.mtnm.performance.PMThresholdType_T thresholdType;
	public boolean triggerFlag;
	public float value;
	public java.lang.String unit = "";
	public TCAParameter_T(java.lang.String pmParameterName, java.lang.String granularity, java.lang.String pmLocation, org.tmforum.mtnm.performance.PMThresholdType_T thresholdType, boolean triggerFlag, float value, java.lang.String unit)
	{
		this.pmParameterName = pmParameterName;
		this.granularity = granularity;
		this.pmLocation = pmLocation;
		this.thresholdType = thresholdType;
		this.triggerFlag = triggerFlag;
		this.value = value;
		this.unit = unit;
	}
}
