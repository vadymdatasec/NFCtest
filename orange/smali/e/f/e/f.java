public abstract class e.f.e.f {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Integer a;
	 public final Integer b;
	 /* # direct methods */
	 public e.f.e.f ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput p1, p0, Le/f/e/f;->a:I */
		 /* .line 3 */
		 /* iput p2, p0, Le/f/e/f;->b:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Integer a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Le/f/e/f;->b:I */
	 } // .end method
	 public abstract a ( Integer p0, Object[] p1 ) {
	 } // .end method
	 public abstract b ( ) {
	 } // .end method
	 public final Integer c ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Le/f/e/f;->a:I */
	 } // .end method
	 public e.f.e.f d ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Le/f/e/e; */
		 /* invoke-direct {v0, p0}, Le/f/e/e;-><init>(Le/f/e/f;)V */
	 } // .end method
	 public Boolean e ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public e.f.e.f f ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/UnsupportedOperationException; */
		 final String v1 = "This luminance source does not support rotation by 90 degrees."; // const-string v1, "This luminance source does not support rotation by 90 degrees."
		 /* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // .end method
	 public final java.lang.String toString ( ) {
		 /* .locals 7 */
		 /* .line 1 */
		 /* iget v0, p0, Le/f/e/f;->a:I */
		 /* new-array v1, v0, [B */
		 /* .line 2 */
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* iget v3, p0, Le/f/e/f;->b:I */
		 /* add-int/lit8 v0, v0, 0x1 */
		 /* mul-int v3, v3, v0 */
		 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V */
		 int v0 = 0; // const/4 v0, 0x0
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 3 */
	 } // :goto_0
	 /* iget v4, p0, Le/f/e/f;->b:I */
	 /* if-ge v3, v4, :cond_4 */
	 /* .line 4 */
	 (( e.f.e.f ) p0 ).a ( v3, v1 ); // invoke-virtual {p0, v3, v1}, Le/f/e/f;->a(I[B)[B
	 int v4 = 0; // const/4 v4, 0x0
	 /* .line 5 */
} // :goto_1
/* iget v5, p0, Le/f/e/f;->a:I */
/* if-ge v4, v5, :cond_3 */
/* .line 6 */
/* aget-byte v5, v1, v4 */
/* and-int/lit16 v5, v5, 0xff */
/* const/16 v6, 0x40 */
/* if-ge v5, v6, :cond_0 */
/* const/16 v5, 0x23 */
} // :cond_0
/* const/16 v6, 0x80 */
/* if-ge v5, v6, :cond_1 */
/* const/16 v5, 0x2b */
} // :cond_1
/* const/16 v6, 0xc0 */
/* if-ge v5, v6, :cond_2 */
/* const/16 v5, 0x2e */
} // :cond_2
/* const/16 v5, 0x20 */
/* .line 7 */
} // :goto_2
(( java.lang.StringBuilder ) v2 ).append ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_3
/* const/16 v4, 0xa */
/* .line 8 */
(( java.lang.StringBuilder ) v2 ).append ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* add-int/lit8 v3, v3, 0x1 */
/* .line 9 */
} // :cond_4
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
