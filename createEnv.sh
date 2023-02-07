#!/bin/bash

for i in {112..119}; do 
        mkdir /home/user$i/.ssh
        cat /home/integration/keys/key$i.pub >> /home/user$i/.ssh/authorized_keys
        chmod 751 /home/user$i/.ssh
        chmod 644 /home/user$i/.ssh/authorized_keys
        chmod +t /home/user$i/.ssh
        chmod +t /home/user$i/.ssh/authorized_keys

        mkdir /home/user$i/.userdat
        chmod 701 /home/user$i/.userdat
        chmod +t /home/user$i/.userdat
        touch /home/user$i/.userdat/N8G03HTWOA7FSB4UYRJ807CQT43OIUDuser$i
        chmod o+w /home/user$i/.userdat/N8G03HTWOA7FSB4UYRJ807CQT43OIUDuser$i
        chmod o-rx /home/user$i/.userdat/N8G03HTWOA7FSB4UYRJ807CQT43OIUDuser$i

        mkdir /home/user$i/PUZZLES
        chmod 705 /home/user$i/PUZZLES
        chmod +t /home/user$i/PUZZLES
done


