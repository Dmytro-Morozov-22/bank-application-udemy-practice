# Application <span style="color: #2DB7F3;">s</span><span style="color: #F5D736;">h</span><span style="color: #F37B21;">o</span><span style="color: #F20F6A;">u</span><span style="color: #AAF73D;">l</span><span style="color: #8A00F1;">d</span> do the following:
* Read a .csv file of names, social security numbers, account type, and initial deposit
* Use a proper data structure to hold all these accounts
* Both savings and checking accounts share the following properties:<br />
_deposit()_<br />
_withdraw()_<br />
_transfer()_<br />
_showinfo()_<br />
<br />
<i>11-digit Account Number (generated with the following process: 1 or 2 depending on Savings or Checking, 
last two digits of SSN, unique 5-digit number, and random 3-digit number)</i><br/>
<br/>

+ Savings Account holders are given a Safety Deposit Box, identified by a 3-digit number and accessed with a 4-digit code<br />
+ Checking Account holders are assigned a Debit Card with a 12-digit number and 4-digit PIN<br />
+ Both accounts will use an interface that determines the base interest rate<br />

<i>Savings accounts will use .25 points less than the base rate</i><br />
<i>Checking accounts will use 15% of the base rate</i><br />

+ The Showinfo method should reveal relevant account information as well as information specific to the Checking account or Savings account