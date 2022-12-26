public class WhatsappNotify extends NotifyDecorator {
    public WhatsappNotify(NotificationAbstr notification) {
        notificationAbstr = notification;
        setPhone("+221780104025");
    }

}
