package com.JavaAllAtOnce.IOStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URI;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class FileInputStreamPrac {
	
	public static void main(String args[]) throws IOException {
		
		File file=new File("C:\\Users\\sr73\\OneDrive - Capgemini\\Documents\\BankData.txt");
		
		if(file.exists()) {
			
			Scanner fileInputStream=new Scanner(file);
			
			List<BankData> bankDatas=new LinkedList<>();
			
			while(fileInputStream.hasNextLine()) {
				
				String bankDetails[]=fileInputStream.nextLine().split(" - ");
				
				BankData bankData=new BankData(bankDetails[0],Double.valueOf(bankDetails[1]),Double.valueOf(bankDetails[2]));
				
				bankDatas.add(bankData);
				
			}
		
			List<String> bankDataProcessed=bankDatas.stream().collect(Collectors.groupingBy(BankData::getBankName))
			.entrySet().stream().map(bankEntry->bankEntry.getValue().stream().reduce((bank01,bank02)->{
				
				bank01.setBankDeposits(bank01.getBankDeposits()+bank02.getBankDeposits());
				bank01.setBankCredits(bank01.getBankCredits()+bank02.getBankCredits());
				
				return bank01;
				
			})).takeWhile(opbankData->opbankData.isPresent()).map(opBankData->opBankData.get()).sorted(Comparator.comparing(BankData::getBankName))
			.map((bankDataAct)->{
				return String.format("%s - %.2f - %.2f%n", bankDataAct.getBankName(),bankDataAct.getBankDeposits(),bankDataAct.getBankCredits());
			})
			.collect(Collectors.toList());
			
			FileWriter writer=new FileWriter(new File("C:\\Users\\sr73\\OneDrive - Capgemini\\Documents\\BankDataProcessed.txt"));
			
			bankDataProcessed.forEach(bankDataAP->{
				
				try {
					
					writer.write(bankDataAP);
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			});
			
			writer.close();
			
			fileInputStream.close();
			
		}
		
	}

}
