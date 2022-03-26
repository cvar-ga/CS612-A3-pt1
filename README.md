# CS612-A3-pt1
The GitHub repository for Part 1 of Assignment 3 in CS 612 at Pace University.

The main Java class in this repository is Hospital.java. To run this program, clone this entire repository, ```cd``` into it from the Terminal, and run the following commands to compile and run the Java program:

```
javac Hospital.java
java Hospital
```

The expected output is as follows:

```
Vito	123
Michael	234	Heart
Vincent	645	Brain	Operating: true
Sonny	789	has 6 patients.
Vito works for the hospital.
Michael works for the hospital.
Michael is a(n) Heart doctor.
Vincent works for the hospital.
Vincent is a(n) Brain doctor.
Vincent is operating now.
Sonny works for the hospital.
Sonny is a nurse with 6 patients.
```

The following text describes each of the individual Java classes.

## Hospital.java
The main class. It declares a Hospital Emlpoyee named Vito, a Doctor named Michael, a Surgeon named Vincent, and a Nurse named Sonny. It populates each of these classes with information pertaining to each of the employees, inlcuding their number, specialty, among others. Then, it prints out the string format of each of the classes then executes their respective work() methods.

## HospitalEmployee.java
The parent HsopitalEmployee class, from which the next Java files inherit. Attributes are name and number.

## Doctor.java
A child of the HospitalEmployee class, with an additional specialty attribute.

## Surgeon.java
A child of the Doctor class, with an additional isOperating attribute, to indicate whether the surgeon is currently operating on a patient.

## Nurse.java
A child of the HospitalEmployee class, with an additional numOfPatients attribute, which inndicates how many patients the nurse currently attends to.
