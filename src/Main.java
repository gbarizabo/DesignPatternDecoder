public class Main {
    public static void main(String[] args) {
        NotificationAbstr smsNotify = new SmsNotify();
        System.out.println(smsNotify.getPhone() + ": " + smsNotify.getContentText() + "ok");

    }
}