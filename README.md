# Taco-Pronto

This is an SMS based Mexican-taco ordering android application. 

The business scenario assumes that a Taco Restaurant is busy all the time. Assuming that arriving customers are hungry and busy, this restaurant needs the application to reduce the waiting time in the queue.

This is only a partial solution to the problem. It can still be improved on the vendor side.

The Work Flow of this application is as following.
1. Customer arrives at the Taco Restaurant.
2. Customer selects the Taco-size, Tortilla, Fillings and Beverages.
3. Customer confirms the order with total invoice amount.
4. Customer places the order (via SMS).
5. Vendor receives the order in the registered mobile number. Total amount to be paid is also sent via SMS to the vendor along with order details.

Technologies used: Android Studio, Java, XML

Locations of important files.

Contact Number on which the message is to be sent is stored in Extras/Constants.java
Menu of the items is stored in assets/XML/item_list.xml
