public abstract class Hero {
    private String name;
    private String specialization;

    private int health;
    private int basicDamage;

    public Hero(String name, String specialization, int health, int basicDamage) {
        this.name = name;
        this.specialization = specialization;
        this.health = health;
        this.basicDamage = basicDamage;
    }

    public int getBasicDamage() {
        return basicDamage;
    }

    public int getHealth() {
        return health;
    }

    public void setBasicDamage(int basicDamage) {
        this.basicDamage = basicDamage;
    }

    void gotHit(int damage) {
        System.out.println(name + " получает " + damage + " урона. Неприятно...");
        health -= damage;
    }

    void showHealth() {
        System.out.println("Текущий запас здоровья " + name + " " + health);
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    abstract void run();

    void death() {
        System.out.println(name + " мёртв!");
    }
}
