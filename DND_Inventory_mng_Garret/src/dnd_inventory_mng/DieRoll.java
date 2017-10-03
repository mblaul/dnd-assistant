package dnd_inventory_mng;

public class DieRoll {
    
    public int die;
    public int numSides;
    
    public int dieRoll(int numSides){
        die = (int)(Math.random()*die) + 1;
        return die;
    }
    
}
