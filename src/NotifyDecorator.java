public abstract class NotifyDecorator extends NotificationAbstr {
    protected NotificationAbstr notificationAbstr;

    @Override
    public String getNotificationTitle() {
        return notificationAbstr.getNotificationTitle() +" "+ super.getNotificationTitle();
    }

    @Override
    public String getContentText() {

        return notificationAbstr.getContentText() +" "+ super.getContentText();
    }

    @Override
    public String getPriority() {

        return notificationAbstr.getPriority() +" "+ super.getPriority();
    }

    @Override
    public String getChannel() {

        return notificationAbstr.getChannel() +" "+ super.getChannel();
    }

    @Override
    public String getPhone() {
        return notificationAbstr.getPhone() +" "+ super.getPhone();
    }

    @Override
    public String getEmail() {

        return notificationAbstr.getEmail() +" "+ super.getEmail();
    }
}
