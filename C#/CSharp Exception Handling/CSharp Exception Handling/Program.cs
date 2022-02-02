using System;

namespace CSharp_Exception_Handling
{
    class Program
    {
        static void Main(string[] args)
        {
            // exception = errors that occur during execution

            //        try     = try some code that is considered "dangerous"
            //        catch   = catches and handles exceptions when they occur
            //        finally = always executes regardless if exception is caught or not

            int x;
            int y;
            double result;
            bool right = true;


            do
            {
                try
                {
                    Console.Write("Enter number 1: ");
                    x = Convert.ToInt32(Console.ReadLine());

                    Console.Write("Enter number 2: ");
                    y = Convert.ToInt32(Console.ReadLine());

                    result = x / y;

                    Console.WriteLine("Result: " + result);

                    right = true;
                }

                catch (FormatException e)
                {
                    Console.WriteLine("Enter only NUMBERS, please.\n");
                    right = false;
                }

                catch (DivideByZeroException e)
                {
                    Console.WriteLine("You can't divide by zero!\n");
                    right = false;
                }

                catch (Exception e)
                {
                    Console.WriteLine("Something went wrong.\n");
                    right = false;
                }
            }
            while (right == false);

            Console.WriteLine("Thanks for visiting!");

            Console.ReadKey();
        }
    }
}
