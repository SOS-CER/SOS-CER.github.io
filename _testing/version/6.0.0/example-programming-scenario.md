---
title: Software Testing
description: "Example Programming Scenario"
navigation: on
pagegroup: testing-v6-0-0
--- 

# Example Programming Scenario
{% include iconHeader.html type="requirements" %}

In the following sections, we will use the following example to
illustrate black box and white box testing of the *Paycheck* program:

> Raleigh's Parks and Recreation Department hires landscapers to care
> for and maintain the city's parks.
>
> An employee has one of three skill levels; each with a hourly pay
> rate:
>
> Skill Level - Hourly Pay Rate (\$)
>
> ---------------------------------
>
> Level 1 - \$19.00
>
> Level 2 - \$22.50
>
> Level 3 - \$25.75
>
> All employees may opt in for insurance, which results in a deduction
> from their pay check.
>
> Deduction - Weekly Cost (\$)
>
> -------------------------------------
>
> Option 1 - Medical Insurance - \$24.50
>
> Option 2 - Dental Insurance - \$15.30
>
> Option 3 - Vision Insurance - \$5.25
>
> Employees at skill level 3 may also opt to place up to 6% of their
> gross pay into a retirement account.
>
> The following information is printed about the employee's pay check:
> 1) employee's name 2) hours worked for a week 3) hourly pay rate 4)
> regular pay for up to 40 hours worked 5) overtime pay (1.5 pay rate)
> for hours over 40 worked 6) gross pay (regular + overtime) 7) total
> deductions 8) net pay (gross pay – total deductions). If the net pay
> is negative, meaning the deductions exceeds the gross pay, then an
> error is printed.
>
> The Paycheck program prompts the user for information about the
> Employee, including the name, level (1, 2, or 3), hours worked,
> retirement percent, and whether he or she has medical, dental, and
> vision insurances. This program assumes a perfect user. There is no
> error checking for user input based on data type.
>
> The following commands compile and run the Paycheck program:
>
> `$ javac Paycheck.java`
>
> `$ java Paycheck`
