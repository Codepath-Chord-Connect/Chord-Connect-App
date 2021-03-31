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
* User can create a new account (sign up), log in, and log out[X]
* User can see an overview of other users (Profile image and 1-2 audio files) who are in a close vicinity
* User can view their own profile
* User can send messages to other users
* User can upload audio files


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
* User can like a photo
* User can follow/unfollow another user
* User can see other users profiles


### 2. Screen Archetypes

* Login Screen
   * User can log into their account
  
* Registration Screen
   * User can register to create an account
* User Profile Screen
    * User can view other user's profile

* Home Screen
    * User can view feed and profiles of other users
   
* Chatting List Screen
    * User can see a list of users and previous chats. 

* Chatting Screen
    * User can receive and see messages from/with other users.
    
* Upload screen
    * User can upload a file (either a video or a audio file)

* Post Screen *(Optional)*
    * User can see a detailed view of the post with comments etc.

* Duet Screen *(Optional)*
    * User can duet with other users' posts here.


### 3. Navigation


**TAB NAVIGATION** (Screen to Screen)
* Home Screen
* Search Screen *(Optional)*
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
    * => Chat List Screen
* Chat List Screen
    * => Home Screen
    * => Chat Screen
* Chat Screen
    * => Chat List Screen
* Upload Screen
    * => Home Screen


## Wireframes
[Add picture of your hand sketched wireframes in this section]
<img src="CODEPATH WIREFRAME.png" width=600>

### [BONUS] Digital Wireframes & Mockups


### [BONUS] Interactive Prototype

## Schema 
[This section will be completed in Unit 9]
### [BONUS] Interactive Prototype

## Schema
[This section will be completed in Unit 9]

### Models
[Add table of models]
--> Audio Files

Property      | Type            | Description
------------- | ----------------|------------
objectId      | String          | unique id for the audio file
updatedAt     | Date            | date for when the audio file was updated
createdAt     | Date            | date for when the audio file was created
user          | Pointer <User>  | user that created and uploaded the audio file
audio_file    | File            | the actual audio file

--> Connections

Property      | Type              | Description
------------- | ------------------|------------
objectId      | String            | unique id for the connection
updatedAt     | Date              | date for when the connection was updated
createdAt     | Date              | date for when the connection was created
user          | Pointer <User>    | user that sent or received the connection request from another user
user_friend   | Pointer <User>    | user's connection who the user sent the request to or recieved the request from
### Networking
- [Add list of network requests by screen ]
- [Create basic snippets for each Parse network request]
- [OPTIONAL: List endpoints if using existing API such as Yelp]

---> Main Screen

- (Read/GET) Query all posts where users can view different users and their audio files
- Code Snippet
    protected void queryAudioFiles() {
        ParseQuery<AudioFiles> query = ParseQuery.getQuery(Audio.class);
        query.addDescendingOrder(AudioFiles.KEY_CREATED_KEY);
        query.findInBackground(new FindCallback<AudioFiles>() {
            @Override
            public void done(List<AudioFiles> audio_files, ParseException e) {
                if(e != null){
                    Log.i(TAG, "Issue with creating a post");
                    return;
                }
                for(AudioFiles audio_file: audio_files){
                    Log.i(TAG, "Post: " + audio_file.getDescription());
                }
                allAudioFiles.addAll(audio_files);
                adapter.notifyDataSetChanged();
            }
        });
    }

---> Profile Screen

- (Read/GET) Query all posts where users can view their own profile pic and audio files
- Code Snippet
    protected void queryAudioFiles() {
        ParseQuery<AudioFiles> query = ParseQuery.getQuery(Audio.class);
        query.include(AudioFiles.KEY_USER);
        query.whereEqualTo(AudioFiles.KEY_USER, ParseUser.getCurrentUser());
        query.addDescendingOrder(AudioFiles.KEY_CREATED_KEY);
        query.findInBackground(new FindCallback<AudioFiles>() {
            @Override
            public void done(List<AudioFiles> audio_files, ParseException e) {
                if(e != null){
                    Log.i(TAG, "Issue with creating a post");
                    return;
                }
                for(AudioFiles audio_file: audio_files){
                    Log.i(TAG, "Post: " + audio_file.getDescription());
                }
                allAudioFiles.addAll(audio_files);
                adapter.notifyDataSetChanged();
            }
        });
    }

Regards,

Kavan Adeshara
President of South Asian Student Association
Peer Mentor
Email: kxa5317@psu.edu
