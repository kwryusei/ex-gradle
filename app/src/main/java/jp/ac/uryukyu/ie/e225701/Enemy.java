package jp.ac.uryukyu.ie.e225701;

public class Enemy extends LivingThing{

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", getName(), getHitpoint(), getAttack());
    }

    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    } 


    public void setName(String name){
        this.name = name;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    public void setAttack(int attack){
        this.attack = attack;
    }

    public int getHitpoint(){
        return this.hitPoint;
    }

    public int getAttack(){
        return this.attack;
    }
       
}