package org.tmforum.mtnm.maintenanceOps;


/**
 *	Generated from IDL definition of struct "CurrentMaintenanceOperation_T"
 *	@author JacORB IDL compiler 
 */

public final class CurrentMaintenanceOperation_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperation_THelper.id(),"CurrentMaintenanceOperation_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tpName", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("maintenanceOperation", org.tmforum.mtnm.maintenanceOps.MaintenanceOperation_THelper.type(), null),new org.omg.CORBA.StructMember("layerRate", org.tmforum.mtnm.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperation_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperation_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/maintenanceOps/CurrentMaintenanceOperation_T:1.0";
	}
	public static org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperation_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperation_T result = new org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperation_T();
		result.tpName = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.maintenanceOperation=in.read_string();
		result.layerRate=in.read_short();
		result.additionalInfo = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperation_T s)
	{
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.tpName);
		out.write_string(s.maintenanceOperation);
		out.write_short(s.layerRate);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
