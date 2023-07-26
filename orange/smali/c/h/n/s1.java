public abstract class c.h.n.s1 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( Integer p0 ) {
		 /* .locals 3 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* if-eq p0, v0, :cond_8 */
		 int v1 = 2; // const/4 v1, 0x2
		 /* if-eq p0, v1, :cond_7 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* if-eq p0, v0, :cond_6 */
		 /* const/16 v1, 0x8 */
		 /* if-eq p0, v1, :cond_5 */
		 /* const/16 v2, 0x10 */
		 /* if-eq p0, v2, :cond_4 */
		 /* const/16 v0, 0x20 */
		 /* if-eq p0, v0, :cond_3 */
		 /* const/16 v0, 0x40 */
		 /* if-eq p0, v0, :cond_2 */
		 /* const/16 v0, 0x80 */
		 /* if-eq p0, v0, :cond_1 */
		 /* const/16 v0, 0x100 */
		 /* if-ne p0, v0, :cond_0 */
		 /* .line 1 */
	 } // :cond_0
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "type needs to be >= FIRST and <= LAST, type="; // const-string v2, "type needs to be >= FIRST and <= LAST, type="
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_1
int p0 = 7; // const/4 p0, 0x7
} // :cond_2
int p0 = 6; // const/4 p0, 0x6
} // :cond_3
int p0 = 5; // const/4 p0, 0x5
} // :cond_4
} // :cond_5
int p0 = 3; // const/4 p0, 0x3
} // :cond_6
} // :cond_7
} // :cond_8
int p0 = 0; // const/4 p0, 0x0
} // .end method
