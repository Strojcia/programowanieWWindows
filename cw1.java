package lab1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class cw1 {
	public static void main(String[] args) {
	System.out.println("S� dwa zbiory, A i B.\n teraz podaj ile liczb ma mie� zbi�r A.");
	Scanner wpisz=new Scanner(System.in);
	Set<Integer> listaA = new HashSet <Integer>();
	Set<Integer> listaB = new HashSet <Integer>();
	
	int iloscA=wpisz.nextInt();
	while(iloscA > 0)
	{
		System.out.println("Podaj liczby do zbioru A");
		int liczba =wpisz.nextInt();
		System.out.println(liczba);	
		iloscA--;
		listaA.add(liczba);
	}
	System.out.println("Zbi�r A: "+listaA);
	int iloscB=wpisz.nextInt();
	while(iloscB > 0)
	{
		System.out.println("Podaj liczby do zbioru B");
		int liczba =wpisz.nextInt();
		System.out.println(liczba);	
		iloscB--;
		listaB.add(liczba);
	}
	
	System.out.println("Zbi�r B: "+listaB);
	System.out.println("Teraz pora wybra� co chcesz wykona� na zbiorach!\n1. dodawanie zbior�w\n2. r�nica A-B\n3. cz�� wsp�lna\n4. ro�nica symetryczna ");
	int wybor=wpisz.nextInt();
	switch(wybor)
	{
	case 1:
	{
		listaA.addAll(listaB);
		System.out.println(listaA);
	
	}
	break;
	case 2:
	{
		listaA.removeAll(listaB);
		System.out.println(listaA);
	}
	
	break;
	case 3:
	{
		listaA.retainAll(listaB);
		System.out.println(listaA);
	}
	break;
	case 4:
	{
		Set<Integer>listaC = new HashSet <Integer>();
		Set<Integer>listaD = new HashSet <Integer>();
		listaC.addAll(listaA.retainAll(listaB));
		System.out.println(listaC);
		listaD.equals(listaA.addAll(listaB));
		System.out.println(listaD);
		listaD.removeAll(listaC);
		System.out.println(listaD);
	}
	break;
}
	}
	/*public static void main(String[] args)
	{
		System.out.println("Witaj!!\nPodaj liczby ca�kowite!\nWpisz ile liczb chcesz poda�.");
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
		System.out.println("ilo�� unikalnych liczb to: "+lista.size());
	}
	*/
}
