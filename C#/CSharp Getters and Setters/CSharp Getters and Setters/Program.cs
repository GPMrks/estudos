using System;

namespace CSharp_Getters_and_Setters
{
    class Program
    {
        static void Main(string[] args)
        {
            //getters & setters = add security to fields by encapsulation
            //                    They're accessors found within properties

            // properties = combine aspects of both fields and methods (share name with a field)
            // get accessor = used to return the property value
            // set accessor = used to assign a new value
            // value keyword = defines the value being assigned by the set (parameter)

            Console.Write("What's the speed? ");
            Car car = new Car(Convert.ToInt32(Console.ReadLine()));

            Console.WriteLine("\nThe car is going at " + car.Speed + " km/h!\n");

            Console.ReadKey();
        }

        class Car
        {
            private int speed;

            public Car(int speed)
            {
                Speed = speed;
            }

            public int Speed
            {
                get { return speed; } // readable

                set                   // writable
                {

                    if (value > 220)
                    {      
                        speed = 220;
                        Console.WriteLine("\nThe car speed limit is " + speed + " km/h!");
                    }
                    else
                    {
                        speed = value;
                    }
                    
                }
            }

        }

    }
}
