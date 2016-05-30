package com.goit.lessons.homeWork.module03.Flowers;

import java.util.List;

/**
 * Created by Оксана on 31.05.2016.
 */
public class Bush {
    private List<Aster> asters;
    private List<Camomile> camomiles;
    private List<Rose> roses;
    private List<RoseTree> roseTrees;
    private List<Tulip> tulips;

    public List<Aster> getAsters() {
        return asters;
    }

    public void setAsters(List<Aster> asters) {
        this.asters = asters;
    }

    public List<Camomile> getCamomiles() {
        return camomiles;
    }

    public void setCamomiles(List<Camomile> camomiles) {
        this.camomiles = camomiles;
    }

    public List<Rose> getRoses() {
        return roses;
    }

    public void setRoses(List<Rose> roses) {
        this.roses = roses;
    }

    public List<RoseTree> getRoseTrees() {
        return roseTrees;
    }

    public void setRoseTrees(List<RoseTree> roseTrees) {
        this.roseTrees = roseTrees;
    }

    public List<Tulip> getTulips() {
        return tulips;
    }

    public void setTulips(List<Tulip> tulips) {
        this.tulips = tulips;
    }
}
