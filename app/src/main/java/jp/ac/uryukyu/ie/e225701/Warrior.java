package jp.ac.uryukyu.ie.e225701;

public class Warrior extends LivingThing{
    public Warrior (String name, int maximumHP, int attack){
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

    
    public void attackWithWeponSkill(LivingThing opponent){
        if(this.dead == false){
            int damage = (int)(this.attack * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動%sに%dのダメーのダメージを与えた！！。\n",name, opponent.getName(), damage);
            opponent.wounded(damage);
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

