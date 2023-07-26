public abstract class i.g.a {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static final Integer a ( Integer p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* rem-int/2addr p0, p1 */
		 /* if-ltz p0, :cond_0 */
	 } // :cond_0
	 /* add-int/2addr p0, p1 */
} // :goto_0
} // .end method
public static final Integer a ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .line 2 */
p0 = i.g.a .a ( p0,p2 );
p1 = i.g.a .a ( p1,p2 );
/* sub-int/2addr p0, p1 */
p0 = i.g.a .a ( p0,p2 );
} // .end method
public static final Integer b ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* if-lez p2, :cond_1 */
/* if-lt p0, p1, :cond_0 */
/* .line 1 */
} // :cond_0
p0 = i.g.a .a ( p1,p0,p2 );
/* sub-int/2addr p1, p0 */
} // :cond_1
/* if-gez p2, :cond_3 */
/* if-gt p0, p1, :cond_2 */
} // :cond_2
/* neg-int p2, p2 */
/* .line 2 */
p0 = i.g.a .a ( p0,p1,p2 );
/* add-int/2addr p1, p0 */
} // :goto_0
/* .line 3 */
} // :cond_3
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String p1 = "Step is zero."; // const-string p1, "Step is zero."
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
