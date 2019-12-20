---
title: CSC116 Encryption/Decryption
description: Somewhat More Simplified Solitaire
navigation: off
pagegroup: sSMSSolitaire
---
# Somewhat More Simplified Solitaire (SMSSolitaire)

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
   1. A starting 15 cards
   2. A message
   3. Whether the user wishes to (E)ncrypt or (D)ecrypt the message
   
If the user enters any option other than E or D, the program should print "Invalid Option" and close. The software should encrypt/decrypt the user's message by using the Somewhat Simplified Solitaire algorithm.   

### 15 Cards
The SMSSolitaire algorithm uses 15 total cards, which includes:
  * one full suits (13 cards)
  * two jokers
  
Each card is assigned a number 1-13, and the jokers are assigned numbers 14 and 15. For example:

{% include image.html file="deck.png" %}
{% include image.html file="jokers.png" %}

# Somewhat Simplified Solitaire Algorithm
{% include iconHeader.html type="design" %}

   1. Assume one suit of deck of cards (numbered 1-13) plus two jokers ("A" (#14) and "B" (#15)).

   2. Find the A joker (14). Exchange it with the card beneath (after) it in the deck, to move the card down the deck by one position. (What if the joker is the last card in the deck? Imagine that the deck of cards is continuous; the card following the bottom card is the top card of the deck, and you'd just exchange them.)

   3. Find the B joker (15). Move it two cards down by performing two exchanges.

   4. Swap the cards above the first joker (the one closest to the top of the deck) with the cards below the second joker. This is called a triple cut.

   5. Take the bottom card from the deck. Count down from the top card by a quantity of cards equal to the value of that bottom card. (If the bottom card is a joker, let its value be 14, regardless of which joker it is.) Take that group of cards and move them to the bottom of the deck. Return the bottom card to the bottom of the deck.

   6. Look at the top card's value (which is again 1-14, as it was in the previous step). Put the card back on top of the deck. Count down the deck by that many cards. Record the value of the NEXT card in the deck, but don't remove it from the deck. If that next card happens to be a joker, don't record anything. Leave the deck the way it is, and start again from the first step, repeating until that next card is not a joker.

## Example

Assume that this is the original ordering of our half-deck of cards: 

**Step 1:** Deck of cards:

```text
1 4 7 10 13 3 6 9 12 15 14 2 5 8 11
```

**Step 2:** Swap 14 with the value following it. So, we swap 14 and 2:

```text
1 4 7 10 13 3 6 9 12 15 2 14 5 8 11
                        ^^^^
```													

**Step 3:** Move 15 two places down the list. It ends up between 14 and 5:

```text
1 4 7 10 13 3 6 9 12 2 14 15 5 8 11
                     ^^^^^^^
```							  

**Step 4:** Do the triple cut. Everything above the first joker (14 in this case) goes to the bottom of the deck, and everything below the second (15) goes to the top:

```text
5 8 11 14 15 1 4 7 10 13 3 6 9 12 2 
^^^^^^       ^^^^^^^^^^^^^^^^^^^^^^
```	

**Step 5:** The bottom card is 2. The first 2 cards of the deck are 5 and 8. They go just ahead of 2 at the bottom end of the deck:

```text
11 14 15 1 4 7 10 13 3 6 9 12 5 8 2                                                           
                              ^^^
```

**Step 6:** The top card is 11. Thus, our generated keystream value is the 12th card, which is 12. 

For encrypting, add 12 to the character "H" to generate the cipher character. For decrypting, subtract 12 from the character "H" to generate the plaintext character.

**Step 7:** Repeat from step 1 for the next character. Use the final configuration of the deck from the current iteration as the starting configuration of the deck for the next iteration. Never return back to the original deck!


# Encryption Example
{% include iconHeader.html type="systemTest" %}

Suppose the user wishes to encrypt the word "HELLO". For each character in the message, you will run the SMSSolitaire algorithm to generate a key value. Add the key value to the character value to generate the cipher character.

For example:
   
   * The user wants to encrypt "HELLO"
   * The starting deck is:

```text
1 4 7 10 13 3 6 9 12 15 14 2 5 8 11
```

  * For **each character** (meaning you will need to repeat the entire SMSSolitaire algorithm for each character) in the message, run the Somewhat Simplified Solitaire Algorithm to generate a keystream value.
  * For **Encyrption**: add the keystream value to the original plaintext letter to obtain the cipertext character.
  * For **Decryption**: subtract the keystream value from the original ciphertext letter to obtain the plaintext character.
  
#### Encryption Example: Ciphertext = Plaintext + keystream value

| Plaintext Character | H | E | L | L | O |
|---------------------|---|---|---|---|---|
| Keystream Value | 12 | 11 | 10 | 4 | 3 |
| Sum | H + 12 | E + 11 | L + 10 | L + 4 | O + 3 |
| Ciphertext Character | T | P | V | P | R |

#### Decryption Example: Plaintext = Ciphertext - keystream value

| Ciphertext Character | T | P | V | P | R |
|---------------------|---|---|---|---|---|
| Keystream Value | 12 | 11 | 10 | 4 | 3 |
| Difference | T- 12 | P - 11 | V - 10 | P - 4 | R - 3 |
| Plaintext Character | H | E | L | L | O |


