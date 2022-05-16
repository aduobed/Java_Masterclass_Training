package Interface;

public class DeskPhone implements ITelephone {
    private int myNUmber;
    private boolean isRinging;

    public DeskPhone(int myNUmber) {
        this.myNUmber = myNUmber;
    }

    @Override
    public void powerOn() {
        System.out.println("NO action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskPhone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNUmber) {
        if (phoneNUmber == myNUmber) {
            isRinging = true;
            System.out.println("Ring Ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
