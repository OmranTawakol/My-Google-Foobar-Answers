
public class levelTwo {
    
    public static void main(String args[]) {
        int[] x = {10,2,3,4};       //This array can be changed to try new test cases
        int z = 15;                 //This variable can be changed to try new test cases
        int[] y = solution(x,z);
        System.out.println(y[0]);
        System.out.println(y[1]);
    }

    public static int[] solution(int[] l, int t) {
        int total = 0;
        int[] outcome = {0,0};
        int[] nothing = {-1,-1};
        /*Used a nested for loop that starts at each value in the array and looks to see-
        if a sequence of numbers add up to the total if not the program stops the inner
        for loop and changes to the next value in the array and starts again. If all 
        values are passed and nothing adds up to the total the function returns -1 -1*/
        for(int x = 0; x < l.length;x++){
            total = 0;
            for(int y = x; y < l.length;y++){
                total = total + l[y];
                if(total == t){   //if total is found
                    outcome[0] = x;
                    outcome[1] = y;
                    return outcome;   //returns array
            }
                if(total > t){   //if total goes over key number set total back to 0 return to outter loop
                    total = 0;
                    y = l.length;
            }
            }
        }
        return nothing;
    }
}