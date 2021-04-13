#!/bin/bash
#
# ==================================
# FileName : install_java.sh
# Description: 
# 
# Author : loevc
# Created Time : 21/04/01 19:31 (CST)
# 
#==================================

cd ~
mkdir java_work
cd java_work
sudo apt-get install openjdk-8-jdk
wget https://download-cf.jetbrains.com/idea/ideaIC-2020.3.3.tar.gz
tar -xzf idea- 2020.3.3.tar.gz
tar -xzf ideaIC-2020.3.3.tar.gz
./idea-IC-203.7717.56/bin/idea.sh
