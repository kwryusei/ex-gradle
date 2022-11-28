package jp.ac.uryukyu.ie.e225701;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    
    
    public LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
    }
    public boolean isDead(){
        return dead;
    }

    public String getName(){
        return this.name;
    }
   

    public void attack(LivingThing opponent){
        if(this.dead == false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメーのダメージを与えた！！。\n",name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if(hitPoint < 0){
            dead = true;
            System.out.printf("%sは倒れた。\n", getName());
        }

    }

    }