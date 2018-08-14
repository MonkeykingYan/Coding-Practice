# **Java**

## **Overloading v.s Overwritting**

* **Overloading** is a term used to describe when two methods have the **same name** but differ in the type or number of arguments.

~~~
1 public double computeArea(Circle c) { .•• }
2 public double computeArea(Square s) { ••• }
~~~

* **Overriding**, however, occurs when a method shares the same name and function signature as another
method in its **super class**.

---

## **Collection Framework**

1. **ArrayList:** An Array List is a dynamically resizing array, which grows as you insert elements.
2. **Vector:** A vector is very similar to an Arraylist except that it is **synchronized.** Its syntax is almost identical as well.
3. **Linked List:**
~~~
1 Linkedlist<String> mylinkedlist = new Linkedlist<String>();
2 mylinkedlist. add("two");
3 myLinkedList. add First ("one");
4 Iterator<String> iter = mylinkedlist.iterator();
5 while (iter.hasNext()) {
6 System.out.println(iter.next());
7 }
~~~
4. **HashMap:**

---

## Some Questions

1. **Private Constructor:** In terms of inheritance, what is the effect of keeping a constructor private?

~~~

~~~
