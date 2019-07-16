CREATE SEQUENCE PUBLIC.seq_team
    INCREMENT BY 1
    MINVALUE 5
    MAXVALUE 9223372036854775807
    CACHE 1;

DROP TABLE IF EXISTS team;

CREATE TABLE team (
    id INT PRIMARY KEY,
    first_name VARCHAR(250) NOT NULL,
    last_name VARCHAR(250) NOT NULL,
    role VARCHAR(250) DEFAULT NULL
);

INSERT INTO team (id, first_name, last_name, role) VALUES
    (nextval('PUBLIC.seq_team'), 'Thabo', 'Lebelo', 'Developer'),
    (nextval('PUBLIC.seq_team'), 'Moses', 'Mathebula', 'Tester'),
    (nextval('PUBLIC.seq_team'), 'Warren', 'Ramjee', 'Analyst'),
    (nextval('PUBLIC.seq_team'), 'Jaco', 'Brits', 'Achitecure');



