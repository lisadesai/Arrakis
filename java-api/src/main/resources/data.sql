INSERT INTO dogs (dog_id, name, age) VALUES (1, 'Einstein', 3);
INSERT INTO dogs (dog_id, name, age) VALUES (2, 'Kaya', 5);
INSERT INTO dogs (dog_id, name, age) VALUES (3, 'Lassie', 7);

INSERT INTO book(book_id, name) VALUES (1,'trading_book_1');
INSERT INTO book(book_id, name) VALUES (2,'trading_book_2');
INSERT INTO book(book_id, name) VALUES (3,'trading_book_3');
INSERT INTO book(book_id, name) VALUES (4,'trading_book_4');
INSERT INTO book(book_id, name) VALUES (5,'trading_book_6');

--users database
INSERT INTO users(user_id, name, email, role) VALUES (1, 'Christopher Chan', 'Chris1@bank.com', 'Trader');
INSERT INTO users(user_id, name, email, role) VALUES (2, 'Jimin Park', 'Jimin1@bank.com', 'Trader');
INSERT INTO users(user_id, name, email, role) VALUES (3, 'Felix Lee', 'fLee@bank.com', 'Trader');


--book_users
INSERT INTO book_user(book_id, user_id) VALUES(1,1);
INSERT INTO book_user(book_id, user_id) VALUES(2,1);
INSERT INTO book_user(book_id, user_id) VALUES(3,1);
INSERT INTO book_user(book_id, user_id) VALUES(1,2);
INSERT INTO book_user(book_id, user_id) VALUES(1,3);
INSERT INTO book_user(book_id, user_id) VALUES(4,3);
INSERT INTO book_user(book_id, user_id) VALUES(4,2);
INSERT INTO book_user(book_id, user_id) VALUES(5,2);
--bonds
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(1,'XS1988387210','','BNPParibasIssu 4,37% Microsoft Corp (USD)','05/08/2021',4.37,'CORP',1000,'USD','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(2,'XS1988387210','','BNPParibasIssu 4,37% Microsoft Corp (USD)','05/08/2021',4.37,'CORP',1000,'USD','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(3,'USN0280EAR64','123456780','Airbus 3.15%  USD','30/07/2021',3.15,'CORP',900,'USD','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(4,'USN0280EAR64','123456780','Airbus 3.15%  USD','30/07/2021',3.15,'CORP',900,'USD','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(5,'A12356111','123456bh0','UBS Facebook (USD)','30/09/2021',2.0,'CORP',900,'USD','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(6,'USN0280EAR64','123456780','Airbus 3.15%  USD','30/07/2021',3.15,'CORP',900,'USD','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(7,'A12356111','123456bh0','UBS Facebook (USD)','30/09/2021',2,'CORP',900,'USD','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(8,'USU02320AG12','AMZN 3.15 08/22/27 REGS','Amazon','03/08/2021',3.15,'CORP',900,'USD','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(9,'USU02320AG12','AMZN 3.15 08/22/27 REGS','Amazon','03/08/2021',3.15,'CORP',900,'USD','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(10,'GB00B6460505','BDCHBW8','HM Treasury United Kingdon','09/08/2021',0.75,'GOVN',900,'GBP','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(11,'GB00B6460506','BDCHBW8','HM Treasury United Kingdon','09/08/2021',0.75,'GOVN',900,'GBP','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(12,'GB00B6460507','BDCHBW8','HM Treasury United Kingdon','09/08/2021',0.75,'GOVN',900,'GBP','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(13,'GB00B6460508','BDCHBW8','HM Treasury United Kingdon','09/08/2021',0.75,'GOVN',900,'GBP','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(14,'GB00B6460509','BDCHBW8','HM Treasury United Kingdon','09/08/2021',0.75,'GOVN',900,'GBP','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(15,'GB00B6460510','BDCHBW8','HM Treasury United Kingdon','09/08/2021',0.75,'GOVN',900,'GBP','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(16,'GB00B6460511','BDCHBW8','HM Treasury United Kingdon','09/08/2021',0.75,'GOVN',900,'GBP','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(17,'GB00B6460512','BDCHBW8','HM Treasury United Kingdon','09/08/2021',0.75,'GOVN',900,'GBP','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(18,'GB00B6460513','BDCHBW8','HM Treasury United Kingdon','09/08/2021',0.75,'GOVN',900,'GBP','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(19,'GB00B6460514','BDCHBW8','HM Treasury United Kingdon','09/08/2021',0.75,'GOVN',900,'GBP','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(20,'GB00B6460515','BDCHBW8','HM Treasury United Kingdon','09/08/2021',0.75,'GOVN',900,'GBP','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(21,'US87973RAA86','87973RAA8','TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S','06/08/2021',2.02,'SOVN',690,'USD','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(22,'US87973RAA86','87973RAA8','TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S','06/08/2021',2.02,'SOVN',690,'USD','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(23,'US87973RAA86','87973RAA8','TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S','06/08/2021',2.02,'SOVN',690,'USD','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(24,'US87973RAA86','87973RAA8','TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S','06/08/2021',2.02,'SOVN',690,'USD','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(25,'IE00B29LNP31','87973RAA8','First Norway Alpha Kl.IV','22/12/2030',1.123,'SOVN',340,'USD','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(26,'IE00B29LNP31','87973RAA8','First Norway Alpha Kl.IV','22/12/2030',1.123,'SOVN',340,'USD','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(27,'IE00B29LNP31','87973RAA8','First Norway Alpha Kl.IV','22/12/2030',1.123,'SOVN',340,'USD','active');
INSERT INTO securities(security_id, isin, cusip, issuer_name, mature_date, coupon_rate,bond_type,face_value,bond_currency,status) VALUES(28,'IE00B29LNP31','87973RAA8','First Norway Alpha Kl.IV','22/12/2030',1.123,'SOVN',340,'USD','active');

--counter party
INSERT INTO counter_party(cp_id,name) VALUES(1,'AZ Holdings Inc');
INSERT INTO counter_party(cp_id,name) VALUES(2,'Acme co');
INSERT INTO counter_party(cp_id,name) VALUES(3,'Sovereign Investments');
INSERT INTO counter_party(cp_id,name) VALUES(4,'Astra Trading Ltd');
INSERT INTO counter_party(cp_id,name) VALUES(5,'Muncipal Gov Of Orange County');
INSERT INTO counter_party(cp_id,name) VALUES(6,'Goldman Sachs');
INSERT INTO counter_party(cp_id,name) VALUES(7,'UBS');
INSERT INTO counter_party(cp_id,name) VALUES(8,'Barclays');
INSERT INTO counter_party(cp_id,name) VALUES(9,'British Telecom');
INSERT INTO counter_party(cp_id,name) VALUES(10,'Pension Holdings');
INSERT INTO counter_party(cp_id,name) VALUES(11,'Zurich Pension fund 4');

--trade
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(1,1,1,1,'USD','open',50,90,'buy','13/05/2021','04/08/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(2,1,2,1,'GBP','open',40,89.56,'sell','04/02/2021','04/08/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(3,2,3,2,'USD','open',1000,105.775,'buy','13/05/2021','23/08/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(4,2,4,2,'GBP','open',900,105.775,'sell','04/02/2021','10/09/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(5,3,5,3,'USD','open',50,90,'buy','13/05/2021','23/08/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(6,2,6,4,'USD','open',1000,105.775,'buy','13/05/2021','23/08/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(7,2,7,3,'USD','open',50,90,'sell','13/05/2021','23/08/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(8,4,8,5,'GBP','open',60,98.56,'buy','04/02/2021','27/09/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(9,4,9,5,'USD','open',50,98.56,'buy','23/08/2021','23/08/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(10,5,10,6,'GBP','open',1100,110.35,'buy','27/09/2021','27/09/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(11,5,11,6,'GBP','open',900,110.35,'sell','28/09/2021','28/09/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(12,5,12,7,'GBP','open',2000,110.35,'buy','29/09/2021','29/09/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(13,5,13,7,'GBP','open',2000,110.35,'sell','30/09/2021','30/09/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(14,5,14,8,'GBP','open',1000,110.35,'buy','01/10/2021','01/10/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(15,5,15,8,'GBP','open',900,110.35,'buy','02/10/2019','02/10/2019');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(16,5,16,8,'GBP','open',1900,110.35,'sell','03/10/2019','03/10/2019');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(17,5,17,9,'GBP','open',600,110.35,'buy','04/10/2018','04/10/2018');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(18,5,18,10,'GBP','open',600,110.35,'buy','05/10/2019','05/10/2019');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(19,5,19,10,'GBP','open',700,110.35,'buy','06/06/2021','06/06/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(20,5,20,10,'GBP','open',1300,110.35,'sell','07/10/2011','07/10/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(21,4,21,11,'USD','open',60,100.13,'buy','04/02/2012','27/09/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(22,4,22,11,'USD','open',50,100.13,'buy','23/08/2012','23/08/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(23,4,23,11,'USD','open',75,100.13,'buy','04/02/2013','27/09/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(24,4,24,11,'USD','open',50,100.13,'buy','23/08/2014','23/08/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(25,4,25,11,'USD','open',300,98.76,'buy','04/02/2016','27/09/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(26,4,26,11,'USD','open',300,98.76,'buy','23/08/2012','23/08/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(27,4,27,11,'USD','open',300,98.76,'buy','04/02/2013','27/09/2021');
INSERT INTO trade(trade_id,book_id,security_id,cp_id,currency,t_status,quantity,unit_price,buy_sell,trade_date,settle_date) VALUES(28,4,28,11,'USD','open',300,98.76,'sell','23/08/2015','23/08/2021');