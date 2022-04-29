using StudentManagement.Models;
using Microsoft.EntityFrameworkCore;
using System;

namespace StudentManagement.Api.Models
{
    public class AppDbContext : DbContext
    {
        public AppDbContext(DbContextOptions<AppDbContext> options) : base(options)
        {
        }
        public DbSet<Sinhvien> Sinhvien { get; set; }
        public DbSet<Canbo> Canbo { get; set; }
        public DbSet<Monhoc> Monhoc { get; set; }
        public DbSet<lop> lop { get; set; }
        public DbSet<Ketqua> Ketqua{ get; set; }
        public DbSet<Dayhoc> Dayhoc { get; set; }
        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            // modelBuilder.Entity<Sinhvien>().HasNoKey();
            // modelBuilder.Entity<Canbo>().HasNoKey();
            // modelBuilder.Entity<Monhoc>().HasNoKey();
            // modelBuilder.Entity<lop>().HasNoKey();
            // modelBuilder.Entity<Ketqua>().HasNoKey();
            // modelBuilder.Entity<Dayhoc>().HasNoKey();
            // base.OnModelCreating(OnModelCreating);

            modelBuilder.Entity<Monhoc>().HasData(
                new Monhoc { Mamon="CT101", Tenmon="Lập trình căn bản"}
                );
            modelBuilder.Entity<Monhoc>().HasData(
                new Monhoc { Mamon = "CT103", Tenmon = "Cấu trúc dữ liệu" }
                );
            modelBuilder.Entity<Monhoc>().HasData(
                new Monhoc { Mamon = "CT251", Tenmon = "Phát triển ứng dụng trên Windows" }
                );

            modelBuilder.Entity<Canbo>().HasData(
                new Canbo { MaCB=001, TenCB="Nguyễn Văn Cường", Matkhau="123"}
                );

            modelBuilder.Entity<Canbo>().HasData(
                new Canbo { MaCB = 002, TenCB = "Huỳnh Minh Phương", Matkhau = "123" }
                );

            modelBuilder.Entity<Canbo>().HasData(
                new Canbo { MaCB = 003, TenCB = " Thái Cẩm Nhung", Matkhau = "123" }
                );
            modelBuilder.Entity<Sinhvien>().HasData(
                new Sinhvien { mssv = "B18001", hoten = "Phạm Thị Bảo Nhiên", malop = "K44-01" }
                );

            modelBuilder.Entity<Sinhvien>().HasData(
                new Sinhvien { mssv = "B18002", hoten = "Nguyễn Văn An", malop = "K44-01" }
                );

            modelBuilder.Entity<Sinhvien>().HasData(
                new Sinhvien { mssv = "B18003", hoten = "Lê Hoài Anh", malop = "K44-01" }
                );

            modelBuilder.Entity<Sinhvien>().HasData(
                new Sinhvien { mssv = "B18004", hoten = "Nguyễn Lâm Hoàng Anh", malop = "K44-01" }
                );

            modelBuilder.Entity<Sinhvien>().HasData(
                new Sinhvien { mssv = "B18005", hoten = "Lê Minh Bằng", malop = "K44-01" }
                );

            modelBuilder.Entity<Sinhvien>().HasData(
                new Sinhvien { mssv = "B18006", hoten = "Vương Thừa Chấn", malop = "K44-02" }
                );

            modelBuilder.Entity<Sinhvien>().HasData(
                new Sinhvien { mssv = "B18007", hoten = "Cao Công Danh", malop = "K44-02" }
                );

            modelBuilder.Entity<Sinhvien>().HasData(
                new Sinhvien { mssv = "B18008", hoten = "Trịnh Lê Long Đức", malop = "K44-02" }
                );

            modelBuilder.Entity<Sinhvien>().HasData(
                new Sinhvien { mssv = "B18009", hoten = "Dương Lê Minh Hậu", malop = "K44-02" }
                );

            modelBuilder.Entity<Sinhvien>().HasData(
                new Sinhvien { mssv = "B18010", hoten = "Nguyễn Vũ Hoàng", malop = "K44-02" }
                );

            modelBuilder.Entity<Sinhvien>().HasData(
                new Sinhvien { mssv = "B18011", hoten = "Nguyễn Hoàng Thái Học", malop = "K44-03" }
                );
            modelBuilder.Entity<Sinhvien>().HasData(
                new Sinhvien { mssv = "B18012", hoten = "Nguyễn Quốc Huy", malop = "K44-03" }
                );

            modelBuilder.Entity<Sinhvien>().HasData(
                new Sinhvien { mssv = "B18013", hoten = "Võ Đoàn Gia Huy", malop = "K44-03" }
                );

            modelBuilder.Entity<Sinhvien>().HasData(
                new Sinhvien { mssv = "B18014", hoten = "Vũ Thị Bích Huyền", malop = "K44-03" }
                );

            modelBuilder.Entity<Sinhvien>().HasData(
                new Sinhvien { mssv = "B18015", hoten = "Hồ Việt Hưng", malop = "K44-03" }
                );

            modelBuilder.Entity<lop>().HasData(
                new lop { malop ="K44-01", tenlop ="CNPM01" }
                );

            modelBuilder.Entity<lop>().HasData(
                new lop { malop = "K44-02", tenlop = "CNPM02" }
                );
            modelBuilder.Entity<lop>().HasData(
                new lop { malop = "K44-03", tenlop = "CNPM03" }
                );
            modelBuilder.Entity<Dayhoc>().HasNoKey(
                //new Dayhoc { macb=001,mamon="CT101",malop="K44-01"}
                );
            modelBuilder.Entity<Ketqua>().HasNoKey(
               //new Dayhoc { macb=001,mamon="CT101",malop="K44-01"}
               );
        }

    }
}