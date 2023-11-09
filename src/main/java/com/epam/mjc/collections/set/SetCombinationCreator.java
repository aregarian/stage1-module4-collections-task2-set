package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> resultSet1 = new HashSet<>();



        firstSet.retainAll(secondSet);
        if (firstSet.isEmpty()) {
            firstSet.addAll(secondSet);

        }

        for (String element : firstSet) {
            if (secondSet.contains(element) && !thirdSet.contains(element)) {
                resultSet1.add(element);
            }
        }

        return resultSet1;
    }
}
