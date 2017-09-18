package KYLAND_pmMgr;

/**
 * KYLAND_pmMgr/KYLAND_pmMgr_IHolder.java .
 * ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
 * ��KYLAND_pmMgr.idl
 * 2017��9��7�� ������ ����03ʱ39��29�� CST
 */

public final class KYLAND_pmMgr_IHolder implements org.omg.CORBA.portable.Streamable {
    public KYLAND_pmMgr.KYLAND_pmMgr_I value = null;

    public KYLAND_pmMgr_IHolder() {
    }

    public KYLAND_pmMgr_IHolder(KYLAND_pmMgr.KYLAND_pmMgr_I initialValue) {
        value = initialValue;
    }

    public void _read(org.omg.CORBA.portable.InputStream i) {
        value = KYLAND_pmMgr.KYLAND_pmMgr_IHelper.read(i);
    }

    public void _write(org.omg.CORBA.portable.OutputStream o) {
        KYLAND_pmMgr.KYLAND_pmMgr_IHelper.write(o, value);
    }

    public org.omg.CORBA.TypeCode _type() {
        return KYLAND_pmMgr.KYLAND_pmMgr_IHelper.type();
    }

}
