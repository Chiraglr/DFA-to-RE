# DFA-to-RE
Problem Statement: We have to find equivalent regular expression of a Deterministic Finite State Automaton by implementing state elimination algorithm in our code.

Algorithm: 
1)If the start state is an accepting state or has transitions in, add a new non-accepting start state and add an epsilon-transition between the new start state and the former start state.
 2)If there is more than one accepting state or if the single accepting state has transitions out,
add a new accepting state, make all other states non-accepting, and add an epsilon-transition from
each former accepting state to the new accepting state.
 3)For each non-start non-accepting state in turn, eliminate the state and update transitions.
