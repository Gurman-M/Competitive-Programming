public boolean linearIn(int[] outer, int[] inner) {
  //optimal solution is O(n) 
  // go through the array only once (do not have nested loops)
  
  int j = 0;
  
  for (int i = 0; i < outer.length; i++) {
      if (inner.length == 0) return true;
    if (outer[i] == inner[j]) {
      j++;
    }
    
    if (j == inner.length) {
      return true;
    }
  }
  
  return false;
}
