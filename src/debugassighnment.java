
    /* Hvis du kører programmet får du en række fejl.
     * Fix programmet så det kan køre
     * outputtet bliver:
     * "7 is the smallest!"
     *
     *  OBS! Skriv hvad du har gjort som kommentar ud for hver linje du fixer
     */
   int smaller;    // have put variable in the global scope so main can use it


    void main() {

        int a = 7, b = 42;

        minimum(a,b);

        if (smaller == a) {     // if should have parantheis ()--- instead of curly brackets.. the right syntax //

            System.out.println("7 is the smallest!"); // change a is the smallest to number 7

        }

    }

    void minimum(int a, int b) {

        if (a < b) {

            smaller = a; // we dont need to put int we can just use the global variable

        } else { // should not have a condition //

            smaller = b; // we use the global variable.. we dont need to create a new one//

        }


    }



