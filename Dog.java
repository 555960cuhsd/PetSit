public class Dog extends Pet{

    private String furColor;
    private boolean wantsWalk;
    private static int goodBoys = 0;
    private static int goodGirls = 0;

    public Dog (String name, boolean isMale, String furColor) {
        super("dog", name, isMale, false, true);
        this.furColor = furColor;
        wantsWalk = (int) (Math.random() * 2) != 0;
    }

    public Dog (boolean isMale, String furColor) {
        super("dog", isMale, false, true);
        this.furColor = furColor;
        if (isMale) {
            goodBoys++;
            setName("Good boy #" + goodBoys);
        }
        else {
            goodGirls++;
            setName("Good girl #" + goodGirls);
        }
        wantsWalk = (int) (Math.random() * 2) != 0;
    }

    public void walk() {
        wantsWalk = false;
        setHunger(true);
    }

    public void play() {
        setHunger(true);
    }


}
