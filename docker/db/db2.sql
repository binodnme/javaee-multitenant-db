CREATE DATABASE db_student_2;
\connect db_student_2;
CREATE TABLE student
(
  id        SERIAL PRIMARY KEY NOT NULL,
  firstname VARCHAR(255),
  lastname  VARCHAR(255)
);