package Zrobione.petleIPliki.ZapisDoPliku.javaWay


import java.io.PrintWriter


fun main(args: Array<String>) {
    val pw = PrintWriter("danie.txt")
    pw.println("Szymon lubi pierogi :)")

    //zapisanie kolejnej linii
    //pw.println("Kamil lubi jeść (dużo!)");
    pw.close()
}

