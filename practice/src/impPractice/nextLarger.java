package impPractice;
import java.util.*;
public class nextLarger {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(transformArray(a));
    }
    static int[] transformArray(int a[]){
        
        Stack<Integer> stack = new Stack<>();
        int na[] = new int[a.length];

        stack.push(a[a.length - 1]);
        na[a.length -1] = -1;
        for(int i = a.length - 2 ; i >= 0 ; i--){
            while(stack.size() > 0 && a[i] >= stack.peek()) {
                stack.pop();
            }
            if(stack.size() == 0){
                na[i] = -1;
            }
            else{
                na[i] = stack.peek();
            }
            stack.push(a[i]);
        }
        return na;
    }

}
