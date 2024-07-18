package org.dexter.generic.core;

import java.util.ArrayList;
import java.util.List;

public class Library <T extends Media>{

    private List<T> inventory = new ArrayList<>();


    public void addMedia(T media){
        inventory.add(media);
    }

    public List<T>getInventory(){
        return inventory;
    }

    public T findMediaByTitle(String title){
        for (T media : inventory){
            if (media.getTitle().equalsIgnoreCase(title)) {

                return media;
            }
        }
        return null;
    }


}
