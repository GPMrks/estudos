using System;

namespace CSharp_Classes
{
    class Program
    {
        static void Main(string[] args)
        {
            // class = A bundle of related code.
            //              Can be used as a blueprint to create objects (OOP)

            Messages.Hello();
            Messages.Waiting();
            Messages.Bye();

            Console.ReadKey();
        }
    }

    /*
    class Messages
    {
        void Hello()
        {
            Console.WriteLine("Hello! Welcome to the program!");
        }

        void Waiting()
        {
            Console.WriteLine("I am waiting for something!");
        }

        void Bye()
        {
            Console.WriteLine("Bye! Thanks for visiting!");
        }
    }
    */

}
