package KYLAND_pmMgr;

/**
 * KYLAND_pmMgr/PMResourceIterator_IHolder.java .
 * ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
 * ��KYLAND_pmMgr.idl
 * 2017��9��7�� ������ ����03ʱ39��29�� CST
 */

public final class PMResourceIterator_IHolder implements org.omg.CORBA.portable.Streamable {
    public KYLAND_pmMgr.PMResourceIterator_I value = null;

    public PMResourceIterator_IHolder() {
    }

    public PMResourceIterator_IHolder(KYLAND_pmMgr.PMResourceIterator_I initialValue) {
        value = initialValue;
    }

    public void _read(org.omg.CORBA.portable.InputStream i) {
        value = KYLAND_pmMgr.PMResourceIterator_IHelper.read(i);
    }

    public void _write(org.omg.CORBA.portable.OutputStream o) {
        KYLAND_pmMgr.PMResourceIterator_IHelper.write(o, value);
    }

    public org.omg.CORBA.TypeCode _type() {
        return KYLAND_pmMgr.PMResourceIterator_IHelper.type();
    }

}
