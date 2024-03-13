# JMETER GUI
## all-student-name
![1](https://cdn.discordapp.com/attachments/1029736062974705746/1217461480308473906/Screenshot_851.png?ex=66041c5c&is=65f1a75c&hm=e0a4b67d6d50e50cc88421bd4f8b3dfec880515fe481dd716e51e9ed7aeb7e9a&)
![2](https://cdn.discordapp.com/attachments/1029736062974705746/1217461480639696936/Screenshot_852.png?ex=66041c5c&is=65f1a75c&hm=6b618c4fb2bcbb3eb0992aa7e93bb29c444b925e16aba45e117cc0ac029af4a6&)
![3](https://cdn.discordapp.com/attachments/1029736062974705746/1217461481038286868/Screenshot_853.png?ex=66041c5c&is=65f1a75c&hm=384aebfea170a0a921422ded4531ae3bcc263349ef629057a95e350ff2116373&)
![4](https://cdn.discordapp.com/attachments/1029736062974705746/1217461481352855662/Screenshot_854.png?ex=66041c5c&is=65f1a75c&hm=488a1a928733474958d3b91804cada4979c7e6cc2a09b242cce790ab231b5b74&)

## highest-gpa
![1](https://cdn.discordapp.com/attachments/1029736062974705746/1217462187115675678/Screenshot_855.png?ex=66041d04&is=65f1a804&hm=9b69533c9dc96ed029dd226430dfa5d99bca8ff213ac1e52b220ca0478f52f2b&)
![2](https://cdn.discordapp.com/attachments/1029736062974705746/1217462187535110267/Screenshot_856.png?ex=66041d04&is=65f1a804&hm=d886434e9c1cf340973e4ff90eec130b7ef8b0fab63a1d7a8a8822a1eb1679b3&)
![3](https://cdn.discordapp.com/attachments/1029736062974705746/1217462187908534313/Screenshot_857.png?ex=66041d04&is=65f1a804&hm=ee460cc98a8e69799ffd57f5f635d1e7da6c4fb3c527b7809c5f8d9ebe4887a6&)
![4](https://cdn.discordapp.com/attachments/1029736062974705746/1217462188252332224/Screenshot_858.png?ex=66041d05&is=65f1a805&hm=da7fd15ace49c459ee22a94ec0bb2d2d8abba4635b6af08fe9c9ee6c71f10b8a&)

# JMETER CLI
![1](https://cdn.discordapp.com/attachments/1029736062974705746/1217461070956859432/Screenshot_860.png?ex=66041bfa&is=65f1a6fa&hm=8f09f5b968416465ae65bd74780761ba90af5f2a07b66a5ab5cccd7653193a3d&)
![2](https://cdn.discordapp.com/attachments/1029736062974705746/1217461071288205382/Screenshot_861.png?ex=66041bfa&is=65f1a6fa&hm=1f9986b3d645d1577d9ffd9005df9d5463200eb9c189b23cb27740501fd52f49&)

# Conclusion
After doing refactoring, on average the response time for all-student-name and highest-gpa has decreased. Around 200-300ms decrease on all-student-name, and around 100ms decrease on highest-gpa. So overall there was a quite significant increase in performance.


# Reflection

1. What is the difference between the approach of performance testing with JMeter and profiling with IntelliJ Profiler in the context of optimizing application performance?

> JMeter focuses on the user's aspect on performance and is used to analyze the latency and performance of a service under a certain load, while IntelliJ Profiler focuses on the developer's aspect on performance and is used to analyze the performance of the code and the application itself and gives an in depth breakdown of resource utilization and speed of each method and class in the application.

2. How does the profiling process help you in identifying and understanding the weak points in your application?

> Profiling gives a detailed breakdown of the performance of the application and resource utilization of each method and class in the application, this helps in identifying the weak points in the application by showing which methods and classes are taking the most time and resources and can be optimized.

3. Do you think IntelliJ Profiler is effective in assisting you to analyze and identify bottlenecks in your application code?

> Yes, IntelliJ Profiler is effective in assisting to analyze and identify bottlenecks in the application code, it gives a detailed breakdown of the performance of the application and resource utilization of each method and class in the application, this helps in identifying the weak points in the application by showing which methods and classes are taking the most time and resources and can be optimized.

4. What are the main challenges you face when conducting performance testing and profiling, and how do you overcome these challenges?
> The main challenge when conducting performance testing and profiling is to understand the results and to optimize the application code based on the results, to overcome this challenge we need to understand the results and optimize the application code based on the results.Also the amount of information given can often times be overwhelming, so some getting used to is needed.

5. What are the main benefits you gain from using IntelliJ Profiler for profiling your application code?
> The benefits of mastering this technique is that it can help in optimizing the application code and improving the performance of the application and could be a powerful tool in the hands of a developer in identifying hard to debug issues, such as resource leaks and performance bottlenecks.

6. How do you handle situations where the results from profiling with IntelliJ Profiler are not entirely consistent with findings from performance testing using JMeter?
> First I'll have to see in depth what the differences are, since JMeter and IntelliJ Profiler are two different tools, and some variables doesn't always translate well between the two, like memory improvement often times doesn't affect or even worsen the performance of a service. I'll also have to analyze the code being tested to see where the problem might arise from. If no further conclusion can be made, I'll have find a third party tool to verify the results.

7. What strategies do you implement in optimizing application code after analyzing results from performance testing and profiling? How do you ensure the changes you make do not affect the application's functionality?
> This method could be paired with test driven development and could be used during the refactoring stages, this way we can ensure that the changes we make do not affect the application's functionality and ensures that a service always met a certain predefined specification.