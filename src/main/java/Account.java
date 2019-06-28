package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

class Account {
    void money(Integer number) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 50, 200, 1000, 20, 5, 2, 10, 100, 500));
        Collections.sort(list, Collections.reverseOrder());
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Integer a = listIterator.next();
            int b = number / a;
            if (b != 0) {
                System.out.print(b + "*" + a + "; ");
                number %= a;
                if (number == 0) break;
            }

        }

    }
}