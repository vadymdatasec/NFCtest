public class org.apache.log4j.lf5.viewer.configure.ConfigurationManager {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public org.apache.log4j.lf5.viewer.LogBrokerMonitor a;
	 public org.apache.log4j.lf5.viewer.LogTable b;
	 /* # direct methods */
	 public org.apache.log4j.lf5.viewer.configure.ConfigurationManager ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 this.a = v0;
		 /* .line 3 */
		 this.b = v0;
		 /* .line 4 */
		 this.a = p1;
		 /* .line 5 */
		 this.b = p2;
		 /* .line 6 */
		 (( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).d ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->d()V
		 return;
	 } // .end method
	 public static java.lang.String treePathToString ( javax.swing.tree.TreePath p0 ) {
		 /* .locals 5 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
		 /* .line 2 */
		 (( javax.swing.tree.TreePath ) p0 ).getPath ( ); // invoke-virtual {p0}, Ljavax/swing/tree/TreePath;->getPath()[Ljava/lang/Object;
		 int v1 = 1; // const/4 v1, 0x1
		 int v2 = 1; // const/4 v2, 0x1
		 /* .line 3 */
	 } // :goto_0
	 /* array-length v3, p0 */
	 /* if-ge v2, v3, :cond_1 */
	 /* .line 4 */
	 /* aget-object v3, p0, v2 */
	 /* check-cast v3, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
	 /* if-le v2, v1, :cond_0 */
	 final String v4 = "."; // const-string v4, "."
	 /* .line 5 */
	 (( java.lang.StringBuffer ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 6 */
} // :cond_0
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v3 ).getTitle ( ); // invoke-virtual {v3}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getTitle()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* add-int/lit8 v2, v2, 0x1 */
/* .line 7 */
} // :cond_1
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
/* # virtual methods */
public java.lang.String a ( org.w3c.dom.NamedNodeMap p0, java.lang.String p1 ) {
/* .locals 0 */
/* .line 13 */
/* .line 14 */
} // .end method
public void a ( ) {
/* .locals 2 */
/* .line 15 */
v0 = this.a;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v0 ).getCategoryExplorerTree ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->getCategoryExplorerTree()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;
/* .line 16 */
v1 = (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) v0 ).getRowCount ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->getRowCount()I
/* add-int/lit8 v1, v1, -0x1 */
} // :goto_0
/* if-lez v1, :cond_0 */
/* .line 17 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) v0 ).collapseRow ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->collapseRow(I)V
/* add-int/lit8 v1, v1, -0x1 */
} // :cond_0
return;
} // .end method
public void a ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 18 */
try { // :try_start_0
/* new-instance v0, Ljava/io/PrintWriter; */
/* new-instance v1, Ljava/io/FileWriter; */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).c ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->c()Ljava/lang/String;
/* invoke-direct {v1, v2}, Ljava/io/FileWriter;-><init>(Ljava/lang/String;)V */
/* invoke-direct {v0, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V */
/* .line 19 */
(( java.io.PrintWriter ) v0 ).print ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* .line 20 */
(( java.io.PrintWriter ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/PrintWriter;->close()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 21 */
(( java.io.IOException ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V
} // :goto_0
return;
} // .end method
public final void a ( java.lang.String p0, java.awt.Color p1, java.lang.StringBuffer p2 ) {
/* .locals 2 */
final String v0 = "\t\t<"; // const-string v0, "\t\t<"
/* .line 62 */
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "colorlevel"; // const-string v0, "colorlevel"
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = " "; // const-string v0, " "
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "name"; // const-string v0, "name"
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "=\""; // const-string v0, "=\""
/* .line 63 */
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "\" "; // const-string p1, "\" "
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = "red"; // const-string v1, "red"
/* .line 64 */
(( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v1 = (( java.awt.Color ) p2 ).getRed ( ); // invoke-virtual {p2}, Ljava/awt/Color;->getRed()I
(( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = "green"; // const-string v1, "green"
/* .line 65 */
(( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v1 = (( java.awt.Color ) p2 ).getGreen ( ); // invoke-virtual {p2}, Ljava/awt/Color;->getGreen()I
(( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "blue"; // const-string p1, "blue"
/* .line 66 */
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
p1 = (( java.awt.Color ) p2 ).getBlue ( ); // invoke-virtual {p2}, Ljava/awt/Color;->getBlue()I
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
final String p1 = "\"/>\r\n"; // const-string p1, "\"/>\r\n"
/* .line 67 */
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
return;
} // .end method
public final void a ( java.lang.String p0, java.lang.StringBuffer p1 ) {
/* .locals 1 */
final String v0 = "\t<"; // const-string v0, "\t<"
/* .line 48 */
(( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "searchtext"; // const-string v0, "searchtext"
(( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = " "; // const-string v0, " "
(( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "name"; // const-string v0, "name"
/* .line 49 */
(( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "=\""; // const-string v0, "=\""
(( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "\""; // const-string p1, "\""
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "/>\r\n"; // const-string p1, "/>\r\n"
/* .line 50 */
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
return;
} // .end method
public final void a ( java.lang.String p0, Boolean p1, java.lang.StringBuffer p2 ) {
/* .locals 1 */
final String v0 = "\t\t<"; // const-string v0, "\t\t<"
/* .line 58 */
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "level"; // const-string v0, "level"
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = " "; // const-string v0, " "
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "name"; // const-string v0, "name"
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "=\""; // const-string v0, "=\""
/* .line 59 */
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "\" "; // const-string p1, "\" "
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "selected"; // const-string p1, "selected"
/* .line 60 */
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;
final String p1 = "\"/>\r\n"; // const-string p1, "\"/>\r\n"
/* .line 61 */
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
return;
} // .end method
public final void a ( java.lang.StringBuffer p0 ) {
/* .locals 1 */
final String v0 = "</configuration>\r\n"; // const-string v0, "</configuration>\r\n"
/* .line 51 */
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
return;
} // .end method
public final void a ( java.util.List p0, java.lang.StringBuffer p1 ) {
/* .locals 2 */
final String v0 = "\t<logtablecolumns>\r\n"; // const-string v0, "\t<logtablecolumns>\r\n"
/* .line 41 */
(( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 42 */
/* .line 43 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 44 */
/* check-cast v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn; */
/* .line 45 */
v1 = this.a;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v1 ).getTableColumnMenuItem ( v0 ); // invoke-virtual {v1, v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->getTableColumnMenuItem(Lorg/apache/log4j/lf5/viewer/LogTableColumn;)Ljavax/swing/JCheckBoxMenuItem;
/* .line 46 */
(( org.apache.log4j.lf5.viewer.LogTableColumn ) v0 ).getLabel ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->getLabel()Ljava/lang/String;
v1 = (( javax.swing.JCheckBoxMenuItem ) v1 ).isSelected ( ); // invoke-virtual {v1}, Ljavax/swing/JCheckBoxMenuItem;->isSelected()Z
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).b ( v0, v1, p2 ); // invoke-virtual {p0, v0, v1, p2}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->b(Ljava/lang/String;ZLjava/lang/StringBuffer;)V
} // :cond_0
final String p1 = "\t</logtablecolumns>\r\n"; // const-string p1, "\t</logtablecolumns>\r\n"
/* .line 47 */
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
return;
} // .end method
public final void a ( java.util.Map p0, java.lang.StringBuffer p1 ) {
/* .locals 3 */
final String v0 = "\t<loglevels>\r\n"; // const-string v0, "\t<loglevels>\r\n"
/* .line 27 */
(( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 28 */
/* .line 29 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 30 */
/* check-cast v1, Lorg/apache/log4j/lf5/LogLevel; */
/* .line 31 */
/* check-cast v2, Ljavax/swing/JCheckBoxMenuItem; */
/* .line 32 */
(( org.apache.log4j.lf5.LogLevel ) v1 ).getLabel ( ); // invoke-virtual {v1}, Lorg/apache/log4j/lf5/LogLevel;->getLabel()Ljava/lang/String;
v2 = (( javax.swing.JCheckBoxMenuItem ) v2 ).isSelected ( ); // invoke-virtual {v2}, Ljavax/swing/JCheckBoxMenuItem;->isSelected()Z
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v1, v2, p2 ); // invoke-virtual {p0, v1, v2, p2}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Ljava/lang/String;ZLjava/lang/StringBuffer;)V
} // :cond_0
final String p1 = "\t</loglevels>\r\n"; // const-string p1, "\t</loglevels>\r\n"
/* .line 33 */
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
return;
} // .end method
public final void a ( java.util.Map p0, java.util.Map p1, java.lang.StringBuffer p2 ) {
/* .locals 2 */
final String v0 = "\t<loglevelcolors>\r\n"; // const-string v0, "\t<loglevelcolors>\r\n"
/* .line 34 */
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 35 */
/* .line 36 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 37 */
/* check-cast v0, Lorg/apache/log4j/lf5/LogLevel; */
/* .line 38 */
/* check-cast v1, Ljava/awt/Color; */
/* .line 39 */
(( org.apache.log4j.lf5.LogLevel ) v0 ).getLabel ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/LogLevel;->getLabel()Ljava/lang/String;
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v0, v1, p3 ); // invoke-virtual {p0, v0, v1, p3}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Ljava/lang/String;Ljava/awt/Color;Ljava/lang/StringBuffer;)V
} // :cond_0
final String p1 = "\t</loglevelcolors>\r\n"; // const-string p1, "\t</loglevelcolors>\r\n"
/* .line 40 */
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
return;
} // .end method
public final void a ( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode p0, java.lang.StringBuffer p1 ) {
/* .locals 3 */
/* .line 22 */
v0 = this.a;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v0 ).getCategoryExplorerTree ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->getCategoryExplorerTree()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) v0 ).getExplorerModel ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->getExplorerModel()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;
/* .line 23 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p1 ).breadthFirstEnumeration ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->breadthFirstEnumeration()Ljava/util/Enumeration;
/* .line 24 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 25 */
/* check-cast v1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
/* .line 26 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) v0 ).getTreePathToRoot ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->getTreePathToRoot(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;)Ljavax/swing/tree/TreePath;
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v1, v2, p2 ); // invoke-virtual {p0, v1, v2, p2}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;Ljavax/swing/tree/TreePath;Ljava/lang/StringBuffer;)V
} // :cond_0
return;
} // .end method
public final void a ( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode p0, javax.swing.tree.TreePath p1, java.lang.StringBuffer p2 ) {
/* .locals 4 */
/* .line 52 */
v0 = this.a;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v0 ).getCategoryExplorerTree ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->getCategoryExplorerTree()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;
final String v1 = "\t<"; // const-string v1, "\t<"
/* .line 53 */
(( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = "category"; // const-string v1, "category"
(( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = " "; // const-string v1, " "
(( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = "name"; // const-string v1, "name"
/* .line 54 */
(( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = "=\""; // const-string v1, "=\""
(( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p1 ).getTitle ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getTitle()Ljava/lang/String;
(( java.lang.StringBuffer ) p3 ).append ( v2 ); // invoke-virtual {p3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = "\" "; // const-string v2, "\" "
(( java.lang.StringBuffer ) p3 ).append ( v2 ); // invoke-virtual {p3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = "path"; // const-string v3, "path"
/* .line 55 */
(( java.lang.StringBuffer ) p3 ).append ( v3 ); // invoke-virtual {p3, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
org.apache.log4j.lf5.viewer.configure.ConfigurationManager .treePathToString ( p2 );
(( java.lang.StringBuffer ) p3 ).append ( v3 ); // invoke-virtual {p3, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( v2 ); // invoke-virtual {p3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = "expanded"; // const-string v3, "expanded"
/* .line 56 */
(( java.lang.StringBuffer ) p3 ).append ( v3 ); // invoke-virtual {p3, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
p2 = (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) v0 ).isExpanded ( p2 ); // invoke-virtual {v0, p2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->isExpanded(Ljavax/swing/tree/TreePath;)Z
(( java.lang.StringBuffer ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( v2 ); // invoke-virtual {p3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p2 = "selected"; // const-string p2, "selected"
/* .line 57 */
(( java.lang.StringBuffer ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
p1 = (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p1 ).isSelected ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->isSelected()Z
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;
final String p1 = "\"/>\r\n"; // const-string p1, "\"/>\r\n"
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
return;
} // .end method
public void a ( org.w3c.dom.Document p0 ) {
/* .locals 8 */
/* .line 1 */
v0 = this.a;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v0 ).getCategoryExplorerTree ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->getCategoryExplorerTree()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;
/* .line 2 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) v0 ).getExplorerModel ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->getExplorerModel()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;
final String v2 = "category"; // const-string v2, "category"
/* .line 3 */
int v2 = 0; // const/4 v2, 0x0
/* .line 4 */
final String v3 = "name"; // const-string v3, "name"
/* .line 5 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
final String v3 = "Categories"; // const-string v3, "Categories"
v2 = (( java.lang.String ) v2 ).equalsIgnoreCase ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
v3 = /* .line 6 */
/* add-int/lit8 v3, v3, -0x1 */
} // :goto_0
/* if-lt v3, v2, :cond_0 */
/* .line 7 */
/* .line 8 */
/* .line 9 */
/* new-instance v5, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath; */
final String v6 = "path"; // const-string v6, "path"
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v4, v6 ); // invoke-virtual {p0, v4, v6}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
/* invoke-direct {v5, v6}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;-><init>(Ljava/lang/String;)V */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) v1 ).addCategory ( v5 ); // invoke-virtual {v1, v5}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->addCategory(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;)Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;
final String v6 = "selected"; // const-string v6, "selected"
/* .line 10 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v4, v6 ); // invoke-virtual {p0, v4, v6}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
final String v7 = "true"; // const-string v7, "true"
v6 = (( java.lang.String ) v6 ).equalsIgnoreCase ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v5 ).setSelected ( v6 ); // invoke-virtual {v5, v6}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->setSelected(Z)V
final String v6 = "expanded"; // const-string v6, "expanded"
/* .line 11 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v4, v6 ); // invoke-virtual {p0, v4, v6}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
(( java.lang.String ) v4 ).equalsIgnoreCase ( v7 ); // invoke-virtual {v4, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* .line 12 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) v1 ).getTreePathToRoot ( v5 ); // invoke-virtual {v1, v5}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->getTreePathToRoot(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;)Ljavax/swing/tree/TreePath;
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) v0 ).expandPath ( v4 ); // invoke-virtual {v0, v4}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->expandPath(Ljavax/swing/tree/TreePath;)V
/* add-int/lit8 v3, v3, -0x1 */
} // :cond_0
return;
} // .end method
public void b ( ) {
/* .locals 3 */
/* .line 13 */
try { // :try_start_0
/* new-instance v0, Ljava/io/File; */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).c ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->c()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 14 */
v1 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 15 */
(( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
/* :try_end_0 */
/* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 16 */
/* :catch_0 */
v0 = java.lang.System.err;
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Cannot delete "; // const-string v2, "Cannot delete "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).c ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->c()Ljava/lang/String;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = " because a security violation occured."; // const-string v2, " because a security violation occured."
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
} // :cond_0
} // :goto_0
return;
} // .end method
public final void b ( java.lang.String p0, Boolean p1, java.lang.StringBuffer p2 ) {
/* .locals 1 */
final String v0 = "\t\t<"; // const-string v0, "\t\t<"
/* .line 18 */
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "column"; // const-string v0, "column"
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = " "; // const-string v0, " "
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "name"; // const-string v0, "name"
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "=\""; // const-string v0, "=\""
/* .line 19 */
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "\" "; // const-string p1, "\" "
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "selected"; // const-string p1, "selected"
/* .line 20 */
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;
final String p1 = "\"/>\r\n"; // const-string p1, "\"/>\r\n"
/* .line 21 */
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
return;
} // .end method
public final void b ( java.lang.StringBuffer p0 ) {
/* .locals 1 */
final String v0 = "<configuration>\r\n"; // const-string v0, "<configuration>\r\n"
/* .line 17 */
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
return;
} // .end method
public void b ( org.w3c.dom.Document p0 ) {
/* .locals 6 */
final String v0 = "colorlevel"; // const-string v0, "colorlevel"
/* .line 1 */
/* .line 2 */
org.apache.log4j.lf5.LogLevel .getLogLevelColorMap ( );
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
v1 = } // :goto_0
/* if-ge v0, v1, :cond_2 */
/* .line 4 */
/* if-nez v1, :cond_0 */
return;
/* .line 5 */
} // :cond_0
final String v2 = "name"; // const-string v2, "name"
/* .line 6 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
/* .line 7 */
try { // :try_start_0
org.apache.log4j.lf5.LogLevel .valueOf ( v2 );
final String v3 = "red"; // const-string v3, "red"
/* .line 8 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v1, v3 ); // invoke-virtual {p0, v1, v3}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
v3 = java.lang.Integer .parseInt ( v3 );
final String v4 = "green"; // const-string v4, "green"
/* .line 9 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v1, v4 ); // invoke-virtual {p0, v1, v4}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
v4 = java.lang.Integer .parseInt ( v4 );
final String v5 = "blue"; // const-string v5, "blue"
/* .line 10 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v1, v5 ); // invoke-virtual {p0, v1, v5}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
v1 = java.lang.Integer .parseInt ( v1 );
/* .line 11 */
/* new-instance v5, Ljava/awt/Color; */
/* invoke-direct {v5, v3, v4, v1}, Ljava/awt/Color;-><init>(III)V */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 12 */
(( org.apache.log4j.lf5.LogLevel ) v2 ).setLogLevelColorMap ( v2, v5 ); // invoke-virtual {v2, v2, v5}, Lorg/apache/log4j/lf5/LogLevel;->setLogLevelColorMap(Lorg/apache/log4j/lf5/LogLevel;Ljava/awt/Color;)V
/* :try_end_0 */
/* .catch Lorg/apache/log4j/lf5/LogLevelFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
return;
} // .end method
public java.lang.String c ( ) {
/* .locals 3 */
final String v0 = "user.home"; // const-string v0, "user.home"
/* .line 9 */
java.lang.System .getProperty ( v0 );
final String v1 = "file.separator"; // const-string v1, "file.separator"
/* .line 10 */
java.lang.System .getProperty ( v1 );
/* .line 11 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "lf5"; // const-string v0, "lf5"
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "lf5_configuration.xml"; // const-string v0, "lf5_configuration.xml"
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public final void c ( java.lang.StringBuffer p0 ) {
/* .locals 1 */
final String v0 = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n"; // const-string v0, "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n"
/* .line 12 */
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
return;
} // .end method
public void c ( org.w3c.dom.Document p0 ) {
/* .locals 5 */
final String v0 = "level"; // const-string v0, "level"
/* .line 1 */
/* .line 2 */
v0 = this.a;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v0 ).getLogLevelMenuItems ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->getLogLevelMenuItems()Ljava/util/Map;
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
v2 = } // :goto_0
/* if-ge v1, v2, :cond_0 */
/* .line 4 */
/* .line 5 */
final String v3 = "name"; // const-string v3, "name"
/* .line 6 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
/* .line 7 */
try { // :try_start_0
org.apache.log4j.lf5.LogLevel .valueOf ( v3 );
/* check-cast v3, Ljavax/swing/JCheckBoxMenuItem; */
final String v4 = "selected"; // const-string v4, "selected"
/* .line 8 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v2, v4 ); // invoke-virtual {p0, v2, v4}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
final String v4 = "true"; // const-string v4, "true"
v2 = (( java.lang.String ) v2 ).equalsIgnoreCase ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
(( javax.swing.JCheckBoxMenuItem ) v3 ).setSelected ( v2 ); // invoke-virtual {v3, v2}, Ljavax/swing/JCheckBoxMenuItem;->setSelected(Z)V
/* :try_end_0 */
/* .catch Lorg/apache/log4j/lf5/LogLevelFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
public void d ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Ljava/io/File; */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).c ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->c()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 2 */
v1 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
try { // :try_start_0
javax.xml.parsers.DocumentBuilderFactory .newInstance ( );
/* .line 4 */
(( javax.xml.parsers.DocumentBuilderFactory ) v1 ).newDocumentBuilder ( ); // invoke-virtual {v1}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;
/* .line 5 */
(( javax.xml.parsers.DocumentBuilder ) v1 ).parse ( v0 ); // invoke-virtual {v1, v0}, Ljavax/xml/parsers/DocumentBuilder;->parse(Ljava/io/File;)Lorg/w3c/dom/Document;
/* .line 6 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).e ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->e(Lorg/w3c/dom/Document;)V
/* .line 7 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Lorg/w3c/dom/Document;)V
/* .line 8 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->c(Lorg/w3c/dom/Document;)V
/* .line 9 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->b(Lorg/w3c/dom/Document;)V
/* .line 10 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->d(Lorg/w3c/dom/Document;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 11 */
v1 = java.lang.System.err;
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "Unable process configuration file at "; // const-string v3, "Unable process configuration file at "
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).c ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->c()Ljava/lang/String;
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = ".Error Message="; // const-string v3, ".Error Message="
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
} // :cond_0
} // :goto_0
return;
} // .end method
public void d ( org.w3c.dom.Document p0 ) {
/* .locals 7 */
final String v0 = "column"; // const-string v0, "column"
/* .line 12 */
/* .line 13 */
v0 = this.a;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v0 ).getLogTableColumnMenuItems ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->getLogTableColumnMenuItems()Ljava/util/Map;
/* .line 14 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
int v2 = 0; // const/4 v2, 0x0
/* .line 15 */
v3 = } // :goto_0
/* if-ge v2, v3, :cond_3 */
/* .line 16 */
/* if-nez v3, :cond_0 */
return;
/* .line 17 */
} // :cond_0
final String v4 = "name"; // const-string v4, "name"
/* .line 18 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
/* .line 19 */
try { // :try_start_0
org.apache.log4j.lf5.viewer.LogTableColumn .valueOf ( v4 );
/* .line 20 */
/* check-cast v5, Ljavax/swing/JCheckBoxMenuItem; */
final String v6 = "selected"; // const-string v6, "selected"
/* .line 21 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v3, v6 ); // invoke-virtual {p0, v3, v6}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
final String v6 = "true"; // const-string v6, "true"
v3 = (( java.lang.String ) v3 ).equalsIgnoreCase ( v6 ); // invoke-virtual {v3, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
(( javax.swing.JCheckBoxMenuItem ) v5 ).setSelected ( v3 ); // invoke-virtual {v5, v3}, Ljavax/swing/JCheckBoxMenuItem;->setSelected(Z)V
/* .line 22 */
v3 = (( javax.swing.JCheckBoxMenuItem ) v5 ).isSelected ( ); // invoke-virtual {v5}, Ljavax/swing/JCheckBoxMenuItem;->isSelected()Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 23 */
/* :try_end_0 */
/* .catch Lorg/apache/log4j/lf5/viewer/LogTableColumnFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* nop */
/* .line 24 */
} // :cond_1
v3 = } // :goto_1
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 25 */
v3 = this.b;
(( org.apache.log4j.lf5.viewer.LogTable ) v3 ).setDetailedView ( ); // invoke-virtual {v3}, Lorg/apache/log4j/lf5/viewer/LogTable;->setDetailedView()V
/* .line 26 */
} // :cond_2
v3 = this.b;
(( org.apache.log4j.lf5.viewer.LogTable ) v3 ).setView ( v1 ); // invoke-virtual {v3, v1}, Lorg/apache/log4j/lf5/viewer/LogTable;->setView(Ljava/util/List;)V
} // :goto_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
return;
} // .end method
public void e ( ) {
/* .locals 3 */
/* .line 7 */
v0 = this.a;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v0 ).getCategoryExplorerTree ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->getCategoryExplorerTree()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) v0 ).getExplorerModel ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->getExplorerModel()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;
/* .line 8 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) v0 ).getRootCategoryNode ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->getRootCategoryNode()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;
/* .line 9 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v0 ).breadthFirstEnumeration ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->breadthFirstEnumeration()Ljava/util/Enumeration;
/* .line 10 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 11 */
/* check-cast v1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
int v2 = 1; // const/4 v2, 0x1
/* .line 12 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v1 ).setSelected ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->setSelected(Z)V
} // :cond_0
return;
} // .end method
public void e ( org.w3c.dom.Document p0 ) {
/* .locals 1 */
final String v0 = "searchtext"; // const-string v0, "searchtext"
/* .line 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* if-nez p1, :cond_0 */
return;
/* .line 3 */
} // :cond_0
final String v0 = "name"; // const-string v0, "name"
/* .line 4 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_2
final String v0 = ""; // const-string v0, ""
/* .line 5 */
v0 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
} // :cond_1
v0 = this.a;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v0 ).setNDCLogRecordFilter ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->setNDCLogRecordFilter(Ljava/lang/String;)V
} // :cond_2
} // :goto_0
return;
} // .end method
public void reset ( ) {
/* .locals 0 */
/* .line 1 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->b()V
/* .line 2 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a()V
/* .line 3 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).e ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->e()V
return;
} // .end method
public void save ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.a;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v0 ).getCategoryExplorerTree ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->getCategoryExplorerTree()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) v0 ).getExplorerModel ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->getExplorerModel()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;
/* .line 2 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) v0 ).getRootCategoryNode ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->getRootCategoryNode()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;
/* .line 3 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* const/16 v2, 0x800 */
/* invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(I)V */
/* .line 4 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->c(Ljava/lang/StringBuffer;)V
/* .line 5 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->b(Ljava/lang/StringBuffer;)V
/* .line 6 */
v2 = this.a;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v2 ).getNDCTextFilter ( ); // invoke-virtual {v2}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->getNDCTextFilter()Ljava/lang/String;
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Ljava/lang/String;Ljava/lang/StringBuffer;)V
/* .line 7 */
v2 = this.a;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v2 ).getLogLevelMenuItems ( ); // invoke-virtual {v2}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->getLogLevelMenuItems()Ljava/util/Map;
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Ljava/util/Map;Ljava/lang/StringBuffer;)V
/* .line 8 */
v2 = this.a;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v2 ).getLogLevelMenuItems ( ); // invoke-virtual {v2}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->getLogLevelMenuItems()Ljava/util/Map;
org.apache.log4j.lf5.LogLevel .getLogLevelColorMap ( );
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v2, v3, v1 ); // invoke-virtual {p0, v2, v3, v1}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Ljava/util/Map;Ljava/util/Map;Ljava/lang/StringBuffer;)V
/* .line 9 */
org.apache.log4j.lf5.viewer.LogTableColumn .getLogTableColumns ( );
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Ljava/util/List;Ljava/lang/StringBuffer;)V
/* .line 10 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;Ljava/lang/StringBuffer;)V
/* .line 11 */
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Ljava/lang/StringBuffer;)V
/* .line 12 */
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.lf5.viewer.configure.ConfigurationManager ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;->a(Ljava/lang/String;)V
return;
} // .end method
