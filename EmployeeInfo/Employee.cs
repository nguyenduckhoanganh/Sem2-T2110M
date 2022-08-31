using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeInfo
{
    internal class Employee : Person, IRole
    {
        public string ID { get; set; }
        public override string FirstName { get; set; }
        public override string LastName { get; set; }
        public override string Email { get; set; }
        public override string Phone { get; set; }
        public override DateTime DateOfBirth { get; set; }
        public DateTime JoinningDateTime { get; set; }
        public string Designation { get; set; }


        public Employee(string iD, string firstName, string lastName, string email, string phone, DateTime dateOfBirth, DateTime joinningDateTime, int designation)
        {

            this.ID = iD;
            this.FirstName = firstName;
            this.LastName = lastName;
            this.Email = email;
            this.Phone = phone;
            this.DateOfBirth = dateOfBirth;
            this.JoinningDateTime = joinningDateTime;
            this.Designation = Enum.GetName(typeof(Designation), designation);
        }
        public override string GetFullName()
        {
            return firstName + " " + lastName;
        }

        public override string GetAge()
        {
            TimeSpan age = DateTime.Now - DateOfBirth;
            int year = age.Days / 365;
            int month = (age.Days - year * 365) / 30;
            int day = (age.Days - month * 365 - month * 30);

            return year.ToString() + " tuổi " + month.ToString() + " tháng " + day.ToString() + " ngày";
        }

        public string[] GetRole(string role)
        {
            string[] roles = role.Split(",");
            return roles;
        }
    }
}