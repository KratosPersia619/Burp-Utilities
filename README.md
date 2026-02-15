# Burp Utilities Documentation

## Introduction
This documentation provides a comprehensive overview of the Burp custom actions, scan checks, and Bambda scripts used in the Burp Utilities project. It serves as a guide for users to understand the functionalities and usages of these components.

## Table of Contents
1. [Burp Custom Actions](#burp-custom-actions)
2. [Scan Checks](#scan-checks)
3. [Bambda Scripts](#bambda-scripts)

## Burp Custom Actions
### Overview
Burp Suite supports the use of custom actions to enhance its capabilities and streamline workflows. Custom actions can be defined for performing specific tasks during scans or when interacting with data in Burp.

### How to Create Custom Actions
1. Go to the Burp Suite dashboard.
2. Navigate to the "Extensions" tab.
3. Select "Manage Extensions" and then "Add" to create a new custom action.
4. Define the parameters and logic for your action.

### Example
```java
public class MyCustomAction extends IBurpExtender {
    // Implementation details
}
