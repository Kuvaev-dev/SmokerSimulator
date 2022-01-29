package com.company.controllers;

import com.company.interfaces.HumanAction;
import com.company.models.*;

public class HumanController implements HumanAction {
    Human human = new Human();
    Box box = new Box();
    CigaretteBox cigaretteBox = new CigaretteBox();

    @Override
    public boolean TakeSigarette() {
        if (cigaretteBox.count_of_cigarettes > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean GiveSigarette() {
        if (cigaretteBox.count_of_cigarettes == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean TakeMatch() {
        if(box.number_of_matches > 0 && !human.isHaveBox) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean GiveMatch() {
        if(box.number_of_matches == 0 && human.isHaveBox) {
            return true;
        } else {
            return false;
        }
    }
}
