package lab1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class cw1 {
	public static void main(String[] args) {
	public static void main(String[] args)
	{
		System.out.println("Witaj!!\nPodaj liczby całkowite!\nWpisz ile liczb chcesz podać.");
		Scanner wpisz=new Scanner(System.in);
		Set<Integer> lista = new HashSet<Integer>();
		int ilosc=wpisz.nextInt();
		while(ilosc > 0)
		{
			System.out.println("Podaj liczbe");
			int liczba =wpisz.nextInt();
			System.out.println(liczba);	
			ilosc--;
			lista.add(liczba);
		}
		System.out.println(lista);
		System.out.println("ilość unikalnych liczb to: "+lista.size());
	}
}
