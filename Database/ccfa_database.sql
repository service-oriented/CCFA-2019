create database ccfa;
use ccfa;
create table account(
	accountId bigint auto_increment primary key,
    username varchar(50) unique not null,
    password varchar(50) not null,
    status bit not null default 1, -- mac dinh tai khoan hoat dong 
    role bit not null default 0 -- mac dinh la khach hang
);
create table guest(
	guestId bigint auto_increment primary key,
    fullName varchar(125) not null,
    birth date,
    gender bit,
    weight float,
    height float,
    job varchar(50),
    body varchar(25),
    phone varchar(25),
    email varchar(25),
    hairColor varchar(25),
    skinColor varchar(25),
    lip_thickness varchar(25),
    faceShape varchar(25),
    favorite varchar(125),
    accountId bigint,
    foreign key (accountId) references account (accountId)
);
alter table guest add column link varchar(125);
create table product(
	productId bigint auto_increment primary key,
    code varchar(25) unique not null,
    type bit not null,
    category varchar(25) not null,
    title varchar(50) not null,
    description text not null,
    view int not null,
    createdDate datetime not null default now(),
    createdBy bigint not null,
    keyword varchar(255),
    foreign key (createdBy) references account (accountId)
);
create table image(
	imageID bigint auto_increment primary key,
    link varchar(125) not null,
    productId bigint not null,
    foreign key (productId) references product(productId)
);
alter table guest add column image varchar(125);
alter table guest add constraint foreign key (image) references image(imageID);
create table historyView(
	historyViewId bigint auto_increment primary key,
    guestId bigint not null,
    productId bigint not null,
    viewTime datetime not null,
    foreign key (guestId) references guest(guestId),
    foreign key (productId) references product(productId)
);
create table feedback(
	feedbackId bigint auto_increment primary key,
    title varchar(25),
    content varchar(125) not null,
    status int not null default 0,-- mac dinh tin nhan vua gui chua dc tra loi
    sentTime datetime not null,
    sender bigint,
    foreign key (sender) references account (accountId)
);
create table answer(
	answerId bigint auto_increment primary key,
    title varchar(25),
    content varchar(125) not null,
    replyTime datetime not null,
    feedbackId bigint,
    foreign key (feedbackId) references feedback(feedbackId)
);
create table favorite(
	 favoriteId bigint auto_increment primary key,
     guestID bigint not null,
     productId bigint not null,
     foreign key (guestId) references guest(guestId),
     foreign key (productId) references product(productId)
);
create table api(
	apiId bigint auto_increment primary key,
    url varchar(125) not null,lip_thickness
    status bit not null default 1 -- mac dinh api dang hoat dong
);
-- update data
insert into account(username,password,status,role) value ('admin','123456',1,1);
insert into guest(fullName,birth,gender,job,email,phone,link,accountId)
 value("Pham Van Dai","1998-11-26",1,"Student","phamdaiyb98@gmail.com","0325808383","http://www.facebook.com/phamdaiyb98",1);
;
insert into account(username,password,status,role) value ('user','123456',1,0);
insert into guest(fullName,birth,gender,job,email,phone,link,accountId)
 value("Cao Thị Ngọc Lan","1998-10-2",0,"Student","ngoclan@gmail.com","0398154141","http://www.facebook.com/lancao",2);
;
