class Instance
{
  static int i=0;
  private Instance()
  {
      System.out.println("obj "+i+" created");
  }
 private static Instance obj;
 public static Instance  getInstance()
 {
        if((i<10))
         {
          obj=new Instance();
			i++;
			
           return obj;
         }
		 else
		 {
			 System.out.println("cannot create instances more than 10");
			 return obj;
		 }
  }
}
class Main
{
    public static void main (String[] args) 
    {   int n=0;
        while(n<12)
        {
            Instance obj=Instance.getInstance();
            n++;
        }
    }
}