public class Ashe extends Hero implements Range {

    public Ashe() {
        super("Эш", "Стрелок", 700, 250);
    }

    @Override
    void run() {
        System.out.println("Эш стремится к цели");
    }

    @Override
    public int shot() {
        System.out.println(getName() + " совершает выстрел!");
        return getBasicDamage();
    }

    @Override
    public int shotAOE() {
        System.out.println(getName() + " проводит массовую атаку! Все в укрытие!");
        return (int) (getBasicDamage() * 1.10);
    }

    @Override
    public int dodge(int damage) {
        System.out.println(getName() + " уклоняется от части урона");
        return damage;
    }
}
