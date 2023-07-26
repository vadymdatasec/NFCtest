public abstract class m.a.a.c.b {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Boolean a ( java.lang.CharSequence p0, Boolean p1, Integer p2, java.lang.CharSequence p3, Integer p4, Integer p5 ) {
		 /* .locals 7 */
		 /* .line 1 */
		 /* instance-of v0, p0, Ljava/lang/String; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* instance-of v0, p3, Ljava/lang/String; */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 2 */
				 /* move-object v1, p0 */
				 /* check-cast v1, Ljava/lang/String; */
				 /* move-object v4, p3 */
				 /* check-cast v4, Ljava/lang/String; */
				 /* move v2, p1 */
				 /* move v3, p2 */
				 /* move v5, p4 */
				 /* move v6, p5 */
				 p0 = 				 /* invoke-virtual/range {v1 ..v6}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z */
			 } // :cond_0
		 } // :goto_0
		 /* add-int/lit8 v0, p5, -0x1 */
		 /* if-lez p5, :cond_4 */
		 /* add-int/lit8 p5, p2, 0x1 */
		 p2 = 		 /* .line 3 */
		 /* add-int/lit8 v1, p4, 0x1 */
		 p4 = 		 /* .line 4 */
		 /* if-ne p2, p4, :cond_1 */
	 } // :cond_1
	 int v2 = 0; // const/4 v2, 0x0
	 /* if-nez p1, :cond_2 */
	 /* .line 5 */
} // :cond_2
v3 = java.lang.Character .toUpperCase ( p2 );
v4 = java.lang.Character .toUpperCase ( p4 );
/* if-eq v3, v4, :cond_3 */
p2 = java.lang.Character .toLowerCase ( p2 );
p4 = java.lang.Character .toLowerCase ( p4 );
/* if-eq p2, p4, :cond_3 */
} // :cond_3
} // :goto_1
/* move p2, p5 */
/* move p5, v0 */
/* move p4, v1 */
} // :cond_4
int p0 = 1; // const/4 p0, 0x1
} // .end method
