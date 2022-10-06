# OrderingTest

## Table CUSTOMER
```
+----+------------+---------------+-----------------+---------------+---------------+
| id | address_id | customer_type | document_number | document_type | name          |
+----+------------+---------------+-----------------+---------------+---------------+
|  1 | 123456     | Residential   | 12345678909     | CPF           | John Doe      |
|  2 | 123454     | Residential   | 12345092137     | CPF           | Jane Doe      |
|  3 | 345321     | Corporate     | 12345665540     | CPF           | Ozzy          |
|  4 | 123796     | Residential   | 12345612347     | CPF           | David Gilmour |
+----+------------+---------------+-----------------+---------------+---------------+
```

## Table ORDER_INFO
```
+----+-------------+------------+------------+----------+
| id | customer_id | end_date   | start_date | status   |
+----+-------------+------------+------------+----------+
|  5 |           1 | 3921-11-04 | 3921-11-01 | Done     |
|  6 |           1 | 3921-04-04 | 3921-04-01 | Canceled |
|  7 |           3 | 3922-02-24 | 3922-02-10 | Done     |
|  8 |           2 | 3921-11-09 | 3921-11-01 | Done     |
|  9 |           3 | 3921-12-18 | 3921-12-03 | Done     |
| 10 |           4 | 3921-11-05 | 3921-05-06 | Canceled |
| 11 |           1 | NULL       | 3922-08-09 | Open     |
| 12 |           2 | 3922-04-02 | 3922-03-26 | Done     |
+----+-------------+------------+------------+----------+
```

## Table ORDER_ACTION
```
+----+-------------+----------+-----------+
| id | action_type | order_id | status    |
+----+-------------+----------+-----------+
| 13 | Provide     |        5 | Done      |
| 14 | Provide     |        5 | Done      |
| 15 | Change      |        6 | Cancelled |
| 16 | Change      |        6 | Cancelled |
| 17 | Provide     |        7 | Done      |
| 18 | Provide     |        8 | Done      |
| 19 | Provide     |        9 | Done      |
| 20 | Change      |        9 | Done      |
| 21 | Provide     |       10 | Cancelled |
| 22 | Cease       |       11 | Done      |
| 23 | Cease       |       11 | Open      |
| 24 | Change      |        8 | Done      |
+----+-------------+----------+-----------+
```

## Table PRODUCT
```
+--------+-----------------+--------------+----------+---------+
| id     | order_Action_id | state        | type     | version |
+--------+-----------------+--------------+----------+---------+
| 100001 |              13 | Active       | TV       |       0 |
| 100001 |              15 | Cancelled    | TV       |       1 |
| 100001 |              22 | Ceased       | TV       |       2 |
| 100002 |              14 | Active       | Internet |       0 |
| 100002 |              16 | Cancelled    | Internet |       1 |
| 100002 |              23 | To be ceased | Internet |       2 |
| 100003 |              17 | Active       | TV       |       0 |
| 100003 |              20 | Active       | TV       |       1 |
| 100004 |              18 | Active       | Internet |       0 |
| 100004 |              24 | Active       | Internet |       1 |
| 100005 |              19 | Active       | Phone    |       0 |
| 100006 |              21 | Cancelled    | TV       |       0 |
+--------+-----------------+--------------+----------+---------+
```

