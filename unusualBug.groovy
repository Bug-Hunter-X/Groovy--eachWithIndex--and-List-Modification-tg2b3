```groovy
def unusualBug() {
  def list = [1, 2, 3]
  list.eachWithIndex { item, index ->
    if (item == 2) {
      list.remove(item) // Modifying the list during iteration
    }
  }
  println list
}

unusualBug()
```