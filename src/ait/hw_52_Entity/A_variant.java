package ait.hw_52_Entity;

import ait.hw_52_Entity.iterfaces.Entity;
import ait.hw_52_Entity.iterfaces.EntityCollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class A_variant implements EntityCollection {
    HashSet<Entity> set = new HashSet<>();
    Comparator<Entity>comparator=(e1,e2)->Integer.compare(e1.getValue(), e2.getValue());

    //O(1)
    @Override
    public void add(Entity entity) {
        set.add(entity);

    }

    //O(n)
    @Override
    public Entity removeMaxValue() {
        Entity max= Collections.max(set,comparator  );
        set.remove(max);

        return max;
    }
}
