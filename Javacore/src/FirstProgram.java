
public class FirstProgram {
	public static void main(String[] args) {
		int[] subjectMarks = { 55, 99, 77, 66, 44, 88 };

		int size = subjectMarks.length;
		int total = 0;
		int minSubjectMarks = subjectMarks[0];
		int maxSubjectMarks = subjectMarks[0];

		// Traversing array elements using for loop
		for (int i = 0; i < size; i++) {
			System.out.println(subjectMarks[i]);
		}

		System.out.println("===============");
		// Traversing array elements using for each loop
		for (int eachSubjectMarks : subjectMarks) {
			total = total + eachSubjectMarks;
			if (minSubjectMarks > eachSubjectMarks) {
				minSubjectMarks = eachSubjectMarks;
			}
			if (maxSubjectMarks < eachSubjectMarks) {
				maxSubjectMarks = eachSubjectMarks;
			}
		}

		System.out.println("Total: " + total);
		System.out.println("Min Subject Marks: " + minSubjectMarks);
		System.out.println("Max Subject Marks: " + maxSubjectMarks);

	}

}
