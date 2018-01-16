import org.tmforum.mtnm.nmsSession.NmsSession_IOperations;
import org.tmforum.mtnm.session.Session_I;

public class SessionImpl implements NmsSession_IOperations {
    @Override
    public void eventLossOccurred(String startTime, String notificationId) {
    }

    /**
     * <p>The EMS invokes this method to indicate that the event loss period is over,
     * and that it is now capable of providing relevant notifications.</p>
     * <p>
     * <p>After invoking this method on the NmsSession_Is, the EMS clears the internal flag
     * set by eventLossOccurred.  If event loss occurs again, eventLossOccurred will be
     * called.</p>
     * <p>
     * <p>How and when the EMS decides to invoke eventLossCleared is an EMS implementation
     * detail. The actual algorithm that the EMS uses may be as simple as a timer-based
     * mechanism or a complicated one which monitors the current rate at which the EMS
     * pushes events and the available resources in NOSE.</p>
     * <p>
     * <br> endTime: The time of the end of the event loss period, as determined by the EMS.
     **/
    @Override
    public void eventLossCleared(String endTime) {

    }

    @Override
    public void alarmLossOccurred(String startTime, String notificationId) {

    }

    @Override
    public void endSession() {

    }

    @Override
    public void ping() {
    }

    @Override
    public Session_I associatedSession() {
        return null;
    }
}
