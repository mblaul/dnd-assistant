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
    private boolean martial;
    private boolean light;
    private boolean heavy;
    private boolean finesse;
    private boolean silvered;
    private int handed; /*0=1handed,1=2handed,2=versatile*/
    private int damageType; /* 0=piercing,1=slashing,2=bludgeoning*/
    private int dieType;
    private int numDies;
    private String DMGtype="";
    private String NumHand="";
    
public Weapon(){
    super();
}

public Weapon(String name,int cost,double weight,int dt,int dtp,
              int nd,int hd,boolean m,boolean l,boolean hv,boolean f,boolean s){
    super(name,cost,weight);
    damageType=dt;
    dieType=dtp;
    numDies=nd;
    handed=hd;
    martial=m;
    light=l;
    heavy=hv;
    finesse=f;
    silvered=s;
}

public boolean getMartial(){
    return martial;
}
public void setMartial(boolean newMartial){
    martial=newMartial;
}

public int getHanded(){
    return handed;
}
public void setHanded(int newHanded){
    handed=newHanded;
}

public boolean getLight(){
    return light;
}
public void setLight(boolean newLight){
    light=newLight;
}

public boolean getHeavy(){
    return heavy;
}
public void setHeavy(boolean newHeavy){
    heavy=newHeavy;
}
public int getDamageType(){
    return damageType;
}
public void setDamageType(int newDamageType){
    damageType=newDamageType;
}

public boolean getFinesse(){
    return finesse;
}
public void setFinesse(boolean newFin){
    finesse=newFin;
}

public boolean getSilvered(){
    return silvered;
}
public void setSilvered(boolean newSilv){
    silvered=newSilv;
}

public int getDieType(){
    return dieType;
}

public void setDieType(int newDtp){
    dieType=newDtp;
}

public int getNumDies(){
    return numDies;
}

public void setNumDies(int newND){
    numDies=newND;
}

public String getDMGtype(){
    switch(damageType){
        case 0: DMGtype="piercing";
        break;
        case 1: DMGtype="slashing";
        break;
        case 2: DMGtype="bludgeoning";
        break;
    }
    return DMGtype;
}

public String getNumHand(){
    switch(handed){
        case 0: NumHand="one-handed";
        break;
        case 1: NumHand="two-handed";
        break;
        case 2: NumHand="versatile";
        break;
    }
    return NumHand;
}

}
