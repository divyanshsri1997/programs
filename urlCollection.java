import java.util.*;
class UrlCollection
{
    private static Hashtable<Integer, String> urlHolder = new Hashtable<Integer, String>();
    public static int containsUrl(String url)
    {
        if(urlHolder.contains(url))
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }


    public static void addUrl(String url)
    {
        urlHolder.put(hashCode(url),url);
    }


    public static int hashCode(String url)//generating hashcode
    {
        int n=url.length();
        return n%2+n-1;
    }
}
class DemoUrlCollection
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        String url;
        while(true)
        {
            System.out.print("Enter URL or enter 'Exit' to close: ");
            url=sc.next();
            if(url.equalsIgnoreCase("exit"))
            {
                break;
            }
            else
            {
                if(UrlCollection.containsUrl(url)==0)
                {
                    System.out.println("already visited");
                }
                else
                {
                    UrlCollection.addUrl(url);
                    System.out.println("Url added");
                }
            }
        }
    }
}