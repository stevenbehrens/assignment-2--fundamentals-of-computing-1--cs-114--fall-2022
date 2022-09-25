# Fall 2022 Fundamentals of Computing I — Assignment 2

* **Read these instructions repeatedly until you understand, then begin your project. If something is not clear, ask.**

## ❖ Before You Begin ❖
1. Log in to GitHub.
2. Fork this repo(sitory). See [this video](http://code-warrior.github.io/tutorials/git/github/forking-and-cloning-at-the-github-web-site/) on how to carry out this step and step `3`.
3. Clone your fork, using either the web site or the GitHub Desktop client.
4. Checkout your personalized branch, the one with your name and GitHub handle.

---

## ❖ Introduction ❖
For this assignment, you’ll be writing a program that accepts input from the user in the form of an integer, then creates a diamond whose width (in columns) and height (in rows) are dictated by user input. For example, if the user enters 5, then the height of the diamond is 5 rows and the width of the diamond is 5 columns. See [http://vanegas.cs.hartford.edu/uploads/videos/diamond-program-in-java.mp4](http://vanegas.cs.hartford.edu/uploads/videos/diamond-program-in-java.mp4).

**Note**: Odd and even versions of the diamond are rendered differently. Review the aforementioned video carefully for an example.

---

## ❖ File List ❖
This repo contains the following files, all required to carry out this assignment. Before you start working, ensure you understand the role of each file below.

01. `Makefile` — Run `make` in your command line interface, or CLI, from this repo’s root folder to build your assignment. As you test input, run `make run` to _only_ run a previously-compiled Java program, not compile it. Run `make clean` to remove the class file.
02. `.editorconfig` — Everything in this file is a redundancy of what’s already in the `.editorconfig` file you installed in your home folder. It’s here to make sure you’re working with the formatting rules defined in `.editorconfig`, as this is part of your grade. **Do not move this file.** Also, **ensure EditorConfig is working in VS Code, _before_ beginning this assignment.**
03. `.gitignore` — **Do not modify this file.**
04. `Assignment2.java` — Where you will do your assignment. **Do not** write your code in anything _other_ than this file.

---

## ❖ Example Output ❖
Here are two examples of output, one for an even situation, the other for an odd.
```
Enter a number
8
        *
       * *
     * * * *
   * * * * * *
 * * * * * * * *
   * * * * * *
     * * * *
       * *
        *
```
```
Enter a number
5
  *
 ***
*****
 ***
  *
---
```

## ❖ Grading ❖
| Item                                                          | Points  |
|---------------------------------------------------------------|:-------:|
| Program works according to instructions                       | `20`    |
| Code compliant with EditorConfig rules                        | `20`    |
| Code is neat and professional                                 | `20`    |
| Odd version of diamond rendered according to video rendering  | `20`    |
| Even version of diamond rendered according to video rendering | `20`    |

---

## ❖ Due ❖
Wednesday, 5 October 2022, at 9:00 AM.

---

## ❖ Submission ❖
You will need to issue a pull request back into the original repo, the one from which your fork was created for this project. See the **Issuing Pull Requests** section of [this site](http://code-warrior.github.io/tutorials/git/github/index.html) for help on how to submit your assignment.

**Note**: This assignment may *only* be submitted via GitHub. **No other form of submission will be accepted**.
