### Difference between State and Strategy pattern:
- Both of these patterns are used to change the behaviour of an object.
  - In State pattern the Context can have single state, and the behaviours are represented by subclass of State interface.
  - In the Strategy pattern we don't have a single state, different behaviours are represented using different Strategy objects.
  
### Undo operation in Memento vs Command Pattern:
- With the Memento pattern we store the changes in the state of an object, so we store multiple snapshots over time. <br>
  Sometime saving these snapshots can be expensive, for example if we build a video editor. Video is a large file <br>
  so storing multiple snapshots of a video is gonna be so expensive is those situations is better to use the command pattern <br>
  because every command knows how to undo itself, so we don't have to store multiple snapshots of an object. For example <br>
  if the user resizes the video all we have to store is the original dimension of the video, not the entire snapshot of the video object.<br>
  If we wanna undo that operation we will resise the video back to its original size.
 