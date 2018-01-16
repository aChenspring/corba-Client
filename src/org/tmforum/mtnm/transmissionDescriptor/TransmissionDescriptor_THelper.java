package org.tmforum.mtnm.transmissionDescriptor;


/**
 *	Generated from IDL definition of struct "TransmissionDescriptor_T"
 *	@author JacORB IDL compiler 
 */

public final class TransmissionDescriptor_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptor_THelper.id(),"TransmissionDescriptor_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("transmissionParams", org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalTPInfo", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("containingTMDName", org.tmforum.mtnm.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("externalRepresentationReference", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", org.tmforum.mtnm.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptor_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptor_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/transmissionDescriptor/TransmissionDescriptor_T:1.0";
	}
	public static org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptor_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptor_T result = new org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptor_T();
		result.name = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.transmissionParams = org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THelper.read(in);
		result.additionalTPInfo = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.containingTMDName = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		result.externalRepresentationReference=in.read_string();
		result.additionalInfo = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.transmissionDescriptor.TransmissionDescriptor_T s)
	{
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.additionalTPInfo);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.containingTMDName);
		out.write_string(s.externalRepresentationReference);
		org.tmforum.mtnm.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
