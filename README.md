# Tutorial Mod

A tutorial mod for making Babric mods for BTA!

Credits:  
DeiveTheDev (the creator) I <-☝️🤓  
CalamityCage (for the mod I used to learn)  
TurnipLabs (for the base mod)
---

## Prerequisites

Know how to program in Java: https://www.codecademy.com/learn/learn-java

## Instructions

First, download the Example Mod by TurnipLabs and follow their README. After that you come back here.

You can change this mod if you want, but I recommend you use this just like a book to learn and copying the instructions in your mod.
If you copy something by `Ctrl + C` and paste in you project, make sure to update the imports too. It will appear in red if it is missing.  
If you just rewrite what is in red (if it is a Class) an option will show, just press `Tab` and automatically will write the import on top of your code.

## Step One

After reading all the tips, go to:

src > main > java > deivethedev > testmod > TestMod(it is the main script).

### A little Tip

If you are in doubt where to change the texts `examplemod` and `turniplabs` with your mod id and mod group, here is where you need to change them.  
Change all the `yourmodname` and `yourgroupname` in files names/variables below. Everytime you change a file name, refactor the code.  
I recommend set your mod id and name as the same, change then in:

`gradle.properties > mod_name = yourmodname (lowercase)`

`gradle.properties > mod_group = yourgroupname (lowercase)`

`src > main > java > yourgroupname > yourmodname > YourModName(PascalCase) > MOD_ID = yourmodname (lowercase)`

Now what you need to change in your files:

`src > main > resources > lang > yourmodname`

`src > main > resources > fabric.mod.json > "id": "yourmodname" (You can already change name, description and authors too)`

`src > main > resources > fabric.mod.json > mixins ["yourmodname.mixins.json"]   (Create the 'mixins' folder in the same folder as your main script)`

`src > main > resources > yourmodname.mixins.json`

You don't need to change the `import turniplabs.halplibe`, just the change the packages if you haven't already refactored.

Lastly, almost every mod will use `YourModNameScriptName` in the main scripts, use this also to make it easier for other developers to read your code.

## Tips

1. If you haven't already you should join the BTA modding discord! https://discord.gg/FTUNJhswBT5. 
2. In Intellij if `Ctrl + Left-Click` on a field or method you can quickly get information on when and where that field or method is assign or used.
5. In Intellij you can double press shift or press ctrl+N to search class files, change the search from the default `Project Files` to `All Places` you can easily explore the classes for you dependencies and even BTA itself.
