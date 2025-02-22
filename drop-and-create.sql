
    drop table if exists task;

    create table task (
        priority integer not null check ((priority>=1) and (priority<=10)),
        status smallint not null check (status between 0 and 4),
        created_at datetime(6),
        due_date datetime(6),
        updated_at datetime(6),
        version bigint,
        assignee varchar(25) not null,
        id varchar(36) not null,
        name varchar(50) not null,
        description varchar(200),
        primary key (id)
    ) engine=InnoDB;

    drop table if exists task;

    create table task (
        priority integer not null check ((priority>=1) and (priority<=10)),
        status smallint not null check (status between 0 and 4),
        created_at datetime(6),
        due_date datetime(6),
        updated_at datetime(6),
        version bigint,
        assignee varchar(25) not null,
        id varchar(36) not null,
        name varchar(50) not null,
        description varchar(200),
        primary key (id)
    ) engine=InnoDB;

    drop table if exists task;

    create table task (
        priority integer not null check ((priority>=1) and (priority<=10)),
        status smallint not null check (status between 0 and 4),
        created_at datetime(6),
        due_date datetime(6),
        updated_at datetime(6),
        version bigint,
        assignee varchar(25) not null,
        id varchar(36) not null,
        name varchar(50) not null,
        description varchar(200),
        primary key (id)
    ) engine=InnoDB;
