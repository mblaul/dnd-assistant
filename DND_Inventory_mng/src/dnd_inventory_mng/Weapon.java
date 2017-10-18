/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd_inventory_mng;

/**
 *
 * @author duroj
 */
public class Weapon extends Item{
int atk;
    
    public Weapon(){
        super();
    }

    public Weapon(int id,String name,int cost,double weight,int attack){
        super(id,name,cost,weight);
        atk = attack;
    }

    public int getAttack() {
            return atk;
        }
    
        public void setAttack(int atk) {
            this.atk = atk;
        }
}

