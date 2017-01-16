#!/bin/bash

function build()
{
    cd /src
    mvn clean install
}

build