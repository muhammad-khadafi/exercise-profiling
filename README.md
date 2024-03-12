# Exercise Profiling

```credential
Nama  : Muhammad Milian Alkindi
Kelas : AdPro-B (Reguler)
```

## Module 05: Java Profiling

### Questions

> What is the difference between the approach of performance testing with JMeter and profiling with IntelliJ Profiler in the context of optimizing application performance?

Performance testing with JMeter will give us data regarding the latency/time for a response to arrive from a request.
This approach lets us simulate a very large number of users doing things in a controlled environment.

Meanwhile, profiling with IntelliJ Profiler saves a snapshot of the program with details for every single process that ran.
This approach gives us information regarding each function that was triggered and lets us know which part needs optimizing.

> How does the profiling process help you in identifying and understanding the weak points in your application?

Profiling lets me know methods that ran during a session and their execution time.
On inspection, it also shows the execution time for each line which helps me point out parts of the method that has non-optimal performance.

> Do you think IntelliJ Profiler is effective in assisting you to analyze and identify bottlenecks in your application code?

Yes

> What are the main challenges you face when conducting performance testing and profiling, and how do you overcome these challenges?

One problem was figuring out how to use the profiler and JMeter. I was also not familiar with Spring Framework and how to optimize it.
But after some use and reading the documentation, I overcame this challenge.

> What are the main benefits you gain from using IntelliJ Profiler for profiling your application code?

IntelliJ's Profiler gives plenty of data and tools for me to analyze a snapshot.
One of them is the **Method List** which lists every method that was called during the snapshot alongside its execution time.
When inspecting the source code, IntelliJ also displays the execution time for each line of the method.
This has helped me with pointing out which part of the method needs optimizing.

> How do you handle situations where the results from profiling with IntelliJ Profiler are not entirely consistent with findings from performance testing using JMeter?

Firstly, I will have to learn more about the profiler and JMeter to make sure I'm using them correctly.
Once I'm confident enough, I will recheck and see if I'm profiling and testing the same thing (logical checks).

> What strategies do you implement in optimizing application code after analyzing results from performance testing and profiling? How do you ensure the changes you make do not affect the application's functionality?

Firstly, I will have to understand what the code is trying to do. This is crucial in making sure I don't affect the desired outcome.
After that, I try out alternatives with the goal of reducing the execution time. Ideas for alternatives will be a trial and error process
which also requires reading the documentation.
From those alternatives, I compare them to the original code in a similar profiler run and pick the one with the best performance but still keeps the original functionality.

### Conclusion

**JMeter GUI Test Results (Post-Optimization)**

![all-student-name](/docs/img/gui_post_testplan2.jpg)
*/all-student-name*

![highest-gpa](/docs/img/gui_post_testplan3.jpg)
*/highest-gpa*

After optimization, there is a visible difference in performance testing results via JMeter.
All three tests have seen a performance increase of over 80% while maintaining the same expected response.

### Attachments

**JMeter GUI Test Results (Pre-Optimization)**

![all-student-name](/docs/img/gui_pre_testplan2.jpg)
*/all-student-name*

![highest-gpa](/docs/img/gui_pre_testplan3.jpg)
*/highest-gpa*

**JMeter CLI Test Results (Pre-Optimization)**

![all-student-name](/docs/img/cli_pre_testplan2.jpg)
*/all-student-name*

![highest-gpa](/docs/img/cli_pre_testplan3.jpg)
*/highest-gpa*

---
[↑ Back to top](#exercise-profiling)