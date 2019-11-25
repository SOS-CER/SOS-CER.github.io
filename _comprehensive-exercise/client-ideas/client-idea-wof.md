# Wheel of Fortune

I would like an application that allows me to play a simplified version of the main game in the popular TV game show, Wheel of Fortune. In this three-player game, one player "spins" a wheel that contains 24 "wedges", 21 of which are labeled with random cash values between $500 and $1000. There is also one "Lose a Turn" and two "Bankrupt" wedges, both of which forfeit the player's turn. The bankrupt wedge eliminates any cash the player has accumulated in the current round.

Each game has a category and a blank puzzle phrase (associated with the category), with each blank representing a letter in the puzzle answer (punctuation, such as an apostrophe, is shown if present).

On each turn, a player has three options:
  * "spin the wheel" and pick a consonant,
  * buy a vowel for a flat rate of $250, or
  * solve the puzzle.  
If the player spins the wheel and picks a letter that exists in the puzzle, the letter(s) are revealed, and the player earns the value the wheel wedge landed on multiplied by the number of times the letter appears in the puzzle. The player can then choose to spin again, buy a vowel, or attempt to solve the puzzle. Players may continue to buy vowels so long as they have enough money to keep doing so, until all of the vowels in the puzzle have been revealed.

The current player can keep playing (choosing one of the three options) until one of the following occurs (and control passes to the next player):

 * the wheel “lands” on the Lose a Turn or a Bankrupt wedge 
 * the player picks a letter that is not in the puzzle
 * the player picks a letter that has already been picked in that round
 * the player unsuccessfully attempts to solve the puzzle.

When a player successfully solves the puzzle, the game ends, and the player with the highest score will be declared the winner. After the game ends, the current score for each player should be displayed. Each player’s score should also be displayed each time they are given a choice of action (spin, buy, solve).

The software should load possible puzzles from an input file for you to start with (which you are free to modify). The puzzle list file contains of a series of category:phrase pairs, one per line. You may assume that the file does not contain any errors, that the phrases in the file only contain capital letters, spaces, and apostrophes (no underscores). The category and phrase are separated in the file by a colon (:). For example:

`puzzle.txt`

```text
DESSERTS:FLAN
DESSERTS:CHOCOLATE CAKE
DESSERTS:TIRAMISU
DESSERTS:CANOLI
DESSERTS:PECAN PIE
DESSERTS:BANANA SPLIT
DESSERTS:PEACH COBBLER
DESSERTS:CARROT CAKE
DESSERTS:BAKED ALASKA
DESSERTS:KEY LIME PIE
DESSERTS:APPLE BROWN BETTY
DESSERTS:CHOCOLATE CHIP COOKIES
DESSERTS:FUDGE BROWNIES
DESSERTS:ANGEL FOOD CAKE
DESSERTS:BUTTERSCOTCH PUDDING
DESSERTS:STRAWBERRY CHEESE CAKE
DESSERTS:ICE CREAM SUNDAE
DESSERTS:BLUEBERRY PIE
RESTAURANTS:OLIVE GARDEN
RESTAURANTS:CHILI'S
RESTAURANTS:BURGER KING
RESTAURANTS:DOMINO'S PIZZA
RESTAURANTS:HARD ROCK CAFE
RESTAURANTS:JACK ASTORS
RESTAURANTS:OUTBACK STEAKHOUSE
RESTAURANTS:RED LOBSTER
RESTAURANTS:SUBWAY
RESTAURANTS:RUBY TUESDAY
RESTAURANTS:GOLDEN CORRAL
RESTAURANTS:LONG JOHN SILVER'S
RESTAURANTS:BOSTON MARKET
RESTAURANTS:DAIRY QUEEN
RESTAURANTS:TACO BELL
RESTAURANTS:WHITE CASTLE
RESTAURANTS:WAFFLE HOUSE
FRUITS:APPLES
FRUITS:APRICOTS
FRUITS:BANANAS
FRUITS:BLUEBERRIES
FRUITS:CANTALOUPES
FRUITS:CRANBERRIES
FRUITS:FIGS
FRUITS:GRAPEFRUITS
FRUITS:GRAPES
FRUITS:LEMONS
FRUITS:LIMES
FRUITS:ORANGES
FRUITS:PEARS
FRUITS:PINEAPPLES
FRUITS:PLUMS
FRUITS:PRUNES
FRUITS:RAISINS
FRUITS:RASPBERRIES
FRUITS:STRAWBERRIES
FRUITS:WATERMELONS
SPORTS:ARCHERY
SPORTS:AUTO RACING
SPORTS:BASEBALL
SPORTS:BASKETBALL
SPORTS:BIKING
SPORTS:BOATING
SPORTS:BOWLING
SPORTS:CLIMBING
SPORTS:CRICKET
SPORTS:CYCLING
SPORTS:FISHING
SPORTS:FOOTBALL
SPORTS:GOLF
SPORTS:HOCKEY
SPORTS:HORSE RACING
SPORTS:POLO
SPORTS:RUGBY
SPORTS:RUNNING
SPORTS:SAILING
SPORTS:SKIING
SPORTS:SOCCER
SPORTS:SURFING
SPORTS:SWIMMING
COUNTRIES:ARGENTINA
COUNTRIES:ARMENIA
COUNTRIES:ARUBA
COUNTRIES:AUSTRALIA
COUNTRIES:AUSTRIA
COUNTRIES:BAHAMAS
COUNTRIES:BANGLADESH
COUNTRIES:BARBADOS
COUNTRIES:GERMANY
COUNTRIES:JAMAICA
COUNTRIES:MEXICO
COUNTRIES:RWANDA
COUNTRIES:ZIMBABWE
COUNTRIES:UNITED STATES OF AMERICA
PHRASES:AS FAR AS THE EYE CAN SEE
PHRASES:TALK IS CHEAP
PHRASES:NIGHT IS DARKEST JUST BEFORE THE DAWN
PHRASES:A DROP IN THE BUCKET
PHRASES:A DIME A DOZEN
PHRASES:PIECE OF CAKE
PHRASES:THE EARLY BIRD CATCHES THE WORM
PHRASES:THE HAND IS QUICKER THAN THE EYE
PHRASES:TWO HEADS ARE BETTER THEN ONE
PHRASES:TIP OF THE ICEBERG
PHRASES:MY DOGS ARE BARKING
PHRASES:COVERING YOUR BASES
PHRASES:TOO MANY COOKS SPOIL THE BROTH
PHRASES:OUT OF THE BLUE
PHRASES:READING THE NEWSPAPER
PHRASES:WATCHING THE GAME
PHRASES:WHEN PIGS FLY
PHRASES:IT IS WHAT IT IS
PHRASES:THE LAST STRAW
PHRASES:THE WHOLE NINE YARDS
PHRASES:IT TAKES TWO TO TANGO
PHRASES:LEARNING THE ROPES
PHRASES:GO OUT ON A LIMB
PHRASES:ICING ON THE CAKE
PHRASES:ONCE IN A BLUE MOON
PHRASES:DEEP AS THE GRAND CANYON
PHRASES:WHERE THERE'S A WILL THERE'S A WAY
PHRASES:FAST AS LIGHTNIGHT
PHRASES:COLD AS ICE
PHRASES:NO PAIN NO GAIN
PHRASES:DOWN TO THE WIRE
PHRASES:WHERE THERE IS SMOKE THERE IS FIRE
PHRASES:OLD HABITS DIE HARD
```

