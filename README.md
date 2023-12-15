# Welcome to the Kata sessions

Today I present to you the following exercise: **Bank account** by Sandro Mancuso

Your bank is tired of its mainframe COBOL accounting software, and they hired you for a greenfield project in - what a happy coincidence
- your favorite programming language!

### Instructions
Write a class named Account that implements the following public interface:
```
public interface AccountService {
    void deposit(int amount)
    void withdraw(int amount)
    void printStatement()
}
```
### Rules
You cannot change the public interface of this class.

### Scenario
Here's the specification for an acceptance test that expresses the desired behaviour for this
```
Given a client makes a deposit of 1000 on 10-01-2012
And a deposit of 2000 on 13-01-2012
And a withdrawal of 500 on 14-01-2012
When they print their bank statement
Then they would see:

Date       || Amount || Balance
14/01/2012 || -500   || 2500
13/01/2012 || 2000   || 3000
10/01/2012 || 1000   || 1000
```

### Note
If you want to upload your solution, simply create a branch: `yourName-kataName`

## Old Katas
- Vigenère cipher and decipher [VIGENERECIPHER.md](old-katas/VIGENERECIPHER.md)
- Leap years [LEAPYEARS.md](old-katas/LEAPYEARS.md)
- Pyramid sliding [PYRAMIDSLIDING.md](old-katas/PYRAMIDSLIDING.md)
- Nearest prime numbers and gossip bus drivers [NEARESTPRIMENUMBERS_GOSSIPBUSDRIVERS.md](old-katas/NEARESTPRIMENUMBERS_GOSSIPBUSDRIVERS.md)
- Harry Potter Bookstore [HARRYPOTTER.md](old-katas/HARRYPOTTER.md)
- Letter value sum [LETTERVALUESUM.md](old-katas/LETTERVALUESUM.md)
- Defusing the bomb [DEFUSINGTHEBOMB.md](old-katas/DEFUSINGTHEBOMB.md)
- Possible number of pies [POSSIBLENUMBEROFPIES.md](old-katas/POSSIBLENUMBEROFPIES.md)
- Sales commissions [SALESCOMMISSIONS.md](old-katas/SALESCOMMISSIONS.md)
