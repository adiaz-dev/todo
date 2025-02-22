
drop table if exists tasks;

create table tasks (
    id varchar(36) not null,
    version integer,
    name varchar(25) not null,
    description varchar(100) null,
    status smallint not null check (status between 0 and 5),
    assignee varchar(25) not null,
    priority smallint not null check (status between 1 and 10),
    due_date datetime(6),
    created_at datetime(6),
    updated_at datetime(6),
    primary key (id)
) engine=InnoDB;