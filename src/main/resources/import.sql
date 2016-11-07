INSERT INTO videotech.USER_PROFILE(role) VALUES ('USER');
  
INSERT INTO videotech.USER_PROFILE(role) VALUES ('ADMIN');
  
INSERT INTO videotech.USER_PROFILE(role) VALUES ('DBA');

INSERT INTO videotech.USER(username, password, first_name, last_name, email, role) VALUES ('admin','pw123', 'John','Doe','fuck@you.com', 2);

INSERT INTO spring_security.APP_USER(sso_id, password, first_name, last_name, email) VALUES ('sam','$2a$10$4eqIF5s/ewJwHK1p8lqlFOEm2QIA0S8g6./Lok.pQxqcxaBZYChRm', 'Sam','Smith','samy@xyz.com');