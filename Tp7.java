package com.tactfactory.javaniveau2.tps.tp7;

import java.io.File;
import java.io.IOException;

import com.tactfactory.javaniveau2.tps.tp7.manager.FileManager;

/**
*
* @author tactfactory
*
*  - Compléter le programme en ne modifiant que manager.FileManager afin que :
*     - 1 : FileManager prenne un File en paramètre de son constructeur
*     - 2 : La fonction createProjectStructure() permet de créer l'arborescence suivante :
*        * ./test/
*             |_src/
*               |_main/
*                 |_java/
*                   |_com/
*                     |_tactfactory/
*                       |_myproject/
*                         |_Myproject.java
*                 |_resources/
*               |_test/
*                 |_java/
*     - 3 : Une fois l'arborescence créé la fonction createProjectStructure() devra ajouter au fichier MyProject.java
*         le contenu suivant :
*           "package com.tactfactory.myproject;\n" +
*           "\n" +
*           "public class MyProject {\n" +
*           "\n" +
*           "  public static void main(String[] args) {\n" +
*           "    System.out.println(\"Hello world\");\n" +
*           "  }\n" +
*           "}\n"
*     - 4 : Ensuite le projet doit être compilé, packagé en jar et exécuté.
*         Pour cela vous pouvez utiliser la fonction runInCommandLine() présente dans CmdUtils.
*         Pour rappel les commandes suivante permettent les actions de la compilation à l'exécution
*           javac -d buildFolder fichierABuild.java
*           jar cfe myproject.jar com/tactfactory/myproject/MyProject buildFolder
*           java -jar myproject.jar
*     - 5 : Rajouter la fonction listFiles() qui depuis le File passé dans le constructeur du FileManager, ci c'est un
*         dossier, viendra lister l'ensemble des sous éléments qui s'y trouve
*/
public class Tp7 {

  public static void main(String[] args) throws IOException {
    FileManager m = new FileManager(new File("/home/antoine.cronier/eclipse-workspace/tp7"));
    m.createProjectStructure();
    m.listFiles();
  }
}
