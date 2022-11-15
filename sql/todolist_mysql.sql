drop table todolist;

CREATE TABLE todolist (
  todoindex      int PRIMARY KEY auto_increment,
  todo    CHAR(40) NOT NULL,
  duedate date,
  finished boolean
);

insert into todolist (todo, dueDate, finished) values ("test", "2022-11-11", true);
insert into todolist (todo, dueDate, finished) values ("test2", "2022-11-11", true);
insert into todolist (todo, dueDate, finished) values ("test3", "2022-11-11", true);
insert into todolist (todo, dueDate, finished) values ("test4", "2022-11-11", true);
insert into todolist (todo, dueDate, finished) values ("test5", "2022-11-11", true);
insert into todolist (todo, dueDate, finished) values ("test6", "2022-11-11", true);
insert into todolist (todo, dueDate, finished) values ("test7", "2022-11-11", true);
insert into todolist (todo, dueDate, finished) values ("test8", "2022-11-11", true);
insert into todolist (todo, dueDate, finished) values ("test9", "2022-11-11", true);
insert into todolist (todo, dueDate, finished) values ("test10", "2022-11-11", true);

insert into todolist values (1, "test", "2022-11-11", true);
insert into todolist values (2, "test2", "2022-11-11", true);
insert into todolist values (3, "test3", "2022-11-11", true);
insert into todolist values (4, "test4", "2022-11-11", true);
insert into todolist values (5, "test5", "2022-11-11", true);
insert into todolist values (6, "test6", "2022-11-11", true);
insert into todolist values (7, "test7", "2022-11-11", true);
insert into todolist values (8, "test8", "2022-11-11", true);
insert into todolist values (9, "test9", "2022-11-11", true);
insert into todolist values (10, "test10", "2022-11-11", true);

update todolist set todo=test, duedate=2022-10-10, finished=true where todoindex=14