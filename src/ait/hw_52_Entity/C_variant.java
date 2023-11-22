package ait.hw_52_Entity;

import ait.hw_52_Entity.iterfaces.Entity;
import ait.hw_52_Entity.iterfaces.EntityCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class C_variant implements EntityCollection {
    ArrayList<Entity> list=new ArrayList<>();
    Comparator<Entity> comparator=(e1, e2)->Integer.compare(e1.getValue(), e2.getValue());

    //O(n)
    @Override
    public void add(Entity entity) {
        int index= Collections.binarySearch(list,entity,comparator);
        if (index<0){
            list.add( -index-1,entity);
        }


    }
//O(1)
    @Override
    public Entity removeMaxValue() {


        return list.remove(list.size()-1);
    }
}
