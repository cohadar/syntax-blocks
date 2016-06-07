#!/bin/bash
# while read line; do
# 	if [[ $line =~ ^i-[0-9a-fA-F]{8}$ ]] ; then echo $line; fi
# done
grep -e '^i-[0-9a-fA-F]\{8\}$'
