SELECT * FROM graded_assignment.`contact table`;
/*Select all columns from the contact table where the active flag is 1*/
 select * from graded_assignment.`contact table`where Active_flag =1;
 /* Deactivate contacts who are opted out*/
update graded_assignment.`contact table` set Active_flag =0 where opt_out=0;
select * from graded_assignment.`contact table`;
set SQL_safe_updates =0;
 /*Delete all the contacts who have the company name ‘ABC’*/
delete from graded_assignment.`contact table` where company = 'ABC';
select * from graded_assignment.`contact table`;
/*Insert a new row with id as 658, name as ‘mili’, email as ‘mili@gmail.com’, the company as ‘DGH’, active flag as 1, opt-out flag as 1*/
insert into graded_assignment.`contact table` values (658, 'mili@gmail.com', 'mili', 'null', 'DGH',1,1);
select * from graded_assignment.`contact table`;
/*Pull out unique values of the company column*/
 select distinct company from graded_assignment.`contact table`;
 /*Update the name Mili to Niti*/
update graded_assignment.`contact table` set fname ='niti' where fname='mili';
select * from graded_assignment.`contact table`;