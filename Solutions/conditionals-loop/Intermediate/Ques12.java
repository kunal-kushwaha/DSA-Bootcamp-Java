package Intermediate;
//Calculate Average Marks
public class Ques12 {
    static int averageMarks(int ...marks){
        int sum = 0;
        for (int m :
                marks) {
            sum+=m;
        }
        return sum/marks.length;

    }
    public static void main(String[] args) {
        System.out.println(averageMarks(12,34,43,22,34));
    }
}
