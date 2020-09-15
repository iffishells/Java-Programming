import javax.swing.JOptionPane ;

class Grades
{
    static final double English_Midterm_percentage = 0.25 ;
    static final double English_finlaExam_percentage = 0.25 ;
    static final double English_Research_percentage = 0.30 ;
    static final double English_presentation_percentage = 0.20 ;
    static final double Math_Midterm_percentage = 0.50;
    static final double Math_finalExam_percentage = 0.50;
    static final double Science_Midterm_percentage = 0.40 ; 
    static final double Science_finalExam_Percentage = 0.40 ; 
    static final double Science_Research_percentage = 0.20;

    static int Midterm  = 0;
    static int FinalExamGrade = 0;
    static int Research = 0;
    static int Presentation = 0;
    static double FinalNumericGrade = 0;
    static String FinalLetterGrade = ""; 

    public static void main (String args[])
    {
        String MoreGradesToCalculate ;
        String Response ;
        
        MoreGradesToCalculate = JOptionPane.showInputDialog("do you want to calcualte Grades");
        MoreGradesToCalculate = MoreGradesToCalculate.toUpperCase();
       
        While (MoreGradesToCalculate.equals("YES"))
        {
            Response = WhatKindOfStudent();
            switch (Integer.parseInt(Response)) {
                case 1:
                    CalculateEnglishGrade();
                    displayGrade (Midterm,FinalExamGrade ,Research , Presentation , FinalNumericGrade ,FinalLetterGrade);
                    break;
                case 2:
                CalcualteMathGrade();
                displayGrade (Midterm,FinalExamGrade ,FinalNumericGrade ,FinalLetterGrade);
                    break;
                case 3:
                    CalcualteScienceGrade();
                    displayGrade(Midterm , FinalExamGrade , Research , FinalNumericGrade,FinalLetterGrade);
                    break;
            
            
                default:
                    JOptionPane.showMessageDialog(null, Response + " - is not a valid student type");
                    System.exit(0);
                    break;
            }
        }
       
       
       
       
       
       
       

       
       
       
       
       
       
       
       
       


       
       
       
       
       
       
       
    }


    
}