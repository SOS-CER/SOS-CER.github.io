---
title: CSC116 Encryption/Decryption
description: Somewhat Simplified Solitaire
navigation: off
pagegroup: sssolitaire
---
# Somewhat Simplified Solitaire (SSSolitaire)

## Overview
Bruce Schneier created the [card-deck-based Solitaire encryption algorithm](https://www.schneier.com/academic/solitaire/) for Neal Stephenson's novel "Cryptonomicon."

Basic encryption involves **plaintext** message that is encrypted into **ciphertext**.
Basic decryption involves **ciphertext** message that is decrypted into **plaintext**.

For Somewhat Simplified Solitaire:

   * **Ciphertext** = Plaintext + keystream value
   * **Plaintext** = Ciphertext - keystream value
   
   where a keystream value is generated for *each character* of the input text by using the Somewhat Simplified Solitaire algorithm.
   
## Requirements
{% include iconHeader.html type="requirements" %}
   
The software should prompt the user for three inputs:
   1. A starting half deck of cards
   2. A message
   3. Whether the user wishes to (E)ncrypt or (D)ecrypt the message
   
If the user enters any option other than E or D, the program should print "Invalid Option" and close. The software should encrypt/decrypt the user's message by using the Somewhat Simplified Solitaire algorithm.   

### Half Deck of Cards
The SSSolitaire algorithm uses 28 total cards, which includes:
  * two full suits (13 cards in each suit)
  * two jokers
  
Each card is assigned a number 1-26, and the jokers are assigned numbers 27 and 28. For example:

{% include image.html file="deck.png" %}
{% include image.html file="jokers.png" %}

# Somewhat Simplified Solitaire Algorithm
{% include iconHeader.html type="design" %}

   1. Assume a half-deck of cards (the cards of two suits, numbered 1-26) plus two jokers ("A" (#27) and "B" (#28)).

   2. Find the A joker (27). Exchange it with the card beneath (after) it in the deck, to move the card down the deck by one position. (What if the joker is the last card in the deck? Imagine that the deck of cards is continuous; the card following the bottom card is the top card of the deck, and you'd just exchange them.)

   3. Find the B joker (28). Move it two cards down by performing two exchanges.

   4. Swap the cards above the first joker (the one closest to the top of the deck) with the cards below the second joker. This is called a triple cut.

   5. Take the bottom card from the deck. Count down from the top card by a quantity of cards equal to the value of that bottom card. (If the bottom card is a joker, let its value be 27, regardless of which joker it is.) Take that group of cards and move them to the bottom of the deck. Return the bottom card to the bottom of the deck.

   6. Look at the top card's value (which is again 1-27, as it was in the previous step). Put the card back on top of the deck. Count down the deck by that many cards. Record the value of the NEXT card in the deck, but don't remove it from the deck. If that next card happens to be a joker, don't record anything. Leave the deck the way it is, and start again from the first step, repeating until that next card is not a joker.

## Example

Assume that this is the original ordering of our half-deck of cards:

```
1 4 7 10 13 16 19 22 25 28 3 6 9 12 15 18 21 24 27 2 5 8 11 14 17 20 23 26
```

**Step 1:** Swap 27 with the value following it. So, we swap 27 and 2:

```
1 4 7 10 13 16 19 22 25 28 3 6 9 12 15 18 21 24 2 27 5 8 11 14 17 20 23 26
                                                ^^^^
```													

**Step 2:** Move 28 two places down the list. It ends up between 6 and 9:

```
1 4 7 10 13 16 19 22 25 3 6 28 9 12 15 18 21 24 2 27 5 8 11 14 17 20 23 26
                        ^^^^^^
```							  

**Step 3:** Do the triple cut. Everything above the first joker (28 in this case) goes to the bottom of the deck, and everything below the second (27) goes to the top:

```
5 8 11 14 17 20 23 26 28 9 12 15 18 21 24 2 27 1 4 7 10 13 16 19 22 25 3 6
^^^^^^^^^^^^^^^^^^^^^                          ^^^^^^^^^^^^^^^^^^^^^^^^^^^
```	

**Step 4:** The bottom card is 6. The first 6 cards of the deck are 5, 8, 11, 14, 17, and 20. They go just ahead of 6 at the bottom end of the deck:

```
23 26 28 9 12 15 18 21 24 2 27 1 4 7 10 13 16 19 22 25 3 5 8 11 14 17 20 6
                                                         ^^^^^^^^^^^^^^^
```

**Step 5:** The top card is 23. Thus, our generated keystream value is the 24th card, which is 11. 

**Step 6:** For encrypting, add 11 to the character "H" to generate the cipher character. For decrypting, subtract 11 from the character "H" to generate the plaintext character.

**Step 7:** Repeat from step 1 for the next character. Use the final configuration of the deck from the current iteration as the starting configuration of the deck for the next iteration. Never return back to the original deck!


# Encryption Example
{% include iconHeader.html type="systemTest" %}

Suppose the user wishes to encrypt the word "HELLO". For each character in the message, you will run the SSSolitaire algorithm to generate a key value. Add the key value to the character value to generate the cipher character.

For example:
   
   * The user wants to encrypt "HELLO"
   * The starting deck is:

```
1 4 7 10 13 16 19 22 25 28 3 6 9 12 15 18 21 24 27 2 5 8 11 14 17 20 23 26
```

  * For **each character** (meaning you will need to repeat the entire SSSolitaire algorithm for each character) in the message, run the Somewhat Simplified Solitaire Algorithm to generate a keystream value.
  * For **Encyrption**: add the keystream value to the original plaintext letter to obtain the cipertext character.
  * For **Decryption**: subtract the keystream value from the original ciphertext letter to obtain the plaintext character.
  
#### Encryption Example: Ciphertext = Plaintext + keystream value

| Plaintext Character | H | E | L | L | O |
|---------------------|---|---|---|---|---|
| Keystream Value | 11 | 9 | 23 | 7 | 10 |
| Sum | H + 11 | E + 9 | L + 23 | L + 7 | O + 10 |
| Ciphertext Character | S | N | I | S | Y |

#### Decryption Example: Plaintext = Ciphertext - keystream value

| Ciphertext Character | S | N | I | S | Y |
|---------------------|---|---|---|---|---|
| Keystream Value | 11 | 9 | 23 | 7 | 10 |
| Difference | S - 11 | N - 9 | I - 23 | S - 7 | Y - 10 |
| Plaintext Character | H | E | L | L | O |


