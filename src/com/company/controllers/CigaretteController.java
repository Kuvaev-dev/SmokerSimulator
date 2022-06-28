package com.company.controllers;

import com.company.interfaces.CigaretteAction;
import com.company.models.Cigarette;

public class CigaretteController implements CigaretteAction {
    Cigarette cigarette = new Cigarette();

    @Override
    public boolean Smoking() {
        if(cigarette.isArsoned) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean SecondSmoking() {
        if(cigarette.isArsoned) {
            return true;
        } else {
            return false;
        }
    }
}
