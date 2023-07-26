public class org.apache.log4j.lf5.viewer.categoryexplorer.CategoryPath {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.util.LinkedList a;
	 /* # direct methods */
	 public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryPath ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/util/LinkedList; */
		 /* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
		 this.a = v0;
		 return;
	 } // .end method
	 public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryPath ( ) {
		 /* .locals 2 */
		 /* .line 3 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 4 */
		 /* new-instance v0, Ljava/util/LinkedList; */
		 /* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
		 this.a = v0;
		 /* if-nez p1, :cond_0 */
		 final String p1 = "Debug"; // const-string p1, "Debug"
	 } // :cond_0
	 /* const/16 v0, 0x2f */
	 /* const/16 v1, 0x2e */
	 /* .line 5 */
	 (( java.lang.String ) p1 ).replace ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;
	 /* const/16 v0, 0x5c */
	 /* .line 6 */
	 (( java.lang.String ) p1 ).replace ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;
	 /* .line 7 */
	 /* new-instance v0, Ljava/util/StringTokenizer; */
	 final String v1 = "."; // const-string v1, "."
	 /* invoke-direct {v0, p1, v1}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
	 /* .line 8 */
} // :goto_0
p1 = (( java.util.StringTokenizer ) v0 ).hasMoreTokens ( ); // invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreTokens()Z
if ( p1 != null) { // if-eqz p1, :cond_1
	 /* .line 9 */
	 (( java.util.StringTokenizer ) v0 ).nextToken ( ); // invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;
	 /* .line 10 */
	 /* new-instance v1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryElement; */
	 /* invoke-direct {v1, p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryElement;-><init>(Ljava/lang/String;)V */
	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryPath ) p0 ).addCategoryElement ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;->addCategoryElement(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryElement;)V
} // :cond_1
return;
} // .end method
/* # virtual methods */
public void addCategoryElement ( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryElement p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( java.util.LinkedList ) v0 ).addLast ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V
return;
} // .end method
public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryElement categoryElementAt ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( java.util.LinkedList ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
/* check-cast p1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryElement; */
} // .end method
public Boolean isEmpty ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = (( java.util.LinkedList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/LinkedList;->size()I
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void removeAllCategoryElements ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( java.util.LinkedList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V
return;
} // .end method
public Integer size ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = (( java.util.LinkedList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/LinkedList;->size()I
} // .end method
public java.lang.String toString ( ) {
/* .locals 5 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* const/16 v1, 0x64 */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V */
final String v1 = "\n"; // const-string v1, "\n"
/* .line 2 */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = "===========================\n"; // const-string v2, "===========================\n"
/* .line 3 */
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = "CategoryPath: \n"; // const-string v3, "CategoryPath: \n"
/* .line 4 */
(( java.lang.StringBuffer ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = "---------------------------\n"; // const-string v3, "---------------------------\n"
/* .line 5 */
(( java.lang.StringBuffer ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = "\nCategoryPath:\n\t"; // const-string v3, "\nCategoryPath:\n\t"
/* .line 6 */
(( java.lang.StringBuffer ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 7 */
v3 = (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryPath ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;->size()I
/* if-lez v3, :cond_0 */
int v3 = 0; // const/4 v3, 0x0
/* .line 8 */
} // :goto_0
v4 = (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryPath ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;->size()I
/* if-ge v3, v4, :cond_1 */
/* .line 9 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryPath ) p0 ).categoryElementAt ( v3 ); // invoke-virtual {p0, v3}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;->categoryElementAt(I)Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryElement;
(( java.lang.Object ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v4 = "\n\t"; // const-string v4, "\n\t"
/* .line 10 */
(( java.lang.StringBuffer ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_0
final String v3 = "<<NONE>>"; // const-string v3, "<<NONE>>"
/* .line 11 */
(( java.lang.StringBuffer ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 12 */
} // :cond_1
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 13 */
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 14 */
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
