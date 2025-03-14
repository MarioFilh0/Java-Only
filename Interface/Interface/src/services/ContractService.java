package services;

import entities.Contract;
import entities.Installment;

import java.text.*;
import java.util.*;

public class ContractService {
    private final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    List<Installment> installmentList = new ArrayList<>();

    public void processContract(Contract contract, Integer months){
        Date contractDate = contract.getDate();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(contractDate);

        for(int i = 1; i <= months; i++){
            calendar.add(Calendar.MONTH, 1);
            Date dueDate = calendar.getTime();
            double div = contract.getTotalValue()/months;
            double totalTax = (div * 0.01) * i;
            totalTax += div;
            double value = totalTax;
            double totalFinal = (totalTax * 0.02) + value;
            System.out.println(formatter.format(dueDate)+" - "+totalFinal);
            installmentList.add(new Installment(totalFinal, dueDate));
        }
    }
}
