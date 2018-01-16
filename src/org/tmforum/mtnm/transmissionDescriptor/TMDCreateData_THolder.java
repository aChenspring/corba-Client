package org.tmforum.mtnm.transmissionDescriptor;

/**
 *	Generated from IDL definition of struct "TMDCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TMDCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.tmforum.mtnm.transmissionDescriptor.TMDCreateData_T value;

	public TMDCreateData_THolder ()
	{
	}
	public TMDCreateData_THolder(final org.tmforum.mtnm.transmissionDescriptor.TMDCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.tmforum.mtnm.transmissionDescriptor.TMDCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.tmforum.mtnm.transmissionDescriptor.TMDCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.tmforum.mtnm.transmissionDescriptor.TMDCreateData_THelper.write(_out, value);
	}
}
