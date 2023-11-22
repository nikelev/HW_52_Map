package ait.hw_52_Entity;

import ait.hw_52_Entity.iterfaces.Entity;
import ait.hw_52_Entity.iterfaces.EntityCollection;

import java.util.Comparator;
import java.util.TreeSet;

public class B_variant implements EntityCollection {
    Comparator<Entity>comparator=(e1,e2)->Integer.compare(e1.getValue(), e2.getValue());
    TreeSet<Entity> set=new TreeSet<>(comparator);

//O(n)
    @Override
    public void add(Entity entity) {
        set.add(entity);

    }
//O(n)
    @Override
    public Entity removeMaxValue() {

        return set.pollLast();
    }
}
