package labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist<arrayliststring> {

	public static void main(String[] args) {
        String csvFile = "C:\\SDET University\\Files\\creditCardStatement.txt";
        List<ArrayList<String>> transactions = new ArrayList<>();
        String datarow;
        try(BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((datarow = br.readLine()) != null) {
                // use comma as separator
                ArrayList<String> line1 = new ArrayList<>(Arrays.asList(datarow.split(",")));
                transactions.add(line1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
      //  transactions.forEach(strings -> strings.forEach(System.out::println));
        for (int i=0; i<transactions.size(); i++) {
        	System.out.println(transactions.get(i).get(1));
        }
     	
	}
    }

	


