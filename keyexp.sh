#!/bin/bash

for i in {1..5}; do
	gpg --export-secret-keys -o 0$i 0$i
	sleep 10
done

