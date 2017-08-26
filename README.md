[![Build Status](https://travis-ci.org/andreperegrina/donorschoose.svg?branch=master)](https://travis-ci.org/andreperegrina/donorschoose)

# DonorsChoose Java command-line app

This application queries the information of the DonorsChoose organization through its api.


## Usage

To use the command-line application you just need to used like this

``java -jar donorschoose-1.0.jar``

this command will execute the default values in the app.

## Keyword parameter

You can use the `-keywords` to search for phrase

``java -jar donorschoose-1.0.jar -keywords="Canoga Park"``

The result will based in the following fields:

* id
* title
* synopsis (full length project essay; not returned in JSON)
* short description
* fulfillment trailer
* school name
* teacher’s first name (not returned in JSON)
* teacher’s last name (only initial returned in JSON)
* city
* county (not returned in JSON)
* district (not returned in JSON)
* ward/neighborhood (not returned in JSON)
* state (e.g. TX)
* zip (not returned in JSON)
* subject name

To see more information or the complete list of fields updated please visit:
[https://data.donorschoose.org/docs/project-listing/json-requests/](https://data.donorschoose.org/docs/project-listing/json-requests/)

### Custom parameters

If you want to pass custom parameters to the application you need to use the `-DNAME_PARAMETER`
command.

``java -jar donorschoose-1.0.jar -Dmax=5``

Warning: you need to use the -D command in capital letter.

To see more information or the complete list of parameters that you can use please visit:
[https://data.donorschoose.org/docs/project-listing/json-requests/](https://data.donorschoose.org/docs/project-listing/json-requests/)

### Help

With the command `java -jar donorschoose-1.0.jar --help` you can have a manual of the commands availables

```
Options: 
	
	--help 
	
	-D 
	    With this argument you can add dynamic parameters. You can add just 1 
	    Syntax: -Dkey=value 
	    Default: {} 
		
	-keywords 
	    Search Projects functionality. The keyword search matches any of the following field: id, title, synopsis, 
	    short description, fulfillment trailer, school name, teacher’s first name, teacher’s last name, city, county , 
	    district, ward/neighborhood, state , zip, subject name
```


### Enable test

If you want to enable the assertion add the following code to **vmoptions**

``-ea``

## Download

To download the command-line application please visit the section of releases:
[https://github.com/andreperegrina/donorschoose/releases](https://github.com/andreperegrina/donorschoose/releases)

## Install

Execute this command:

``./gradlew``

or

``./gradlew build``

if you want to generate the jar.