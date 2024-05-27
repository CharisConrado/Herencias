package com.mycompany.game;

import com.mycompany.game.spaceship.MilenniumFalcon;
import com.mycompany.game.spaceship.StellarDestroyer;

public class Game {

    public static void main(String[] args) {
        StellarDestroyer stellarDestroyer = new StellarDestroyer(true,true,"Navy",true,4,0,100,200);
        
        stellarDestroyer.shoot();
        
        MilenniumFalcon milenniumFalcon = new MilenniumFalcon (true,2,true,"navy2",true,6,10,100,300);
        
        milenniumFalcon.shoot();
    }
    
}
