# EZLauncher
This is a simple launcher that i developed using JAVA. It is intended to provide upto 9 user-prescribed buttons that open the file associated to it. the buttons are also dynamically resized to fit into the screen to increase ambiguity. The program is meant to run on startup so the file needs to be added to the startup programs list while booting up windows.

This is how the window will look like with just two buttons:
![image](https://github.com/Sh0urya-S/EZLauncher/assets/101881808/d494c148-06cb-4cba-a8ce-8d2757ae0f1e)

As buttons are added it will soon take form of a neatly arranged grid with no extra border gaps or anything. Each button also has a cross within it which when clicked deletes the button and rearranges and resizes the rest of the buttons accordingly to keep the whole layout filled completely.

**Creating a Button**

1) Press the + button on the top of the window.
   
2) Enter the button name (You can keep either the program name or any other name).
   ![image](https://github.com/Sh0urya-S/EZLauncher/assets/101881808/2a3365c5-730c-403e-ac21-d152dbd37743)
   
3) Enter the location of the file.
   ![image](https://github.com/Sh0urya-S/EZLauncher/assets/101881808/7fda99fe-25d4-4223-9b76-b6c1848f8ac8)

   Now, incase of a program, you need to open up windows search, type the program name, right click on the result and click open file location. It should take you to the location
   where the file is present. Now right click on it, click properties. Now in front of Target there will be a pre selected text...copy it, paste it into the textbox which is open in the EZlauncher, remove the
   double quotes and hit enter.

   If its a file or a folder, then go to file explorer navigate into the folder, click on the URL bar on the top and copy the address. If its a file you may need to add the _filename.its-respective-extension_.
   ![image](https://github.com/Sh0urya-S/EZLauncher/assets/101881808/79a17ef1-3488-4afe-a60b-0d0de0eee6c8)

4) Hit OK and you are good to go, a button has been created. If you want to delete a button just press on the X mark on the button

**Insight into the dynamic layout adjustment**

Screenshots of when the layout has 5 and 9 buttons respectively:
![image](https://github.com/Sh0urya-S/EZLauncher/assets/101881808/abb585dd-1554-4ab1-b146-bb3979c47912) ![image](https://github.com/Sh0urya-S/EZLauncher/assets/101881808/615eda05-f2d1-4a5d-bf2a-929eeddb16f3)

**Upcoming Updates**

-Saves the exisiting buttons so that you dont have to redeclare them every time it's launched
-Appearance changes such as background colors and stuff
