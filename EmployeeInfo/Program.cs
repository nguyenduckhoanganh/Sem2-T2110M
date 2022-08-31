using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeInfo
{
    internal class Program
    {
        static void Main(string[] cmd)
        {
            try
            {
                Console.WriteLine("Input :...............");
                Console.WriteLine("Enter Id:");
                string id = Console.ReadLine();

                Console.WriteLine("Enter First Name:");
                string firstName = Console.ReadLine();

                Console.WriteLine("Enter Last Name:");
                string lastName = Console.ReadLine();

                Console.WriteLine("Enter Email:");
                string email = Console.ReadLine();

                Console.WriteLine("Enter Number:");
                string phone = Console.ReadLine();

                Console.WriteLine("Enter Date of birth (mm/dd/yyyy):  ");
                DateTime dateOfBarth = Convert.ToDateTime(Console.ReadLine());

                Console.WriteLine("Joining Date (mm/dd/yyyy):");
                DateTime JoiningDateTime = Convert.ToDateTime(Console.ReadLine());

                Console.WriteLine("DESIGNATIONS:\n========================" +
                    "\n1 CEO\n2 President\n3 SOFTWAREENGINEER\n4 TraineeEngineer\n5 ProjectManager" +
                    "\n6 SystemEngineer\n7 WebDeveloper\n8 QualityAnalyst");
                Console.Write("\nInput any one serial number of the designations given above: ");
                int deg = Int32.Parse(Console.ReadLine());

                Employee employee = new Employee(id, firstName, lastName, email, phone, dateOfBarth, JoiningDateTime, deg);
                Console.Write("\nGive  roles of the employee (Seperate by comma[,]) ");
                string[] roles = employee.GetRole(Console.ReadLine());

                Console.WriteLine("\nOUTPUT\n===============");
                Console.WriteLine("\nEmployee ID: " + employee.ID + "\nName: " + employee.GetFullName() + "\nDate of birth: " +
                    employee.DateOfBirth.ToShortDateString() + "\nJoining Date: " + employee.JoinningDateTime.ToShortDateString() + "\nDesignation: " +
                    employee.Designation + "\nAge: " + employee.GetAge() + "\nRole plays :");
                for (int i = 0; i < roles.Length; i++)
                {
                    Console.WriteLine((i + 1).ToString() + " . " + roles[i].Trim());
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            doSalary();
            Console.ReadLine();
        }
        static void doSalary()
        {
            Console.WriteLine("\n\nSalary Caculate: \n===================");
            Console.WriteLine("Input Basic Salary");
            var bs = Console.ReadLine();
            Salary s = new Salary();
            var bsReturn = s.CalculateSalary(Convert.ToInt32(bs));
            var overtime = s.CalculateSalary(Convert.ToInt32(bs));

            Console.WriteLine(">> Basic Salary   {0} /= {1}", s.basicSalary, s.currency);
            Console.WriteLine(">> House Rent:{0} /= {1}", s.hourRent, s.currency);
            Console.WriteLine(">> Medical Allowance:   {0} /= {1}", s.medicalAllowance, s.currency);
            Console.WriteLine(">> Conveyance Allowance:  {0} /= {1}", s.conveyance, s.currency);
            Console.WriteLine(">> Over Time :  {0} /= {1}", overtime, s.currency);
            Console.WriteLine("................................");
            Console.WriteLine("  Gross Salary :    {0} /= {1}", bsReturn, s.currency);
            Console.WriteLine();
        }
    }
}