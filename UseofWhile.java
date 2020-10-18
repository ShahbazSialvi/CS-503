public class UseofWhile{
    public static void main(String[] args) {
        int a,b;
        b = 5;
        a =10;
        while(a != b){
            System.out.println("Still not matched");
            if(a<1){
                a=10;
            }
            if(b<1){
                b=5;
            }
            b--;
            a--;
        }
        System.out.println("Finally matched"+"\na="+a+"\nb="+b);
    }
}