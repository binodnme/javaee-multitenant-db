CREATE DATABASE db_student_1;
\connect db_student_1;
CREATE TABLE student
(
  id        SERIAL PRIMARY KEY NOT NULL,
  firstname VARCHAR(255),
  lastname  VARCHAR(255)
);