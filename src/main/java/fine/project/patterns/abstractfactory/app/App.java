package fine.project.patterns.abstractfactory.app;

import fine.project.patterns.abstractfactory.comparator.ComparatorEnum;
import fine.project.patterns.abstractfactory.comparator.ObjectComparator;
import fine.project.patterns.abstractfactory.factory.ComparatorFactory;
import fine.project.patterns.abstractfactory.factory.ComparatorManager;

public class App {
	public static void main(String[] args) throws Exception {
		String val1="Hello world";
		String val2=null;
		ComparatorFactory comparatorFactory = ComparatorManager.getComparatorFactory(ComparatorEnum.STRING);
		ObjectComparator comparator = comparatorFactory.createComparator();
		int rez = comparator.compare(val1, val2);
		System.out.println(rez);
	}
}
