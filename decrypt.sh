#!/bin/bash
Help()
{
   # Display Help
        echo "========================================================="
        echo "HELP"
        echo "Usage: decrypt <filename> <password>"
        echo "Note: This command should be used everytime to decrypt the files"
        echo "========================================================="
}
while getopts ":h" option; do
   case $option in
      h) # display Help
         Help
         exit;;
     \?) # incorrect option
         echo "Error: Invalid option."
         exit;;
   esac
done
file=$1
pass=$2
unzip $file &>/dev/null
status=$?
if [ $status -eq 0 ]; then
echo "Congrats. Correct password."

echo "$USER `date` $file" >> ~/.userdat/N8G03HTWOA7FSB4UYRJ807CQT43OIUD$USER
else echo "Wrong password!. Try again." 
fi
