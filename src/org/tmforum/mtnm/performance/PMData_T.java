package org.tmforum.mtnm.performance;

/**
 *	Generated from IDL definition of struct "PMData_T"
 *	@author JacORB IDL compiler 
 */

public final class PMData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMData_T(){}
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName;
	public short layerRate;
	public java.lang.String granularity;
	public java.lang.String retrievalTime;
	public org.tmforum.mtnm.performance.PMMeasurement_T[] pmMeasurementList;
	public PMData_T(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, java.lang.String retrievalTime, org.tmforum.mtnm.performance.PMMeasurement_T[] pmMeasurementList)
	{
		this.tpName = tpName;
		this.layerRate = layerRate;
		this.granularity = granularity;
		this.retrievalTime = retrievalTime;
		this.pmMeasurementList = pmMeasurementList;
	}
}
