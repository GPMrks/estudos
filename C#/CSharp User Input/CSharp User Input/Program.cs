using System;

namespace CSharp_User_Input
{
    class Program
    {
        static void Main(string[] args)
        {

            Console.Write("Enter your name: ");

            String name = Console.ReadLine();

            Console.Write("Enter your age: ");

            int age = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("\nHello " + name);
            Console.WriteLine("You are " + age + " years old");

            Console.ReadKey();
        }
    }
}
