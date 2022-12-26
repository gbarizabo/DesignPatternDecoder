public class SmsNotify extends NotifyDecorator {

    public SmsNotify(NotificationAbstr notification) {
        notificationAbstr = notification;
        setPhone("+221780104025");
        setContentText("ok");
    }

    public SmsNotify() {

    }

    @Override
    public String toString() {
        return "SmsNotify{"+
                "Phone='" + getPhone() + '\'' +
                ", ContentText=" + getContentText() +
                '}';
    }

}
