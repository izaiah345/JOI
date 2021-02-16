class Main {
  public static void main(String[] args) 
  {
    int result = sum(5);
    int outcome = sub(10);
    int equals = multi(9);
    int answer = div(2);
   System.out.println(result);
   System.out.println(outcome);
   System.out.println(equals);
   System.out.println(answer); 
  }
  public static int sum(int num)
  {
   if(num > 0)
   {
   return num + sum(num - 1); 
   }else{
     return 0;
   }
  }
   public static int sub(int num)
  {
   if(num > 0)
   {
   return num - sub(num - 3); 
   }else{
     return 0;
   }
  }
     public static int multi(int num)
  {
   if(num > 0)
   {
   return num * multi(num - 8); 
   }else{
     return 1;
   }
  }
  public static int div(int num)
  {
   if(num > 0)
   {
   return num / div(num - 2); 
   }else{
     return 1;

     
   }
  }
}