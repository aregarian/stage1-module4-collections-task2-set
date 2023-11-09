package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> hehe = new TreeSet<>();

        for (Integer i: sourceList) {
            hehe.add(i * i);
        }

        return hehe.subSet(lowerBound,upperBound + 1);
    }
}
