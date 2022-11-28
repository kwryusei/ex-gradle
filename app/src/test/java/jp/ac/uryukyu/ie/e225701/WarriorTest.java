package jp.ac.uryukyu.ie.e225701;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void attackTest() {
    int warriorAttack = 100;
    int testEnemy1HP = 100;
    for(int count=0; count<5; count++){
    Warrior demoWarrior = new Warrior("デモWarrior", 100,warriorAttack);
    Enemy testEnemy = new Enemy("Warriorもどき", 100, 300);
    demoWarrior.attackWithWeponSkill(testEnemy);
    int damage = testEnemy1HP - testEnemy.getHitpoint();
    assertEquals((int)warriorAttack * 1.5, damage);
    }
  }
}

    
