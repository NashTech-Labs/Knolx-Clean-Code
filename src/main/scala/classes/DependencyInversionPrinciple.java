package classes;

import java.util.List;


class BackEndDeveloper {

    public void writeJava() {
    }
}

class FrontEndDeveloper {

    public void writeJavascript() {
    }

}

// we can see the Project class is a high level module and it depends on low level modules such as BackEndDeveloper and FrontEndDeveloper.
// We are actually violating the first part of the dependency inversion principle.

class Project {

    private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
    private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();

    public void implement() {

        backEndDeveloper.writeJava();
        frontEndDeveloper.writeJavascript();
    }

}


/**
 * We can change it to ::::::::::
 */
interface Developer {

    void develop();
}


class BackEndDeveloperUpdated implements Developer {

    @Override
    public void develop() {
        writeJava();
    }

    private void writeJava() {
    }
}

class FrontEndDeveloperUpdated implements Developer {

    @Override
    public void develop() {
        writeJavascript();
    }

    public void writeJavascript() {
    }

}

//The next step in order to tackle the violation of the first part would be to refactor the Project class
// so that it will not depend on the FrontEndDeveloper and the BackendDeveloper class.

class ProjectUpdated {

    private List<Developer> developers;

    public ProjectUpdated(List<Developer> developers) {

        this.developers = developers;
    }

    public void implement() {

        developers.forEach(d -> d.develop());
    }

}

// The outcome is that the Project class does not depend on lower level modules but abstractions.
// Also low-level modules and their details depend on abstractions.