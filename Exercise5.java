import java.util.Scanner;

public class Exercise5
    /*
    Write a method called countDuplicates that returns the number of duplicates in a sorted list. The list will be in
sorted order, so all of the duplicates will be grouped together. For example, if a variable list stores the values
[1, 1, 1, 3, 3, 6, 9, 15, 15, 23, 23, 23, 40, 40], the call of list.countDuplicates() should
return 7 because there are 2 duplicates of 1, 1 duplicate of 3, 1 duplicate of 15, 2 duplicates of 23, and 1 duplicate of 40
     */
{

}
class list
{
    public int data;
    public list next;

    public list()
    {
        this(0, null);
    }

    public list(int data)
    {
        this(data, null);
    }

    public list(int data, list next)
    {
        this.data = data;
        this.next = next;
    }
}

class LinkedIntList
{
    private list front;

    public LinkedIntList ()
    {
        front = null;
    }

    public String toString()
    {
        if (front == null)
        {
            return "[]";
        }
        else
        {
            String result = "[" + front.data;
            list current = front.next;

            while (current != null )
            {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    public void add (int value)
    {
        if (front == null)
        {
            front = new list(value);
        }
        else {
            list current = front;

            while (current.next != null)
            {
                current = current.next;
            }
            current.next = new list (value);
        }
    }

    public int countDuplicates()
    {
        int count = 0;
        if (front == null)
        {
            return count;
        }
        else
        {
            list last = front;
            list current = front.next;

            while (current!= null)
            {
                if (last.data == current.data)
                {
                    count += 1;
                }
                last = current;
                current = current.next;
            }
            return count;
        }
    }
}

class main
{
    public static void main(String[] args)
    {
        LinkedIntList liste1 = new LinkedIntList();

        Scanner scanner = new Scanner(System.in);

        int value;
        System.out.println("Skriv et nummer: ");

        value = scanner.nextInt();

        while (value != -1)
        {
            liste1.add(value);

            System.out.println("Enter another number: ");
            value = scanner.nextInt();

            if (value == -1)
                break;
        }
        System.out.println(" Count: " + liste1.countDuplicates());
    }
}
