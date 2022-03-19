import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int arr[][]=new int[n][n];
		 for(int i=0;i<n;i++)
		 {
		     for(int j=0;j<n;j++)
		     {
		         arr[i][j]=sc.nextInt();
		     }
		 }
		 int ct=n*n;
		 int row=0,col=n-1,t=0,te=n-1; // you can use either row or col ,i have used t as row and te as col
		 while(ct>0)
		 {
		         for(int j=t;j<te;j++)
		         {
		             System.out.print(arr[t][j]+" ");
		             ct--;
		         }
		     
		  //   t++;
		  //   te--;
		     for(int i=t;i<te;i++)
		     {
		         System.out.print(arr[i][te]+" ");
		         ct--;
		     }
		     for(int j=te;j>t;j--)
		     {
		         System.out.print(arr[te][j]+" ");
		         ct--;
		     }
		     for(int i=te;i>t;i--)
		     {
		         System.out.print(arr[i][t]+" ");
		         ct--;
		     }
		     t++;
		     te--;
		     if(t==te)
		     {
		         System.out.print(arr[t][te]);
		         break;
		     }
		     if(ct==0)
		     {
		         break;
		     }
		     
		 }
                        		 
	}
}
