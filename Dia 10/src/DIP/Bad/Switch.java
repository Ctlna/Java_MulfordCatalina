package DIP.Bad;

public class Switch {
    private LightBulb bulb;

    public Switch(LightBulb bulb){
        this.bulb=bulb;
    }

    public void operate(){
        bulb.turnON();
    }
}
