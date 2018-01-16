package org.tmforum.mtnm.mLSNPPLink;


/**
 *	Generated from IDL definition of struct "LayeredCapacity_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredCapacity_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.tmforum.mtnm.mLSNPPLink.LayeredCapacity_THelper.id(),"LayeredCapacity_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("layerRate", org.tmforum.mtnm.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("capacity", org.tmforum.mtnm.mLSNPPLink.Capacity_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.tmforum.mtnm.mLSNPPLink.LayeredCapacity_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.tmforum.mtnm.mLSNPPLink.LayeredCapacity_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/mLSNPPLink/LayeredCapacity_T:1.0";
	}
	public static org.tmforum.mtnm.mLSNPPLink.LayeredCapacity_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.tmforum.mtnm.mLSNPPLink.LayeredCapacity_T result = new org.tmforum.mtnm.mLSNPPLink.LayeredCapacity_T();
		result.layerRate=in.read_short();
		result.capacity=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.tmforum.mtnm.mLSNPPLink.LayeredCapacity_T s)
	{
		out.write_short(s.layerRate);
		out.write_string(s.capacity);
	}
}
