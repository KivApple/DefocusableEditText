# DefocusableEditText

Just EditText which clears its focus when user presses Back button.

## Usage

Execute this command under your project root:

    git submodule add https://github.com/KivApple/DefocusableEditText.git defocusableedittext

Add these lines to your Android project files:

`/settings.gradle`

    include ':app', ..., ':defocusableedittext'

`/build.gradle`

    buildscript {
        ext.kotlin_version = '1.3.50'
        ext.appCompatVersion = '1.0.2'
        ...
    }

`/app/build.gradle`

    dependencies {
        ...
        implementation project(':defocusableedittext')
        ...
    }
