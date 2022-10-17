#!/bin/sh 

# called with '--upstream-version' <version>
VERSION=$2
TAR=../osgi-foundation-ee_$VERSION.orig.tar.gz
DIR=osgi-foundation-ee-$VERSION
TAG=42

wget -O ee.foundation.jar http://www.osgi.org/download/r4v$TAG/ee.foundation.jar 

mkdir -p $DIR/src/
(cd $DIR && jar xvf ../ee.foundation.jar)

rm -r $DIR/java*
mv $DIR/OSGI-OPT/src/* $DIR/src/
mv $DIR/OSGI-OPT/*.bnd $DIR/src/
mv $DIR/META-INF $DIR/src/
rm -r $DIR/OSGI-OPT

GZIP=--best tar -c -z -f $TAR --exclude '*.jar' --exclude '*.class' $DIR
rm -rf $DIR ee.foundation.jar
