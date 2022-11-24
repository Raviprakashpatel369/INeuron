public class Program
{
    public static void main(String[] args) {
        int n=14;
        for(int i=0;i<n;i++){
            if(i==0||i==n-1)
            for(int j=0;j<n;j++){
                System.out.print("*");
                
            }
            else{
            System.out.print("*");
            for(int j=1;j<n/2-i;j++){
                System.out.print("*");
            }
            int k=((2*i)-1<n-2)?((2*i)-1):(n-2);
            
            for(int j=0;j<k;j++){
                System.out.print(" ");
            }
            System.out.print("*");
             for(int j=1;j<n/2-i+1;j++){
                System.out.print("*");
            }
            }
            System.out.println();
        }
        
    }
}