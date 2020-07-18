import java.util.*;
/**
 * parent class of ComplexReportGenerator and SimpleReportGenerator
 * used template method pattern
 * because the frame of two child class are same
 */
public abstract class ReportGenerator {
	
	public String generate(List<Customer> customers) {
		//first abstract method
		String report = printCusNum(customers);
		//second abstract method
		List<Customer> upcustomers = updateList(customers);
		//shared part
		for(int i=0; i< upcustomers.size(); i++) {
			Customer customer = upcustomers.get(i);
			report+=String.format("%d: %s\n",customer.getPoint(), 
					customer.getName());
		}
		//third abstract method
		report += printTotal(customers);
		return report;
	}
	//prints customer number in different format
	public abstract String printCusNum(List<Customer> customers);
	//ComplexReportGenerator updates customer list
	public abstract List<Customer> updateList(List<Customer> customers);
	//ComplexReportGenerator prints total score of customers
	public abstract String printTotal(List<Customer> customers);
}
