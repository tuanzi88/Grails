package linkcassadrademo

class Person {
	
	String name
	int age
	String ToString() {
		"${name}"
	}
	
	//static hasMany = [trees: Tree]
	static mapWith = "cassandra"
    static constraints = {
    }
}
