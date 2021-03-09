public class Graves extends Hero implements Melee {

    public Graves() {
        super("Грейвз", "боец", 1000, 200);
    }

    @Override
    void run() {
        System.out.println("Грейвз передвигается");
    }

    @Override
    public int punch() {
        System.out.println(getName() + " наносит удар!");
        return getBasicDamage();
    }

    @Override
    public int strongPunch() {
        System.out.println(getName() + " проводит коронную двоечку! Какая техника!");
        return (int) (getBasicDamage() * 1.25);
    }

    @Override
    public int raiseShield() {
        System.out.println(getName() +" блокирует часть урона! Потрясающе!");
        return (int) (getBasicDamage() * 0.5);
    }
}
