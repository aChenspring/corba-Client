package KYLAND_pmMgr;


/**
 * KYLAND_pmMgr/PMResourceList_THolder.java .
 * ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
 * ��KYLAND_pmMgr.idl
 * 2017��9��7�� ������ ����03ʱ39��29�� CST
 */

public final class PMResourceList_THolder implements org.omg.CORBA.portable.Streamable {
    public KYLAND_pmMgr.PMResource_T value[] = null;

    public PMResourceList_THolder() {
    }

    public PMResourceList_THolder(KYLAND_pmMgr.PMResource_T[] initialValue) {
        value = initialValue;
    }

    public void _read(org.omg.CORBA.portable.InputStream i) {
        value = KYLAND_pmMgr.PMResourceList_THelper.read(i);
    }

    public void _write(org.omg.CORBA.portable.OutputStream o) {
        KYLAND_pmMgr.PMResourceList_THelper.write(o, value);
    }

    public org.omg.CORBA.TypeCode _type() {
        return KYLAND_pmMgr.PMResourceList_THelper.type();
    }

}
