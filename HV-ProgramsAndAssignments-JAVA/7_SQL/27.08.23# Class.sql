SELECT * FROM testDatabase.Enrollments;
use testDatabase;
select * from clients;
select name from clients  order by name DESC;
select name,state from clients order by name ASC,state ASC;
/* Display city where city =2*/
select city, count(*) as CityTotal from clients group by city having CityTotal=2; 
SELECT state, COUNT(DISTINCT client_id) AS total_clients, COUNT(DISTINCT city) AS unique_cities FROM clients GROUP BY state;

/*List Students Who Have Not Enrolled in Any Course*/
select s.* from Students s 
left join Enrollments e on s.StudentID= e.StudentID 
where e.StudentID is null;

/*Find Students Who Have Enrolled in Course 2*/
select s.StudentID, s.FirstName from Students s 
inner join Enrollments e on s.StudentID= e.StudentID 
where e.CourseID =2;

/*Count the Number of Students Enrolled in Each Course*/
SELECT COUNT(*) , E.CourseID FROM Students S
LEFT JOIN Enrollments E ON S.StudentID = E.StudentID
GROUP BY E.CourseID;


/*Find Students Who Are Enrolled in More Than One Course*/
SELECT COUNT(*) , E.CourseID, S.CourseName FROM Courses S
LEFT JOIN Enrollments E ON S.CourseID = E.CourseID
GROUP BY E.CourseID;
 
/* student entrolled in more than one course*/
select s.StudentID, s.FirstName from Students s
Right join Enrollments e
on s.StudentID = e.StudentID
group by s.StudentID, s.FirstName
having count(e.CourseID) > 1;

/* list Student and their Enrollemnts in Alphabetic Order*/
select s. *, e.EnrollmentID from Students s
left join Enrollments e on s.StudentID = e.StudentID
order by s.FirstName;

select count(*) from Students;
