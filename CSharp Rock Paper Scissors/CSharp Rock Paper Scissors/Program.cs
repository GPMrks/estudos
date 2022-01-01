using System;

namespace CSharp_Rock_Paper_Scissors
{
    class Program
    {
        static void Main(string[] args)
        {
            Random random = new Random();
            bool playAgain = true;
            String response;
            String player;
            String computer;

            while (playAgain)
            {
                player = "";
                computer = "";
                response = "";

                while (player != "ROCK" && player != "PAPER" && player != "SCISSORS") {
                Console.Write("Enter ROCK, PAPER, or SCISSORS: ");
                player = Console.ReadLine();
                player = player.ToUpper();
                }

                switch (random.Next(1, 4))
                {
                    case 1:
                        computer = "ROCK";
                        break;
                    case 2:
                        computer = "PAPER";
                        break;
                    case 3:
                        computer = "SCISSORS";
                        break;
                }

                Console.WriteLine("\nPlayer: " + player);
                Console.WriteLine("Computer: " + computer);

                switch (player)
                {
                    case "ROCK":
                        if(computer == "ROCK")
                        {
                            Console.WriteLine("\nIt's a draw!\n");
                        }
                        else if(computer == "SCISSORS")
                        {
                            Console.WriteLine("\nPLAYER WIN!\n");
                        }
                        else
                        {
                            Console.WriteLine("\nCOMPUTER WIN!\n");
                        }
                        break;
                    case "PAPER":
                        if (computer == "PAPER")
                        {
                            Console.WriteLine("\nIt's a draw!\n");
                        }
                        else if (computer == "ROCK")
                        {
                            Console.WriteLine("\nPLAYER WIN!\n");
                        }
                        else
                        {
                            Console.WriteLine("\nCOMPUTER WIN!\n");
                        }
                        break;
                    case "SCISSORS":
                        if (computer == "SCISSORS")
                        {
                            Console.WriteLine("\nIt's a draw!\n");
                        }
                        else if (computer == "PAPER")
                        {
                            Console.WriteLine("\nPLAYER WIN!\n");
                        }
                        else
                        {
                            Console.WriteLine("\nCOMPUTER WIN!\n");
                        }
                        break;
                }

                Console.Write("\nWould you like to continue playing?(Y/N): ");
                response = Console.ReadLine();
                response = response.ToUpper();

                if (response == "Y")
                {
                    playAgain = true;
                }
                else if (response == "N")
                {
                    playAgain = false;
                }
                else
                {
                    Console.WriteLine("\nInvalid. Exiting the game.");
                    playAgain = false;
                }

            }

            Console.WriteLine("\nThank you for playing!");
            
            Console.ReadKey();
        }
    }
}
