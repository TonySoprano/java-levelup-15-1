package lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by ivanm on 07.07.2015.
 */
public class MyRandomGenerator {
    public Integer minValue, maxValue;

    MyRandomGenerator(Integer minValue, Integer maxValue){
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public Integer getRandomValue(){
        Integer result;

        while (true) {
            result = new Random().nextInt(maxValue);
            if(result >= minValue && result <= maxValue){
                break;
            }

        }
        return result;
    }

}
