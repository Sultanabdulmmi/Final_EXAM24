using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;

namespace Create_Table
{
    class Program
    {
        public void CreateTable()
        {
            SqlConnection con = null;
            try
            {
                con = new SqlConnection("data source=SULTAN-SA11MM5I\\SULTAN;database=ProdiTI;Integrade Security = TRUE");
                con.Open();

                SqlCommand cm = new SqlCommand("create table Mahasiswa_Coba (NIM char(12) not null primary key, Nama varchar(50), Alamat varchar (255), Jenis_Kelamin char (1))", con);
                cm.ExecuteNonQuery();

                Console.WriteLine("Tabel Sukses Dibuat!");
                Console.ReadKey();
            }       
            catch (Exception e)
            {
                Console.WriteLine("Oops, sepertinya ada yang salah. " + e);
                Console.ReadKey();

            }
            finally
            {
                con.Close();
            }
        }
        static void Main(string[] args)
        {
        }
    }
}
