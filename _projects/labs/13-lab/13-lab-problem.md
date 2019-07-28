---
title: CSC216 Lab 13 - Non-linear Data Structures
tags: [software engineering, software lifecycle, CS2, CSC216, Lab13]
description: CSC216 Lab 13 - Non-linear Data Structures - Problem
navigation: on
pagegroup: 13-lab
---

# CSC216 Lab 13 Problem

The problem that you will be exploring is from the [Association of Computing Machinery](http://www.acm.org/) [International Collegiate Programming Contest](https://icpc.baylor.edu/) World Finals 2016.  ACM ICPC is the premier programming contest for college students. It is truly international, with 3-member teams of contestants representing colleges and universities from countries all over the world.

The contest itself challenges teams to solve as many problems as they can in a 5-hour period. Solutions to problems are judged correct if they produce the same results as the judges' solutions do on secret data and if they are efficient enough to run within specified time limits. The team that solves the most problems wins. Ties are broken according to the total amount of time taken to solve the problems, with time penalties applied for submissions of incorrect solutions.

So, just what kinds of problems do teams have to solve? Here's the [problem set from ICPC 2016](https://icpc.baylor.edu/download/worldfinals/problems/icpc2016.pdf), which was held last May in Thailand. Some of these problems are wickedly hard and require algorithms that are way beyond the scope of CSC 216. But there is one problem from the last contest that you can do. Look at Problem C, Ceiling Function (which is copied below in full).

If competitive programming and problem solving sound interesting to you, you should consider signing up for CSC295-001: Competitive Problem Solving taught by Dr. David Sturgill in Spring 2017.

 
## Problem C: Ceiling Function
Advanced Ceiling Manufacturers (ACM) is analyzing the properties of its new series of Incredibly Collapse-Proof Ceilings (ICPCs).  An ICPC consists of n layers of material, each with a different value of collapse resistance (measured as a positive integer).  The analysis ACM wants to run will take the collapse-resistance values of the layers, store them in a binary search tree, and check whether the shape of this tree in any way correlates with teh quality of the whole construction.  Because, well, why should it not?

To be precise, ACM takes the collapse-resistance values for the layers, ordered from the top layer to the bottom layer, and inserts them one-by-one into a tree.  The rules for inserting a value *v* are:

  * If the tree is empty, make *v* the root of the tree.
  * If the tree is not empty, compare *v* with the root of the tree.  If *v* is smaller, insert *v* into the left subtree of the root, otherwise insert *v* into the right subtree.
  
ACM has a set of ceiling prototypes it wants to analyze by trying to collapse them.  It wants to take each group of ceiling prototypes that have trees of the same shape and analyze them together. *[Instructor Note: this sounds a lot like identifying equivalence classes for testing!]*

For example, assume ACM is considering five ceiling prototypes with three layers each, as described by Sample Input 1 as shown in the Figure C.1.  Notice that the first prototype's top layer has collapse resistance value 2, the middle layer has value 7, and the bottom layer has value 1.  The second prototype has layers with collapse-resistance values of 3, 1, and 4 - and yet these two prototypes induce the same tree shape, so ACM will analyze them together.

{% include image.html file="images/Figure1C.PNG" caption="Figure: Figure C.1: The four tree shapes induced by the ceiling prototypes in Sample Input 1." %} 

Given a set of prototypes, your task is to determine how many different tree shapes they induce.

 
## Input
The first line of the input contains two integers *n* (1 <= *n* <= 50), which is the number of ceiling prototypes to analyze, and *k* (1 <= *k* <= 20), which is the number of layers in each of the prototypes.

The next *n* lines describe the ceiling prototypes.  Each of these lines contains *k* distinct integers (between 1 and 10^6, inclusive), which are the collapse-resistance values of the layers in a ceiling prototype, ordered from top to bottom.

 
## Output
Display the number of different tree shapes

 
## Sample Inputs/Outputs
**Sample Input 1**
    
    5 3
    2 7 1
    2 1 4
    1 5 9
    2 6 5
    9 7 3

**Sample Output 1**

    4

**Sample Input 2**

    3 4
    3 1 2 40000
    3 4 2 1
    33 42 17 23
    
**Sample Output 2**

    2
    
[Additional input/output data are available for 40 different scenarios.](files/ceiling.zip)
    
 
## Activity
With your team, you will design (but not implement) an *efficient* algorithm for counting the number of different tree shapes for a given input file.  During the ACM ICPC competition, participants were expected to have their solution run on all 40 tests cases in less than 5 seconds! 

You will prepare a presentation that will describe the following:

  * How you will identify and count the different tree shapes from an input file.
  * How you will handle error conditions.
  * An estimation of the runtime of your algorithm.
  
Your design may be control flow diagrams, pseudo-code, actual code, or anything that can help describe how you would solve the problem.
  
**On-campus Students:** You will [present your algorithm design to your lab in a five minute presentation](13-lab-presentation).  You will only have 40-50 minutes to work on your algorithm.
