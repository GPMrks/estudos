using System;

namespace CSharp_String_Methods
{
    class Program
    {
        static void Main(string[] args)
        {

            String fullName = "GPMrks";
            String phoneNumber = "31 99237-9771";


            //fullName = fullName.ToUpper();
            //fullName = fullName.ToLower();
            //Console.WriteLine(fullName);

            //phoneNumber = phoneNumber.Replace("-", "/");
            //Console.WriteLine(phoneNumber);

            //String userName = fullName.Insert(0, "@");
            //Console.WriteLine(userName);

            //Console.WriteLine(fullName.Length);

            String firstName = fullName.Substring(0, 2);
            String lastName = fullName.Substring(2, 4);

            Console.WriteLine(firstName);
            Console.WriteLine(lastName);

            Console.ReadKey();
        }
    }
}
