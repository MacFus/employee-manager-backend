create table employee
(
    id            bigint       not null auto_increment,
    email         varchar(255),
    employee_code varchar(255) not null,
    img_url       varchar(255),
    job_title     varchar(255),
    name          varchar(255) not null,
    phone         varchar(255),
    primary key (id)
) engine=InnoDB;
