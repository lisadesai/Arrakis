--DROP TABLE IF EXISTS dogs, book, securities;
DROP TABLE IF EXISTS dogs, trade, securities, book_user, counter_party, book, users;


CREATE TABLE dogs (
    dog_id INT NOT NULL,
    name VARCHAR(250) NOT NULL,
    age INT NOT NULL
);


CREATE TABLE book (
  book_id int NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  PRIMARY KEY (book_id)
);

CREATE TABLE users (
  user_id int NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  email varchar(255) NOT NULL,
  role varchar(255) NOT NULL,
  PRIMARY KEY (user_id)
);

CREATE TABLE book_user (
  book_id int NOT NULL,
  user_id int NOT NULL,
  PRIMARY KEY(book_id, user_id),
  CONSTRAINT FK1_book_id FOREIGN KEY (book_id) REFERENCES book(book_id),
  CONSTRAINT FK_user_id FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE counter_party (
  cp_id int NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  PRIMARY KEY (cp_id)
);


CREATE TABLE securities (
  security_id int NOT NULL AUTO_INCREMENT,
  isin varchar(50) DEFAULT NULL,
  cusip varchar(50) DEFAULT NULL,
  issuer_name varchar(255) NOT NULL,
  mature_date varchar(255) NOT NULL,
  coupon_rate float NOT NULL,
  bond_type varchar(255) NOT NULL,
  face_value float NOT NULL,
  bond_currency varchar(10) NOT NULL,
  status varchar(32) DEFAULT NULL,
  PRIMARY KEY (security_id)
);

CREATE TABLE trade (
  trade_id int NOT NULL AUTO_INCREMENT,
  book_id int NOT NULL,
  security_id int NOT NULL,
  cp_id int NOT NULL,
  currency varchar(10) NOT NULL,
  t_status varchar(32) NOT NULL,
  quantity int NOT NULL,
  unit_price float NOT NULL,
  buy_sell varchar(32) NOT NULL,
  trade_date varchar(255) NOT NULL,
  settle_date varchar(255) NOT NULL,
  PRIMARY KEY (trade_id),
  CONSTRAINT FK_security_id FOREIGN KEY (security_id) REFERENCES securities(security_id),
  CONSTRAINT FK_cp_id FOREIGN KEY (cp_id) REFERENCES counter_party(cp_id),
  CONSTRAINT FK_book_id FOREIGN KEY (book_id) REFERENCES book(book_id)
);