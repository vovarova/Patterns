package fine.project.patterns.abstractfactory.factory;

import fine.project.patterns.abstractfactory.comparator.ObjectComparator;

public interface ComparatorFactory {
	ObjectComparator createComparator();
}
