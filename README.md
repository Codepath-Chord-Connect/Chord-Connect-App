Original App Design Project - README Template
===

# Chord Connect

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
Chord Connect is a social app that connects musicians within your proximity, collaborate together and possibly form a band/musician coalition.

### App Evaluation

- **Category:** Photo/Social/Music
- **Mobile:** Android first experience, uses camera and user location, and parse database (back4app)
- **Story:** Allows musicians to connect with other musicians within their proximity; musicians can view each other's description, the type of instrument they play, the type of music software they use, their profile picture, and their location (proximity of the other user)
- **Market:** Anyone that enjoys making music and wants to connect/collaborate with other musicians
- **Habit:** Users can post their profile pic, description, the type of instrument they play, the type of music software they use, and their location (to see other users near their area) 
- **Scope:** Since its just the start, our app is going to be focused on a narrow location, like University Park, PA.

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

*User can post a new photo to their feed
* User can create a new account (sign up)
* User can log in
* User can log out
* User can see other users in a close vicinity
* User can like a photo
* User can follow/unfollow another user
* User can send messages to other users


**Optional Nice-to-have Stories**

* User can collaborate with other users by "Dueting"
* User can record on pre recorded samples and share them
* User can add a comment to a photo
* User can tap a photo to view a more detailed photo screen with comments
* User can see trending photos
* User can search for photos by a hashtag
* User can see notifications when their photo is liked or they are followed
* User can see their profile page with their photos
* User can see a list of their followers
* User can see a list of their following
* User can view other user’s profiles and see their photo feed


### 2. Screen Archetypes

* Login Screen
   * User can log into their account
  
* Registration Screen
   * User can register to create an account
* User Profile Screen
    * User can view other user's profile

* Home Screen
    * User can view feed and profiles of other users
   
* Chatting Screen
    * User can chat with other users. 
    * 
* Upload screen
    * User can upload a file (either a video or a audio file)

* Post Screen (Optional)
    * User can see a detailed view of the post with comments etc.

* Duet Screen (Optional)
    * User can duet with other users' posts here.


### 3. Navigation


**TAB NAVIGATION** (Screen to Screen)
* Home Screen
* Search Screen
* Upload Screen
* Profile Screen




**Flow Navigation** (Screen to Screen)
* Login Screen
    * => Home
* Registration Screen
    * => Home
* Home Screen
    * => Search Screen
* Search Screen 
    * => Home screen
* Profile Screen
    * => Chat Screen
* Chat Screen
    * => Home Screen
* Upload Screen
    * => Home Screen


## Wireframes
[Add picture of your hand sketched wireframes in this section]
<img src="CODEPATH WIREFRAME.png" width=600>

### [BONUS] Digital Wireframes & Mockups


### [BONUS] Interactive Prototype

## Schema 
[This section will be completed in Unit 9]
### Models
[Add table of models]
### Networking
- [Add list of network requests by screen ]
- [Create basic snippets for each Parse network request]
- [OPTIONAL: List endpoints if using existing API such as Yelp]
