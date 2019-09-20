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
    url varchar(125) not null,
    status bit not null default 1 -- mac dinh api dang hoat dong
);


