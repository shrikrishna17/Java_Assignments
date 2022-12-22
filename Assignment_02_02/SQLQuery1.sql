create database Trade;

use trade;

Create table Trade_Detail(
tradeNumber	int	primary	key,
tradeDescription varchar(20),
tradeType varchar(20),
tradedate Date,
paymentMode	varchar(20));

select *from sys.tables;