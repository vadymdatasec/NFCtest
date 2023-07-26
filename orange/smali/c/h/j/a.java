public abstract class c.h.j.a {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Boolean a ( ) {
		 /* .locals 2 */
		 /* .annotation runtime Ljava/lang/Deprecated; */
	 } // .end annotation
	 /* .line 3 */
	 /* const/16 v1, 0x1e */
	 /* if-lt v0, v1, :cond_0 */
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public static Boolean a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 2 */
final String v0 = "REL"; // const-string v0, "REL"
/* .line 1 */
v0 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
p0 = (( java.lang.String ) p1 ).compareTo ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
/* if-ltz p0, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
} // .end method
public static Boolean b ( ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x1f */
/* if-ge v0, v1, :cond_1 */
v0 = android.os.Build$VERSION.CODENAME;
final String v1 = "S"; // const-string v1, "S"
v0 = c.h.j.a .a ( v1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
