package KYLAND_pmMgr;


/**
 * KYLAND_pmMgr/PMResource_THelper.java .
 * ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
 * ��KYLAND_pmMgr.idl
 * 2017��9��7�� ������ ����03ʱ39��29�� CST
 */

abstract public class PMResource_THelper {
    private static String _id = "IDL:mtnm.tmforum.org/KYLAND_pmMgr/PMResource_T:1.0";

    public static void insert(org.omg.CORBA.Any a, KYLAND_pmMgr.PMResource_T that) {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
        a.type(type());
        write(out, that);
        a.read_value(out.create_input_stream(), type());
    }

    public static KYLAND_pmMgr.PMResource_T extract(org.omg.CORBA.Any a) {
        return read(a.create_input_stream());
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;
    private static boolean __active = false;

    synchronized public static org.omg.CORBA.TypeCode type() {
        if (__typeCode == null) {
            synchronized (org.omg.CORBA.TypeCode.class) {
                if (__typeCode == null) {
                    if (__active) {
                        return org.omg.CORBA.ORB.init().create_recursive_tc(_id);
                    }
                    __active = true;
                    org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember[4];
                    org.omg.CORBA.TypeCode _tcOf_members0 = null;
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[0] = new org.omg.CORBA.StructMember(
                            "resourcedes",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[1] = new org.omg.CORBA.StructMember(
                            "performanceIndex",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[2] = new org.omg.CORBA.StructMember(
                            "performanceVal",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[3] = new org.omg.CORBA.StructMember(
                            "resourcetype",
                            _tcOf_members0,
                            null);
                    __typeCode = org.omg.CORBA.ORB.init().create_struct_tc(KYLAND_pmMgr.PMResource_THelper.id(), "PMResource_T", _members0);
                    __active = false;
                }
            }
        }
        return __typeCode;
    }

    public static String id() {
        return _id;
    }

    public static KYLAND_pmMgr.PMResource_T read(org.omg.CORBA.portable.InputStream istream) {
        KYLAND_pmMgr.PMResource_T value = new KYLAND_pmMgr.PMResource_T();
        value.resourcedes = istream.read_string();
        value.performanceIndex = istream.read_string();
        value.performanceVal = istream.read_string();
        value.resourcetype = istream.read_string();
        return value;
    }

    public static void write(org.omg.CORBA.portable.OutputStream ostream, KYLAND_pmMgr.PMResource_T value) {
        ostream.write_string(value.resourcedes);
        ostream.write_string(value.performanceIndex);
        ostream.write_string(value.performanceVal);
        ostream.write_string(value.resourcetype);
    }

}
