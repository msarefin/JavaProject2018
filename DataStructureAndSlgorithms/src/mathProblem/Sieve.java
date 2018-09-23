package mathProblem;

public class Sieve
{

    private int current;
    private int max;
    private Sieve   parent;

    public Sieve(int current, int max, Sieve parent )
    {
        this.current = current;
        this.max = max;
        this.parent = parent;
    }

    public static void main(String[] args)
    {
        int n = 1234567;

        System.out.print("Primes from 1 to " + n + ":\n");

        printPrimes(n);
    }

    private static void printPrimes(int i)
    {
        new Sieve(2,i,null).start();    
    }

    private void start()
    {
        if(current <2 || max <2)
        {
            return;
        }

        if(this.current > max)
        {
            parent.print();
            return;
        }

        for(int i = this.current+1;current<=max+1;i++)
        {
            if(this.testPrime(i))
            {
                new Sieve(i,this.max,this).start();
                return;
            }
        }
    }

    private boolean testPrime(int i)
    {
        if(i%this.current != 0)
        {
            if(this.parent == null)
            {
                return true;
            }
            else
            {
                return this.parent.testPrime(i);
            }
        }
        return false;
    }

    private void print()
    {
        if(this.parent != null)
        {
            this.parent.print();
        }

        System.out.print(" "+this.current);
    }


}
