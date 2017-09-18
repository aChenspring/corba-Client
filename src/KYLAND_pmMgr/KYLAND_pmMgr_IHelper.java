package KYLAND_pmMgr;


/**
 * KYLAND_pmMgr/KYLAND_pmMgr_IHelper.java .
 * ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
 * ��KYLAND_pmMgr.idl
 * 2017��9��7�� ������ ����03ʱ39��29�� CST
 */

abstract public class KYLAND_pmMgr_IHelper {
    private static String _id = "IDL:mtnm.tmforum.org/KYLAND_pmMgr/KYLAND_pmMgr_I:1.0";

    public static void insert(org.omg.CORBA.Any a, KYLAND_pmMgr.KYLAND_pmMgr_I that) {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
        a.type(type());
        write(out, that);
        a.read_value(out.create_input_stream(), type());
    }

    public static KYLAND_pmMgr.KYLAND_pmMgr_I extract(org.omg.CORBA.Any a) {
        return read(a.create_input_stream());
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;

    synchronized public static org.omg.CORBA.TypeCode type() {
        if (__typeCode == null) {
            __typeCode = org.omg.CORBA.ORB.init().create_interface_tc(KYLAND_pmMgr.KYLAND_pmMgr_IHelper.id(), "KYLAND_pmMgr_I");
        }
        return __typeCode;
    }

    public static String id() {
        return _id;
    }

    public static KYLAND_pmMgr.KYLAND_pmMgr_I read(org.omg.CORBA.portable.InputStream istream) {
        return narrow(istream.read_Object(_KYLAND_pmMgr_IStub.class));
    }

    public static void write(org.omg.CORBA.portable.OutputStream ostream, KYLAND_pmMgr.KYLAND_pmMgr_I value) {
        ostream.write_Object((org.omg.CORBA.Object) value);
    }

    public static KYLAND_pmMgr.KYLAND_pmMgr_I narrow(org.omg.CORBA.Object obj) {
        if (obj == null)
            return null;
        else if (obj instanceof KYLAND_pmMgr.KYLAND_pmMgr_I)
            return (KYLAND_pmMgr.KYLAND_pmMgr_I) obj;
        else if (!obj._is_a(id()))
            throw new org.omg.CORBA.BAD_PARAM();
        else {
            org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate();
            KYLAND_pmMgr._KYLAND_pmMgr_IStub stub = new KYLAND_pmMgr._KYLAND_pmMgr_IStub();
            stub._set_delegate(delegate);
            return stub;
        }
    }

    public static KYLAND_pmMgr.KYLAND_pmMgr_I unchecked_narrow(org.omg.CORBA.Object obj) {
        if (obj == null)
            return null;
        else if (obj instanceof KYLAND_pmMgr.KYLAND_pmMgr_I)
            return (KYLAND_pmMgr.KYLAND_pmMgr_I) obj;
        else {
            org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate();
            KYLAND_pmMgr._KYLAND_pmMgr_IStub stub = new KYLAND_pmMgr._KYLAND_pmMgr_IStub();
            stub._set_delegate(delegate);
            return stub;
        }
    }

}
