using System.ComponentModel.DataAnnotations;
using System;
namespace StudentManagement.Models{
    public class lop{
        [KeyAttribute]
        public string malop{get; set;}
        public string tenlop{get; set;}
        //public ICollection<Sinhvien> Sinhvien{get;set;}
    }
}