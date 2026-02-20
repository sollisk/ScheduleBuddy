CREATE SCHEMA IF NOT EXISTS schedule_buddy;

CREATE TABLE IF NOT EXISTS schedule_buddy.Roles (
role_id             int             AUTO_INCREMENT PRIMARY KEY,
role_name           varchar(12)     NOT NULL
);

CREATE TABLE IF NOT EXISTS schedule_buddy.Users (
user_id             int             AUTO_INCREMENT PRIMARY KEY,
first_name          varchar(24)   	NOT NULL,
last_name           varchar(24)	    NOT NULL,
user_role_id        int             NOT NULL,
user_email          varchar(255),
phone_number        varchar(10),
timezone            varchar(3),
FOREIGN KEY (user_role_id) REFERENCES Roles(role_id)
);

CREATE TABLE IF NOT EXISTS schedule_buddy.Appointment (
appointment_id      int             AUTO_INCREMENT PRIMARY KEY,
artist_id           int             NOT NULL,
customer_id        	int             NOT NULL,
appointment_date    DATETIME        NOT NULL,
placement           varchar(64),
description         varchar(255),
appointment_status  BOOL            DEFAULT FALSE,
deposit_status      BOOL            DEFAULT FALSE,
deposit_amount      DECIMAL(7,2)    NOT NULL,
FOREIGN KEY (artist_id) REFERENCES Users(user_id),
FOREIGN KEY (customer_id) REFERENCES Users(user_id)
);