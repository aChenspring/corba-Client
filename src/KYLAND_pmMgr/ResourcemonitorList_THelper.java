package KYLAND_pmMgr;


/**
 * KYLAND_pmMgr/ResourcemonitorList_THelper.java .
 * ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
 * ��KYLAND_pmMgr.idl
 * 2017��9��7�� ������ ����03ʱ39��29�� CST
 */

abstract public class ResourcemonitorList_THelper {
    private static String _id = "IDL:mtnm.tmforum.org/KYLAND_pmMgr/ResourcemonitorList_T:1.0";

    public static void insert(org.omg.CORBA.Any a, KYLAND_pmMgr.Resourcemonitor_T[] that) {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
        a.type(type());
        write(out, that);
        a.read_value(out.create_input_stream(), type());
    }

    public static KYLAND_pmMgr.Resourcemonitor_T[] extract(org.omg.CORBA.Any a) {
        return read(a.create_input_stream());
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;

    synchronized public static org.omg.CORBA.TypeCode type() {
        if (__typeCode == null) {
            __typeCode = KYLAND_pmMgr.Resourcemonitor_THelper.type();
            __typeCode = org.omg.CORBA.ORB.init().create_sequence_tc(0, __typeCode);
            __typeCode = org.omg.CORBA.ORB.init().create_alias_tc(KYLAND_pmMgr.ResourcemonitorList_THelper.id(), "ResourcemonitorList_T", __typeCode);
        }
        return __typeCode;
    }

    public static String id() {
        return _id;
    }

    public static KYLAND_pmMgr.Resourcemonitor_T[] read(org.omg.CORBA.portable.InputStream istream) {
        KYLAND_pmMgr.Resourcemonitor_T value[] = null;
        int _len0 = istream.read_long();
        value = new KYLAND_pmMgr.Resourcemonitor_T[_len0];
        for (int _o1 = 0; _o1 < value.length; ++_o1)
            value[_o1] = KYLAND_pmMgr.Resourcemonitor_THelper.read(istream);
        return value;
    }

    public static void write(org.omg.CORBA.portable.OutputStream ostream, KYLAND_pmMgr.Resourcemonitor_T[] value) {
        ostream.write_long(value.length);
        for (int _i0 = 0; _i0 < value.length; ++_i0)
            KYLAND_pmMgr.Resourcemonitor_THelper.write(ostream, value[_i0]);
    }

}
