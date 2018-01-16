package org.tmforum.mtnm.notifications;

/**
 *	Generated from IDL definition of union "AlarmOrTCAIdentifier_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmOrTCAIdentifier_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private org.tmforum.mtnm.notifications.AlarmTypeQualifier_T discriminator;
	private org.tmforum.mtnm.notifications.AlarmId_T alarmId;
	private org.tmforum.mtnm.notifications.TCAId_T tcaId;

	public AlarmOrTCAIdentifier_T ()
	{
	}

	public org.tmforum.mtnm.notifications.AlarmTypeQualifier_T discriminator ()
	{
		return discriminator;
	}

	public org.tmforum.mtnm.notifications.AlarmId_T alarmId ()
	{
		if (discriminator != org.tmforum.mtnm.notifications.AlarmTypeQualifier_T.ALARM)
			throw new org.omg.CORBA.BAD_OPERATION();
		return alarmId;
	}

	public void alarmId (org.tmforum.mtnm.notifications.AlarmId_T _x)
	{
		discriminator = org.tmforum.mtnm.notifications.AlarmTypeQualifier_T.ALARM;
		alarmId = _x;
	}

	public org.tmforum.mtnm.notifications.TCAId_T tcaId ()
	{
		if (discriminator != org.tmforum.mtnm.notifications.AlarmTypeQualifier_T.TCA)
			throw new org.omg.CORBA.BAD_OPERATION();
		return tcaId;
	}

	public void tcaId (org.tmforum.mtnm.notifications.TCAId_T _x)
	{
		discriminator = org.tmforum.mtnm.notifications.AlarmTypeQualifier_T.TCA;
		tcaId = _x;
	}

}
