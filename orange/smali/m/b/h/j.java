public abstract class m.b.h.j {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static void a ( java.lang.Object p0 ) {
		 /* .locals 1 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 return;
			 /* .line 1 */
		 } // :cond_0
		 /* new-instance p0, Ljava/lang/IllegalArgumentException; */
		 final String v0 = "Object must not be null"; // const-string v0, "Object must not be null"
		 /* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p0 */
	 } // .end method
	 public static void a ( java.lang.Object p0, java.lang.String p1 ) {
		 /* .locals 0 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 return;
			 /* .line 2 */
		 } // :cond_0
		 /* new-instance p0, Ljava/lang/IllegalArgumentException; */
		 /* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p0 */
	 } // .end method
	 public static void a ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .line 10 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 /* invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // .end method
	 public static void a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 0 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 8 */
			 p0 = 			 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
			 if ( p0 != null) { // if-eqz p0, :cond_0
				 return;
				 /* .line 9 */
			 } // :cond_0
			 /* new-instance p0, Ljava/lang/IllegalArgumentException; */
			 /* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
			 /* throw p0 */
		 } // .end method
		 public static void a ( Boolean p0 ) {
			 /* .locals 1 */
			 /* if-nez p0, :cond_0 */
			 return;
			 /* .line 3 */
		 } // :cond_0
		 /* new-instance p0, Ljava/lang/IllegalArgumentException; */
		 final String v0 = "Must be false"; // const-string v0, "Must be false"
		 /* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p0 */
	 } // .end method
	 public static void a ( Boolean p0, java.lang.String p1 ) {
		 /* .locals 0 */
		 /* if-nez p0, :cond_0 */
		 return;
		 /* .line 4 */
	 } // :cond_0
	 /* new-instance p0, Ljava/lang/IllegalArgumentException; */
	 /* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw p0 */
} // .end method
public static void a ( java.lang.Object[] p0 ) {
	 /* .locals 1 */
	 final String v0 = "Array must not contain any null objects"; // const-string v0, "Array must not contain any null objects"
	 /* .line 5 */
	 m.b.h.j .a ( p0,v0 );
	 return;
} // .end method
public static void a ( java.lang.Object[] p0, java.lang.String p1 ) {
	 /* .locals 3 */
	 /* .line 6 */
	 /* array-length v0, p0 */
	 int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* aget-object v2, p0, v1 */
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* add-int/lit8 v1, v1, 0x1 */
	 /* .line 7 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // :cond_1
return;
} // .end method
public static void b ( java.lang.String p0 ) {
/* .locals 1 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 3 */
p0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
if ( p0 != null) { // if-eqz p0, :cond_0
	 return;
	 /* .line 4 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "String must not be empty"; // const-string v0, "String must not be empty"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void b ( Boolean p0 ) {
/* .locals 1 */
if ( p0 != null) { // if-eqz p0, :cond_0
	 return;
	 /* .line 1 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "Must be true"; // const-string v0, "Must be true"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void b ( Boolean p0, java.lang.String p1 ) {
/* .locals 0 */
if ( p0 != null) { // if-eqz p0, :cond_0
	 return;
	 /* .line 2 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
