/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {

    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList< String> usersData) {
    	super(usersData);
    }


    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
    	for (int index = 1; index < elements.size(); ++index) {
			insert1( index);
		}
    }

    public void insert1( int alreadyInserted) {
		String valueToInsert = elements.get(alreadyInserted);
		for (int indexToCompare = alreadyInserted - 1; indexToCompare >= 0; indexToCompare--) {
			if (valueToInsert.compareTo( elements.get(indexToCompare)) < 0) {
				elements.set(indexToCompare + 1, elements.get(indexToCompare));
			}
			else {
				elements.set(indexToCompare + 1, valueToInsert);
				return;
			}
		}
		elements.set(0, valueToInsert);
	}
}
