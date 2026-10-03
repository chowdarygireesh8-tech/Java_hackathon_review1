public class StudentMarks {
    public static void main(String[] args) {
        int Telugu = 95;
        int Hindi = 90;
        int English = 85;
        int totalMarks = Telugu + Hindi + English;
        int AverageMarks = (Telugu + Hindi + English)/3;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + AverageMarks);
        if (totalMarks >= 150){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
    }
}
