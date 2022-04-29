using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System;
namespace StudentManagement.Models
{
	public class Sinhvien
	{
		[KeyAttribute]
		public string mssv {get; set;}
		public string hoten {get; set;}
		[ForeignKey("malop")]
		public lop lop{get; set;}

		//khoi tao de tao khoa ngoai cho class ket qua
		//public virtual Ketqua ketqua{get;set;}
	}
}