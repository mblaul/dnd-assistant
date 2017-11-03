package dnd_inventory_mng;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Character {
    
    // defined during object creation
    public int id;
    
    // entered by user
    public String name;
    
    // rolled or entered by user
    public int health;
    public int magic;
    public int agility;
    public int strength;
    public int charisma;
    public int intelligence;
    public int luck;
    
    // inventory items - these Item classes could be more specific ie helemt weapon etc
    public Armor helm;
    public Armor upper;
    public Armor lower;
    public Weapon weapon;
    public Potion potion;
    public Adventure adventure;
    public InventoryList charInventory;

    
    public Character(int identifier, String n, int h, int m, int a, int s, int c, int i, int l, 
            Armor he, Armor up, Armor lo, Weapon we, Potion po, Adventure ad){

        id = identifier;
        name = n;
        health = h;
        magic = m;
        agility = a;
        strength = s;
        charisma = c;
        intelligence = i;
        luck = l;

        helm = he;
        upper = up;
        lower = lo;
        weapon = we;
        potion = po;
    }
    
    

    // id setter and getter
    public int getId(){
        return id;
    }

    public void setId(int identifier){
        id = identifier;
    }

    // name setters and getters
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name=newName;
    }

    // health setters and getters
    public int getHealth(){
        return health;
    }

    public void setHealth(int newHealth){
        health = newHealth;
    }

    // magic setters and getters
    public int getMagic(){
        return magic;
    }

    public void setMagic(int newMagic){
        magic = newMagic;
    }

    // agility setters and getters
    public int getAgility(){
        return agility;
    }

    public void setAgility(int newAgility){
        agility = newAgility;
    }

    // strength setters and getters
    public int getStrength(){
        return strength;
    }

    public void setStregth(int newStrength){
        strength = newStrength;
    }

    // charisma setters and getters
    public int getCharisma(){
        return charisma;
    }

    public void setCharisma(int newCharisma){
        charisma = newCharisma;
    }

    // intelligence setters and getters
    public int getIntelligence(){
        return intelligence;
    }

    public void setIntelligence(int newIntelligence){
        intelligence = newIntelligence;
    }

    // luck setters and getters
    public int getLuck(){
        return luck;
    }

    public void setLuck(int newLuck){
        luck = newLuck;
    }

    // helmet setter and getters
    public Item getHelmet(){
        return helm;
    }

    public void setHelmet(Armor newHelm){
        helm = newHelm;
    }

    // upper setters and getters
    public Item getUpper(){
        return upper;
    }

    public void setUpper(Armor newUpper){
        upper = newUpper;
    }

    // lower setters and getters
    public Item getLower(){
        return lower;
    }

    public void setLower(Armor newLower){
        lower = newLower;
    }

    // weapon setters and getters
    public Item getWeapon(){
        return weapon;
    }

    public void setWeapon(Weapon newWeapon){
        weapon = newWeapon;
    }

    // potion setters and getters
    public Item getPotion(){
        return potion;
    }

    public void setPotion(Potion newPotion){
        potion = newPotion;
    }

    // adventure setters and getters
    public Item getAdventure(){
        return adventure;
    }

    public void setAdventure(Adventure newAdventure){
        adventure = newAdventure;
    }

    public InventoryList getCharInventory(){
        return charInventory;
    }

    public void setCharInventory(InventoryList charInventory){
        this.charInventory = charInventory;
    }
}