/*
 *  in the code given bellow there is an important concept hidden
 *  the code :- 
 *          ⚡ third()
 *          public void third(Runnable printThird) throws InterruptedException {
 *              synchronized (this) {
 *                  while (!firstFinished && !secondFinished) {
 *                      wait();             // waits until both are done
 *                  }
 *                  notify();               // wakes one waiting thread (but who's left?)
 *              }
 *              printThird.run();           // prints "third"
 *          }
 * 
 *  👉 What happens?         
 *                  Waits while both firstFinished and secondFinished are false.
 *                  Wakes up and calls notify().
 *                  📝 Issues:
 *                  
 *                  1️⃣ Condition logic:
 *                  while (!firstFinished && !secondFinished)
 *                  This means it will wait only if both are false.
 *                  But the goal is to wait until both are true.
 *                  
 *                      👉 Example:
 *                              firstFinished = true, secondFinished = false
 *                              third() will not wait → it proceeds (wrong order)
 *                              ✅ The correct logic would need:
 *                              while (!firstFinished || !secondFinished)
 *                              ➡ Wait until both are true.
 *                  
 *                  2️⃣ notify() after waking up
 *                  third() calls notify() after waking up — but who is left to wake up at this point? 
 *                  There are no other threads waiting on the lock → this notify() does nothing useful.
 * 
 * 
 *              ALWAYS REMEBER WHEN USING ! WITH OPPOSITE CONDITION FOR EXAMPLE
 *              LETS SAY U WANT TO PERFORM SOMETHING BASED ON String a is Yes or Not
 *              then u check with a method called aIsYes() 
 *                  which return true if true if a = "Yes"
 *                  else it return false if true if a = "No"
 *              
 *              NOW 
 *                  if( aIsYes() ) {
 *                      // do something for yes
 *                  }
 *                  
 *                  if( !aIsYes() ) {        
 *                      // do something for no, this is basically aIsNotYes method by using ! inside if  
 *                  }
 *              SIMILARLY : we have same method for b variable bIsYes
 * 
 *              NOW USING THEM BOTH for something in case a returns No 
 *              So,
 *              using while(!aIsYes() && !bIsYes()) for case where both return false for case NO 
 *              this is wrong since were using ! 
 *              it will not run loop in CASE !aIsYes() is true and !aIsYes() is false it returns (false) overall
 *              INSTEAD WHAT'S CORRECT TO USE || (OR) OPERATOR TO ENSURE BOTH ARE FALSE
 *              AND USE && (AND) TO ENSURE THAT ONLY ONE OF THEM IS FALSE 
 */