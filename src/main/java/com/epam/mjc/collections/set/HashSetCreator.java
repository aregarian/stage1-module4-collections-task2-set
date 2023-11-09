package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        HashSet<Integer> hehe = new HashSet<>();

        for (int i = 0; i < sourceList.size() ; i++) {
            boolean t = true;
            if (sourceList.get(i) % 2 == 0) {
                int a = sourceList.get(i);
                while (t) {
                    if (a % 2 == 1) {
                        t = false;
                    }

                    hehe.add(a);
                    a = a / 2;

                }
            } else {
                hehe.add(sourceList.get(i));
                hehe.add(sourceList.get(i) * 2);
            }

        }

        return hehe;
    }
}
