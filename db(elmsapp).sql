show databases;
+--------------------+
| Database           |
+--------------------+
| deptapp            |
| elmsapp            |
| information_schema |
| mysql              |
| performance_schema |
| phpmyadmin         |
| test               |
+--------------------+
7 rows in set (0.006 sec)

MariaDB [(none)]> use elmsapp;
Database changed
MariaDB [elmsapp]> show tables;
+-------------------+
| Tables_in_elmsapp |
+-------------------+
| admin             |
| apply_leave       |
| department        |
| employee          |
| leave_permisson   |
| login             |
| permission        |
+-------------------+
7 rows in set (0.001 sec)

MariaDB [elmsapp]> desc admin;
+-----------------+--------------+------+-----+---------+-------+
| Field           | Type         | Null | Key | Default | Extra |
+-----------------+--------------+------+-----+---------+-------+
| admin_id        | varchar(255) | NO   | PRI | NULL    |       |
| mobilenum       | int(11)      | NO   |     | NULL    |       |
| name            | varchar(255) | YES  |     | NULL    |       |
| password        | varchar(255) | YES  |     | NULL    |       |
| user_name       | varchar(255) | YES  |     | NULL    |       |
| logins_login_id | varchar(255) | YES  | MUL | NULL    |       |
| login_id        | varchar(255) | NO   | MUL | NULL    |       |
+-----------------+--------------+------+-----+---------+-------+
7 rows in set (0.017 sec)

MariaDB [elmsapp]> desc apply_leave;
+---------------------------+--------------+------+-----+---------+-------+
| Field                     | Type         | Null | Key | Default | Extra |
+---------------------------+--------------+------+-----+---------+-------+
| lid                       | varchar(255) | NO   | PRI | NULL    |       |
| description               | varchar(255) | YES  |     | NULL    |       |
| leave_from                | varchar(255) | YES  |     | NULL    |       |
| leave_to                  | varchar(255) | YES  |     | NULL    |       |
| status                    | varchar(255) | YES  |     | NULL    |       |
| type                      | varchar(255) | YES  |     | NULL    |       |
| emp_id                    | varchar(255) | NO   | MUL | NULL    |       |
| address_when_on_leave     | varchar(255) | YES  |     | NULL    |       |
| data_of_first_appoinment  | varchar(255) | YES  |     | NULL    |       |
| date_of_commencing_leave  | varchar(255) | YES  |     | NULL    |       |
| date_of_resuming_duties   | varchar(255) | YES  |     | NULL    |       |
| designation               | varchar(255) | YES  |     | NULL    |       |
| leave_taken_in_current_yr | int(11)      | NO   |     | NULL    |       |
| no_of_leave_applied       | int(11)      | NO   |     | NULL    |       |
| reason                    | varchar(255) | YES  |     | NULL    |       |
+---------------------------+--------------+------+-----+---------+-------+
15 rows in set (0.017 sec)

MariaDB [elmsapp]> desc department ;
+-------------+--------------+------+-----+---------+-------+
| Field       | Type         | Null | Key | Default | Extra |
+-------------+--------------+------+-----+---------+-------+
| dept_id     | varchar(255) | NO   | PRI | NULL    |       |
| description | varchar(255) | YES  |     | NULL    |       |
| name        | varchar(255) | YES  |     | NULL    |       |
| admin_id    | varchar(255) | NO   | MUL | NULL    |       |
+-------------+--------------+------+-----+---------+-------+
4 rows in set (0.009 sec)

MariaDB [elmsapp]> desc employee;
+------------+--------------+------+-----+---------+-------+
| Field      | Type         | Null | Key | Default | Extra |
+------------+--------------+------+-----+---------+-------+
| emp_id     | varchar(255) | NO   | PRI | NULL    |       |
| address    | varchar(255) | YES  |     | NULL    |       |
| email      | varchar(255) | YES  |     | NULL    |       |
| mobile_num | varchar(255) | YES  |     | NULL    |       |
| name       | varchar(255) | YES  |     | NULL    |       |
| password   | varchar(255) | YES  |     | NULL    |       |
| role       | varchar(255) | YES  |     | NULL    |       |
| dept_id    | varchar(255) | NO   | MUL | NULL    |       |
| login_id   | varchar(255) | NO   | MUL | NULL    |       |
+------------+--------------+------+-----+---------+-------+
9 rows in set (0.016 sec)

MariaDB [elmsapp]> desc leave_permisson;
+---------------+--------------+------+-----+---------+-------+
| Field         | Type         | Null | Key | Default | Extra |
+---------------+--------------+------+-----+---------+-------+
| permission_id | varchar(255) | YES  | MUL | NULL    |       |
| leave_id      | varchar(255) | NO   | PRI | NULL    |       |
+---------------+--------------+------+-----+---------+-------+
2 rows in set (0.015 sec)

MariaDB [elmsapp]> desc login;
+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| login_id | varchar(255) | NO   | PRI | NULL    |       |
| password | varchar(255) | YES  |     | NULL    |       |
| username | varchar(255) | YES  |     | NULL    |       |
+----------+--------------+------+-----+---------+-------+
3 rows in set (0.013 sec)

MariaDB [elmsapp]> desc permission;
+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| pr_id    | varchar(255) | NO   | PRI | NULL    |       |
| status   | varchar(255) | YES  |     | NULL    |       |
| admin_id | varchar(255) | NO   | MUL | NULL    |       |
+----------+--------------+------+-----+---------+-------+
3 rows in set (0.011 sec)
