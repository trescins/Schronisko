import java.util.Scanner;
import java.util.*;

public class Main_Class {

	public static void main(String[] args) {
		
		 String name;
		 String optionSelected;
		 Scanner getName = new Scanner(System.in);
		 Scanner getOptionSelected = new Scanner(System.in);
		 List animals = new LinkedList();
		 int option;
		 
		 
		
		
		for(int number_of_operations=0; number_of_operations <11; number_of_operations++){

			 System.out.println("Witamy w Hostelu zwierzak�w ! \n");
			 System.out.println("Wybierz co chcesz zrobi� : \n");
			 System.out.println("1. Dodaj zwierzaka ");
			 System.out.println("2. Usu� zwierzaka ");
			 System.out.println("3. Wy�wietl zwierzaki w schronisku ");
			 System.out.println("4. Zamknij schronisko \n");
			 
			 option = getOptionSelected.nextInt();
			 
	 if(option == 1){
		 
		 optionSelected = "Tw�j wyb�r to dodanie zwierzaka \n ";
		 System.out.print("Prosz�, wpisz imi� zwierzaka \n" );
			animals.add(getName.nextLine());
			
	 }
	 if(option == 2){
			
		 optionSelected = "Tw�j wyb�r to usuni�cie zwierzaka \n";
		 System.out.print("Wpisz imi� zwierzaka do usuni�cia \n" );
			animals.remove(getName.nextLine());
			
	 }
	 if(option == 3){
		 
			
		 optionSelected = "Tw�j wyb�r to wy�wietlenie zwierz�t w schronisku \n  ";
		 	System.out.println(animals);
		 	
	 }
	 if(option == 4){
		 	
		 optionSelected = "";
		 break;
	 }
	 if(number_of_operations >= 10 ){
		 System.out.println("Schronisko jest pe�ne ! Oddaj jakiego� zwierzaka !");
		 
	 }
		 }
	 
		 
		}
		 
	}
		
	
		 
		 
		 
	
		

	


