using System;

namespace CSharp_Methods
{
    class Program
    {
        static void Main(string[] args)
        {
            // method  = performs a section of code, whenever it's called "invoked".
            //           benefit = Let's us reuse code w/o writing it multiple times
            //           Good practice is to capitalize method names

            String name = "GPMrks";
            int age = 27;

            singHappyBirthday(name, age);

            Console.ReadKey();
        }

        static void singHappyBirthday(String name, int age)
        {

            Console.WriteLine("Happy birthday to you!");
            Console.WriteLine("Happy birthday to you!");
            Console.WriteLine("Happy birthday dear " + name + "!");
            Console.WriteLine("Happy birthday to you!");
            Console.WriteLine("You are " + age + " years old!");
            Console.WriteLine();

        }

    }
}
