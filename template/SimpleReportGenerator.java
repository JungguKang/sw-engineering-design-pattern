import java.util.*;

public class SimpleReportGenerator extends ReportGenerator {
	
	public String printCusNum(List<Customer> customers) {
		
		return String.format("���� ��: %d ��\n", customers.size());
	}
	//does nothing
	public List<Customer> updateList(List<Customer> customers){
		return customers;
	}
	//does nothing
	public String printTotal(List<Customer> customers){
		String empty = "";
		return empty;
	}
}
