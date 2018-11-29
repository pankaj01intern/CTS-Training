//call and apply 
/*function doTeach(){
    
    function doLearn(sub,by){
        console.log('Learning '+sub+' by '+by);
    }
    return doLearn;
}


let p1={name:'java'};
let p2={name:'Ria'}
let learn= doTeach();
learn.call(p1,p1.name,'Praveen');
learn.apply(p1,['C++',p2.name]);*/

//----------------------------------------------------------------------------------

//BIND DEMO

function startSession(){

    function Employee(name){
        this.name=name;
    }

    function Trainer(name){
        this.name=name;
    }

    doTeach=function(sub){
        console.log(this.name+' is teaching '+sub);
        let self=this;
       // console.dir(self);
        console.log('-- Teachig Ends..');
        
        doLearn=function(){
            //console.dir(this);
        let notes=this.sub+' Notes';
        
        console.log(this.name+' is learning '+sub+' from '+self.name);
    }
    return doLearn;
    
    }
let e1=new Employee('A');
let e2=new Employee('B');
let trainer=new Trainer('Praveen');

let trainByPraveen=doTeach.bind(trainer);
let learn=trainByPraveen('Java');

learn.call(e1);
learn.call(e2);

}
startSession();