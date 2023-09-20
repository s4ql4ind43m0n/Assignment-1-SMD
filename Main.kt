
fun main() {

//q1
    println("QUESTION 1\n")

    val bowler1 = ConcreteBowler()
    bowler1.getRanking()
    bowler1.setWickets(50)
    bowler1.print("Saqlain",23,"Pakistan")
    bowler1.print()

    val batsman1 = ConcreteBatsman()
    batsman1.getRanking()
    batsman1.setScore(5409)
    batsman1.getScore()
    batsman1.print("Babar Azam", 28,"Pakistan" )
    batsman1.print()

    val allRounder = AllRounder()
    allRounder.print("John", 25, "England")
    allRounder.setScore(1000)
    allRounder.setWickets(50)
    allRounder.setBowlerRanking(10)
    allRounder.setBatsmanRanking(50)
    println("Ranking is: ${allRounder.getRanking()}")
    println("all-Rounder's score: ${allRounder.getScore()}")
    println("all-Rounder's Wickets: ${allRounder.getWickets()}\n\n\n\n\n\n")

    println("QUESTION 2\n")

    /*-----q2------*/

    //code before prettifying it
//    val pgStudent: Student = PGStudent(
//        AadharId = 60808,
//        Name = "Saqlain",
//        Address = "147 F Block, Model Town, Lahore.",
//        Phone = 923213869909.toInt(),
//        Profession = "Student",
//        StudentID = "19L-2326",
//        Major = "Computer Science",
//        Year = 4,
//        Semester = 9,
//        College = "FAST NUCES",
//        grade = 90,
//        RollNO = "19L-2326",
//        Specialization = "Software and Mobile Development"
//    )
//
//    println(pgStudent.Register("19L-2326"))
//    println(pgStudent.Perform("doing assignments"))
//    println(pgStudent.include("Google for learning syntax and ChatGPT for completing repetitive code"))
//    println(pgStudent.like("Studying and learning ways to solve problems"))
//    println(pgStudent.RegisterCourse("SMD"))
//    println(pgStudent.getGrade("SMD"))
//    println(pgStudent.Attend("CS Department"))
//    println(pgStudent.Learn())
//
//    if (pgStudent is PGStudent) {
//        // we can check if we have indeed created a polymorphic class
//        println(pgStudent.SubmitThesis("Mehfooz Ghar: Final Year Project"))
//    }
//
//    //let's make separate arrays of staff members for better understanding of polymorphism
//
//    val staffArray: Array<Staff?> = arrayOfNulls(3)
//
//    // Create instances of Faculty and store them in the array
//    staffArray[0] = Faculty(
//        AadharId = 123456789,
//        Name = "Dr. Kashif Zafar",
//        Address = "FAST NUCES",
//        Phone = 42111128128.toInt(), //avoided phone extension
//        Profession = "Teaching",
//        EmpId = "F123",
//        EmpRole = "Professor & HOD",
//        EmpDept = "Computer Science",
//        EmpSalary = 80000.0f,
//        EmpExperience = 10,
//        FacultySpecialization = "Artificial Intelligence",
//        Section = "7-A",
//        NoOfStudents = 30,
//        Qualification = "Ph.D."
//    )
//
//    staffArray[1] = Faculty(
//        AadharId = 987654321,
//        Name = "Dr. Hammad Naveed",
//        Address = "FAST NUCES",
//        Phone = 9242111128128.toInt(),
//        Profession = "Teaching",
//        EmpId = "F456",
//        EmpRole = "Professor",
//        EmpDept = "Computer Science",
//        EmpSalary = 75000.0f,
//        EmpExperience = 8,
//        FacultySpecialization = "BioInformatics",
//        Section = "9-A",
//        NoOfStudents = 50,
//        Qualification = "Ph.D."
//    )
//
//    staffArray[2] = Faculty(
//        AadharId = 567890123,
//        Name = "Mr. Mughees Musaddiq",
//        Address = "FAST NUCES",
//        Phone = 9242111128128.toInt(),
//        Profession = "Teaching",
//        EmpId = "S789",
//        EmpRole = "Professor",
//        EmpDept = "Computer Science",
//        FacultySpecialization = "Software for Mobile Development",
//
//        EmpSalary = 60000.0f,
//        EmpExperience = 5,
//        Section = "7-B",
//        NoOfStudents = 50,
//        Qualification = "Masters."
//    )
//
//    for (staff in staffArray) {
//        if (staff is Faculty) {
//            println(staff.Teach(staff.FacultySpecialization))
//            println(staff.Assess("A"))
//        }
//        println(staff?.Register("UID123"))
//        println(staff?.Perform("Working"))
//        println(staff?.include("Benefits"))
//        println(staff?.like("Teaching"))
//    }

    //better readable output
    val pgStudent: Student = PGStudent(
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
        RollNO = "19L2326",
        Specialization = "SMD"
    )

    // Header for the student output
    println("%-20s%-30s".format("Attribute", "Value"))
    println("-".repeat(50))

    // Print student details in a tabular format
    println("%-20s%-30s".format("Name", pgStudent.Name))
    println("%-20s%-30s".format("Aadhar ID", pgStudent.AadharId))
    println("%-20s%-30s".format("Address", pgStudent.Address))
    println("%-20s%-30s".format("Phone", pgStudent.Phone))
    println("%-20s%-30s".format("Profession", pgStudent.Profession))
    println("%-20s%-30s".format("Student ID", pgStudent.StudentID))
    println("%-20s%-30s".format("Major", pgStudent.Major))
    println("%-20s%-30s".format("Year", pgStudent.Year))
    println("%-20s%-30s".format("Semester", pgStudent.Semester))
    println("%-20s%-30s".format("College", pgStudent.College))
    println("%-20s%-30s".format("Grade", pgStudent.grade))

    println("-".repeat(50))

    // Header for the actions
    println("Actions:")
    println("%-20s%-30s".format("Attribute", "Value"))
    println("-".repeat(50))

    // Print student actions
    println("%-20s%-30s".format("Register", pgStudent.Register("19L-2326")))
    println("%-20s%-30s".format("Perform", pgStudent.Perform("doing assignments")))
    println(
        "%-20s%-30s".format(
            "Include",
            pgStudent.include("Google for learning syntax and ChatGPT for completing repetitive code")
        )
    )
    println("%-20s%-30s".format("Like", pgStudent.like("Studying and learning ways to solve problems")))
    println("%-20s%-30s".format("Register Course", pgStudent.RegisterCourse("SMD")))
    println("%-20s%-30s".format("Get Grade", pgStudent.getGrade("SMD")))
    println("%-20s%-30s".format("Attend", pgStudent.Attend("SMD")))
    println("%-20s%-30s".format("Learn", pgStudent.Learn()))

    if (pgStudent is PGStudent) {
        // Check if we have a PGStudent and print the thesis action
        println("-".repeat(50))
        println("Thesis Submission:")
        println("%-20s%-30s".format("Attribute", "Value"))
        println("-".repeat(50))
        println("%-20s%-30s".format("Submit Thesis", pgStudent.SubmitThesis("Mehfooz Ghar: Final Year Project")))
    }

    // Create an array of Staff references
    val staffArray: Array<Staff?> = arrayOfNulls(4)

    // Create instances of Faculty and store them in the array
    staffArray[0] = Faculty(
        AadharId = 123456789,
        Name = "Dr. Kashif Zafar",
        Address = "FAST NUCES",
        Phone = 9242111128128,
        Profession = "Teaching",
        EmpId = "F123",
        EmpRole = "Professor & HOD",
        EmpDept = "Computer Science",
        EmpSalary = 80000.0f,
        EmpExperience = 10,
        FacultySpecialization = "Artificial Intelligence",
        Section = "7-A",
        NoOfStudents = 30,
        Qualification = "Ph.D."
    )

    staffArray[1] = Faculty(
        AadharId = 987654321,
        Name = "Dr. Hammad Naveed",
        Address = "FAST NUCES",
        Phone = 9242111128128,
        Profession = "Teaching",
        EmpId = "F456",
        EmpRole = "Professor",
        EmpDept = "Computer Science",
        EmpSalary = 75000.0f,
        EmpExperience = 8,
        FacultySpecialization = "BioInformatics",
        Section = "9-A",
        NoOfStudents = 50,
        Qualification = "Ph.D."
    )

    staffArray[2] = Faculty(
        AadharId = 567890123,
        Name = "Mr. Mughees Musaddiq",
        Address = "FAST NUCES",
        Phone = 9242111128128,
        Profession = "Teaching",
        EmpId = "S789",
        EmpRole = "Professor",
        EmpDept = "Computer Science",
        FacultySpecialization = "Software for Mobile Development",
        EmpSalary = 60000.0f,
        EmpExperience = 5,
        Section = "7-B",
        NoOfStudents = 50,
        Qualification = "Masters.")
    staffArray[3] = Technician(
        AadharId = 789012345,
        Name = "Muhammad Ali",
        Address = "FAST, Lahore",
        Phone = 90078601,
        Profession = "Technician",
        EmpId = "T123",
        EmpRole = "Maintenance Technician",
        EmpDept = "Information Technology",
        EmpSalary = 55000.0f,
        EmpExperience = 4,
        TechType = "Hardware"

    )

    println("-".repeat(50))

    // Iterate through the array and print staff details in a tabular format
    for (staff in staffArray) {
        println("%-20s%-30s".format("\n\nAttribute", "Value"))
        println("-".repeat(50))

        println("%-20s%-30s".format("Name", staff?.Name))
        println("%-20s%-30s".format("Aadhar ID", staff?.AadharId))
        println("%-20s%-30s".format("Address", staff?.Address))
        println("%-20s%-30s".format("Phone", staff?.Phone))
        println("%-20s%-30s".format("Profession", staff?.Profession))
        println("%-20s%-30s".format("Employee ID", staff?.EmpId))
        println("%-20s%-30s".format("Role", staff?.EmpRole))
        println("%-20s%-30s".format("Department", staff?.EmpDept))
        println("%-20s%-30s".format("Salary", staff?.EmpSalary))
        println("%-20s%-30s".format("Experience", staff?.EmpExperience))
        if (staff is Technician){
            println("%-20s%-30s".format("Maintain", staff?.Maintain("Computer Lab")))
            println("%-20s%-30s".format("Install", staff?.Install("New Server")))
        }
    }
}

