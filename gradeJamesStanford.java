import java.util.Scanner;

public class gradeJamesStanford {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create Scanner 

        System.out.println("Enter the # of exams taken so far: "); //Ask for # of exams 
        int examNum = input.nextInt();
        
        if (examNum > 4) {
            System.out.println("Error: You can't have more than four exams."); 
            System.exit(1);//User can't have more than 4 exams 
        }
            else {
              System.out.println("Please enter your grade(s) for the exam(s): ");   
            }
           
           
        int examGrades[] = new int[examNum]; 

        for (int i = 0; i < examNum; i++) { //flip through the array allowing the user to input grades
            int j = i + 1;
            System.out.println("Enter grade #" + j +" :");
            examGrades[i] = input.nextInt();
        
        }
        System.out.println("Enter the # of assignments taken so far: "); //Ask for # of assignments
        int assignmentNum = input.nextInt();
        
        if (assignmentNum > 8) {
            System.out.println("Error: You can't have more than eight assignments. ");
            System.exit(1); //User can't have more than 8 assignments
        }
        else {
             System.out.println("Please enter your grade(s) for the assignment(s): "); 
        }
          
           
            int assignmentGrades[] = new int[assignmentNum]; 

            for (int i = 0; i < assignmentNum; i++) {//flip through the array allowing the user to input grades
                int j = i + 1; 
                System.out.println("Enter grade #" + j +" :");
                assignmentGrades[i] = input.nextInt();
                
         
        }
       
        
        input.close();
        //Display the results 
        if (examNum < 4){
        System.out.printf("============================================== \n");
        System.out.println("Exam Average: " + examAverage(examGrades));
        System.out.println("Assignment Average: " + assignmentAverage(assignmentGrades));
        System.out.println("Final Average: " + finalGrade(examAverage(examGrades), assignmentAverage(assignmentGrades)));
        System.out.printf("============================================== \n");
        }
        if(examNum == 4){
            System.out.printf("===============DROP MODE ACTIVATED============ \n");
            System.out.println("Exam Average: " + droppedGrade(examGrades));
            System.out.println("Assignment Average: " + assignmentAverage(assignmentGrades));
            System.out.println("Final Average: " + finalGrade(droppedGrade(examGrades), assignmentAverage(assignmentGrades)));
            System.out.printf("===============DROP MODE ACTIVATED============ \n");
        }


    } // Main Method Close 

    public static double examAverage(int a[]) { //method that finds the average of your exam grades 
        int examAverage = 0; 

        for(int i = 0; i < a.length; i++) {

                examAverage += a[i]; //adds all the values to a var   
               
               
             }
             if (examAverage == 0){

                return 100.00; 
           } else {
               return examAverage / a.length; 
           }
        
     }
        
        public static double assignmentAverage(int a[]) { //method that finds the average of your assignment grades
       
            int assignmentAverage = 0;
    
            for(int i = 0; i < a.length; i++) {

                  assignmentAverage += a[i]; //adds all the values to a var   

                 
                }
        if (assignmentAverage == 0){

             return 100.00; 
        } else {
            return assignmentAverage / a.length; 
        }
       
    }

    public static double finalGrade (double a, double b) { //Method that calculates your final grade using the given formula 
        double finalGrade = 0.00;
         finalGrade = Math.ceil( (b * .5) + (a * .4) + 10);   

         if (a ==  100.00 && b == 100.00){
            return 100.00;
         } else {
            return finalGrade;
         }
        
        
    }
    public static double droppedGrade(int[] examGrades) {
        
        double lowestScore = examGrades[0];

        for(int i = 1; i < examGrades.length; i++){
           if (lowestScore > examGrades[i]) {
            lowestScore = examGrades[i];
           }
        
    }
       return lowestScore(lowestScore, examGrades);
}

public static double lowestScore(double lowestScore, int[] examGrades){
    int droppedGrade = 0;
    for (int j = 0; j < examGrades.length; j++) { 
      
        if (examGrades[j] != lowestScore){
          droppedGrade += examGrades[j];  
        
        }
        

    }
    
    return droppedGrade / 3;
    
}

}// End Program

