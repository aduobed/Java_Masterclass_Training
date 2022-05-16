package Interface;

public class Main {
    public static void main(String[] args) {
        ITelephone obisPhone;
        obisPhone = new DeskPhone(125488);
        obisPhone.powerOn();
        obisPhone.callPhone(125488);
        obisPhone.answer();

        obisPhone = new MobilePhone(7844);
        obisPhone.powerOn();
        obisPhone.callPhone(7844);
        obisPhone.answer();
    }
}