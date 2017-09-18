package KYLAND_pmMgr;


/**
 * KYLAND_pmMgr/Process_THelper.java .
 * ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
 * ��KYLAND_pmMgr.idl
 * 2017��9��7�� ������ ����03ʱ39��29�� CST
 */

abstract public class Process_THelper {
    private static String _id = "IDL:mtnm.tmforum.org/KYLAND_pmMgr/Process_T:1.0";

    public static void insert(org.omg.CORBA.Any a, KYLAND_pmMgr.Process_T that) {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
        a.type(type());
        write(out, that);
        a.read_value(out.create_input_stream(), type());
    }

    public static KYLAND_pmMgr.Process_T extract(org.omg.CORBA.Any a) {
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
                    org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember[6];
                    org.omg.CORBA.TypeCode _tcOf_members0 = null;
                    _tcOf_members0 = org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.tk_long);
                    _members0[0] = new org.omg.CORBA.StructMember(
                            "id",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[1] = new org.omg.CORBA.StructMember(
                            "dn",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[2] = new org.omg.CORBA.StructMember(
                            "index",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[3] = new org.omg.CORBA.StructMember(
                            "name",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[4] = new org.omg.CORBA.StructMember(
                            "type",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[5] = new org.omg.CORBA.StructMember(
                            "state",
                            _tcOf_members0,
                            null);
                    __typeCode = org.omg.CORBA.ORB.init().create_struct_tc(KYLAND_pmMgr.Process_THelper.id(), "Process_T", _members0);
                    __active = false;
                }
            }
        }
        return __typeCode;
    }

    public static String id() {
        return _id;
    }

    public static KYLAND_pmMgr.Process_T read(org.omg.CORBA.portable.InputStream istream) {
        KYLAND_pmMgr.Process_T value = new KYLAND_pmMgr.Process_T();
        value.id = istream.read_long();
        value.dn = istream.read_string();
        value.index = istream.read_string();
        value.name = istream.read_string();
        value.type = istream.read_string();
        value.state = istream.read_string();
        return value;
    }

    public static void write(org.omg.CORBA.portable.OutputStream ostream, KYLAND_pmMgr.Process_T value) {
        ostream.write_long(value.id);
        ostream.write_string(value.dn);
        ostream.write_string(value.index);
        ostream.write_string(value.name);
        ostream.write_string(value.type);
        ostream.write_string(value.state);
    }

}
