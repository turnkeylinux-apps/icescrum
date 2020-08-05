#!/bin/bash

JAVA_BIN='/usr/lib/jvm/adoptopenjdk-8-hotspot-jre-amd64/bin/java'
ICESCRUM_CONTEXT='/'
ICESCRUM_WORK_DIR='/var/www/icescrum/work'

$JAVA_BIN -Dicescrum_config_location=/var/www/icescrum/config.groovy -Xmx512M \
    -jar /var/www/icescrum/icescrum.jar \
    context=$ICESCRUM_CONTEXT workDir=$ICESCRUM_WORK_DIR
