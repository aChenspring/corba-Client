package org.omg.DsLogAdmin;

/**
 *	Generated from IDL definition of alias "QoSList"
 *	@author JacORB IDL compiler 
 */

public final class QoSListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public short[] value;

	public QoSListHolder ()
	{
	}
	public QoSListHolder (final short[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return QoSListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = QoSListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		QoSListHelper.write (out,value);
	}
}
