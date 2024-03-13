#!/bin/bash

JAVA_BIN='/usr/lib/jvm/temurin-8-jre-amd64/bin/java'
ICESCRUM_CONTEXT='/'
ICESCRUM_WORK_DIR='/var/www/icescrum/work'
ICESCRUM_CONFIG=/var/www/icescrum/config.groovy

$JAVA_BIN -Dicescrum_config_location="$ICESCRUM_CONFIG" -Xmx512M \
    -jar /var/www/icescrum/icescrum.jar \
    context=$ICESCRUM_CONTEXT workDir=$ICESCRUM_WORK_DIR host=localhost
