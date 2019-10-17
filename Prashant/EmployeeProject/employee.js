//console.log('hello')

class employee{
	constructor(id,name,address){
		this.empId = id;
		this.empName = name;
		this.empAddress = address;
	}
}

class EmpRepository{
	constructor(){
		this.data = []; //initi.. array
	}

	addEmployee(emp){
		this.data.push(emp);
		alert("Employee added successfully");
	}

	deleteEmployee(id){
		for(var i = 0; i < this.data.length; i++){
			if(this.data[i].empId == id){
				this.data.splice(i,1);
				alert("Employee deleted successfully");
			}
		}
		throw "Employee not found to delete";
	}

    find(id){
    	for(var i = 0; i <this.data.length; i++){
    		if(this.data[i].empId == id){
    			return this.data[i];
    		}
    	}
    	throw "Employee not found";
    }	
}
