package fine.project.patterns.abstractfactory.comparator;

public class StringComparator implements ObjectComparator {

	public int compare(Object o1, Object o2) throws Exception {
		int result = 0;
		if (o1 != null && o2 == null) {
			result = -1;
		} else if (o1 == null && o2 != null) {
			result = 1;
		} else if (o1 == null && o2 == null) {
			result = 0;
		} else if (o1 != null && o2 != null) {
			try {
				String val1 = (String) o1;
				String val2 = (String) o2;
				result = val1.compareTo(val2);
			} catch (ClassCastException castException) {
				throw new Exception(castException);
			}
		}
		return result;
	}

}
