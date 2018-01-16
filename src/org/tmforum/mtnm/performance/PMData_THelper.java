package org.tmforum.mtnm.performance;


/**
 *	Generated from IDL definition of struct "PMData_T"
 *	@author JacORB IDL compiler 
 */

public final class PMData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.performance.PMData_THelper.id(),"PMData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tpName", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("layerRate", org.tmforum.mtnm.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("granularity", org.tmforum.mtnm.performance.Granularity_THelper.type(), null),new org.omg.CORBA.StructMember("retrievalTime", org.tmforum.mtnm.globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("pmMeasurementList", org.tmforum.mtnm.performance.PMMeasurementList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.performance.PMData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.performance.PMData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMData_T:1.0";
	}
	public static org.tmforum.mtnm.performance.PMData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.performance.PMData_T result = new org.tmforum.mtnm.performance.PMData_T();
		result.tpName = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.layerRate=in.read_short();
		result.granularity=in.read_string();
		result.retrievalTime=in.read_string();
		result.pmMeasurementList = org.tmforum.mtnm.performance.PMMeasurementList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.performance.PMData_T s)
	{
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.tpName);
		out.write_short(s.layerRate);
		out.write_string(s.granularity);
		out.write_string(s.retrievalTime);
		org.tmforum.mtnm.performance.PMMeasurementList_THelper.write(out,s.pmMeasurementList);
	}
}
