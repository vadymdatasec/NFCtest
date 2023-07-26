public abstract class k.e1.i.h {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Boolean a ( java.lang.String p0 ) {
		 /* .locals 1 */
		 final String v0 = "POST"; // const-string v0, "POST"
		 /* .line 1 */
		 v0 = 		 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 /* if-nez v0, :cond_1 */
		 final String v0 = "PATCH"; // const-string v0, "PATCH"
		 /* .line 2 */
		 v0 = 		 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 /* if-nez v0, :cond_1 */
		 final String v0 = "PUT"; // const-string v0, "PUT"
		 /* .line 3 */
		 v0 = 		 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 /* if-nez v0, :cond_1 */
		 final String v0 = "DELETE"; // const-string v0, "DELETE"
		 /* .line 4 */
		 v0 = 		 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 /* if-nez v0, :cond_1 */
		 final String v0 = "MOVE"; // const-string v0, "MOVE"
		 /* .line 5 */
		 p0 = 		 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( p0 != null) { // if-eqz p0, :cond_0
		 } // :cond_0
		 int p0 = 0; // const/4 p0, 0x0
	 } // :cond_1
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // :goto_1
} // .end method
public static Boolean b ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "GET"; // const-string v0, "GET"
/* .line 1 */
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
final String v0 = "HEAD"; // const-string v0, "HEAD"
p0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez p0, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static Boolean c ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "PROPFIND"; // const-string v0, "PROPFIND"
/* .line 1 */
p0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* xor-int/lit8 p0, p0, 0x1 */
} // .end method
public static Boolean d ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "PROPFIND"; // const-string v0, "PROPFIND"
/* .line 1 */
p0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
public static Boolean e ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "POST"; // const-string v0, "POST"
/* .line 1 */
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
final String v0 = "PUT"; // const-string v0, "PUT"
/* .line 2 */
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
final String v0 = "PATCH"; // const-string v0, "PATCH"
/* .line 3 */
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
final String v0 = "PROPPATCH"; // const-string v0, "PROPPATCH"
/* .line 4 */
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
final String v0 = "REPORT"; // const-string v0, "REPORT"
/* .line 5 */
p0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // :goto_1
} // .end method
