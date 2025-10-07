package common;

import org.apache.commons.lang3.RandomUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class ValueChoosers {

    public static String getRandomTitle() {
        ArrayList<String> lostOfTitles = new ArrayList<>();
        lostOfTitles.add("Proba1");
        lostOfTitles.add("Proba2");
        lostOfTitles.add("Proba3");

        return lostOfTitles.get(RandomUtils.nextInt(0, lostOfTitles.size()));
    }
}
