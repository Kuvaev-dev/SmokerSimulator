package com.company.controllers;

import com.company.interfaces.CigaretteAction;
import com.company.models.Cigarette;

public class SmokingController implements CigaretteAction {
    Cigarette cigarette = new Cigarette();
    HumanController humanController = new HumanController();

    @Override
    public boolean Smoking() {
        if(cigarette.isArsoned && humanController.TakeMatch() && humanController.TakeSigarette()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean SecondSmoking() {
        if(cigarette.isArsoned && humanController.TakeMatch() && humanController.TakeSigarette()) {
            return true;
        } else {
            return false;
        }
    }
}
