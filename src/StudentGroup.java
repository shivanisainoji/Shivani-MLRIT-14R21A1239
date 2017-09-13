import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	int l;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
                         this.l=length;
	}

	@Override
	public Student[] getStudents() {
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		if(students==null)
                             throw new IllegalArgumentException("IllegalArgumentException");
                           else 
                  this.students=students;
}


	@Override
	public Student getStudent(int index) {
                             if(students==null)
                             throw new IllegalArgumentException("IllegalArgumentException");
		else return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		if(students==null)
                             throw new IllegalArgumentException("IllegalArgumentException");
                            if(index<0 && index>=l)
                           throw new IllegalArgumentException("IllegalArgumentException");
                           else students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
                            if(students==null)
                             throw new IllegalArgumentException("IllegalArgumentException");
		if(l==students.length)
{
                       students=Arrays.copyof(students.length+1);
                     l++;
                    for(int i=l;i>=0;i--)
{
                   students[i]=student[i-1];
}
                 students[0]=student;

	}

	@Override
	public void addLast(Student student) {
		  if(students==null)
                             throw new IllegalArgumentException("IllegalArgumentException");
		if(l==students.length)
{
                       students=Arrays.copyof(students.length+1);
                     l++;
                   students[l]=student;
	}
}


	@Override
	public void add(Student student, int index) {
               if(students==null)
                             throw new IllegalArgumentException("IllegalArgumentException");
		if(l==students.length)
{
                       students=Arrays.copyof(students.length+1);
                     l++;
                   for(int i=l-1;i>index;i--)
{
           students[i]=student[i-1];
}
      students[index]=student;
			}

	@Override
	public void remove(int index) {
       if(students==null)
                             throw new IllegalArgumentException("IllegalArgumentException");
		if(l==students.length)
{
                                         l--;
                   for(int i=index;i<l-1;i++)
{
           students[i]=student[i+1];
}
      students[index]=student;
		
	}
 i
	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
