using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;
using System;
namespace StudentManagement.Models{
    public class Dayhoc{
        [KeyAttribute]
        public int macb { get; set; }
        [KeyAttribute]
        public string mamon { get; set; }
        [KeyAttribute]
        public string malop { get; set; }
        
        [ForeignKey("macb)]
        public Canbo Canbo{set;get;}

        [ForeignKey("mamon")]
        public Monhoc Monhoc{set;get;

        [ForeignKey("malop")]
        public lop lop{ set; get; }
    }
}