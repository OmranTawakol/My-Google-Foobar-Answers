import java.util.HashMap;

public class levelOne {
        public static void main(String args[]) {
            int[] x = {14, 27, 1, 4, 2, 50, 3, 1};
            int[] y = {2, 4, -4, 3, 1, 1, 14, 27, 50};
            int z = solution(x,y);
            System.out.println(z);
        }
        public static int solution(int[] x, int[] y) {
            HashMap<Integer,Integer> list = new HashMap<>();
            HashMap<Integer,Integer> list2 = new HashMap<>();
            for(int a = 0; a < x.length; a++){
                list.put(a,x[a]);
            }
            for(int b = 0; b < y.length; b++){
                list2.put(b,y[b]);        
            }
            
            for(int z = 0; z < list.size(); z++){
                if(! list2.containsValue(list.get(z))){
                    return list.get(z);
                }
            }
            for(int c = 0; c < list2.size(); c++){
                if(! list.containsValue(list2.get(c))){
                    return list2.get(c);
                }
            }
            return -1;
        }
    }