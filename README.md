# GitHub Activity Tracker  

- A lightweight **Java-based CLI tool** that fetches a user's **GitHub activity** and presents events in a structured, readable format.
- This project idea is taken from **roadmap.sh**
---

## 🚀 Features
- Fetches GitHub user events using the **GitHub API**  
- Parses structured data like **PushEvents, WatchEvents, CreateEvents,.....**  
- Displays commits and repository interactions in a **clean format** 

---
## 📜 Code Structure
- GitHubApiHandler → Handles API requests and fetches JSON data
- GitHubEvent → Represents a GitHub event with structured details
- DisplayManager → Formats and prints event summaries
- Main → Entry point for user input and execution
