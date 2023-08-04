DROP TABLE IF EXISTS dogs, book, securities;

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
