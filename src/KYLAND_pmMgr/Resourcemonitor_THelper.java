package KYLAND_pmMgr;


/**
 * KYLAND_pmMgr/Resourcemonitor_THelper.java .
 * ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
 * ��KYLAND_pmMgr.idl
 * 2017��9��7�� ������ ����03ʱ39��29�� CST
 */

abstract public class Resourcemonitor_THelper {
    private static String _id = "IDL:mtnm.tmforum.org/KYLAND_pmMgr/Resourcemonitor_T:1.0";

    public static void insert(org.omg.CORBA.Any a, KYLAND_pmMgr.Resourcemonitor_T that) {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
        a.type(type());
        write(out, that);
        a.read_value(out.create_input_stream(), type());
    }

    public static KYLAND_pmMgr.Resourcemonitor_T extract(org.omg.CORBA.Any a) {
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
                    org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember[21];
                    org.omg.CORBA.TypeCode _tcOf_members0 = null;
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[0] = new org.omg.CORBA.StructMember(
                            "monitorName",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[1] = new org.omg.CORBA.StructMember(
                            "resourceType",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[2] = new org.omg.CORBA.StructMember(
                            "monitorMethod",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[3] = new org.omg.CORBA.StructMember(
                            "monitorObject",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.tk_long);
                    _members0[4] = new org.omg.CORBA.StructMember(
                            "timeInterval",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.tk_long);
                    _members0[5] = new org.omg.CORBA.StructMember(
                            "monitorType",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[6] = new org.omg.CORBA.StructMember(
                            "alarm",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[7] = new org.omg.CORBA.StructMember(
                            "monitorcondition",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[8] = new org.omg.CORBA.StructMember(
                            "criticalLimit",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[9] = new org.omg.CORBA.StructMember(
                            "majorLimit",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[10] = new org.omg.CORBA.StructMember(
                            "minorLimit",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[11] = new org.omg.CORBA.StructMember(
                            "unit",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[12] = new org.omg.CORBA.StructMember(
                            "monitorDesc",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[13] = new org.omg.CORBA.StructMember(
                            "monitorParam",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[14] = new org.omg.CORBA.StructMember(
                            "category",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.tk_long);
                    _members0[15] = new org.omg.CORBA.StructMember(
                            "isCounter",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.tk_long);
                    _members0[16] = new org.omg.CORBA.StructMember(
                            "isValid",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[17] = new org.omg.CORBA.StructMember(
                            "alarmReason",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.tk_long);
                    _members0[18] = new org.omg.CORBA.StructMember(
                            "defaultRun",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[19] = new org.omg.CORBA.StructMember(
                            "rule",
                            _tcOf_members0,
                            null);
                    _tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
                    _members0[20] = new org.omg.CORBA.StructMember(
                            "alarmType",
                            _tcOf_members0,
                            null);
                    __typeCode = org.omg.CORBA.ORB.init().create_struct_tc(KYLAND_pmMgr.Resourcemonitor_THelper.id(), "Resourcemonitor_T", _members0);
                    __active = false;
                }
            }
        }
        return __typeCode;
    }

    public static String id() {
        return _id;
    }

    public static KYLAND_pmMgr.Resourcemonitor_T read(org.omg.CORBA.portable.InputStream istream) {
        KYLAND_pmMgr.Resourcemonitor_T value = new KYLAND_pmMgr.Resourcemonitor_T();
        value.monitorName = istream.read_string();
        value.resourceType = istream.read_string();
        value.monitorMethod = istream.read_string();
        value.monitorObject = istream.read_string();
        value.timeInterval = istream.read_long();
        value.monitorType = istream.read_long();
        value.alarm = istream.read_string();
        value.monitorcondition = istream.read_string();
        value.criticalLimit = istream.read_string();
        value.majorLimit = istream.read_string();
        value.minorLimit = istream.read_string();
        value.unit = istream.read_string();
        value.monitorDesc = istream.read_string();
        value.monitorParam = istream.read_string();
        value.category = istream.read_string();
        value.isCounter = istream.read_long();
        value.isValid = istream.read_long();
        value.alarmReason = istream.read_string();
        value.defaultRun = istream.read_long();
        value.rule = istream.read_string();
        value.alarmType = istream.read_string();
        return value;
    }

    public static void write(org.omg.CORBA.portable.OutputStream ostream, KYLAND_pmMgr.Resourcemonitor_T value) {
        ostream.write_string(value.monitorName);
        ostream.write_string(value.resourceType);
        ostream.write_string(value.monitorMethod);
        ostream.write_string(value.monitorObject);
        ostream.write_long(value.timeInterval);
        ostream.write_long(value.monitorType);
        ostream.write_string(value.alarm);
        ostream.write_string(value.monitorcondition);
        ostream.write_string(value.criticalLimit);
        ostream.write_string(value.majorLimit);
        ostream.write_string(value.minorLimit);
        ostream.write_string(value.unit);
        ostream.write_string(value.monitorDesc);
        ostream.write_string(value.monitorParam);
        ostream.write_string(value.category);
        ostream.write_long(value.isCounter);
        ostream.write_long(value.isValid);
        ostream.write_string(value.alarmReason);
        ostream.write_long(value.defaultRun);
        ostream.write_string(value.rule);
        ostream.write_string(value.alarmType);
    }

}
