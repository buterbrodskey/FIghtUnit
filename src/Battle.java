import java.util.Random;

public class Battle {
    private final int ATTACK_METHODS_COUNT = 2;
    private final int DEFENSE_METHODS_COUNT = 1;

    public void start() {
        Ashe ashe = new Ashe();
        Graves graves = new Graves();

        Random random = new Random();

        int randomAction;

        while (true) {
            randomAction = random.nextInt(ATTACK_METHODS_COUNT * DEFENSE_METHODS_COUNT + 2);

            switch (randomAction) {
                case 0: {
                    graves.gotHit(ashe.shot());
                    break;
                }
                case 1: {
                    graves.gotHit(ashe.shotAOE());
                    break;
                }
                case 2: {
                    graves.gotHit(ashe.shot() - graves.raiseShield());
                    break;
                }
                case 3: {
                    graves.gotHit(ashe.shotAOE() - graves.raiseShield());
                    break;
                }
            }
            graves.showHealth();

            randomAction = random.nextInt(ATTACK_METHODS_COUNT * DEFENSE_METHODS_COUNT + 2);

            switch (randomAction) {
                case 0: {
                    ashe.gotHit(graves.punch());
                    break;
                }
                case 1: {
                    ashe.gotHit(graves.strongPunch());
                    break;
                }
                case 2: {
                    ashe.gotHit(graves.punch() - ashe.dodge(graves.punch()));
                    break;
                }
                case 3: {
                    ashe.gotHit(graves.strongPunch() - ashe.dodge(graves.strongPunch()));
                    break;
                }
            }
            ashe.showHealth();

            if (ashe.getHealth() <= 0) {
                System.out.println("Эш пала! Грейвз победил!");
                break;
            }
            else if (graves.getHealth() <= 0) {
                System.out.println("Грейвз пал! Эш победила!");
                break;
            }
            else continue;


        }


    }
}
