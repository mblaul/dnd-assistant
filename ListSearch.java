package dnd_inventory_mng;

import java.util.ArrayList;
import java.util.List;


public class ListSearch {

    public int searchID;
    
    List<Armor> armorItemList;
    List<Melee> meleeItemList;
    List<Ranged> rangedItemList;
    List<Potion> potionItemList;
    List<Adventure> adventureItemList;
    
    public int firstDigit;
    
    String[] itemType = {"armor","melee","ranged","potion","adventure"};
 
    
    public int returnListPos(int sID, List<Armor> armorList, List<Melee> meleeList, 
            List<Ranged> rangedList, List<Potion> potionList, 
            List<Adventure> adventureList){
        
        // lists to search
        armorItemList = armorList;
        meleeItemList = meleeList;
        rangedItemList = rangedList;
        potionItemList = potionList;
        adventureItemList = adventureList;
        
        // temp objects to test their id numbers
        Armor testArmor = new Armor();
        Melee testMelee = new Melee();
        Ranged testRanged = new Ranged();
        Potion testPotion = new Potion();
        Adventure testAdventure = new Adventure();
        
        searchID = sID;
        firstDigit = searchID/10000; // returns first digit indicating which list is needed to search
        
        String itemCase = itemType[sID - 1];
        
        String searchList = itemCase +"ItemList"; 
        // ^^ is this needed? how can i select the proper list using this string
        // im not sure why i put this here, i think i was trying to think of a way
        // to select the correct list without using a switch statement.
        
        /* pseudo code for "for" search loop
        
        for (int i = 0, i <= searchList.length, i++){
                                ^^not sure how to define the lenght of the list without using a switch statement before the for loop
            switch(itemCase){
                case "armor":
                
                    testArmor = armorItemList.get[i]
                    if(testArmor.getID() == searchID){
                        return i;
                    }
        
                break;
            
                case "melee":
        
                    testMelee = meleeItemList.get[i]
                    if(testMelee.getID() == searchID){
                        return i;
                    }
                
                break;
            
                case "ranged":
        
                    testRanged = rangedItemList.get[i]
                    if(testRanged.getID() == searchID){
                        return i;
                    }
                
                break;
            
                case "potion":
        
                    testPotion = potionItemList.get[i]
                    if(testPotion.getID() == searchID){
                        return i;
                    }
                
                break;
            
                case "adeventure":
        
                    testAdventure = adventureItemList.get[i]
                    if(testAdventure.getID() == searchID){
                        return i;
                    }
                
                break;
            
            }
           
        }
        
        */
        
        // if this line in code is reached create a notification that the item
        // is not found or does not exist
        
    }
    
}
