//superclass
abstract class Person(
    val AadharId: Int,
    val Name: String,
    val Address: String,
    val Phone: Long,
    val Profession: String
) {
    abstract fun Register(UID: String): String
    abstract fun Perform(duty: String): String
    abstract fun include(service: String): String
    abstract fun like(item: String): String
}
//polymorphic student class
abstract class Student(
    AadharId: Int,
    Name: String,
    Address: String,
    Phone: Long,
    Profession: String,
    val StudentID: String,
    val Major: String,
    val Year: Int,
    val Semester: Int,
    val College: String,
    val grade: Int
) : Person(AadharId, Name, Address, Phone, Profession) {

    override fun Register(UID: String): String {
        return "Student $Name with ID $StudentID registered with UID: $UID"
    }

    override fun Perform(duty: String): String {
        return "The student $Name performs the following duty: $duty"
    }

    override fun include(service: String): String {
        return "The service that can be availed by $Name is $service"
    }

    override fun like(item: String): String {
        return "$Name likes $item"
    }
    //since this is an abstract class, we make its methods also abstract.
    abstract fun RegisterCourse(course: String): String
    abstract fun getGrade(course: String): Int
    abstract fun Attend(className: String): String
    abstract fun Learn(): String
}
//concrete student class

class PGStudent(
    AadharId: Int,
    Name: String,
    Address: String,
    Phone: Long,
    Profession: String,
    StudentID: String,
    Major: String,
    Year: Int,
    Semester: Int,
    College: String,
    grade: Int,
    var RollNO:String,
    var Specialization:String
) : Student(
    AadharId,
    Name,
    Address,
    Phone,
    Profession,
    StudentID,
    Major,
    Year,
    Semester,
    College,
    grade
) {
    override fun Register(UID: String): String {
        RollNO= StudentID
        return "Registered for $UID"
    }
    override fun RegisterCourse(course: String): String {
        return "$Name with ID $StudentID: registered for course: $course\n"
    }

    override fun getGrade(course: String): Int {
        // Implementation to get the grade for the course
        return 85 // Example grade
    }

    override fun Attend(className: String): String {
        return "$Name with ID $StudentID is attending class: $className"
    }

    override fun Learn(): String {
        Specialization = Major
        return "$Name with ID $StudentID is learning Major: $Specialization"
    }

    fun SubmitThesis(topic: String): String {
        return "$Name with ID $StudentID submitted a thesis on: $topic"
    }
}
abstract class Staff(
    AadharId: Int,
    Name: String,
    Address: String,
    Phone: Long,
    Profession: String,
    val EmpId: String,
    val EmpRole: String,
    val EmpDept: String,
    val EmpSalary: Float,
    val EmpExperience: Int
) : Person(AadharId, Name, Address, Phone.toLong(), Profession) {

    override fun Register(UID: String): String {
        return "Staff $Name with Employee ID $EmpId registered with UID: $UID"
    }

    override fun Perform(duty: String): String {
        return "The staff $Name performs the following duty: $duty"
    }

    override fun include(service: String): String {
        return "The service that can be availed by $Name is $service"
    }

    override fun like(item: String): String {
        return "$Name likes $item"
    }
    //since this is an abstract class, we make its methods also abstract.
    abstract fun ManageTeam(teamName: String): String
    abstract fun AssignTask(task: String): String
    abstract fun CalculateSalary(): Float
}
//concrete faculty class

class Faculty(
    AadharId: Int,
    Name: String,
    Address: String,
    Phone: Long,
    Profession: String,
    EmpId: String,
    EmpRole: String,
    EmpDept: String,
    EmpSalary: Float,
    EmpExperience: Int,
    val FacultySpecialization: String,
    val Section: String,
    val NoOfStudents: Int,
    val Qualification: String
) : Staff(
    AadharId,
    Name,
    Address,
    Phone,
    Profession,
    EmpId,
    EmpRole,
    EmpDept,
    EmpSalary,
    EmpExperience
) {
    override fun Register(UID: String): String {
        return "Faculty $Name with Employee ID $EmpId registered with UID: $UID"
    }

    override fun Perform(duty: String): String {
        return "The faculty $Name performs the following duty: $duty"
    }

    override fun include(service: String): String {
        return "The service that can be availed by $Name is $service"
    }

    override fun like(item: String): String {
        return "$Name likes $item"
    }

    override fun ManageTeam(teamName: String): String {
        return "Faculty $Name is managing the team: $teamName"
    }

    override fun AssignTask(task: String): String {
        return "Faculty $Name is assigning the task: $task"
    }

    override fun CalculateSalary(): Float {
        return EmpSalary // Example implementation
    }
    fun Teach(Course: String): String {
        return "Faculty $Name is teaching the course: $Course"
    }

    fun Assess(StudentGrade: String): String {
        //create student object
        val student:Student = PGStudent  (
            AadharId = 60808,
        Name = "Saqlain",
        Address = "147 F Block, Model Town, Lahore.",
        Phone = 923213869909,
        Profession = "Student",
        StudentID = "19L-2326",
        Major = "Computer Science",
        Year = 4,
        Semester = 9,
        College = "FAST NUCES",
        grade = 90,
        RollNO = "19L-2326",
        Specialization = "Software and Mobile Development")
        return "$Name has assessed ${student.Name} with grade: $StudentGrade"
    }
}
//concrete technician class:

class Technician(
    AadharId: Int,
    Name: String,
    Address: String,
    Phone: Long,
    Profession: String,
    EmpId: String,
    EmpRole: String,
    EmpDept: String,
    EmpSalary: Float,
    EmpExperience: Int,
    val TechType: String
) : Staff(
    AadharId,
    Name,
    Address,
    Phone,
    Profession,
    EmpId,
    EmpRole,
    EmpDept,
    EmpSalary,
    EmpExperience
) {
    override fun Register(UID: String): String {
        return "Technician $Name with Employee ID $EmpId registered with UID: $UID"
    }

    override fun Perform(duty: String): String {
        return "The technician $Name performs the following duty: $duty"
    }

    override fun include(service: String): String {
        return "The service that can be availed by $Name is $service"
    }

    override fun like(item: String): String {
        return "$Name likes $item"
    }

    override fun ManageTeam(teamName: String): String {
        return "Technician $Name is managing the team: $teamName"
    }

    override fun AssignTask(task: String): String {
        return "Technician $Name is assigning the task: $task"
    }

    override fun CalculateSalary(): Float {
        return EmpSalary // Example implementation
    }

    fun Maintain(Lab: String): String {
        return "$Lab"
    }
    fun Install(system: String): String {
        return "$system"
    }
}
