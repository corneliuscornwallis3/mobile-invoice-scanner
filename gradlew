#!/bin/sh
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
"$DIR/gradle/wrapper/gradle-wrapper.jar" "$@"
