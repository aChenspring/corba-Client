package KYLAND_pmMgr;


/**
 * KYLAND_pmMgr/PMResource_T.java .
 * ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
 * ��KYLAND_pmMgr.idl
 * 2017��9��7�� ������ ����03ʱ39��29�� CST
 */

public final class PMResource_T implements org.omg.CORBA.portable.IDLEntity {
    public String resourcedes = null;
    public String performanceIndex = null;
    public String performanceVal = null;
    public String resourcetype = null;

    public PMResource_T() {
    } // ctor

    public PMResource_T(String _resourcedes, String _performanceIndex, String _performanceVal, String _resourcetype) {
        resourcedes = _resourcedes;
        performanceIndex = _performanceIndex;
        performanceVal = _performanceVal;
        resourcetype = _resourcetype;
    } // ctor

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PMResource_T{");
        sb.append("resourcedes='").append(resourcedes).append('\'');
        sb.append(", performanceIndex='").append(performanceIndex).append('\'');
        sb.append(", performanceVal='").append(performanceVal).append('\'');
        sb.append(", resourcetype='").append(resourcetype).append('\'');
        sb.append('}');
        return sb.toString();
    }
} // class PMResource_T
