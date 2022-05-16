package Interface;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        if (isOn){
            System.out.println("Mobile phone powered on");
        }
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn){
        System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNUmber) {
        if (phoneNUmber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Ring Ring Ring Ring");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not powered on");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
