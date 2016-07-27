package com.goit.finalProject;

import java.util.Comparator;

public class FleetComparator implements Comparator<Plane>{
    @Override
    public int compare(Plane o1, Plane o2){
        return o1.getFlyingRange().compareTo(o2.getFlyingRange());
    };

}
