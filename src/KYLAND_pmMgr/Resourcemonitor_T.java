package KYLAND_pmMgr;


/**
 * KYLAND_pmMgr/Resourcemonitor_T.java .
 * 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
 * 从KYLAND_pmMgr.idl
 * 2017年9月7日 星期四 下午03时39分29秒 CST
 */

public final class Resourcemonitor_T implements org.omg.CORBA.portable.IDLEntity {
    public String monitorName = null;
    public String resourceType = null;
    public String monitorMethod = null;
    public String monitorObject = null;
    public int timeInterval = (int) 0;
    public int monitorType = (int) 0;
    public String alarm = null;
    public String monitorcondition = null;
    public String criticalLimit = null;
    public String majorLimit = null;
    public String minorLimit = null;
    public String unit = null;
    public String monitorDesc = null;
    public String monitorParam = null;
    public String category = null;
    public int isCounter = (int) 0;
    public int isValid = (int) 0;
    public String alarmReason = null;
    public int defaultRun = (int) 0;
    public String rule = null;
    public String alarmType = null;

    public Resourcemonitor_T() {
    } // ctor

    public Resourcemonitor_T(String _monitorName, String _resourceType, String _monitorMethod, String _monitorObject, int _timeInterval, int _monitorType, String _alarm, String _monitorcondition, String _criticalLimit, String _majorLimit, String _minorLimit, String _unit, String _monitorDesc, String _monitorParam, String _category, int _isCounter, int _isValid, String _alarmReason, int _defaultRun, String _rule, String _alarmType) {
        monitorName = _monitorName;
        resourceType = _resourceType;
        monitorMethod = _monitorMethod;
        monitorObject = _monitorObject;
        timeInterval = _timeInterval;
        monitorType = _monitorType;
        alarm = _alarm;
        monitorcondition = _monitorcondition;
        criticalLimit = _criticalLimit;
        majorLimit = _majorLimit;
        minorLimit = _minorLimit;
        unit = _unit;
        monitorDesc = _monitorDesc;
        monitorParam = _monitorParam;
        category = _category;
        isCounter = _isCounter;
        isValid = _isValid;
        alarmReason = _alarmReason;
        defaultRun = _defaultRun;
        rule = _rule;
        alarmType = _alarmType;
    } // ctor

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Resourcemonitor_T{");
        sb.append("monitorName='").append(monitorName).append('\'');
        sb.append(", resourceType='").append(resourceType).append('\'');
        sb.append(", monitorMethod='").append(monitorMethod).append('\'');
        sb.append(", monitorObject='").append(monitorObject).append('\'');
        sb.append(", timeInterval=").append(timeInterval);
        sb.append(", monitorType=").append(monitorType);
        sb.append(", alarm='").append(alarm).append('\'');
        sb.append(", monitorcondition='").append(monitorcondition).append('\'');
        sb.append(", criticalLimit='").append(criticalLimit).append('\'');
        sb.append(", majorLimit='").append(majorLimit).append('\'');
        sb.append(", minorLimit='").append(minorLimit).append('\'');
        sb.append(", unit='").append(unit).append('\'');
        sb.append(", monitorDesc='").append(monitorDesc).append('\'');
        sb.append(", monitorParam='").append(monitorParam).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append(", isCounter=").append(isCounter);
        sb.append(", isValid=").append(isValid);
        sb.append(", alarmReason='").append(alarmReason).append('\'');
        sb.append(", defaultRun=").append(defaultRun);
        sb.append(", rule='").append(rule).append('\'');
        sb.append(", alarmType='").append(alarmType).append('\'');
        sb.append('}');
        return sb.toString();
    }
} // class Resourcemonitor_T
