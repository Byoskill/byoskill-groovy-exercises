var liste = [1,2,3,4,4,5]
println liste.size()

// version Groovy
Set sansDoublons = liste as Set;
println sansDoublons.size()

// version Java
Set sansDoublons2 = new HashSet(liste)