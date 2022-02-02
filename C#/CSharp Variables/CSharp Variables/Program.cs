using System;

namespace CSharp_Variables
{
    class Program
    {
        static void Main(string[] args)
        {
            int x; // declaration
            x = 123; // initialization

            int y = 321; // declaration + initialization

            int z = x + y;

            int age = 27; // whole integer
            double height = 174.5; // decimal number
            bool alive = true; // true or false
            char symbol = '@'; // single character
            String name = "GPMrks"; // a series of characters

            Console.WriteLine("Hello " + name);
            Console.WriteLine("Your age is " + age);
            Console.WriteLine("Your height is " + height + "cm");
            Console.WriteLine("Are you alive? " + alive);
            Console.WriteLine("Your symbol is: " + symbol);

            String userName = symbol + name;

            Console.WriteLine("Your username is: " + userName);

            Console.ReadKey();
        }
    }
}
