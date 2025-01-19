```groovy
def safeRemoval() {
  def list = [1, 2, 3]
  def itemsToRemove = []

  list.eachWithIndex { item, index ->
    if (item == 2) {
      itemsToRemove << index
    }
  }

  // Remove elements in reverse order to avoid index issues
  itemsToRemove.reverse().each { index ->
    list.remove(index)
  }
  println list
}

safeRemoval()
```