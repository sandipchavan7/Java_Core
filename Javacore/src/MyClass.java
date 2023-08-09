
public class MyClass
{
   public static void main(String []args)
   {
     int[] a1={1,2,3,4};
     int[] a2={5,6,7,8};
     int[] a3;
     int i,j;
     int total=0;
     int min;
     a3=new int[a1.length+a2.length];
     for(i=0;i<a1.length;i++)
     {
       a3[i]=a1[i];
     }
      for(i=a1.length,j=0;i<a3.length;i++,j++)
      { 
            a3[i]=a2[j]; 
      }
      for(i=0;i<a1.length+a2.length;i++)
       {
         System.out.println(" "+a3[i]);
       }
      
      for (int eacha1 : a1) {
    	  System.out.println(eacha1);
      }
      
      
      for (i=0;i<a1.length;i++) {
    	  total+=a1[i];
      }
      System.out.println(total);
      min=a1[0];
      int max = a1[0];
      for(i=0;i<a1.length;i++) {
    	  
    	  if(min>a1[i]) {
    		  min=a1[i];
    	  }
    	  if(max<a1[i]) {
    		  max=a1[i];
    	  }
      }
      System.out.println(min);
      System.out.println(max);
   }
   
   

    
 
}
