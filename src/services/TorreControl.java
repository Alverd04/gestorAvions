package services;

import classes.Avio;

import java.util.ArrayList;

public class TorreControl {

    public boolean isPistaLliure(ArrayList<Avio> pista){
        for(int i = 0; i < pista.size(); i++){
            if(pista.get(i).getCoordenades().getX()==100 && pista.get(i).getCoordenades().getY()==100){
                return false;
            }
            else{
                continue;
            }
        }
        return true;
    }


}
