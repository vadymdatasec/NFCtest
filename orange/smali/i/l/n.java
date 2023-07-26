public abstract class i.l.n extends i.l.m {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static final Boolean a ( java.lang.String p0, Integer p1, java.lang.String p2, Integer p3, Integer p4, Boolean p5 ) {
		 /* .locals 6 */
		 final String v0 = "$this$regionMatches"; // const-string v0, "$this$regionMatches"
		 i.h.c.k .c ( p0,v0 );
		 final String v0 = "other"; // const-string v0, "other"
		 i.h.c.k .c ( p2,v0 );
		 /* if-nez p5, :cond_0 */
		 /* .line 4 */
		 p0 = 		 (( java.lang.String ) p0 ).regionMatches ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z
	 } // :cond_0
	 /* move-object v0, p0 */
	 /* move v1, p5 */
	 /* move v2, p1 */
	 /* move-object v3, p2 */
	 /* move v4, p3 */
	 /* move v5, p4 */
	 /* .line 5 */
	 p0 = 	 /* invoke-virtual/range {v0 ..v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z */
} // :goto_0
} // .end method
public static final Boolean a ( java.lang.String p0, java.lang.String p1, Boolean p2 ) {
/* .locals 0 */
/* if-nez p0, :cond_1 */
/* if-nez p1, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // :cond_1
/* if-nez p2, :cond_2 */
/* .line 2 */
p0 = (( java.lang.String ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* .line 3 */
} // :cond_2
p0 = (( java.lang.String ) p0 ).equalsIgnoreCase ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
} // :goto_1
} // .end method
public static Boolean a ( java.lang.String p0, java.lang.String p1, Boolean p2, Integer p3, java.lang.Object p4 ) { //synthethic
/* .locals 0 */
/* and-int/lit8 p3, p3, 0x2 */
if ( p3 != null) { // if-eqz p3, :cond_0
int p2 = 0; // const/4 p2, 0x0
/* .line 1 */
} // :cond_0
p0 = i.l.n .a ( p0,p1,p2 );
} // .end method
