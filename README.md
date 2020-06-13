# Shopping-Cart
You will design and implement items of a Shopping Cart.

An item in the shopping cart could be one of the following types: Food, Apparel, Beverage, Hardware. You will design and implement the set of classes that deﬁne various types of items. Each class should have a constructor which initializes all of the attributes values and appropriate set/get methods. You will write a toString method in order to print the attributes of the item as well.
Shopping Cart Item Types The following item types may exist in a shopping cart: Food, Apparel, Beverage, Hardware. Descriptions and attributes you should store for each type are listed below. You should write separate classes for each item type and arrange these into an acceptable class hierarchy for the sake of modularity and code re-use.
• Food: Food type has a title ﬁeld (string), a price ﬁeld (double), a brand ﬁeld (string) and type ﬁeld(string). Type may be one of the following "meat","snack","dairy product","canned food" etc...
• Apparel: Apparel type has a title ﬁeld (string), a price ﬁeld (double), a brand (string), a season ﬁeld (string). Season may be "Winter", "Summer" etc.
• Beverage: Beverage type has a title ﬁeld (string), a price ﬁeld (double), a brand (string) and a boolean ﬁeld which speciﬁes whether it is an alcoholic drink or not.(i.e. isAlcoholic)
• Hardware: Hardware type has a title ﬁeld (string), a price ﬁeld (double), a brand (string), and an integer ﬁeld for warranty period.
You will design and implement a class that simulates a shopping cart as an ArrayList of items.
ShoppingCart class should have an ArrayList instance as a container for items.
The methods are as follows:
• Constructor: initializes the ShoppingCart, instantiates a new ArrayList of items.
• addItem: This method should add the item to the cart.
• toString: as usual returns a String which holds all the Items, the total number of items and the total price.
Write a program that simulates shopping. Instantiate a number of items of type Food, Apparel, Beverage and Hardware. Add these items to a ShoppingCart instance. Display stored items by calling toString method of the ShoppingCart. 
