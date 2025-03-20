package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String path = "D:\\temp\\in.txt";
        Map<String, Integer> stock = new LinkedHashMap<>();

        int somaAlex = 0;
        int somaMaria = 0;
        int somaBob = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while(line != null){
                String[] split = line.split(",");
                String name = split[0];
                Integer vote = Integer.parseInt(split[1]);
                stock.put(name,vote);

                if(name.equals("Alex Blue")){
                        somaAlex += Integer.parseInt(split[1]);
                        stock.put(name, somaAlex);
                }if(name.equals("Maria Green")){
                    somaMaria += Integer.parseInt(split[1]);
                    stock.put(name, somaMaria);
                }if(name.equals("Bob Brown")){
                    somaBob += Integer.parseInt(split[1]);
                    stock.put(name, somaBob);
                }
                line = br.readLine();
            }

            for(String key : stock.keySet()){
                System.out.println(key+": "+stock.get(key));
            }
        }
        catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }



    }
}