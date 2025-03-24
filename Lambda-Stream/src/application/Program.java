package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = "/home/mario-luiz/Documents/temp/in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Employee> list = new ArrayList<Employee>();
			String line = br.readLine();
			while(line != null) {
				
				String[] fields = line.split(",");
				line = br.readLine();
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				
			}
			
			System.out.println("Digite um valor a ser filtrado: ");
			double price = sc.nextDouble();
			sc.nextLine();
			
			List<String> email = list.stream()
					       .filter(e -> e.getSalary() > price) //Filtrou valores acima da var price
					       .map(e -> e.getEmail()) // Capturou o email
					       .sorted() // Listou em ordem alfabetica
					       .collect(Collectors.toList()); //Transformou em lista.
			
			email.forEach(System.out::println);
			
			Double nameFilter = list.stream()
					     .filter(e -> e.getName().charAt(0) == 'M') 	
					     .map(e -> e.getSalary())
					     .reduce(0.0, (x,y) -> x + y);
			
			System.out.println("Soma do salario das pessoas com 'M' "+String.format("%.2f", nameFilter));
					   
			
		}
		catch(IOException e) {
			System.out.println("ERROR: "+e);
		}
	
		sc.close();
	}

}


