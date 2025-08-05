import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pairsum {




    public static void main(String[] args){

        List<Integer> arrayList=new ArrayList<>(Arrays.asList(2,7,11,15));
        int target=18;

        Pairsum ps=new Pairsum();

        List<Integer> ans= ps.sumindex(arrayList,target);
        System.out.println("Index number: "+ans);

    }

    List<Integer> sumindex(List<Integer> arrayList,int target){

        List<Integer> ans=new ArrayList<>();
        for(int i=0; i<arrayList.size();i++){

            for(int j=i+1;j<arrayList.size();j++){

                if (arrayList.get(i)+arrayList.get(j)==target){

                    ans.add(i);
                    ans.add(j);
                    return ans;

                }

            }


        }

        return ans;

    }

}
