DROP TABLE IF EXISTS team;

CREATE TABLE team (
  id INT PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  role VARCHAR(250) DEFAULT NULL
);

INSERT INTO team (id, first_name, last_name, role) VALUES
  (1, 'Thabo', 'Lebelo', 'Developer'),
  (2, 'Moses', 'Mathebula', 'Tester'),
  (3, 'Warren', 'Ramjee', 'Analyst'),
  (4, 'Jaco', 'Brits', 'Achitecure');