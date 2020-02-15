# Greeting Service Kata

A Code Kata intended to pratice TDD Outside-In.

## Welcome!

Hello developer! :wave: At the _HELLO WORLD! Inc._ company we are excited to develop and release a new idea into the market! We want to build a new service to send customized greeting messages to our users.

**Here you'll find few requirements**

* The service have to expose an HTTP API which can be called from other HTTP clients.
* The service can also be directly used from a command line or an interactive shell.

_Try to complete each feature before proceeding to the next one. We like to work iteratively._

## Feature One

_Just a Greeting_

```
When a greeting message is requested
Then the system will reply with "Hello my friend!"
```

## Feature Two

_Greeting a User with a customized message!_

```
When a User with the name Joe request a greeting message
Then the system will reply with a customized message that says:
"Hello Joe!"
```

## Feature Three

_Greeting a User by choosing a random greeting message from a set of messages_

```
When a User with the name Joe request a greeting message
Then the system will reply with a customized message that says:
"Hey Joe, nice to see you here!"
```

**List of predefined messages**

- `Hello {User}!`
- `Hey {User}, nice to see you here!`
- `{User} welcome back!`
- `Have a splendid day {User}.`

## Retrospective

- How difficult it was to boostrap your project and setup your first test?
- Do you think the requirements were clear enough?
- Which was the most difficult step? Why?

## Feature Four

_Greeting a User by choosing a greeting message from a predefined set of messages, **based on the time of the day**._

**Requesting a greeting message early in the morning**

```
When a User with the name Joe request a greeting message
And the time is early in the morning
Then the system will reply with a customized message that says:
"Good morning, Joe! The sun is high and shining!"
```

**List of predefined messages based on the time**

- **Morning (from 7 AM to 11 AM)** :sunny:
    - `Good morning, {User}! The sun is high and shining!`
    - `Hey {User}, nice to see you here!`
    - `{User} welcome back!`
    - `Have a splendid day {User}.`
- **The rest of the day (from 12 PM to 8 PM)** :clock3:
    - `Hello {User}!`
    - `You are great {User}`
- **Night (from 9 PM to 6 AM)** :zzz:
    - `Have a good night, {User}`
    - `Wish you sweet dreams {User} ...`
    - `It was a great day! {User} it's time to relax!`

## Retrospective

- Do you think your design is simple enough?
- What are the parts of your code you believe are most likely to change?
    - Do you think your code can be easily extended?

## Credits

The inspiration of this Code Kata comes from [String Calculator Kata](https://osherove.com/tdd-kata-1), [The Goose Game Kata](https://github.com/xpeppers/goose-game-kata), [RPG Combat Kata](https://github.com/ardalis/kata-catalog/blob/master/katas/RPG%20Combat.md) and [GOOS style TDD by Example - Sagy Rozman](https://www.youtube.com/watch?v=zcQOjYXe8vM).
