using System;

namespace CSharp_Calculator_Program
{
    class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("------------------");
            Console.WriteLine("Calculator Program");
            Console.WriteLine("------------------");

            do
            {
                double num1 = 0;
                double num2 = 0;
                double result = 0;

                Console.Write("Enter number 1: ");
                num1 = Convert.ToDouble(Console.ReadLine());

                Console.Write("Enter number 2: ");
                num2 = Convert.ToDouble(Console.ReadLine());

                Console.WriteLine("Enter an option: ");
                Console.WriteLine("\t+ : Add");
                Console.WriteLine("\t- : Subtract");
                Console.WriteLine("\t* : Multiply");
                Console.WriteLine("\t/ : Divide\n");
                Console.Write("Enter an option: ");

                switch (Console.ReadLine())
                {
                    case "+":
                        result = num1 + num2;
                        Console.WriteLine($"Your result: {num1} + {num2} = {result}");
                        break;
                    case "-":
                        result = num1 - num2;
                        Console.WriteLine($"Your result: {num1} - {num2} = {result}");
                        break;
                    case "*":
                        result = num1 * num2;
                        Console.WriteLine($"Your result: {num1} * {num2} = {result}");
                        break;
                    case "/":
                        result = num1 / num2;
                        Console.WriteLine($"Your result: {num1} / {num2} = {result}");
                        break;
                    default:
                        Console.WriteLine("That's not a valid option.");
                        break;
                }

                Console.Write("Would you like to continue?(Y/N) ");

            } while (Console.ReadLine().ToUpper() == "Y");

            Console.WriteLine("\nThank you!\n");

            Console.ReadKey();
        }
    }
}
