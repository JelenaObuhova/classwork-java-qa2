package homework3;

import jdk.dynalink.Operation;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ActionWithNumbers {
    @Test
    public void twentyNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(186);
        numbers.add(12);
        numbers.add(18);
        numbers.add(21);
        numbers.add(27);
        numbers.add(31);
        numbers.add(589);
        numbers.add(38);
        numbers.add(42);
        numbers.add(8);
        numbers.add(48);
        numbers.add(113);
        numbers.add(59);
        numbers.add(22);
        numbers.add(777);
        numbers.add(9);
        numbers.add(16);
        numbers.add(24);
        numbers.add(14);

        for (Integer num : numbers) {
            if (num / 2 == 4) {
                System.out.println(num + " - " + "Divided numbers by 2 equals 4.");

            }
        }
        for (Integer evenNum: numbers){
            if (evenNum % 2 == 0){
                System.out.println("Even numbers:" + " "+ evenNum);
            }
        }
    }
}




