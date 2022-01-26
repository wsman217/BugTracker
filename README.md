# Getting Started

* Clone this repository.
* Rename example-config.json to config.json and replace with your own values.
* Go through the set-up process after this then the deployment.

# What this project is:

This project is meant to be a portfolio project and will eventually be listed on my [website](https://westonsublett.com). I started work on this project on October 26, 2021 in hopes to finish it in 6 months. 

This project is my take on a bug tracker similar to JIRA or the likes. I will be using technologies such as Spring, React Native, and MariaDB respectively. Most of these technologies will be fairly new to me so any advice is greatly appreciated! 

### Configuration Options
Config Option | Definition
--- |--- |
isFirstBoot | This is a config option to tell the application if it needs to copy the original resources from the jar to outside the jar for users to change.
host | this is the hostname of the MariaDB
port | port to connect to the MariaDB
username | the username used to connect to the MariaDB
password | the password used to connect to the MariaDB
database | the specific database to connect to for MariaDB