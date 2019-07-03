import java.util.HashMap;


public class Lockers {


    public static HashMap generateLockers(HashMap e, int index)

    {
        String temp = "Locker"+index;
        e.put(temp,false);
        return e;
    }

    public static HashMap openClose(HashMap e,int increment)

    {
        for(int i = increment; i<=100; i=i+increment)
        {
            if((e.get("Locker"+i).equals(false)))
            {
                e.replace("Locker"+i,true);
            }
            else
            {
                e.replace("Locker"+i,false);
            }
        }
        return e;
    }


    public static void main(String[] args)
    {

        HashMap<String,Boolean> lockers = new HashMap<>();

        int j = 1;

        for(int i = 1; i<=100;i++)
        {
            lockers = generateLockers(lockers,i);
        }

        while(j!=101)
        {
            lockers = openClose(lockers, j);
            j++;
        }


        for(int i = 1; i<=100; i++)
        {
            if((lockers.get("Locker"+i).equals(true)))
            {
                System.out.println("Locker "+i+" is open");
            }
        }

    }
}
