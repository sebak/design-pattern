# Builder

The Builder Pattern provides a way to construct an object by allowing you to set its various properties (or attributes) in a step-by-step manner.

This pattern is particularly useful when dealing with objects that have many optional parameters or configurations.

Imagine we’re developing a user entity. Users have different properties like name, email, phone and city etc. Here name and email are required fields and phone and city are optional. Now, each person might have different combinations of these properties. Some might have city, others might not. Some might have phone, others might not. The Builder Design Pattern helps you create these users flexibly, step by step.