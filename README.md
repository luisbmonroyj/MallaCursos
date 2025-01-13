# MallaCursos
PruebaBackend

## CRUD for teacher
- Table teachers must be filled first because of dependency

### CREATING TEACHER
INSERT INTO teacher (id, name, lastname, email VALUES (123459789,"Pythagoras","From Samos","pitaghoras3.14@math.com");

### READING teacher
SELECT * FROM teacher WHERE id = 987654321 AND name != "Pythagoras";

### UPDATING TEACHER
--recomended updating id not allowed
UPDATE teacher SET name = "Pitagoras", lastname "de Samos" WHERE id = 123456789;

### DELETING TEACHER
--not recommended. foreign key attached to course may conflict
DELETE FROM teacher WHERE id = 123456789;


## CRUD for course
### CREATING COURSE
--name must be unique
INSERT INTO course (name,description,duration,price,beginningDate,idTeacher) VALUES
  ("Backend101","El mejor curso de backend",16,789000,'2025-01-20 10:00:00',123456789);

### READING FROM COURSE
SELECT idTeacher FROM course WHERE name = "Backend101";

### UPDATING COURSE
UPDATE course SET description = "el curso mas facil de backend. aprovecha descuento", price = 652000 WHERE name = Backend101;

### DELETING FROM COURSE
not recommended, PLEASE study the option of doing a softdeletion instead

DELETE FROM course WHERE price > 1000000;

SOFT DELETION

INSERT INTO pastcourses (name,description,duration,price,beginningDate,idTeacher) SELECT * FROM course WHERE price > 1000000;


