using System;

namespace CSharp_If_Statements
{
    class Program
    {
        static void Main(string[] args)
        {

            //if statement = a basic form of decision making

            //--------------Example #1:--------------

            /*
            Console.Write("Please enter your age: ");
            int age = Convert.ToInt32(Console.ReadLine());

            if (age >= 18 && age < 100)
            {
                Console.WriteLine("You are now signed up!");
            }
            else if (age < 0)
            {
                Console.WriteLine("Invalid age!");
            }
            else if (age >= 100)
            {
                Console.WriteLine("You are too old to sign up!");
            }
            else
            {
                Console.WriteLine("You must be 18+ to sign up!");
            }
            */

            //--------------Example #2:--------------

            Console.Write("Please enter your name: ");
            String name = Console.ReadLine();

            if (name == "")
            {
                Console.WriteLine("You did not enter your name!");
            }
            else
            {
                Console.WriteLine("Hello " + name);
            }

            Console.ReadKey();
        }
    }
}
