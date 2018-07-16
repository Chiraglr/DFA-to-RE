# DFA-to-RE
Problem Statement: We have to find equivalent regular expression of a Deterministic Finite State Automaton by implementing state elimination algorithm in our code.

Algorithm: 
1)If the start state is an accepting state or has transitions in, add a new non-accepting start state and add an epsilon-transition between the new start state and the former start state.
2)If there is more than one accepting state or if the single accepting state has transitions out, add a new accepting state, make all other states non-accepting, and add an epsilon-transition from each former accepting state to the new accepting state.
3)For each non-start non-accepting state in turn, eliminate the state and update transitions.

![image](https://user-images.githubusercontent.com/29271117/42746183-287e1da2-88f4-11e8-9c9b-55b7e4ff39a2.png)

input is:
![image](https://user-images.githubusercontent.com/29271117/42746278-b5697aea-88f4-11e8-8fd5-60db3bef138b.png)
output is:
![image](https://user-images.githubusercontent.com/29271117/42746307-cdd2aff2-88f4-11e8-9010-b1fdccb9121c.png)

![image](https://user-images.githubusercontent.com/29271117/42746193-3a667f28-88f4-11e8-89ce-e41a92a34454.png)

input is:
![image](https://user-images.githubusercontent.com/29271117/42746361-10005ece-88f5-11e8-9f4f-9929019b7b87.png)
output is:
![image](https://user-images.githubusercontent.com/29271117/42746367-1adbc93c-88f5-11e8-89c7-bff6f458c528.png)

![image](https://user-images.githubusercontent.com/29271117/42746206-490aafae-88f4-11e8-8329-356395a8fc76.png)

input is:
![image](https://user-images.githubusercontent.com/29271117/42746420-520fd042-88f5-11e8-8864-f73e3c99cdb4.png)

![image](https://user-images.githubusercontent.com/29271117/42746431-5c5c6cae-88f5-11e8-8e4e-9cbfd9c0dcce.png)
output is:
![image](https://user-images.githubusercontent.com/29271117/42746437-6519d23c-88f5-11e8-86ac-5349b3ff3632.png)
