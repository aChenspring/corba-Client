package org.tmforum.mtnm.softwareAndDataManager;


/**
 *	Generated from IDL definition of struct "BackupId_T"
 *	@author JacORB IDL compiler 
 */

public final class BackupId_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.softwareAndDataManager.BackupId_THelper.id(),"BackupId_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("meName", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("backupTime", org.tmforum.mtnm.globaldefs.Time_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.softwareAndDataManager.BackupId_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.softwareAndDataManager.BackupId_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/softwareAndDataManager/BackupId_T:1.0";
	}
	public static org.tmforum.mtnm.softwareAndDataManager.BackupId_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.softwareAndDataManager.BackupId_T result = new org.tmforum.mtnm.softwareAndDataManager.BackupId_T();
		result.meName = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.backupTime=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.softwareAndDataManager.BackupId_T s)
	{
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.meName);
		out.write_string(s.backupTime);
	}
}
