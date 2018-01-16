package org.tmforum.mtnm.notifications;

/**
 *	Generated from IDL definition of struct "TCAId_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAId_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TCAId_T(){}
	public org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName;
	public short layerRate;
	public java.lang.String pmParameterName;
	public java.lang.String pmLocation;
	public java.lang.String granularity;
	public TCAId_T(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, short layerRate, java.lang.String pmParameterName, java.lang.String pmLocation, java.lang.String granularity)
	{
		this.objectName = objectName;
		this.layerRate = layerRate;
		this.pmParameterName = pmParameterName;
		this.pmLocation = pmLocation;
		this.granularity = granularity;
	}
}
