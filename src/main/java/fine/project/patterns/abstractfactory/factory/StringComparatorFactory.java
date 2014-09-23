package fine.project.patterns.abstractfactory.factory;

import fine.project.patterns.abstractfactory.comparator.ObjectComparator;
import fine.project.patterns.abstractfactory.comparator.StringComparator;

public class StringComparatorFactory implements ComparatorFactory {

	public ObjectComparator createComparator() {
		return new StringComparator();
	}
}
