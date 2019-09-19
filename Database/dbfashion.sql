
create table feedback
(
	feedBackID int primary key not null,
    name varchar(50) not null,
    phone varchar(12),
    email varchar(255),
    address varchar(255),
    Content varchar(255),
    statuse bit,
    createdDate datetime not null,
    createdBy varchar(50)



)


;

create table user
(

userID int primary key not null,
userName varchar(50),
passWord varchar(50),
name varchar(50),
address varchar(255),
email varchar(255),
phone varchar(12),
createdDate datetime,
createdBy varchar(50),
modifiedBy varchar(50),
status bit,
permission int

)

;

create table product
(

productID int primary key ,
productCode varchar(50),
productName varchar(50),
metaTitle varchar(50),
Description varchar(255),
Detail mediumtext,
productImage mediumtext,
moreImage mediumtext,
price int,
quantity int,
category int,
createdDate datetime,
createdBy varchar(50),
modifiedBy varchar(50),
modifiedDate datetime,
status bit,
topHot datetime,
viewCounts int,
metaKeywords varchar(255)


)
;

create table productCategory
(

categoryID int primary key ,
name varchar(50),
metaTitle varchar(50),
parentID int,
displayOrder int,
seoTitle varchar(50),

createdDate datetime,
createdBy varchar(50),
modifiedBy varchar(50),
modifiedDate datetime,

metaKeywords varchar(255),
metaDescription mediumtext,
status bit,
showOnHome bit

)
;
create table history
(
	historyID int primary key not null,
    userID int not null,
    createdDate datetime not null,
    metaDescriptions mediumtext
    

)

