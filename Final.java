import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Final {
    HashMap originalGradesMap = (HashMap) TestResults.getOriginalGrades();
HashMap makeUpGradesMap = (HashMap) TestResults.getMakeUpGrades();
    public Map finalGrades(){
        HashMap<String, Integer> finalGrade = new HashMap<>();
        finalGrade.putAll(originalGradesMap);

        for(Object s : finalGrade.keySet()){
            if(finalGrade.get(s) < (int) makeUpGradesMap.get(s)){

               // finalGrade.remove(s);
                finalGrade.put(s.toString(),(int) makeUpGradesMap.get(s));
            }
        }



            //if ( originalGradesMap.get(s) < makeUpGradesMap.get(x) ){}
           // System.out.println("1" + originalGradesMap.get(s));

//            if (TestResults.getOriginalGrades().get(s) < TestResults.getMakeUpGrades().get(s)){}



return finalGrade;
    }

}
