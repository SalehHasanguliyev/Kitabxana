insert into users
(username, password, enabled)
values
('librarian1', '$2a$12$HEkfuA7X8cHh5YNELGheHOBur0bR204YKFQWovP.ZnboXOS40DHtC', 1),
('student1', '$2a$12$B3z.44iUbYzeUStTm0Q5eOtbm7x/QS8aobQxgynNOKYIMt9j4Uiui', 1);

insert into authorities
(username, authority)
values
('librarian1', 'ROLE_USERS'),
('librarian1', 'ROLE_ADD_BOOK'),
('librarian1', 'ROLE_ADD_LIBRARIAN'),
('librarian1', 'ROLE_ADD_STUDENT'),
('student1', 'ROLE_USERS');