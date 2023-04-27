create table memberh(
	name varchar2(30),
	userid varchar2(30),
	pwd varchar2(30),
	email varchar2(30),
	phone varchar2(15),
	admin number(1) default 0,
	primary key(userid)
);

INSERT INTO memberh VALUES('김재롱', 'cute', '1234','cutie@naver.com', '010-2323-3434',1);
INSERT INTO memberh VALUES('고영이', 'meow', '1234','catie@naver.com', '010-5555-6666',0);
INSERT INTO memberh VALUES('멍멍이', 'mung', '1234','doggo@daum.net', '010-2222-3333',0);

select *from memberh;


