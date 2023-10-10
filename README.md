# Application should do the following:
* Read a .csv file of names, social security numbers, account type, and initial deposit
* Use a proper data structure to hold all these accounts
* Both savings and checking accounts share the following properties:<br />
_deposit()_<br />
_withdraw()_<br />
_transfer()_<br />
_showinfo()_<br />
<br />
11-digit Account Number (generated with the following process: 1 or 2 depending on Savings or Checking, 
last two digits of SSN, unique 5-digit number, and random 3-digit number)<br />
<br />
* Savings Account holders are given a Safety Deposit Box, identified by a 3-digit number and
accessed with a 4-digit code<br />
* Checking Account holders are assigned a Debit Card with a 12-digit number and 4-digit PIN<br />
* Both accounts will use an interface that determines the base interest rate<br />
>_Savings accounts will use .25 points less than the base rate_<br />
>_Checking accounts will use 15% of the base rate_<br />
* The Showinfo method should reveal relevant account information as well as information
specific to the Checking account or Savings account