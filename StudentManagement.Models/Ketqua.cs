using System.ComponentModel.DataAnnotations;
using System;
namespace StudentManagement.Models{
    public class Ketqua{
        [KeyAttribute]
        public string masv { get; set; }
        [KeyAttribute]
        public int mamon {get; set; }
        

        public int diem {get; set;}
        //public virtual Sinhvien Sinhvien { get; set; 
        [ForeignKey("masv")]
        public Sinhvien Sinhvien { get; set; }
        [ForeignKet("mamon")]
        public Monhoc Monhoc { get; set; }
    }
}