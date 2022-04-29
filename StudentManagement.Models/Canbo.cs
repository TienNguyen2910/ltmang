using System.ComponentModel.DataAnnotations;
using System;
namespace StudentManagement.Models{
    public class Canbo{
        [KeyAttribute]
        public int MaCB {get; set;}
        public string TenCB {get; set;}
        public string Matkhau{get; set;}
    }
}