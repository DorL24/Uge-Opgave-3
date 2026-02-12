public class score {

    // Opgave 2: Karakter-beregner ..



    //methods with parameters
    /* Lav et program der holder styr på point fra forskellige afleveringer og beregner den samlede score.*/

    int assignmentPoints;
    int examPoints;
    int projectPoints;



    //Lav en metode getTotal, der lægger de tre globale point variable sammen og returnerer resultatet
    int getTotal() {
        int total = assignmentPoints + examPoints + projectPoints;
        return total;

    }

    void addPoints(int points, String type) { // tilføjer point til assignment //Lav en mere generisk metode med signaturen: void addPoints(int points, String type)
        if (type.equals("assignment")) {
            assignmentPoints += points; //add to assignment points
        } else if (type.equals("projects")) {
            projectPoints += points;  // add to project points
        } else if (type.equals("exam")) {
            examPoints += points; //add to exam points
        } else {
            System.out.println("Fail");
        }
    }

    void addExamPoints(int points) {  // tilføjer point til eksamen
        examPoints +=  points;

    }

    void addProjectPoints(int points) {  // tilføjer point til projekt
        projectPoints += points;


    }

    void printTotalScore() { // udskriver total score
        int totalScore = assignmentPoints + examPoints + projectPoints;
        System.out.println("Total:  " + totalScore);
// kald metoden getTotal i printTotal metoden fra før, sådan at printTotal udelukkende har ansvar for at printe.
        getTotal();

    }
// Lav en metode getGrade() der returnerer karakteren baseret på total score (0-50: -3, 51-70: 00, 71-85: 7, 86-100: 12).
    void getGrade() {
        int total = getTotal();
        if (total >= 85) {
            System.out.println(12);

        } else if (total >= 70) {
            System.out.println(70);
        } else if (total >= 50) {
            System.out.println(00);
        } else {
            System.out.println(-3);

        }

    }



            void main(){
                // addAssignmentPoints(25); //Tilføj 25 assignment points // det er en error her... det vil jeg ikke hvorfor..
                addExamPoints(40); //Tilføj 40 exam points
                addProjectPoints(30); // Tilføj 30 project points
                printTotalScore();
                getGrade();
            }

        }



