public class org.apache.log4j.config.PropertyPrinter implements org.apache.log4j.config.PropertyGetter$PropertyCallback {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public Integer a;
	 public java.util.Hashtable b;
	 public java.io.PrintWriter c;
	 public Boolean d;
	 /* # direct methods */
	 public org.apache.log4j.config.PropertyPrinter ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, p1, v0}, Lorg/apache/log4j/config/PropertyPrinter;-><init>(Ljava/io/PrintWriter;Z)V */
		 return;
	 } // .end method
	 public org.apache.log4j.config.PropertyPrinter ( ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* iput v0, p0, Lorg/apache/log4j/config/PropertyPrinter;->a:I */
		 /* .line 4 */
		 /* new-instance v0, Ljava/util/Hashtable; */
		 /* invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V */
		 this.b = v0;
		 /* .line 5 */
		 /* new-instance v0, Ljava/util/Hashtable; */
		 /* invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V */
		 /* .line 6 */
		 this.c = p1;
		 /* .line 7 */
		 /* iput-boolean p2, p0, Lorg/apache/log4j/config/PropertyPrinter;->d:Z */
		 /* .line 8 */
		 (( org.apache.log4j.config.PropertyPrinter ) p0 ).print ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/config/PropertyPrinter;->print(Ljava/io/PrintWriter;)V
		 /* .line 9 */
		 (( java.io.PrintWriter ) p1 ).flush ( ); // invoke-virtual {p1}, Ljava/io/PrintWriter;->flush()V
		 return;
	 } // .end method
	 public static java.lang.String capitalize ( java.lang.String p0 ) {
		 /* .locals 3 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 v1 = 		 (( java.lang.String ) p0 ).charAt ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
		 v1 = 		 java.lang.Character .isLowerCase ( v1 );
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* .line 2 */
			 v1 = 			 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
			 int v2 = 1; // const/4 v2, 0x1
			 /* if-eq v1, v2, :cond_0 */
			 v1 = 			 (( java.lang.String ) p0 ).charAt ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C
			 v1 = 			 java.lang.Character .isLowerCase ( v1 );
			 if ( v1 != null) { // if-eqz v1, :cond_1
				 /* .line 3 */
			 } // :cond_0
			 /* new-instance v1, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v1, p0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
			 /* .line 4 */
			 p0 = 			 (( java.lang.String ) p0 ).charAt ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
			 p0 = 			 java.lang.Character .toUpperCase ( p0 );
			 (( java.lang.StringBuffer ) v1 ).setCharAt ( v0, p0 ); // invoke-virtual {v1, v0, p0}, Ljava/lang/StringBuffer;->setCharAt(IC)V
			 /* .line 5 */
			 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 } // :cond_1
	 } // .end method
	 public static void main ( java.lang.String[] p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance p0, Lorg/apache/log4j/config/PropertyPrinter; */
		 /* new-instance v0, Ljava/io/PrintWriter; */
		 v1 = java.lang.System.out;
		 /* invoke-direct {v0, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/OutputStream;)V */
		 /* invoke-direct {p0, v0}, Lorg/apache/log4j/config/PropertyPrinter;-><init>(Ljava/io/PrintWriter;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v1 = "A"; // const-string v1, "A"
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 /* iget v1, p0, Lorg/apache/log4j/config/PropertyPrinter;->a:I */
		 /* add-int/lit8 v2, v1, 0x1 */
		 /* iput v2, p0, Lorg/apache/log4j/config/PropertyPrinter;->a:I */
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 } // .end method
	 public void a ( java.io.PrintWriter p0, java.lang.Object p1, java.lang.String p2 ) {
		 /* .locals 2 */
		 /* .line 23 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
		 (( java.lang.StringBuffer ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String v1 = "="; // const-string v1, "="
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.Object ) p2 ).getClass ( ); // invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 (( java.io.PrintWriter ) p1 ).println ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
		 /* .line 24 */
		 /* new-instance p1, Ljava/lang/StringBuffer; */
		 /* invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V */
		 (( java.lang.StringBuffer ) p1 ).append ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String p3 = "."; // const-string p3, "."
		 (( java.lang.StringBuffer ) p1 ).append ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 org.apache.log4j.config.PropertyGetter .getProperties ( p2,p0,p1 );
		 return;
	 } // .end method
	 public void a ( java.io.PrintWriter p0, org.apache.log4j.Category p1 ) {
		 /* .locals 7 */
		 /* .line 5 */
		 (( org.apache.log4j.Category ) p2 ).getAllAppenders ( ); // invoke-virtual {p2}, Lorg/apache/log4j/Category;->getAllAppenders()Ljava/util/Enumeration;
		 /* .line 6 */
		 (( org.apache.log4j.Category ) p2 ).getLevel ( ); // invoke-virtual {p2}, Lorg/apache/log4j/Category;->getLevel()Lorg/apache/log4j/Level;
		 final String v2 = ""; // const-string v2, ""
		 /* if-nez v1, :cond_0 */
		 /* move-object v1, v2 */
		 /* .line 7 */
	 } // :cond_0
	 (( org.apache.log4j.Priority ) v1 ).toString ( ); // invoke-virtual {v1}, Lorg/apache/log4j/Priority;->toString()Ljava/lang/String;
	 /* .line 8 */
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_4
	 /* .line 9 */
	 /* check-cast v3, Lorg/apache/log4j/Appender; */
	 /* .line 10 */
	 v4 = this.b;
	 (( java.util.Hashtable ) v4 ).get ( v3 ); // invoke-virtual {v4, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v4, Ljava/lang/String; */
	 /* if-nez v4, :cond_3 */
	 /* .line 11 */
	 if ( v4 != null) { // if-eqz v4, :cond_1
		 v5 = 		 (( org.apache.log4j.config.PropertyPrinter ) p0 ).a ( v4 ); // invoke-virtual {p0, v4}, Lorg/apache/log4j/config/PropertyPrinter;->a(Ljava/lang/String;)Z
		 if ( v5 != null) { // if-eqz v5, :cond_2
			 /* .line 12 */
		 } // :cond_1
		 (( org.apache.log4j.config.PropertyPrinter ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/config/PropertyPrinter;->a()Ljava/lang/String;
		 /* .line 13 */
	 } // :cond_2
	 v5 = this.b;
	 (( java.util.Hashtable ) v5 ).put ( v3, v4 ); // invoke-virtual {v5, v3, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 14 */
	 /* new-instance v5, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v6 = "log4j.appender."; // const-string v6, "log4j.appender."
	 (( java.lang.StringBuffer ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v5 ).append ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 (( org.apache.log4j.config.PropertyPrinter ) p0 ).a ( p1, v3, v5 ); // invoke-virtual {p0, p1, v3, v5}, Lorg/apache/log4j/config/PropertyPrinter;->a(Ljava/io/PrintWriter;Ljava/lang/Object;Ljava/lang/String;)V
	 /* .line 15 */
	 if ( v5 != null) { // if-eqz v5, :cond_3
		 /* .line 16 */
		 /* new-instance v5, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V */
		 (( java.lang.StringBuffer ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v5 ).append ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String v6 = ".layout"; // const-string v6, ".layout"
		 (( java.lang.StringBuffer ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 (( org.apache.log4j.config.PropertyPrinter ) p0 ).a ( p1, v3, v5 ); // invoke-virtual {p0, p1, v3, v5}, Lorg/apache/log4j/config/PropertyPrinter;->a(Ljava/io/PrintWriter;Ljava/lang/Object;Ljava/lang/String;)V
		 /* .line 17 */
	 } // :cond_3
	 /* new-instance v3, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
	 (( java.lang.StringBuffer ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String v1 = ", "; // const-string v1, ", "
	 (( java.lang.StringBuffer ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 /* .line 18 */
} // :cond_4
org.apache.log4j.Logger .getRootLogger ( );
/* if-ne p2, v0, :cond_5 */
final String v0 = "log4j.rootLogger"; // const-string v0, "log4j.rootLogger"
} // :cond_5
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "log4j.logger."; // const-string v3, "log4j.logger."
(( java.lang.StringBuffer ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( org.apache.log4j.Category ) p2 ).getName ( ); // invoke-virtual {p2}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // :goto_1
/* if-eq v1, v2, :cond_6 */
/* .line 19 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "="; // const-string v0, "="
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( java.io.PrintWriter ) p1 ).println ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
/* .line 20 */
} // :cond_6
v0 = (( org.apache.log4j.Category ) p2 ).getAdditivity ( ); // invoke-virtual {p2}, Lorg/apache/log4j/Category;->getAdditivity()Z
/* if-nez v0, :cond_7 */
org.apache.log4j.Logger .getRootLogger ( );
/* if-eq p2, v0, :cond_7 */
/* .line 21 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "log4j.additivity."; // const-string v1, "log4j.additivity."
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( org.apache.log4j.Category ) p2 ).getName ( ); // invoke-virtual {p2}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p2 = "=false"; // const-string p2, "=false"
(( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( java.io.PrintWriter ) p1 ).println ( p2 ); // invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
} // :cond_7
return;
} // .end method
public void a ( java.io.PrintWriter p0, org.apache.log4j.Logger p1 ) {
/* .locals 0 */
/* .line 22 */
(( org.apache.log4j.config.PropertyPrinter ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/apache/log4j/config/PropertyPrinter;->a(Ljava/io/PrintWriter;Lorg/apache/log4j/Category;)V
return;
} // .end method
public Boolean a ( java.lang.String p0 ) {
/* .locals 4 */
/* .line 2 */
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 2; // const/4 v2, 0x2
/* if-lt v0, v2, :cond_4 */
v0 = (( java.lang.String ) p1 ).charAt ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C
/* const/16 v2, 0x41 */
/* if-eq v0, v2, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
} // :goto_0
v2 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-ge v0, v2, :cond_3 */
/* .line 4 */
v2 = (( java.lang.String ) p1 ).charAt ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C
/* const/16 v3, 0x30 */
/* if-lt v2, v3, :cond_2 */
v2 = (( java.lang.String ) p1 ).charAt ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C
/* const/16 v3, 0x39 */
/* if-le v2, v3, :cond_1 */
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
} // :goto_1
} // :cond_3
int p1 = 1; // const/4 p1, 0x1
} // :cond_4
} // :goto_2
} // .end method
public void foundProperty ( java.lang.Object p0, java.lang.String p1, java.lang.String p2, java.lang.Object p3 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of p1, p1, Lorg/apache/log4j/Appender; */
if ( p1 != null) { // if-eqz p1, :cond_0
final String p1 = "name"; // const-string p1, "name"
p1 = (( java.lang.String ) p1 ).equals ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
return;
/* .line 2 */
} // :cond_0
/* iget-boolean p1, p0, Lorg/apache/log4j/config/PropertyPrinter;->d:Z */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 3 */
org.apache.log4j.config.PropertyPrinter .capitalize ( p3 );
/* .line 4 */
} // :cond_1
p1 = this.c;
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p2 = "="; // const-string p2, "="
(( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.Object ) p4 ).toString ( ); // invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( java.io.PrintWriter ) p1 ).println ( p2 ); // invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
return;
} // .end method
public void print ( java.io.PrintWriter p0 ) {
/* .locals 2 */
/* .line 1 */
org.apache.log4j.Logger .getRootLogger ( );
(( org.apache.log4j.config.PropertyPrinter ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/apache/log4j/config/PropertyPrinter;->a(Ljava/io/PrintWriter;Lorg/apache/log4j/Logger;)V
/* .line 2 */
org.apache.log4j.LogManager .getCurrentLoggers ( );
/* .line 3 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
/* check-cast v1, Lorg/apache/log4j/Logger; */
(( org.apache.log4j.config.PropertyPrinter ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lorg/apache/log4j/config/PropertyPrinter;->a(Ljava/io/PrintWriter;Lorg/apache/log4j/Logger;)V
} // :cond_0
return;
} // .end method
