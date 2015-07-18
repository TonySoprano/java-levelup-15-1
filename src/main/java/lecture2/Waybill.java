package lecture2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 27.06.2015.
 */
public class Waybill extends Document {

    public List<String> checkPointList = new ArrayList<String>();


    Waybill(Integer number, Float sum, String strAuthor){
        super(number, sum, strAuthor);
    }

    public void setCheckPointList(String checkPointName){
       checkPointList.add(checkPointName);
    }

    public void print(){
        System.out.println(super.toString());
        if (checkPointList.size() > 0){
            System.out.println("Checkpoint list:");
            for (String checkpoint : checkPointList){
                System.out.println(checkpoint);
            }
        }
        System.out.println();
    }
}
