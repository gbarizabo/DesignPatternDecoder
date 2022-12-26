public abstract class NotificationAbstr {
    protected String notificationTitle;
    protected String contentText;
    protected String priority;
    protected String channel;
    protected String email;
    protected String phone;

    public String getNotificationTitle() {
        return notificationTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setNotificationTitle(String notificationTitle) {

        this.notificationTitle = notificationTitle;
    }

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {

        this.contentText = contentText;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {

        this.priority = priority;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {

        this.channel = channel;
    }
}
