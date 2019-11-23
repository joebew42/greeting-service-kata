# Greeting Service Kata

A code kata intended to pratice TDD Outside-In.

## Background

The HELLO WORLD! Inc. company is willing to release a new product in the market! They want to build a new Greetings Service to send customized greeting messages each time a user request it.

**Requirements**

* The service should expose an HTTP API to be invoked by external services or users.
* The service can be invoked directly from a command line or an interactive shell.

## Instructions

1. Complete each feature before proceeding to the next one.

## Feature One

_Greeting a User!_

```
When Joe request a greeting message
The system replies with "Hello Joe!"
```

_Greeting when a User is not specified!_

```
When a greeting message is requested with no User
The system replies with "Hello my friend!"
```

## Feature Two

_Greeting a User by choosing a greeting message from a predefined set of messages_

```
When Joe request a greeting message
The system replies with "Hey Joe, nice to see you here!"
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

## Feature Three

_Greeting a User by choosing a greeting message from a predefined set of messages, **based on the time of the day**._

**Requesting a greeting message early in the morning**

```
When Joe request a greeting message
And the time is early in the morning
The system replies with "Good morning, Joe! The sun is high and shining!"
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