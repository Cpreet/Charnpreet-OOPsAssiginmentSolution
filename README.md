# Charanpreet-OOPsAssiginmentSolution
- This is the solution for the assiginment assigned on the 22/Nov/2021.

### Execution Insturctions
---
- The `main` function exists in the `driver/Main.java` file. Please use javac compiler with JVM version 17.0.1 to execute the same.

### Contents
---
```sh
    src/com/assigiment
    ├───classes
    │   ├───SuperDepartment.java
    │   ├───AdminDepartment.java
    │   ├───HrDepartment.java
    │   └───TechDepartment.java
    └───driver
        └───Main.java
```

### Test Output

```
Welcome to Admin Department
Complete your documents submission
Complete by EOD
Today is not a holiday

Welcome to Hr Department
team Lunch
Fill today's timesheet and mark your attendance
Complete by EOD
Today is not a holiday

Welcome to Tech Department
Complete Coding of Module 1
Complete by EOD
core Java
Today is not a holiday
```

### Explaination
---
- All the classes are placed in the **com.assiginment.classes** package.
- The driver class is placed in a seprate **com.assiginment.driver** package, named **Main** class.
- All department classes inheret from the **SuperDepartment** class.
- All departments have overridden methods, except *isTodayAHoliday()*, which is used from the super class.
- All classes are imported to **driver** from the **classes** package.
