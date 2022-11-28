# Array

~~~java
int[] ary = {1, 2, 3};
//           0  1  2
~~~

uninitialized array are filled with 0



## Bubble Sort

~~~java
package com.thealgorithms.sorts;

import static com.thealgorithms.sorts.SortUtils.*;

/**
 * @author Varun Upadhyay (https://github.com/varunu28)
 * @author Podshivalov Nikita (https://github.com/nikitap492)
 * @see SortAlgorithm
 */
class BubbleSort implements SortAlgorithm {

    /**
     * Implements generic bubble sort algorithm.
     *
     * @param array the array to be sorted.
     * @param <T> the type of elements in the array.
     * @return the sorted array.
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int i = 1, size = array.length; i < size; ++i) {
            boolean swapped = false;
            for (int j = 0; j < size - i; ++j) {
                if (greater(array[j], array[j + 1])) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return array;
    }
}
~~~

## Linear Search

~~~java
package com.thealgorithms.searches;

import com.thealgorithms.devutils.searches.SearchAlgorithm;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Linear search is the easiest search algorithm It works with sorted and
 * unsorted arrays (an binary search works only with sorted array) This
 * algorithm just compares all elements of an array to find a value
 *
 * <p>
 * Worst-case performance O(n) Best-case performance O(1) Average performance
 * O(n) Worst-case space complexity
 *
 * @author Varun Upadhyay (https://github.com/varunu28)
 * @author Podshivalov Nikita (https://github.com/nikitap492)
 * @see BinarySearch
 * @see SearchAlgorithm
 */
public class LinearSearch implements SearchAlgorithm {

    /**
     * Generic Linear search method
     *
     * @param array List to be searched
     * @param value Key being searched for
     * @return Location of the key
     */
    @Override
    public <T extends Comparable<T>> int find(T[] array, T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(value) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // just generate data
        Random r = new Random();
        int size = 200;
        int maxElement = 100;
        Integer[] integers = Stream
            .generate(() -> r.nextInt(maxElement))
            .limit(size)
            .toArray(Integer[]::new);

        // the element that should be found
        Integer shouldBeFound = integers[r.nextInt(size - 1)];

        LinearSearch search = new LinearSearch();
        int atIndex = search.find(integers, shouldBeFound);

        System.out.println(
            String.format(
                "Should be found: %d. Found %d at index %d. An array length %d",
                shouldBeFound,
                integers[atIndex],
                atIndex,
                size
            )
        );
    }
}
~~~

## Binary Search

~~~java
package com.thealgorithms.searches;

import static java.lang.String.format;

import com.thealgorithms.devutils.searches.SearchAlgorithm;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

/**
 * Binary search is one of the most popular algorithms The algorithm finds the
 * position of a target value within a sorted array
 *
 * <p>
 * Worst-case performance O(log n) Best-case performance O(1) Average
 * performance O(log n) Worst-case space complexity O(1)
 *
 * @author Varun Upadhyay (https://github.com/varunu28)
 * @author Podshivalov Nikita (https://github.com/nikitap492)
 * @see SearchAlgorithm
 * @see IterativeBinarySearch
 */
class BinarySearch implements SearchAlgorithm {

    /**
     * @param array is an array where the element should be found
     * @param key is an element which should be found
     * @param <T> is any comparable type
     * @return index of the element
     */
    @Override
    public <T extends Comparable<T>> int find(T[] array, T key) {
        return search(array, key, 0, array.length - 1);
    }

    /**
     * This method implements the Generic Binary Search
     *
     * @param array The array to make the binary search
     * @param key The number you are looking for
     * @param left The lower bound
     * @param right The upper bound
     * @return the location of the key
     */
    private <T extends Comparable<T>> int search(
        T array[],
        T key,
        int left,
        int right
    ) {
        if (right < left) {
            return -1; // this means that the key not found
        }
        // find median
        int median = (left + right) >>> 1;
        int comp = key.compareTo(array[median]);

        if (comp == 0) {
            return median;
        } else if (comp < 0) {
            return search(array, key, left, median - 1);
        } else {
            return search(array, key, median + 1, right);
        }
    }

    // Driver Program
    public static void main(String[] args) {
        // Just generate data
        Random r = ThreadLocalRandom.current();

        int size = 100;
        int maxElement = 100000;

        Integer[] integers = IntStream
            .generate(() -> r.nextInt(maxElement))
            .limit(size)
            .sorted()
            .boxed()
            .toArray(Integer[]::new);

        // The element that should be found
        int shouldBeFound = integers[r.nextInt(size - 1)];

        BinarySearch search = new BinarySearch();
        int atIndex = search.find(integers, shouldBeFound);

        System.out.println(
            format(
                "Should be found: %d. Found %d at index %d. An array length %d",
                shouldBeFound,
                integers[atIndex],
                atIndex,
                size
            )
        );

        int toCheck = Arrays.binarySearch(integers, shouldBeFound);
        System.out.println(
            format(
                "Found by system method at an index: %d. Is equal: %b",
                toCheck,
                toCheck == atIndex
            )
        );
    }
}
~~~

