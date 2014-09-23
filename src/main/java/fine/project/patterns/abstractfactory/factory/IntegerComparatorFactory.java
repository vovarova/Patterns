package fine.project.patterns.abstractfactory.factory;

import fine.project.patterns.abstractfactory.comparator.IntegerComparator;
import fine.project.patterns.abstractfactory.comparator.ObjectComparator;

public class IntegerComparatorFactory implements ComparatorFactory {

	public ObjectComparator createComparator() {
		return new IntegerComparator();
	}
}
