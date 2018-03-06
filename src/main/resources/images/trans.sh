#!/bin/bash
for file in *.png 
do 
	convert $file -transparent white batch/$file 
done
