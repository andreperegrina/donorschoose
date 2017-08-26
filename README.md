[![Build Status](https://travis-ci.org/andreperegrina/donorschoose.svg?branch=master)](https://travis-ci.org/andreperegrina/donorschoose)

# DonorsChoose Java command-line app

This application queries the information of the DonorsChoose organization through its api.


## Usage

To use the command-line application you just need to used like this

``./gradlew``


With the command `--help` you can have a manual of the commands availables


``
  Options:
    --help

    -D
      Dynamic parameters -NAME_OF_PARAMETER
      Syntax: -Dkey=value
      Default: {}
    -keywords
      Search Projects functionality. The keyword search matches any of the 
      following field: id, title, synopsis, short description, fulfillment 
      trailer, school name, teacher’s first name, teacher’s last name, city, 
      county , district, ward/neighborhood, state , zip, subject name

``


If you want to enable the assertion add the following code to **vmoptions**

``-ea``

## Install

Execute this command:

``./gradlew``

or

``./gradlew build``

if you want to generate the jar.