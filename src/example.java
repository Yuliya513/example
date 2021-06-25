

public class example {
    public static void main (String [] args){
        Pattern pattern=Pattern compile ("(\\d+)");
        Matcher matcher=pattern matcher ("2019 year,2018 year, 2020 year");
        while (matcher. find());
        {
            System.out.println("matcher.group(1)");
        }
        if (! matcher.group());
        System.out.println("Coincidence doesn't found");
        System.out.println("Coincidence is find");
    }
}
