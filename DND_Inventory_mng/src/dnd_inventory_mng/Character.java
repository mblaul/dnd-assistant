package dnd_inventory_mng;

public class Character {
    
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
    
    /*
    
    It would be cool to implement items as arrays of items so characters could 
    carry multiple items as needed.
    
    public Item[] charHelmets; 
    
    I've forgetten the best way to delcare an array of objects but I think you 
    can see the main idea. The result would be an expandable array of Items as
    needed.
    
    charHelmets[n] = helm[0] , helm[1] , + ... + helm[n]
    
    A boolean field added to items could show whether or not the item was equipped.
    Only one item in each catagory would be able to be equipped at once but many 
    more items could be carried while not being equipped.
     
    */
    
    // inventory items - these Item classes could be more specific ie helemt weapon etc
    public Item helm;
    public Item upper;
    public Item lower;
    public Item weapon;
    public Item potion;
    public Item adventure;
        
public Character(String n, int h, int m, int a, int s, int c, int i, int l, 
        Item he, Item up, Item lo, Item we, Item po, Item ad){

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

public void setHelmet(Item newHelm){
    helm = newHelm;
}

// upper setters and getters

public Item getUpper(){
    return upper;
}

public void setUpper(Item newUpper){
    upper = newUpper;
}

// lower setters and getters

public Item getLower(){
    return lower;
}

public void setLower(Item newLower){
    lower = newLower;
}

// weapon setters and getters

public Item getWeapon(){
    return weapon;
}

public void setWeapon(Item newWeapon){
    weapon = newWeapon;
}

// potion setters and getters

public Item getPotion(){
    return potion;
}

public void setPotion(Item newPotion){
    potion = newPotion;
}

// adventure setters and getters

public Item getAdventure(){
    return adventure;
}

public void setAdventure(Item newAdventure){
    adventure = newAdventure;
}

}
