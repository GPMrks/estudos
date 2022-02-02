using System;

namespace CSharp_Return_Keyword
{
    class Program
    {
        static void Main(string[] args)
        {
            // return  = returns data back to the place where a method is invoked

            double x;
            double y;
            double result;

            Console.Write("Enter first number: ");
            x = Convert.ToDouble(Console.ReadLine());

            Console.Write("Enter second number: ");
            y = Convert.ToDouble(Console.ReadLine());

            result = Multiply(x, y);

            Console.WriteLine("The result is " + result);

            Console.ReadKey();
        }

        static double Multiply(double x, double y)
        {
            return x * y;
        }

    }
}
