create table pipeline (
id INTEGER IDENTITY PRIMARY KEY,
name VARCHAR (255)
description VARCHAR(255)
task VARCHAR(255)

)
create table pipetasks(
id INTEGER IDENTITY PRIMARY KEY,
task_name VARCHAR(255)
task_description VARCHAR(255)
action VARCHAR (255)
)

create table action(
id INTEGER IDENTITY PRIMARY KEY,
action_name VARCHAR(255)
)


