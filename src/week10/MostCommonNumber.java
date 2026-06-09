package week10;

public class MostCommonNumber {
     int mostCommonNumber(int[] numbers) {
        int[] counts =new int[100];
        for(int number:numbers){
            counts[number]++;
        }
        int maxCount=0;
        int max=0;
        for(int i=0;i<counts.length;i++){
            if(counts[i]>maxCount){
                maxCount=counts[i];
            }
        }
        return  max;
    }
}

