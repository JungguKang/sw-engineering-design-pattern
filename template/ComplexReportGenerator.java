import java.util.*;

public class ComplexReportGenerator extends ReportGenerator{
	public String printCusNum(List<Customer> customers) {
		return String.format("고객의 수: %d 명입니다.\n", customers.size());
	}
	//updates customer list that has more than 100 points
	public List<Customer> updateList(List<Customer> customers){
		List<Customer> selected = new ArrayList<Customer>();
		
		for(Customer customer : customers)
			if(customer.getPoint() >= 100)
				selected.add(customer);
		return selected;
	}
	//prints total points of customers
	public String printTotal(List<Customer> customers) {
		int totalPoint = 0;
		String report = new String();
		for(Customer customer : customers)
			totalPoint += customer.getPoint();
		
		report = String.format("점수 합계: %d", totalPoint);
		return report;
	}
}
