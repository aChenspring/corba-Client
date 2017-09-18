package KYLAND_pmMgr;


/**
 * KYLAND_pmMgr/Process_T.java .
 * 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
 * 从KYLAND_pmMgr.idl
 * 2017年9月7日 星期四 下午03时39分29秒 CST
 */

public final class Process_T implements org.omg.CORBA.portable.IDLEntity {
    public int id = (int) 0;
    public String dn = null;
    public String index = null;
    public String name = null;
    public String type = null;
    public String state = null;

    public Process_T() {
    } // ctor

    public Process_T(int _id, String _dn, String _index, String _name, String _type, String _state) {
        id = _id;
        dn = _dn;
        index = _index;
        name = _name;
        type = _type;
        state = _state;
    } // ctor

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Process_T{");
        sb.append("id=").append(id);
        sb.append(", dn='").append(dn).append('\'');
        sb.append(", index='").append(index).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append('}');
        return sb.toString();
    }
} // class Process_T
