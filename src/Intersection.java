public class Intersection {

    //intersection problem
    public static void main(String[] args){

        int[] arr1=new int[]{4,9,5};
        int[] arr2=new int[]{9,4,9,8,4};
        int value=0;
        int current=0;
        for(int i=0;i<arr1.length;i++){

            for(int j=i;j<arr2.length;j++){

                if(arr1[i]==arr2[j]){
                    value=arr1[i];
                    current=arr2[j];
                    break;
                }

            }

        }

        System.out.print(value+" "+current);


    }

}
