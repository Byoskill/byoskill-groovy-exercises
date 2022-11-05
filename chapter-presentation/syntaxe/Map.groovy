Map mp = [:]

Map mp2 = [1: "un", 2: "deux"]

mp2 += [3: "trois"]

//mp2 -= [3: "trois"  ]

mp2.remove(3)

var mp3 = mp2 + [4 : "quatre"]

println mp3

int [] i = [ 0, 1, 2, 3 ]


var liste =[ 0, 1, 2, 3 ]
liste.add(5)

/* K     V
  key1 : value
  key2: value2
  key3 : value3
 */

// JAVA 4 new Hashtable<>();
var tree = new TreeMap<>();
tree.put("un", 1);
tree.put("deux", 2);
tree.put("trois", 3);
println "Tree ${tree}";

var tree2 = new HashMap<>();
tree2.put("un", 1);
tree2.put("deux", 2);
tree2.put("trois", 3);
println "HashMap ${tree2}";

println "Hashcode 1 " + "un".hashCode();
println "Hashcode 2 " + "deux".hashCode();
println "Hashcode 3 " + "trois".hashCode();

/**
 * Clé => hashcode
 *
 * hashcode -> ["un", "quatre"]
 * hashcode2 -> []
 * hashcode3 -> []
 *
 */


Map<Integer, String> map = new HashMap<Integer, String>()
map.put(1, "un")
map.put(2, "deux")
map.put(2, "deux fois")
map.put("trois", "trois")
println map

println "Clés " + map.keySet()
println "Valeurs " + map.values()

println "Taille ${liste.size()}"

// Set : un ensemble de valeurs "uniques"
// SELECT DISTINCT **

liste2 = [1, 2, 2, 4]
println "Doublons : " + liste2.size()

set1 = [1, 2, 2, 4] as Set
println "Set : " + set1.size()
println "Set : " + set1

