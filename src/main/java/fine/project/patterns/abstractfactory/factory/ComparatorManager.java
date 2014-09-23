package fine.project.patterns.abstractfactory.factory;

import fine.project.patterns.abstractfactory.comparator.ComparatorEnum;

public final class ComparatorManager {
	private ComparatorManager() {
	}

	public static ComparatorFactory getComparatorFactory(
			ComparatorEnum comparatorEnum) {
		ComparatorFactory comparatorFactory = null;
		
		switch (comparatorEnum) {
		case INTEGER:
			comparatorFactory = new IntegerComparatorFactory();
			break;
		case STRING:
			comparatorFactory = new StringComparatorFactory();
			break;
		default:
			comparatorFactory = new StringComparatorFactory();
			break;
		}
		
		return comparatorFactory;
	}
}
