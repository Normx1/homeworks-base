package HomeWork6.robot;


import HomeWork6.robot.hands.PhilipsHand;
import HomeWork6.robot.hands.SamsungHand;
import HomeWork6.robot.hands.SonyHand;
import HomeWork6.robot.heads.SamsungHead;
import HomeWork6.robot.heads.SonyHead;
import HomeWork6.robot.legs.PhilipsLeg;
import HomeWork6.robot.legs.SamsungLeg;
import HomeWork6.robot.legs.SonyLeg;
import HomeWork6.robot.hands.IHand;
import HomeWork6.robot.heads.IHead;
import HomeWork6.robot.legs.ILeg;

public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    @Override
    public void action() {
        head.speek();
        hand.upHand();
        leg.step();
    }

    /**
     * Get the cost of a robot
     *
     * @return int
     */
    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }
}
