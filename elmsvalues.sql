/*login*/
insert into login values ("admin01","ravi@123","ravi");
insert into login values ("admin02","john@123","john");
insert into login values ("admin03","mala@123","mala");

INSERT into login values("emp01","ratha@123","ratha");
INSERT into login values("emp02","kasun@123","kasun");
INSERT into login values("emp03","damith@123","damith");

INSERT into login values("emp04","gihani@123","gihani");
INSERT into login values("emp05","faza@123","faza");
INSERT into login values("emp06","iresha@123","iresha");

INSERT into login values("emp07","supun@123","supun");
INSERT into login values("emp08","ishara@123","ishara");
INSERT into login values("emp09","tharaka@123","tharaka");

/*admin*/
insert into admin values ("admin01","ravi",0770808286,"ravi@123","admin01");
insert into admin values ("admin02","john",0773208222,"john@123","admin02");
insert into admin values ("admin03","mala",0714508789,"mala@123","admin03");


/*department*/
INSERT into department values ("dept01","Applied science","Faculty of applied science","admin01");
INSERT into department values ("dept02","Bio science","Faculty of Bio science","admin02");
INSERT into department values ("dept03","Technology","Faculty of Technology","admin03");

/*employee*/
INSERT into employee VALUES ("emp01","ratha","kurunegala","ratha@gmail.com",0772367834,"ratha@123","electric","dept01","emp01");
INSERT into employee VALUES ("emp02","kasun","matala","kasun@gmail.com",0772367836,"kasun@123","electric","dept01","emp02");
INSERT into employee VALUES ("emp03","damith","kurunegala","damith@gmail.com",0772367838,"damith@123","plumber","dept01","emp03");

INSERT into employee VALUES ("emp04","gihani","maho","gihani@gmail.com",0772367831,"gihani@123","carpenter","dept02","emp04");
INSERT into employee VALUES ("emp05","faza","puttalam","faza@gmail.com",0772367823,"faza@123","plumber","dept02","emp05");
INSERT into employee VALUES ("emp06","iresha","kurunegala","iresha@gmail.com",0772367835,"iresha@123","electric","dept02","emp06");

INSERT into employee VALUES ("emp07","supun","puttalam","supun@gmail.com",0772367855,"supun@123","carpenter","dept03","emp07");
INSERT into employee VALUES ("emp08","ishara","anuradhapura","ishara@gmail.com",0772367666,"ishara@123","electric","dept03","emp08");
INSERT into employee VALUES ("emp09","tharaka","akurana","tharaka@gmail.com",077236777,"tharaka@123","plumber","dept03","emp09");


MariaDB [elmsapp]> desc apply_leave;
+---------------------------+--------------+------+-----+---------+-------+
| Field                     | Type         | Null | Key | Default | Extra |
+---------------------------+--------------+------+-----+---------+-------+
| lid                       | varchar(255) | NO   | PRI | NULL    |       |
| address_when_on_leave     | varchar(255) | YES  |     | NULL    |       |
| data_of_first_appointment | date         | YES  |     | NULL    |       |
| date_of_commencing_leave  | datetime     | YES  |     | NULL    |       |
| date_of_resuming_duties   | datetime     | YES  |     | NULL    |       |
| designation               | varchar(255) | YES  |     | NULL    |       |
| leave_taken_in_current_yr | int(11)      | NO   |     | NULL    |       |
| no_of_dates_leave_applied | int(11)      | NO   |     | NULL    |       |
| reason                    | varchar(255) | YES  |     | NULL    |       |
| emp_id                    | varchar(255) | NO   | MUL | NULL    |       |
+---------------------------+--------------+------+-----+---------+-------+



MariaDB [elmsapp]> desc permission;
+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| pr_id    | varchar(255) | NO   | PRI | NULL    |       |
| status   | varchar(255) | YES  |     | NULL    |       |
| admin_id | varchar(255) | NO   | MUL | NULL    |       |
+----------+--------------+------+-----+---------+-------+
